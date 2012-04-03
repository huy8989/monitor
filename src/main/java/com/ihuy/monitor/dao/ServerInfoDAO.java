/**
 * ServerInfoDAO.java
 * com.ihuy.monitor.dao
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2012-4-3 		huy
 *
 * Copyright (c) 2012, TNT All Rights Reserved.
 */

package com.ihuy.monitor.dao;

import java.util.Date;
import java.util.List;

import com.ihuy.monitor.model.ServerInfo;

/**
 * ClassName:ServerInfoDAO Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-4-3 下午7:36:18
 * 
 * @see
 */
public interface ServerInfoDAO {

	/**
	 * 
	 * insertServerInfo:插入服务器信息
	 *
	 * @param  @param serverInfo    服务器信息
	 * @return void    DOM对象
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public void insertServerInfo(ServerInfo serverInfo);

	/**
	 * 
	 * getServerInfos:获取ServerInfo列表
	 *
	 * @param  @param begin	查询开始时间
	 * @param  @param end    查询截至时间
	 * @return List        ServerInfo列表
	 * @throws 
	 * @since  CodingExample　Ver 1.1
	 */
	public List<ServerInfo> getServerInfos(Date begin, Date end);

}
