package com.skcet.day3_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.day3_1.model.ApiModel;

public interface ApiRepo extends JpaRepository<ApiModel, Integer>{

}
