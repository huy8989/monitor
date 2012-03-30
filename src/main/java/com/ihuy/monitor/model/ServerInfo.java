/**
 * SeverInfo.java
 * com.ihuy.monitor.model
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2012-3-11 		huy
 *
 * Copyright (c) 2012, TNT All Rights Reserved.
 */

package com.ihuy.monitor.model;

/**
 * ClassName:ServerInfo 服务器负载信息
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-3-11 下午1:14:15
 * 
 * @see
 */
public class ServerInfo {

	/** 是否是第一次获取服务器信息 是：true，否：false */
	private boolean isFirst;

	/** 当前服务器CPU信息 */
	private CPUInfo cPUInfo;

	/** 当前服务器内存信息 */
	private MemInfo memInfo;

	/** 当前服务器网络负载信息 */
	private NetInfo netInfo;

	/**
	 * CPU占用率 cpu usage=[(user_2 +sys_2+nice_2) - (user_1 +
	 * sys_1+nice_1)]/(total_2 - total_1)
	 * */
	private float cPURate;

	/**
	 * 网络负载参数 平均网络负载 = ((输出的数据包2+流入的数据包2)-(输出的数据包1+流入的数据包1)) / t
	 * */
	private float netLoad;

	/**
	 * 内存占用率(单位：%) 内存使用百分比 = 100 * (cmem / umem)
	 * */
	private int memRate;

	/** 此刻服务器时间 */
	private long time;

	public boolean isFirst() {
		return isFirst;
	}

	public void setFirst(boolean isFirst) {
		this.isFirst = isFirst;
	}

	public CPUInfo getcPUInfo() {
		return cPUInfo;
	}

	public void setcPUInfo(CPUInfo cPUInfo) {
		this.cPUInfo = cPUInfo;
	}

	public MemInfo getMemInfo() {
		return memInfo;
	}

	public void setMemInfo(MemInfo memInfo) {
		this.memInfo = memInfo;
	}

	public NetInfo getNetInfo() {
		return netInfo;
	}

	public void setNetInfo(NetInfo netInfo) {
		this.netInfo = netInfo;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public float getcPURate() {
		return cPURate;
	}

	public void setcPURate(float cPURate) {
		this.cPURate = cPURate;
	}

	public float getNetLoad() {
		return netLoad;
	}

	public void setNetLoad(float netLoad) {
		this.netLoad = netLoad;
	}

	public int getMemRate() {
		return memRate;
	}

	public void setMemRate(int memRate) {
		this.memRate = memRate;
	}

}
