/**
 * MemInfoServiceImpl.java
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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.ihuy.monitor.model.MemInfo;

/**
 * ClassName:MemInfoServiceImpl Function: TODO ADD FUNCTION Reason: TODO ADD
 * REASON
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-3-8 下午7:55:11
 * 
 * @see
 */

public class MemInfoServiceImpl {

	public static MemInfo getMemInfo() throws NumberFormatException,
			IOException {

		MemInfo memInfo = new MemInfo();
		File file = new File("/proc/meminfo");
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(file)));
		String str = null;
		StringTokenizer token = null;
		int memFree = 0;
		while ((str = br.readLine()) != null) {
			token = new StringTokenizer(str);
			if (!token.hasMoreTokens()) {
				continue;
			}

			str = token.nextToken();
			if (!token.hasMoreTokens()) {
				continue;
			}

			// 空闲内存=free+buffers+cached
			if (str.equalsIgnoreCase("MemTotal:")) {
				memInfo.setMemTotal(Integer.parseInt(token.nextToken()));
			} else if (str.equalsIgnoreCase("MemFree:")) {
				memFree = +Integer.parseInt(token.nextToken());
			} else if (str.equalsIgnoreCase("Buffers:")) {
				memFree = +Integer.parseInt(token.nextToken());
			} else if (str.equalsIgnoreCase("Cached:")) {
				memFree = +Integer.parseInt(token.nextToken());
				memInfo.setMemFree(memFree);
			}

		}
		return memInfo;
	}

}
