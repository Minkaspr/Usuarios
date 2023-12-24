package test;

import dao.DaoUsuario;
import dao.impl.DaoUsuarioImpl;
import entidad.Usuario;

/**
 *
 * @author Dario
 */
public class TestRegister {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        DaoUsuario dao = new DaoUsuarioImpl();
        
        // Establece los detalles del usuario con datos ficticios
        usuario.setNombres("Juan");
        usuario.setPaterno("Pérez");
        usuario.setMaterno("González");
        usuario.setUsuario("juanpg");
        usuario.setClave("Contra123");

        try {
            // Intenta registrar al usuario
            String result = dao.register(usuario);
            System.out.println("Usuario Registrado");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(dao.getMessage());
        }
    }
}
