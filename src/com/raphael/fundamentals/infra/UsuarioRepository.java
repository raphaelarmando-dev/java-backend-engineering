package com.raphael.fundamentals.infra;

import com.raphael.fundamentals.oo.UsuarioSistema;
import com.raphael.fundamentals.oo.UsuarioDataHandler;
import java.util.List;

public class UsuarioRepository extends RepositorioBase<UsuarioSistema>
        implements UsuarioDataHandler, CrudRepository<UsuarioSistema> {

    @Override
    public void persistir(UsuarioSistema usuario) throws PersistenciaException {
        if (usuario.getLogin() == null || usuario.getLogin().isEmpty()) {
            throw new PersistenciaException("Login inválido para persistência.");
        }
        super.inserir(usuario);
    }

    @Override
    public List<UsuarioSistema> listarTodos() {
        LoggerService.logInfo("Consultando base de dados de usuários...");
        return this.dados;
    }
}