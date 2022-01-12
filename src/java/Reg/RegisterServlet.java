package Reg;

import java.io.IOException; 

import Reg.RegisterBean;
import Reg.RegisterDao;


import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

 
 
public class RegisterServlet extends HttpServlet {
  
     public RegisterServlet() {
     }
 
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Copying all the input parameters in to local variables
         String fullName = request.getParameter("fullname");
         String email = request.getParameter("email");
         String userName = request.getParameter("username");
         String password = request.getParameter("password");
          
         RegisterBean registerBean = new RegisterBean();
        //Using Java Beans - An easiest way to play with group of related data
         registerBean.setFullName(fullName);
         registerBean.setEmail(email);
         registerBean.setUserName(userName);
         registerBean.setPassword(password); 
          
         RegisterDao registerDao = new RegisterDao();
          
        //The core Logic of the Registration application is present here. We are going to insert user data in to the database.
         String userRegistered = registerDao.registerUser(registerBean);
          
         if(userRegistered.equals("SUCCESS"))   //On success, you can display a message to user on Home page
         {
            request.getRequestDispatcher("/reg/HomeRegister.jsp").forward(request, response);
         }
         else   //On Failure, display a meaningful message to the User.
         {
            request.setAttribute("errMessage", userRegistered);
            request.getRequestDispatcher("/reg/Register.jsp").forward(request, response);
         }
     }
}