package br.com.aluno.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaDeConexoes {

  public static Connection pegarConexao() throws Exception {
    String protocolo = "jdbc:mysql://";
    String servidor = "localhost";
    String BD = "bdacademico";
    String usuario = "uacademico";
    String senha = "#Uacad10";

    return DriverManager.getConnection(protocolo + servidor + "/" + BD, usuario, senha);
  }
  
  public static void encerrarRecursosBD(Connection con) throws Exception {
    if (con != null)
      con.close();
  }
}
