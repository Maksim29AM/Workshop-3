package pl.coderslab.users;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pl.coderslab.UserDao;

import java.io.IOException;

@WebServlet(name="Delete",urlPatterns = "/user/delete")
public class UserDelete extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       UserDao userDao = new UserDao();
       userDao.delete(Integer.parseInt(request.getParameter("id")));
        response.sendRedirect(request.getContextPath() + "/users/delete.jsp");

    }
}
