/**
 * CPUInfo.java
 * com.ihuy.monitor.model
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2012-3-10 		huy
 *
 * Copyright (c) 2012, TNT All Rights Reserved.
 */

package com.ihuy.monitor.model;

/**
 * ClassName:CPUInfo Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-3-10 下午7:40:21
 * 
 * @see
 */
public class CPUInfo {

	/** 从系统启动开始累计到当前时刻，用户态的CPU时间（单位：jiffies） */
	private int user;

	/** 从系统启动开始累计到当前时刻，nice值为负的进程所占用的CPU时间 */
	private int nice;

	/** 从系统启动开始累计到当前时刻，核心时间 */
	private int system;

	/** 从系统启动开始累计到当前时刻，除硬盘IO等待时间以外其它等待时间 */
	private int idle;

	public int getUser() {
		return user;
	}

	public void setUser(int user) {
		this.user = user;
	}

	public int getNice() {
		return nice;
	}

	public void setNice(int nice) {
		this.nice = nice;
	}

	public int getSystem() {
		return system;
	}

	public void setSystem(int system) {
		this.system = system;
	}

	public int getIdle() {
		return idle;
	}

	public void setIdle(int idle) {
		this.idle = idle;
	}

}
