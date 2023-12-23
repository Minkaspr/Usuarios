package dao.impl;

import dao.DaoUsuario;
import entidad.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.ConexionBD;

/**
 *
 * @author Dario
 */
public class DaoUsuarioImpl implements DaoUsuario{
    
    private final ConexionBD conexion;
    private String mensaje;

    public DaoUsuarioImpl() {
        this.conexion = new ConexionBD();
    }
    
    @Override
    public Usuario login(String user, String pass) {
        Usuario usuario = new Usuario();
        StringBuilder query = new StringBuilder();
        query.append("SELECT ")
                .append("id, ")
                .append("nombres, ")
                .append("paterno, ")
                .append("materno, ")
                .append("usuario ")
                .append("FROM usuario ")
                .append("WHERE usuario = ? ")
                .append("AND (AES_DECRYPT(clave, ? ) = ? )");
        try (Connection cn = conexion.conexionBD()) {
            // Establecer la conexión con la base de datos y preparar la consulta SQL
            PreparedStatement ps = cn.prepareStatement(query.toString());
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, pass);

            try (ResultSet rs = ps.executeQuery()) {
                // Ejecutar la consulta y verificar si se encontró un registro
                if (rs.next()) {
                    // Construir el objeto Usuario con los datos obtenidos de la base de datos
                    usuario.setId(rs.getInt(1));
                    usuario.setNombres(rs.getString(2));
                    usuario.setPaterno(rs.getString(3));
                    usuario.setMaterno(rs.getString(4));
                    usuario.setUsuario(rs.getString(5));
                } else {
                    usuario = null;
                    mensaje = "Usuario no registrado";
                }
            } catch (Exception e) {
                // Capturar excepciones relacionadas con la consulta y almacenar el mensaje de error
                mensaje = e.getMessage();
            }
        } catch (Exception e) {
            // Capturar excepciones relacionadas con la conexión y almacenar el mensaje de error
            mensaje = "Error: " + e.getMessage();
        }
        // Devolver el objeto Usuario encontrado o null si no se encontró ninguno
        return usuario;
    }

    @Override
    public String getMessage() {
        return mensaje;
    }
    
}
