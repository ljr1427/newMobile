package kr.co.mwings.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "shop")
public class ShopController {
	
	private static final Logger logger = LoggerFactory.getLogger(ShopController.class);
	
	@RequestMapping(value = "shopIntroduce.view", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView shopIntroduce(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/shop/shopIntroduce");
		return mav;
	}
	
	@RequestMapping(value = "shopSongdo.view", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView shopSongdo(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/shop/shopSongdo");
		return mav;
	}
	
}
