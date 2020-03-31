/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagemcn.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexao {
    public static Connection conexao(){
        try {
            return DriverManager.getConnection("jdbc:mysql://DESKTOP-A31SRT4/imagemcn","root","1914");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
        return null;
    }
        public static void close(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {

            }
        }
    }

    public static void close(Connection con, PreparedStatement ps) {
        if (con != null) {
            try {
                con.close();
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {

            }
        }
    }

    public static void close(Connection con, PreparedStatement ps, ResultSet rs) {
        if (con != null) {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                }
                con.close();
            } catch (SQLException ex) {

            }
        }
    }
        public static void criatabela() {
        Connection con = conexao();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("CREATE TABLE IF NOT EXISTS registros("
                    + "cod int PRIMARY KEY AUTO_INCREMENT,"
                    + "sus varchar(200) not null,"
                    + "nome varchar(200) not null,"
                    + "dn varchar(20) not null,"
                    + "endereco varchar(200) not null,"
                    + "cidade varchar(20) not null,"
                    + "ubs varchar(200) not null,"
                    + "exame varchar(200) not null,"
                    + "tipo_exame varchar(200) not null,"
                    + "consulta varchar(200) not null,"
                    + "data varchar(20) not null,"
                    + "profissional varchar(200) not null"
                    + ")");
            ps.executeUpdate();
            System.out.println("Tabela criada!");
        } catch (SQLException ex) {
            System.out.println("ERRO " + ex.getMessage());
        }
    }
}
