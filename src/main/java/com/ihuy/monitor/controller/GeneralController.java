/**
 * GeneralController.java
 * com.ihuy.monitor.controller
 *
 * Function： TODO 
 *
 *   ver     date      		author
 * ──────────────────────────────────
 *   		 2012-3-29 		huy
 *
 * Copyright (c) 2012, TNT All Rights Reserved.
 */

package com.ihuy.monitor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ihuy.monitor.dao.ExampleDAO;

/**
 * ClassName:GeneralController Function: TODO ADD FUNCTION Reason: TODO ADD
 * REASON
 * 
 * @author huy
 * @version
 * @since Ver 1.1
 * @Date 2012-3-29 上午9:53:24
 * 
 */
@Controller
public class GeneralController {

	private ExampleDAO exampleDAO;

	public ExampleDAO getExampleDAO() {
		return exampleDAO;
	}

	public void setExampleDAO(ExampleDAO exampleDAO) {
		this.exampleDAO = exampleDAO;
	}

	@RequestMapping(value = "index.do")
	public void index_jsp(Model model) {
		model.addAttribute("liming", "黎明你好");
		model.addAttribute("name", exampleDAO.getExampleName(1));
		System.out.println("index.jsp");
	}
}
