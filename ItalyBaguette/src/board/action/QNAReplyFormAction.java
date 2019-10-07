package board.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.control.CommandProcess;

public class QNAReplyFormAction implements CommandProcess {
	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {

		String pseq = request.getParameter("pseq");
		String pg = request.getParameter("pg");

		request.setAttribute("display", "/board/QNAReplyForm.jsp");
		request.setAttribute("pseq", pseq);
		request.setAttribute("pg", pg);

		return "/main/index.jsp";
	}
}