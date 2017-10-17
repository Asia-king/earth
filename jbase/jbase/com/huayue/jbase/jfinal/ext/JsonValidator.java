package com.huayue.jbase.jfinal.ext;

import com.huayue.jbase.jfinal.ext.Validator;
import com.huayue.model.json.SendJson;
import com.jfinal.core.Controller;

public class JsonValidator extends Validator
{
	
	
	
	protected void addError(int code )
	{
		super.addError("code", code+"");
		
	}
	
	
	
	
	
	
	@Override
	protected void handleError(Controller c)
	{
		c.renderJson(new SendJson(Integer.parseInt((String)c.getAttr("code"))) .toJson());
		
	}

}
