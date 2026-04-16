package com.raphael.fundamentals.infra;
import com.raphael.fundamentals.oo.UsuarioSistema;
import com.raphael.fundamentals.oo.UsuarioDataHandler;

public class UsuarioRepository extends RepositorioBase<UsuarioSistema> implements UsuarioDataHandler {

    @Override
    public void persistir(UsuarioSistema usuario) throws PersistenciaException {
        if (usuario.getLogin() == null || usuario.getLogin().isEmpty()) {
            throw new PersistenciaException("Login inválido para persistência.");
        }
        super.inserir(usuario);
    }
}