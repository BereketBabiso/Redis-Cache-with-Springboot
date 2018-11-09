package com.rediscache.demo.resident.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rediscache.demo.domain.Resident;
import com.rediscache.demo.util.CacheUtil;

@Service
public class ResidentService {
	@Autowired
	private CacheUtil cacheUtil;
	
	public Resident getResidentRecordById(long id) {
		return cacheUtil.getResidentRecordById(id);
	}

}
