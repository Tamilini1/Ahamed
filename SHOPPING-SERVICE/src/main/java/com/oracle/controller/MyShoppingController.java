package com.oracle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/shopping")
public class MyShoppingController {
	@GetMapping("/pay/{price}")
	public String payAmout(@PathVariable double price)
	{
		return "My Payment Amout is"+price+"success fully paid";
	}
}
