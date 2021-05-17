/******************************************************************************
*  Date:   17 may. 2021
*  Author: Xavier Carrizo / Marco Calvo
*
*****************************************************************************/
package com.holygift.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fractals")
public class FractalsController {
	
	@RequestMapping("mandelbrot")
	public String Mandelbrot() {
		return "Greetings! Mandelbrot is a work in progress";
	}
	
	@RequestMapping("snowflakes")
	public String Snowflakes() {
		return "Greetings! Snowflakes is a work in progress";
	}
	
	@RequestMapping("dragon")
	public String Dragon() {
		return "Greetings! Dragon is a work in progress";
	}

}
