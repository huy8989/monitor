/**
 * ExampleDAOImpl.java
 * com.ihuy.monitor.dao
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2012-4-2 		huy
 *
 * Copyright (c) 2012, TNT All Rights Reserved.
*/

package com.ihuy.monitor.dao;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.ihuy.monitor.model.Example;

/**
 * ClassName:ExampleDAOImpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   huy
 * @version  
 * @since    Ver 1.1
 * @Date	 2012-4-2		下午2:49:46
 *
 * @see 	 
 */
public class ExampleDAOImpl extends SqlMapClientDaoSupport implements ExampleDAO{

	@Override
	public Example getExampleName(int id) {
		
		return (Example) getSqlMapClientTemplate().queryForList(
				"getExampleName", id).get(0);
		
	}

}

