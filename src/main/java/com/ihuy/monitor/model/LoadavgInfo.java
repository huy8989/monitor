/**
 * LoadavgInfo.java
 * com.ihuy.monitor.model
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2012-3-8 		huy
 *
 * Copyright (c) 2012, TNT All Rights Reserved.
 */

package com.ihuy.monitor.model;

/**
 * ClassName:LoadavgInfo Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-3-8 下午3:45:56
 * 
 * @see
 */
public class LoadavgInfo {

	/** 1-分钟平均负载 */
	private float lavg_1;

	/** 5-分钟平均负载 */
	private float lavg_5;

	/** 15-分钟平均负载 */
	private float lavg_15;

	/** 在采样时刻，运行队列的任务的数目 */
	private int nr_running;

	/** 在采样时刻，系统中活跃的任务的个数（不包括运行已经结束的任务） */
	private int nr_threads;

	/** 最大的pid值，包括轻量级进程，即线程。 */
	private int last_pid;

	public float getLavg_1() {
		return lavg_1;
	}

	public void setLavg_1(float lavg_1) {
		this.lavg_1 = lavg_1;
	}

	public float getLavg_5() {
		return lavg_5;
	}

	public void setLavg_5(float lavg_5) {
		this.lavg_5 = lavg_5;
	}

	public float getLavg_15() {
		return lavg_15;
	}

	public void setLavg_15(float lavg_15) {
		this.lavg_15 = lavg_15;
	}

	public int getNr_running() {
		return nr_running;
	}

	public void setNr_running(int nr_running) {
		this.nr_running = nr_running;
	}

	public int getNr_threads() {
		return nr_threads;
	}

	public void setNr_threads(int nr_threads) {
		this.nr_threads = nr_threads;
	}

	public int getLast_pid() {
		return last_pid;
	}

	public void setLast_pid(int last_pid) {
		this.last_pid = last_pid;
	}

}
