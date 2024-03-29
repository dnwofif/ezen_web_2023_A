package controller.library;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.dao.library.LibraryDao;
import model.dto.library.LibraryDto;


@WebServlet("/Library")
public class Library extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Library() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<LibraryDto> list = LibraryDao.getInstance().seatPrint();
		
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(list);
		
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().print(json);
		System.out.println("자바통신");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LibraryDto dto = new LibraryDto();
		dto.setSno(Integer.parseInt(request.getParameter("sno")));
		dto.setUname(request.getParameter("name"));
		dto.setUphone(request.getParameter("phone"));
		
		
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().print(LibraryDao.getInstance().enterSeat(dto));
		System.out.println("자바통신 post");
		
		
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	  protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		      LibraryDto dto = new LibraryDto();
		      dto.setSno(Integer.parseInt(request.getParameter("sno")));
		      dto.setUphone(request.getParameter("phone"));
		      boolean result = LibraryDao.getInstance().exitSeat(dto);
		      System.out.println("dto : "+dto);
		   
		      response.setContentType("application/json;charset=UTF-8");
		      response.getWriter().print(result);
		      }

		}