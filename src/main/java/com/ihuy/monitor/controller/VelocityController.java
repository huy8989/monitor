/**
 * VelocityController.java
 * com.ihuy.monitor.controller
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2012-4-2 		huy
 *
 * Copyright (c) 2012, TNT All Rights Reserved.
 */

package com.ihuy.monitor.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ihuy.monitor.dao.ServerInfoDAO;
import com.ihuy.monitor.model.ServerInfo;
import com.ihuy.monitor.service.ServerInfoService;
import com.ihuy.monitor.service.ServerInfoServiceImpl;

/**
 * ClassName:VelocityController Function: TODO ADD FUNCTION Reason: TODO ADD
 * REASON
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-4-2 下午4:36:39
 * 
 * @see
 */
@Controller
public class VelocityController {

	Logger logger = Logger.getLogger("VelocityController.class");

	private ServerInfoDAO serverInfoDAO;

	public ServerInfoDAO getServerInfoDAO() {
		return serverInfoDAO;
	}

	public void setServerInfoDAO(ServerInfoDAO serverInfoDAO) {
		this.serverInfoDAO = serverInfoDAO;
	}

	@RequestMapping(value = "velocity.do")
	public void index_jsp(Model model) throws IOException,
			InterruptedException, ParseException {
		ServerInfoService service = new ServerInfoServiceImpl();
		ServerInfo server = service.getServerInfo();
		Thread.sleep(1000);
		server = service.getServerInfo();
		logger.info(String.valueOf(server.getcPURate()));
		logger.info(String.valueOf(server.getMemRate()));
		logger.info(String.valueOf(server.getNetLoad()));
		List<ServerInfo> serverInfos = null;

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		serverInfos = serverInfoDAO.getServerInfos(
				df.parse("2012-04-04 00:00:00"),
				df.parse("2012-04-04 01:46:05"));
		model.addAttribute("serverInfos", serverInfos);
		serverInfoDAO.insertServerInfo(server);
	}
}
