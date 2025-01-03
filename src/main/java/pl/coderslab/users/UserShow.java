package pl.coderslab.users;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pl.coderslab.User;
import pl.coderslab.UserDao;

import java.io.IOException;


@WebServlet(name = "Show", urlPatterns = "/user/show")
public class UserShow extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("id");
            UserDao userDao = new UserDao();
            User user = userDao.read(Integer.parseInt(userId));
            request.setAttribute("user", user);

        getServletContext().getRequestDispatcher("/users/show.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("id");
            UserDao userDao = new UserDao();
            User user = userDao.read(Integer.parseInt(userId));
            request.setAttribute("user", user);
        getServletContext().getRequestDispatcher("/users/show.jsp").forward(request, response);
    }
}