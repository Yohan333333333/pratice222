package com.jsplec.bbs.homecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.Commnad.HCommand;

import com.jsplec.bbs.Commnad.CLoginCommand;
/**
 * Servlet implementation class HostController
 */
@WebServlet("*.do")
public class HostController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HostController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
	}	protected void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("actionDo");
		request.setCharacterEncoding("utf-8");

		String viewPage = null;
		HCommand command = null;

		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
	
		
		switch (com) {
		// 로그인
		case ("/ClientLogin.do"):
			System.out.println("login.do에 들어왔습니다.");
			command = new CLoginCommand();
			int count = command.execute2(request, response);
			
			if (count == 1) {
				request.setAttribute("COUNT", count);
				viewPage = "ClientMain.jsp";
			} else {
				viewPage = "ClientLogin.jsp";
			}
			
			break;
			
			//메인 화면에서 호스트 회원가입 약관 띄우기
			case("/Hostsignup.do"):
				System.out.println("Hostlogin.do에 들어왔습니다.");
			command = new HostSignup_Command();
			int count = command.execute2(request, response);
			
			if (count == 1) {
				request.setAttribute("COUNT", count);
				viewPage = "HostLogin.jsp";
			} else {
				viewPage = "ClientLogin.jsp";
			}
			
			break;
			
	
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
