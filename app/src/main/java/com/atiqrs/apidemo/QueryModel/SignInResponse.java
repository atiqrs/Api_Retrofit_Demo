package com.atiqrs.apidemo.QueryModel;

import com.google.gson.annotations.SerializedName;

public class SignInResponse{

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
			"SignInResponse{" + 
			"response = '" + response + '\'' + 
			"}";
		}
}