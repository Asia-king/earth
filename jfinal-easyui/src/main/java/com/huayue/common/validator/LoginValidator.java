package com.huayue.common.validator;

import com.huayue.common.UrlConfig;
import com.huayue.jbase.jfinal.ext.Validator;
import com.huayue.jbase.util.RSA;
import com.huayue.jbase.util.Validate;
import com.jfinal.core.Controller;

public class LoginValidator extends Validator
{

	@Override
	protected void validate(Controller c)
	{
		validateRequiredString("key",   "请重新登录");

		String key = c.getPara("key");
		if (!Validate.isEmpty(key))
		{
			String [] result = RSA.decryptUsernameAndPwd(key);

			if (result==null) addError( ERROR_MSG, "用户名或密码不能为空");
		}
		
		

	}

	@Override
	protected void handleError(Controller c)
	{
		c.forwardAction(UrlConfig.LOGIN);
	}

}
