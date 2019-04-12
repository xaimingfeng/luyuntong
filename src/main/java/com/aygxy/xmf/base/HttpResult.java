package com.aygxy.xmf.base;

import com.alibaba.fastjson.JSON;

/**
 * 响应结果封装
 */
public class HttpResult {
	
    private HttpResponse response;
    
    public HttpResult(){
    	response = new HttpResponse();
    	response.setResultCode(1);
    }
    
    public HttpResult(String message){
    	response = new HttpResponse();
    	response.setResultCode(2);
    	response.setMessage(message);
    }
    
    
    public HttpResponse getResponse() {
		return response;
	}

	public void setResponse(HttpResponse response) {
		this.response = response;
	}
	
	public void setMessage(String message) {
		response.resultCode = 2;
		response.message = message;
	}
	
	public class HttpResponse{
		
		private String message;
		
		private Integer resultCode;

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public Integer getResultCode() {
			return resultCode;
		}

		public void setResultCode(Integer resultCode) {
			this.resultCode = resultCode;
		}
		
	}
	
	@Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}

