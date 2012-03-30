/**
 * ServerInfoService.java
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

import com.ihuy.monitor.model.ServerInfo;

/**
 * ClassName:ServerInfoService Function: TODO ADD FUNCTION Reason: TODO ADD
 * REASON
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-3-11 下午2:44:12
 * 
 * @see
 */
public interface ServerInfoService {

	/**
	 * 获取服务器信息
	 * 
	 * @throws IOException
	 * */
	public ServerInfo getServerInfo() throws IOException;

}
