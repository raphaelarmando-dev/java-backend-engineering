package com.raphael.fundamentals.infra;

import com.raphael.fundamentals.oo.UsuarioSistema;
import com.raphael.fundamentals.oo.UsuarioDataHandler;
import com.raphael.fundamentals.oo.Notificador;
import java.util.List;

public class UsuarioRepository extends RepositorioBase<UsuarioSistema>
        implements UsuarioDataHandler, CrudRepository<UsuarioSistema> {

    private Notificador notificador = NotificadorFactory.criar();

    @Override
    public void persistir(UsuarioSistema usuario) throws PersistenciaException {
        if (usuario.getLogin() == null || usuario.getLogin().isEmpty()) {
            throw new PersistenciaException("Login inválido para persistência.");
        }

        super.inserir(usuario);

        notificador.enviar("Usuário " + usuario.getLogin() + " persistido com ID: " + usuario.getId());
    }

    @Override
    public List<UsuarioSistema> listarTodos() {
        LoggerService.logInfo("Consultando base de dados de usuários...");
        return this.dados;
    }
}