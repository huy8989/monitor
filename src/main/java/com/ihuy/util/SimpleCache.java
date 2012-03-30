/**
 * DataCache.java
 * com.ihuy.util
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2012-3-11 		huy
 *
 * Copyright (c) 2012, TNT All Rights Reserved.
 */

package com.ihuy.util;


/**
 * ClassName:DataCache 
 * 
 * 不存在并发问题，故为考虑并发
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-3-11 下午3:14:18
 * 
 * @see
 */
public class SimpleCache {
	
	protected static final FIFOHashMap map = new FIFOHashMap(); // Cache table


	private SimpleCache() {
	} // 防止在外部实例化

	/*
	 * 不存在返回null
	 */
	public static Object get(Object key) {
		Object v = map.get(key);
		return v;

	}

	/*
	 * Load data from data source.
	 */
	public static  void put(Object key, Object value) {
		map.put(key, value);
	}
}
