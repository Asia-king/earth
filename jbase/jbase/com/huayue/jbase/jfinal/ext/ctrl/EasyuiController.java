package com.huayue.jbase.jfinal.ext.ctrl;

import java.util.List;

import com.huayue.model.easyui.DataGrid;
import com.huayue.model.easyui.Form;

public class EasyuiController<T> extends Controller<T>
{
	
	public DataGrid<T> getDataGrid()
	{
		DataGrid<T> dg = new DataGrid<T>();
		dg.sortName = getPara("sort", "");
		dg.sortOrder = getPara("order", "");
		dg.page = getParaToInt("page", 1);
		dg.total = getParaToInt("rows", 15);

		return dg;
	}


}
