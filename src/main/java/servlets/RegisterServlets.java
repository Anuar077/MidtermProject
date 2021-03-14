package servlets;

import database.UserDao;
import entities.UserEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

@WebServlet(
        name = "registerServlet",
        urlPatterns = "/registerservlet"
)
public class RegisterServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("registerdb.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao userDao = new UserDao();

        userDao.addUser( new UserEntity(
                        req.getParameter("login"),
                        req.getParameter("password"),
                        req.getParameter("phone")
                )
        );

        req.getRequestDispatcher("registerdb.jsp").forward(req, resp);
    }
}