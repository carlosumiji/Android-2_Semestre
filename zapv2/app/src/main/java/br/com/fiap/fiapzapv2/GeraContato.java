package br.com.fiap.fiapzapv2;

import java.util.ArrayList;
import java.util.List;

public class GeraContato {

    public static List<Contato> getAll(){
        List<Contato> contatos =  new ArrayList<>();

        Contato contato1 = new Contato("Teste01", "(11)1111-1111",R.drawable.p1,"Ocupado");
        contatos.add(contato1);

        Contato contato2 = new Contato("Teste02", "(11)2222-1111",R.drawable.p2,"Disponivel");
        contatos.add(contato2);

        return contatos;
    }
}
