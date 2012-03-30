/**
 * MemInfoService.java
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

import com.ihuy.monitor.model.MemInfo;

/**
 * ClassName:MemInfoService Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-3-8 下午2:50:27
 * 
 * @see
 */
public interface MemInfoService {

	public MemInfo getMemInfo() throws FileNotFoundException, NumberFormatException, IOException;

}
