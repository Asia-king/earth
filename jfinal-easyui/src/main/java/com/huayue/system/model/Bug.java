package com.huayue.system.model;

import com.huayue.jbase.jfinal.ext.model.EasyuiModel;
import com.jfinal.ext.plugin.tablebind.TableBind;

@TableBind(tableName = "system_bug")
public class Bug extends EasyuiModel<Bug>
{
	private static final long serialVersionUID = 3706516534681611550L;

	public static Bug dao = new Bug();




}
