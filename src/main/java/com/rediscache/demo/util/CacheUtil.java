package com.rediscache.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.rediscache.demo.domain.Resident;
import com.rediscache.demo.repository.ResidentRepository;

@Component
public class CacheUtil {
	@Autowired
	private ResidentRepository residentRepository;
	
	@Cacheable(value="residentInfo", key="#id")
	public Resident getResidentRecordById(long id) {
		System.out.println("cacheeeee");
		return residentRepository.findById(id).get();
	}

}
