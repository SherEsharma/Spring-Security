package com.xenture.service;

import java.util.List;

import com.xenture.model.UserProfile;



public interface UserProfileService {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
