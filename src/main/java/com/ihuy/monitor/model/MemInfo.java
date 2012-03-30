/**
 * MemInfo.java
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
 * ClassName:MemInfo
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   huy
 * @version  
 * @since    Ver 1.1
 * @Date	 2012-3-8		下午2:16:35
 *
 * @see 	 
 */
public class MemInfo {
	
	/**内存总大小*/
	private int memTotal;
	
	/**空闲内存大小*/
	private int memFree;

	public int getMemTotal() {
		return memTotal;
	}

	public void setMemTotal(int memTotal) {
		this.memTotal = memTotal;
	}

	public int getMemFree() {
		return memFree;
	}

	public void setMemFree(int memFree) {
		this.memFree = memFree;
	}
	
	
	
	

}

