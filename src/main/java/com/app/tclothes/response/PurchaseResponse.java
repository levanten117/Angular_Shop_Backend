package com.app.tclothes.response;

import lombok.Data;
import lombok.NonNull;

@Data
public class PurchaseResponse {
	
	@NonNull
	private String orderTrackingNumber;
}