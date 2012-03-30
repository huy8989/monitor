/**
 * NetInfoServiceImpl.java
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

import com.ihuy.monitor.model.NetInfo;

/**
 * ClassName:NetInfoServiceImpl Function: TODO ADD FUNCTION Reason: TODO ADD
 * REASON
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-3-8 下午8:45:26
 * 
 * @see
 */
public class NetInfoServiceImpl {

	public static NetInfo getNetInfo(String face) throws NumberFormatException,
			IOException {

		NetInfo netInfo = new NetInfo();
		File file = new File("/proc/net/dev");
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(file)));
		String str = null;
		StringTokenizer token = null;

		while (((str = br.readLine()) != null)) {
			if (str.startsWith(face, 0)) {
				token = new StringTokenizer(str);
				if (!token.hasMoreTokens()) {
					continue;
				}
				token = new StringTokenizer(str);
				netInfo.setFace(token.nextToken());
				netInfo.setReBytes(Long.parseLong(token.nextToken()));
				netInfo.setRePackets(Long.parseLong(token.nextToken()));
				netInfo.setReErrs(Long.parseLong(token.nextToken()));
				netInfo.setReDrop(Long.parseLong(token.nextToken()));
				netInfo.setReFifo(Long.parseLong(token.nextToken()));
				netInfo.setReFrame(Long.parseLong(token.nextToken()));
				netInfo.setReCompressed(Long.parseLong(token.nextToken()));
				netInfo.setReMulticast(Long.parseLong(token.nextToken()));
				netInfo.setTrBytes(Long.parseLong(token.nextToken()));
				netInfo.setTrPackets(Long.parseLong(token.nextToken()));
				netInfo.setTrErrs(Long.parseLong(token.nextToken()));
				netInfo.setTrDrop(Long.parseLong(token.nextToken()));
				netInfo.setTrFifo(Long.parseLong(token.nextToken()));
				netInfo.setTrColls(Long.parseLong(token.nextToken()));
				netInfo.setTrCarrier(Long.parseLong(token.nextToken()));
				netInfo.setTrCompressed(Long.parseLong(token.nextToken()));

			}
		}
		return netInfo;

	}

}
