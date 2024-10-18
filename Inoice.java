package m.p.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import m.p.dbcon.DbConnection;

@WebServlet("/merc")
public class Inoice extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		resp.setContentType("text/html");
		
		String vname=req.getParameter("vname");
		String inumber=req.getParameter("inumber");
		String idate=req.getParameter("idate");
		String pitem=req.getParameter("pitem");
		String tamount=req.getParameter("tamount");
		String cdate=req.getParameter("cdate");
		
		try {
			
			Connection con=DbConnection.getConnection();
			String insert_query="insert into merc_perchase_items value(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(insert_query);
			
			ps.setString(1, vname);
			ps.setString(2, inumber);
			ps.setString(3, idate);
			ps.setString(4, pitem);
			ps.setString(5, tamount);
			ps.setString(6, cdate);
			
			int count=ps.executeUpdate();
			
			if(count>0) {
				pw.println("<h3 style:'color=green'>Data Save Succcessful</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/save.html");
				rd.include(req, resp);
			}
			else {
				pw.println("<h3 style='color:red'>Data Not Save Due to Some error</h3>");
				RequestDispatcher rd=req.getRequestDispatcher("/entryform.html");
				rd.include(req, resp);
			}	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
