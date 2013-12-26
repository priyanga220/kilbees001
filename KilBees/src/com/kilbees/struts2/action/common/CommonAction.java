package com.kilbees.struts2.action.common;



import com.kilbees.struts2.action.AbstractAction;

public class CommonAction extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public String loadEntrance()
	{
		System.out.println("InComing...");
		return SUCCESS;
	}

}
