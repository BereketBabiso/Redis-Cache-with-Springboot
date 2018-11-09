package com.rediscache.demo.resident.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rediscache.demo.domain.Resident;
import com.rediscache.demo.resident.service.ResidentService;

@RestController
@RequestMapping(path="/residents")
public class ResidentController {
	@Autowired
	private ResidentService residentService;
	
	@GetMapping("/{id}")
	public Resident getResident(@PathVariable String id) {
		return residentService.getResidentRecordById(Long.parseLong(id));
	}

}
