/**
 * LoadavgInfoServiceImpl.java
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

import com.ihuy.monitor.model.LoadavgInfo;

/**
 * ClassName:LoadavgInfoServiceImpl Function: TODO ADD FUNCTION Reason: TODO ADD
 * REASON
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-3-8 下午6:39:36
 * 
 * @see
 */
public class LoadavgInfoServiceImpl implements LoadavgInfoService {

	public LoadavgInfo getLoadavgInfo() throws IOException {

		LoadavgInfo loadavgInfo = null;
		// 读取服务器负载信息文件
		File file = new File("/proc/loadavg");
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(file)));

		String str = null;
		StringTokenizer token = null;
		str = br.readLine();

		// 读取信息出错返回null
		if (str == null || "".equals(str)) {
			return loadavgInfo;
		}

		// 读取负载信息
		token = new StringTokenizer(str);
		loadavgInfo = new LoadavgInfo();
		loadavgInfo.setLavg_1(Float.parseFloat(token.nextToken()));
		loadavgInfo.setLavg_5(Float.parseFloat(token.nextToken()));
		loadavgInfo.setLavg_15(Float.parseFloat(token.nextToken()));

		str = token.nextToken();
		StringTokenizer token2 = new StringTokenizer(str, "/");
		loadavgInfo.setNr_running(Integer.parseInt(token2.nextToken()));
		loadavgInfo.setNr_threads(Integer.parseInt(token2.nextToken()));
		loadavgInfo.setLast_pid(Integer.parseInt(token.nextToken()));

		return loadavgInfo;

	}

}
