package br.com.aluno.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.aluno.jdbc.FabricaDeConexoes;

public class TesteDeFabricaDeConexoes {

  public static void main(String[] args) throws SQLException {
    Connection conexao1 = new FabricaDeConexoes().pegarConexao();

    System.out.println("conexao1 realizada");

    conexao1.close();

  }

}
