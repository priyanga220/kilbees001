package com.kilbees.struts2.action;



import com.opensymphony.xwork2.ActionSupport;

public abstract class  AbstractAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int x;
	private int y;


	public String alwaysSuccess() {
		return SUCCESS;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
