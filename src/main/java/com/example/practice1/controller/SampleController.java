package com.example.practice1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {
	/**
	 * 1.パラメータありのコントローラ.<br>
	 * アクセス例:/sample1?message=test
	 *
	 * @param message
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/sample1", method = RequestMethod.GET)
	public String sample1(@RequestParam("message") String message, Model model) {
		model.addAttribute("userName", "ユーザ名");
		model.addAttribute("message", message);
		return "sample1";
	}

	/**
	 * 2.パラメータありのコントローラ.<br>
	 * アクセス例:/hello2/test
	 *
	 * @param message
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/sample2/{message}", method = RequestMethod.GET)
	public String sample2(@PathVariable("message") String message, Model model) {
		model.addAttribute("userName", "ユーザ名");
		model.addAttribute("message", message);
		return "sample2";
	}

	/**
	 * 3.パラメータありのコントローラ(POST).<br>
	 *
	 * @param param
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/sample3", method = RequestMethod.POST)
	public String sample3(SampleParameter param, Model model) {
		model.addAttribute("param", param);
		return "sample3";
	}
}
