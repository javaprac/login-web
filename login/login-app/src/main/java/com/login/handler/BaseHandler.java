package com.login.handler;

import java.util.Map;

public interface BaseHandler {
	public String getSQL();
	public Map<String, String> getParamMap(Object obj);
}
