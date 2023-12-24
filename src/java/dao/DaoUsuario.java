package dao;

import entidad.Usuario;

/**
 *
 * @author Dario
 */
public interface DaoUsuario {
    Usuario login (String user, String pass);
    String register(Usuario usuario);
    String getMessage();
}
