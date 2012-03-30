/**
 * NetInfoService.java
 * com.ihuy.monitor.service
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2012-3-8 		huy
 *
 * Copyright (c) 2012, TNT All Rights Reserved.
 */

package com.ihuy.monitor.service;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.ihuy.monitor.model.NetInfo;

/**
 * ClassName:NetInfoService Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-3-8 下午2:05:51
 * 
 * @see
 */
public interface NetInfoService {

	/**
	 * 获取无线网卡信息 face=" wlan"
	 * 获取以太网卡信息 face="  eth"
	 *  
	 *  */
	public NetInfo getNetInfo(String face) throws FileNotFoundException,
			NumberFormatException, IOException;

}
