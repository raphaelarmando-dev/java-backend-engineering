package com.raphael.fundamentals.infra;
import com.raphael.fundamentals.oo.UsuarioSistema;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    private List<UsuarioSistema> dbMock = new ArrayList<>();

    public void salvar(UsuarioSistema u) {
        dbMock.add(u);
        System.out.println("Usuário " + u.getLogin() + " persistido no banco.");
    }
}