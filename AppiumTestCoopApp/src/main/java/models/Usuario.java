package models;

public class Usuario {

    private String usuario;
    private String password;

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public Usuario(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }
}
