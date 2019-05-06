package com.atiqrs.apidemo.RegModel;

import com.google.gson.annotations.SerializedName;

public class RegistrationResponse{

	@SerializedName("response")
	private Response response;

	public void setResponse(Response response){
		this.response = response;
	}

	public Response getResponse(){
		return response;
	}

	@Override
 	public String toString(){
		return 
			"RegistrationResponse{" + 
			"response = '" + response + '\'' + 
			"}";
		}
}