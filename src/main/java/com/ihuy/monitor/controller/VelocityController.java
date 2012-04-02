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

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

	@RequestMapping(value = "velocity.do")
	public void index_jsp(Model model) {
		model.addAttribute("liming", "黎明你好");
		System.out.println("hello");
	}
}
