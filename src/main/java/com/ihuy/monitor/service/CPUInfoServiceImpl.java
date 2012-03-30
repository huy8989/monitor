/**
 * CPUInfoServiceImpl.java
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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.ihuy.monitor.model.CPUInfo;
import com.ihuy.monitor.model.LoadavgInfo;

/**
 * ClassName:CPUInfoServiceImpl
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   huy
 * @version  
 * @since    Ver 1.1
 * @Date	 2012-3-11		上午10:44:24
 *
 * @see 	 
 */
public class CPUInfoServiceImpl {

	public static CPUInfo getCPUInfo() throws IOException {
		
		CPUInfo CPUInfo = null;
		
		//读取服务器CPU信息文件
		File file = new File("/proc/stat");
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(file)));

		String str = null;
		StringTokenizer token = null;
		str = br.readLine();
		
		// 读取信息出错返回null
		if (str == null || "".equals(str)) {
			return CPUInfo;
		}

		// 读取CPU信息
		token = new StringTokenizer(str);
		CPUInfo = new CPUInfo();
		token.nextToken();
		CPUInfo.setUser(Integer.parseInt(token.nextToken()));
		CPUInfo.setNice(Integer.parseInt(token.nextToken()));
		CPUInfo.setSystem(Integer.parseInt(token.nextToken()));
		CPUInfo.setIdle(Integer.parseInt(token.nextToken()));

		return CPUInfo;
		
	}

}

