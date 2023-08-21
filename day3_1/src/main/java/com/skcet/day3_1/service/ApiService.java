package com.skcet.day3_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcet.day3_1.model.ApiModel;
import com.skcet.day3_1.repository.ApiRepo;

@Service
public class ApiService {
	@Autowired
ApiRepo anu;
public ApiModel saveinfo(ApiModel an)
{
	return anu.save(an);
}
public List<ApiModel>showinfo()
{
	return anu.findAll();
	}
}
