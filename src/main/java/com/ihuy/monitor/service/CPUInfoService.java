/**
 * CPUInfoService.java
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

import java.io.FileNotFoundException;
import java.io.IOException;

import com.ihuy.monitor.model.CPUInfo;

/**
 * ClassName:CPUInfoService Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-3-11 上午10:43:46
 * 
 * @see
 */
public interface CPUInfoService {

	public CPUInfo getCPUInfo() throws FileNotFoundException, IOException;

}
