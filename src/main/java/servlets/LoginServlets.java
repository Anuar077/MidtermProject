package servlets;



import database.UserDao;
import entities.UserEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(
        name = "loginServlet",
        urlPatterns = "/loginservlet"
)
public class LoginServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("logindb.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        UserEntity user = userDao.getUserByLogin(req.getParameter("login"));

        if (user != null && user.getPassword().equals(req.getParameter("password"))) {
            HttpSession session = req.getSession();
            session.setAttribute("login", user.getLogin());
            session.setAttribute("phone", user.getPhone());
        }
        else {
            System.out.println("Failed to login.");
        }

        req.getRequestDispatcher("logindb.jsp").forward(req, resp);
    }
}
