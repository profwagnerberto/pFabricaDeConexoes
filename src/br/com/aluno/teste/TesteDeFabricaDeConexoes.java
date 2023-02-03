package br.com.aluno.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.aluno.jdbc.FabricaDeConexoes;

public class TesteDeFabricaDeConexoes {

  public static void main(String[] args) {
    try {
      Connection conexao1 = FabricaDeConexoes.pegarConexao();

      System.out.println("conexao1 realizada");

      conexao1.close();
    } catch (Exception e) {
      System.err.println("Erro no banco de dados: " + "\n" +
          e.getMessage() + "\n" +
          e.getClass() );
//        e.printStackTrace();
    }
  }
}
