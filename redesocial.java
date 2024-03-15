import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class RedeSocial {
    private List<Usuario> usuarios;

    public RedeSocial() {
        this.usuarios = new ArrayList<>();
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
