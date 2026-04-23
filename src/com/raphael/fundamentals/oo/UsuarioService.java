package com.raphael.fundamentals.oo;
import com.raphael.fundamentals.infra.UsuarioRepository;
import com.raphael.fundamentals.infra.PersistenciaException;

public class UsuarioService {
    private UsuarioRepository repo = new UsuarioRepository();

    public void cadastrarNovoUsuario(UsuarioSistema usuario) throws AuthException, PersistenciaException {
        if (!usuario.isValido()) {
            throw new AuthException("Dados de usuário inválidos para cadastro.");
        }
        repo.persistir(usuario);
    }
}
