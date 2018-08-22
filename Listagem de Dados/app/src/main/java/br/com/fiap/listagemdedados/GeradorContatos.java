package br.com.fiap.listagemdedados;

import java.util.ArrayList;
import java.util.List;

public class GeradorContatos {

    public  static List<Contato> geraContatos(){
        List<Contato> contatos = new ArrayList<>();

        Contato contato1 = new Contato(
                "João",
                "(11) 1111-1111",
                "Disponível",
                R.drawable.p1
        );

        contatos.add(contato1);

        Contato contato2 = new Contato(
                "Maria",
                "(11) 2222-2222",
                "Ocupada",
                R.drawable.p2
        );

        contatos.add(contato2);

        return contatos;
    }
}
