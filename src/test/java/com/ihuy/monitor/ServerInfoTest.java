/**
 * ServerInfoTest.java
 * com.ihuy.monitor
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2012-4-3 		huy
 *
 * Copyright (c) 2012, TNT All Rights Reserved.
 */

package com.ihuy.monitor;

import java.io.IOException;

import junit.framework.TestCase;

import com.ihuy.monitor.constants.Constants;
import com.ihuy.monitor.dao.ExampleDAO;
import com.ihuy.monitor.dao.ExampleDAOImpl;
import com.ihuy.monitor.dao.ServerInfoDAO;
import com.ihuy.monitor.dao.ServerInfoDAOImpl;
import com.ihuy.monitor.model.ServerInfo;
import com.ihuy.monitor.service.ServerInfoService;
import com.ihuy.monitor.service.ServerInfoServiceImpl;
import com.ihuy.util.SimpleCache;

/**
 * ClassName:ServerInfoTest Function: TODO ADD FUNCTION Reason: TODO ADD REASON
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-4-3 下午5:34:24
 * 
 * @see
 */
public class ServerInfoTest extends TestCase {

	public void testServerInfoImpl() throws IOException, InterruptedException {
		ServerInfoService service = new ServerInfoServiceImpl();
		System.out.println(SimpleCache.get(Constants.PRE_SERVER_INFO));
		ServerInfo server = service.getServerInfo();
		/*
		 * while (true) { server = service.getServerInfo();
		 * System.out.println("CPURate:" + server.getcPURate());
		 * System.out.println("MemRate:" + server.getMemRate());
		 * Thread.sleep(3000); }
		 */
	}

	/*public void testServerInfoInsert() throws IOException {
		ServerInfoDAO serverInfoDAO = new ServerInfoDAOImpl();
		ServerInfoService service = new ServerInfoServiceImpl();
		ServerInfo server = service.getServerInfo();
		serverInfoDAO.insertServerInfo(server);
	}*/

	public void testExample() {
		ExampleDAO dao = new ExampleDAOImpl();
		System.out.println(dao.getExampleName(1));
	}

}
