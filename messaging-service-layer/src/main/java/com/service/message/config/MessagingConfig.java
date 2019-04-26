package com.service.message.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MessagingConfig {

	@Value("${smsconfig-apikey}")
	private String apiKey;
	@Value(" Bhai Tough h bnanana")
	private String message;
	@Value("${smsconfig-number}")
	private String mobileNumber;
	
	@Override
	public String toString() {
		return "SmsConfig [apiKey=" + apiKey + ", message=" + message + ", mobileNumber="
				+ mobileNumber + "]";
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}
