package com.codepath.models;

import org.json.JSONException;
import org.json.JSONObject;

public class User {
	private String name;
	private String profileImageUrl;
	@SuppressWarnings("unused")
	private String location;
	@SuppressWarnings("unused")
	private String profileBackgroundImageUrl;
	private String screenName;
	
	public User(JSONObject userJSON) throws JSONException {
		name = userJSON.getString("name");
		screenName =  userJSON.getString("screen_name");
		profileImageUrl =  userJSON.getString("profile_image_url");
		profileBackgroundImageUrl =  userJSON.getString("profile_background_image_url");
		location = userJSON.getString("location");
	}

	public String getName() {
		return name;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	
	public String getHandle() {
		return screenName;
	}
	
}