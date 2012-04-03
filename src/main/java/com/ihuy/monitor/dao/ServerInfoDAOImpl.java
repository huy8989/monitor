/**
 * ServerInfoDAOImpl.java
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ihuy.monitor.model.ServerInfo;

/**
 * ClassName:ServerInfoDAOImpl serverInfo数据库操作类
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-4-3 下午10:34:42
 * 
 * @see
 */
public class ServerInfoDAOImpl extends SqlMapClientDaoSupport implements
		ServerInfoDAO {

	@Override
	public void insertServerInfo(ServerInfo serverInfo) {

		getSqlMapClientTemplate().insert("serverInsert", serverInfo);

	}

	@Override
	public List<ServerInfo> getServerInfos(Date begin, Date end) {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("begin", begin);
		map.put("end", end);
		return getSqlMapClientTemplate().queryForList("getServerInfosBytime",
				map);

	}

}
