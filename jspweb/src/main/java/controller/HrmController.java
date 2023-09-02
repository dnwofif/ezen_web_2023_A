package controller;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import model.dao.HrmDao;
import model.dto.HrmDto;


@WebServlet("/HrmController")
public class HrmController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public HrmController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<HrmDto> result = HrmDao.getInstance().hread();
		ObjectMapper objectMapper = new ObjectMapper();
		String jsonArray = objectMapper.writeValueAsString( result ); 
		System.out.println( jsonArray );
		
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().print( jsonArray ); 
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uploadpath = request.getServletContext().getRealPath("hrm/img");
		
		System.out.println("hrm 폴더 img 폴더 실제(서버) 경로 : "+ uploadpath);
		
			MultipartRequest multi = new MultipartRequest(
					request,
					uploadpath,
					1024*1024*10,
					"UTF-8",
					new DefaultFileRenamePolicy()
					);
		String himg = multi.getFilesystemName("himg"); 		System.out.println("himg : "+himg);
		String hname = multi.getParameter("hname"); 	System.out.println("hname : "+hname);
		String hphone = multi.getParameter("hphone"); 	System.out.println("hphone : "+hphone);
		String hrank = multi.getParameter("hrank"); 	System.out.println("hrank : "+hrank);
		String hdate = multi.getParameter("hdate"); 	System.out.println("hdate : "+hdate);
		
		if( himg == null ) { System.out.println("사진을 넣어주세요.");}
		HrmDto hrmDto = new HrmDto(himg, hname, hphone, hrank, hdate);
		boolean result = HrmDao.getInstance().signup(hrmDto);
		
		response.setContentType("application/json;charset=UTF-8");
   		response.getWriter().print(result);
		
	}

}
