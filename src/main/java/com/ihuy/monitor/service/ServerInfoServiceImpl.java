/**
 * ServerInfoServiceImpl.java
 * com.ihuy.monitor.service
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2012-3-11 		huy
 *
 * Copyright (c) 2012, TNT All Rights Reserved.
 */

package com.ihuy.monitor.service;

import java.io.IOException;
import java.util.Date;

import com.ihuy.monitor.constants.Constants;
import com.ihuy.monitor.model.CPUInfo;
import com.ihuy.monitor.model.MemInfo;
import com.ihuy.monitor.model.NetInfo;
import com.ihuy.monitor.model.ServerInfo;
import com.ihuy.util.SimpleCache;

/**
 * ClassName:ServerInfoServiceImpl Function: TODO ADD FUNCTION Reason: TODO ADD
 * REASON
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-3-11 下午2:46:30
 * 
 * @see
 */
public class ServerInfoServiceImpl implements ServerInfoService {

	public ServerInfo getServerInfo() throws IOException {

		ServerInfo serverInfo = new ServerInfo();

		serverInfo.setTime(new Date());

		// 获取CPU信息
		CPUInfo cpuInfo = CPUInfoServiceImpl.getCPUInfo();

		// 获取内存信息
		MemInfo memInfo = MemInfoServiceImpl.getMemInfo();

		// 获取网络负载信息
		NetInfo netInfo = NetInfoServiceImpl
				.getNetInfo(Constants.PROC_NET_DEV_ETH);

		// 获取前一时刻服务器信息
		ServerInfo preServerInfo = getPreServerInfo();

		if (preServerInfo == null) {
			// 此刻为第一次获取服务器状态信息
			serverInfo.setFirst(true);

		} else {
			// 非第一次
			serverInfo.setcPURate(getCPURate(cpuInfo,
					preServerInfo.getcPUInfo()));
			serverInfo.setNetLoad(getNetLoad(netInfo,
					preServerInfo.getNetInfo(), serverInfo.getTime().getTime()
							- preServerInfo.getTime().getTime()));
		}

		serverInfo.setcPUInfo(cpuInfo);
		serverInfo.setMemInfo(memInfo);
		serverInfo.setNetInfo(netInfo);
		serverInfo.setMemRate(getMemRate(memInfo.getMemTotal(),
				memInfo.getMemFree()));

		// 更新CPU cache
		SimpleCache.put(Constants.PRE_SERVER_INFO, serverInfo);

		return serverInfo;

	}

	/**
	 * 从缓存中获取前一时刻服务器信息，不存在返回null
	 */
	private ServerInfo getPreServerInfo() {
		ServerInfo serverInfo = (ServerInfo) SimpleCache
				.get(Constants.PRE_SERVER_INFO);
		return serverInfo;
	}

	/**
	 * 
	 * getMemRate:获取内存空闲率
	 * 
	 * 
	 * @param @param memTotal 总内存
	 * @param @param memFree 空闲内存
	 * @param @return 设定文件
	 * @return int DOM对象
	 * @throws
	 * @since CodingExample　Ver 1.1
	 */
	private int getMemRate(int memTotal, int memFree) {
		return memFree * 100 / memTotal;
	}

	/**
	 * 
	 * getCPURate:获取CPU使用率 IntCpuRate =(((float)((user_2 +sys_2+nice_2) -
	 * (user_1 + sys_1+nice_1))/(float)(total_2 - total_1) )*100)
	 * 
	 * @param @param cpuInfo 当前CPU参数信息
	 * @param @param preCpuInfo 前一时刻CPU参数信息
	 * @param @return 设定文件 CPU使用率
	 * @throws
	 * @since CodingExample　Ver 1.1
	 */
	private float getCPURate(CPUInfo cpuInfo, CPUInfo preCpuInfo) {

		int cpuTotal = cpuInfo.getUser() + cpuInfo.getSystem()
				+ cpuInfo.getNice() + cpuInfo.getIdle();
		int preCpuTotal = preCpuInfo.getUser() + preCpuInfo.getSystem()
				+ preCpuInfo.getNice() + preCpuInfo.getIdle();
		float rate = (float) ((float) ((cpuInfo.getUser() + cpuInfo.getSystem() + cpuInfo
				.getNice()) - (preCpuInfo.getUser() + preCpuInfo.getSystem() + preCpuInfo
				.getNice())) / (float) (cpuTotal - preCpuTotal));
		return rate;

	}

	/**
	 * 
	 * getNetLoad:获取网络负载
	 * 
	 * @param @param netInfo 当前网络负载
	 * @param @param preNetInfo 前一时刻网络负载
	 * @param @return 设定文件
	 * @return float DOM对象
	 * @throws
	 * @since CodingExample　Ver 1.1
	 */
	private float getNetLoad(NetInfo netInfo, NetInfo preNetInfo, long time) {
		return ((float) ((netInfo.getTrBytes() + netInfo.getReBytes()) - (preNetInfo
				.getReBytes() + preNetInfo.getTrBytes()))) / ((float) time);
	}

}
