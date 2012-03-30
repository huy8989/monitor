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

import com.ihuy.monitor.constants.Constants;
import com.ihuy.monitor.model.CPUInfo;
import com.ihuy.monitor.model.MemInfo;
import com.ihuy.monitor.model.NetInfo;
import com.ihuy.monitor.model.ServerInfo;
import com.ihuy.util.SimpleCache;

/**
 * ClassName:ServerInfoServiceImpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   huy
 * @version  
 * @since    Ver 1.1
 * @Date	 2012-3-11		下午2:46:30
 *
 * @see 	 
 */
public class ServerInfoServiceImpl implements ServerInfoService{

	public ServerInfo getServerInfo() throws IOException {
		
		ServerInfo serverInfo =new ServerInfo();
		
		//获取CPU信息
		CPUInfo cpuInfo = CPUInfoServiceImpl.getCPUInfo();
		
		//获取内存信息
		MemInfo memInfo = MemInfoServiceImpl.getMemInfo();
		
		//获取网络负载信息
		NetInfo netInfo = NetInfoServiceImpl.getNetInfo(Constants.PROC_NET_DEV_ETH);
		
		//获取前一时刻服务器信息
		ServerInfo preServerInfo = getPreServerInfo();
		
		if(preServerInfo==null){
			//此刻为第一次获取服务器状态信息
			serverInfo.setFirst(true);
			
		}else{
			//非第一次
			serverInfo.setcPURate(cPURate);
			serverInfo.setNetLoad(netLoad);
		}
		
		serverInfo.setcPUInfo(cpuInfo);
		serverInfo.setMemInfo(memInfo);
		serverInfo.setNetInfo(netInfo);
		serverInfo.setMemRate(getMemRate(memInfo.getMemTotal(), memInfo.getMemFree()));
		serverInfo.setTime(System.currentTimeMillis());
		return null;
		
	}
	
	/**
	 * 从缓存中获取前一时刻服务器信息，不存在返回null
	 */
	private ServerInfo getPreServerInfo(){
		ServerInfo serverInfo = (ServerInfo) SimpleCache.get(Constants.PRE_SERVER_INFO);
		return serverInfo;
	}
	
	/**
	 * 
	 * getMemRate:获取内存空闲率
	 * 
	 *
	 * @param  @param memTotal  总内存
	 * @param  @param memFree	空闲内存
	 * @param  @return    设定文件
	 * @return int    DOM对象
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	private int getMemRate(int memTotal,int memFree){
		return memFree*100/memTotal;
	}
	
	private int getCPURate(CPUInfo cpuInfo,CPUInfo preCPUInfo){
		
	}

}
