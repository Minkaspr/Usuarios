package web.servlet;

import dao.DaoUsuario;
import dao.impl.DaoUsuarioImpl;
import entidad.Usuario;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dario
 */
@WebServlet(name = "UsuarioServlet", urlPatterns = {"/Usuario"})
public class UsuarioServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String accion = request.getParameter("accion");
        accion = (accion == null) ? "" : accion;

        String result;
        String target = "login.jsp";
        Usuario usuario = null;
        DaoUsuario dao = new DaoUsuarioImpl();

        String user;
        String pass;

        switch (accion) {
            case "LOGIN":
                user = request.getParameter("usuario");
                pass = request.getParameter("clave");
                usuario = dao.login(user, pass);
                result = dao.getMessage();
                target = result == null ? "dashboard.jsp" : "login.jsp";
                break;
            case "REGISTER":
                user = request.getParameter("usuario");
                pass = request.getParameter("clave");
                String nombres = request.getParameter("nombres");
                String paterno = request.getParameter("paterno");
                String materno = request.getParameter("materno");
                usuario = new Usuario();
                usuario.setUsuario(user);
                usuario.setClave(pass);
                usuario.setNombres(nombres);
                usuario.setPaterno(paterno);
                usuario.setMaterno(materno);
                dao.register(usuario);
                result = dao.getMessage();
                target = result == null ? "login.jsp" : "register.jsp";
                break;
            case "":
                result = "Solicitud requerida";
                break;
            default:
                result = "Solicitud no reconocida";
        }

        if (result != null) {
            request.setAttribute("message", result);
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher(target);
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
