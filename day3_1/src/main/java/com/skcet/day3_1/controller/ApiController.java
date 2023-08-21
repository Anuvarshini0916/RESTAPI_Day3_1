package com.skcet.day3_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.day3_1.model.ApiModel;
import com.skcet.day3_1.service.ApiService;

@RestController
public class ApiController {
@Autowired
ApiService aser;
@PostMapping("addEmp")
public ApiModel add(@RequestBody ApiModel an)
{
	return aser.saveinfo(an);
}
public List<ApiModel>show()
{
	return aser.showinfo();
}
}
