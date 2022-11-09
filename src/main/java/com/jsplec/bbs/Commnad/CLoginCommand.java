package com.jsplec.bbs.Commnad;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jsplec.bbs.Dao.HostDao;

public class CLoginCommand implements HCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub

	}
	@Override	
	public int execute2(HttpServletRequest request, HttpServletResponse reqResponse) {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		String id = request.getParameter("cId");
		String pw = request.getParameter("cPw");
		
		HostDao dao = new HostDao();
		int count = dao.ClientLogin(id, pw);
		
		request.setAttribute("CID", id);
		session.setAttribute("ID", id);
		
		
		return 0;
	}

}
