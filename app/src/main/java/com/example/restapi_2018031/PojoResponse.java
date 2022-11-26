package com.example.restapi_2018031;

import java.util.List;

public class PojoResponse {
	private int code;
	private List<DataItem> data;
	private String status;

	public int getCode(){
		return code;
	}

	public List<DataItem> getData(){
		return data;
	}

	public String getStatus(){
		return status;
	}
}