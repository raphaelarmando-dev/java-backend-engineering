package com.raphael.fundamentals;
import com.raphael.fundamentals.infra.*;
import com.raphael.fundamentals.oo.*;

public class MainServiceTest {
    public static void main(String[] args) {
        ConfiguracaoSistemaInfra config = ConfiguracaoSistemaInfra.getInstancia();

        UsuarioRepository repo = new UsuarioRepository();

        UsuarioService service = new UsuarioService(repo);

        UsuarioAdmin novoAdmin = new UsuarioAdmin("Raphael_Senior");

        System.out.println("Iniciando Sistema v" + config.VERSAO);

        PerformanceMonitor.monitor(() -> {
            try {
                service.cadastrarNovoUsuario(novoAdmin);
            } catch (Exception e) {
                LoggerService.logInfo("Erro no serviço: " + e.getMessage());
            }
        });
    }
}
