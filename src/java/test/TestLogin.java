package test;

import dao.DaoUsuario;
import dao.impl.DaoUsuarioImpl;
import entidad.Usuario;

/**
 *
 * @author Dario
 */
public class TestLogin {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        DaoUsuario dao = new DaoUsuarioImpl();
        
        try {
            usuario = dao.login("Minka", "Minka");
            System.out.println("Nombre del Usuario: " + usuario.getNombres());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(dao.getMessage());
        }
    }
}
