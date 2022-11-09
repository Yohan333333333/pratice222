package com.jsplec.bbs.Commnad;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface HCommand {

	public void execute(HttpServletRequest request, HttpServletResponse response);
	
	
	


	public int execute2(HttpServletRequest request, HttpServletResponse response);
	
	
}
