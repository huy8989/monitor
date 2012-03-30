/**
 * LoadavgInfoService.java
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

import com.ihuy.monitor.model.LoadavgInfo;

/**
 * ClassName:LoadavgInfoService Function: TODO ADD FUNCTION Reason: TODO ADD
 * REASON
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-3-8 下午4:10:26
 * 
 * @see
 */
public interface LoadavgInfoService {

	public LoadavgInfo getLoadavgInfo() throws FileNotFoundException, IOException;

}
