package com.raphael.fundamentals.oo;
import com.raphael.fundamentals.infra.UsuarioRepository;
import com.raphael.fundamentals.infra.PersistenciaException;

public class UsuarioService {
    private final UsuarioRepository repo;

    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    public void cadastrarNovoUsuario(UsuarioSistema usuario) throws AuthException, PersistenciaException {
        if (!usuario.isValido()) {
            throw new AuthException(usuario.getLogin());
        }
        repo.persistir(usuario);
    }
}
