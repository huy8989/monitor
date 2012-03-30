/**
 * FIFOHashMap.java
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

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * ClassName:FIFOHashMap Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-3-11 下午3:38:57
 * 
 * @see
 */
public class FIFOHashMap extends LinkedHashMap {

	/**缓存器最大容量*/
	private static final int SIZE = 100;

	protected boolean removeEldestEntry(Map.Entry eldest) {
		return size() > SIZE;
	}

}
