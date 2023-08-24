

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;


@WebServlet("/Accountbook")
public class Accountbook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Accountbook() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    //1. 저장
  	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		String vcontent = request.getParameter("vcontent"); 	System.out.println("vcontent : "+vcontent);
  		String vamount = request.getParameter("vamount");		System.out.println("vamount : "+vamount);
  		String vdate = request.getParameter("vdate"); 			System.out.println("vdate : "+vdate);
  		AccountbookDto accountbookDto = new AccountbookDto(vcontent, vamount, vdate); System.out.println("accountbookDto : "+accountbookDto);
  		boolean result = AccountbookDao.getInstance().vwrite(accountbookDto);
  		response.setContentType("application/json;charset=UTF-8");
  		response.getWriter().print(result);
  	}
    
	//2. 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<AccountbookDto> result = AccountbookDao.getInstance().vread();
		ObjectMapper objectMapper = new ObjectMapper();
	}

	//3. 수정
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	//4. 삭제
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
