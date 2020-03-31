package imagemcn.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistroDao implements CRUD_Interface {

    String[] listaUBS = {"DANIEL GUANABARA", "CENTRO DE IMAGEM", "QUIABOS", "SANTO ANTONIO", "ANIL", "SAO JUDAS TADEU", "SAO FRANCISCO", "BURITI", "AFONSO CUNHA", "DUQUE BACELAR", "MONTE ALEGRE", "SANTA MARIA", "BONFIM", "SARNEY", "URGENCIA"};
    String[] cidades = {"C", "D", "B", "A"};
    boolean cid = false;
    boolean ub = false;
    ArrayList<Registro> lista = new ArrayList<>();

    @Override
    public String salvar(Registro r, String referencia) {
        Connection con = Conexao.conexao();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement("INSERT INTO registros values(?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, r.getCod());
            ps.setString(2, r.getUsuario().getSus());
            ps.setString(3, r.getUsuario().getNome());
            ps.setString(4, r.getUsuario().getDn());
            ps.setString(5, r.getUsuario().getEndereco());
            ps.setString(6, r.getUsuario().getCidade());
            ps.setString(7, r.getUbs());
            ps.setString(8, r.getExame());
            ps.setString(9, r.getTipo_exame());
            ps.setString(10, r.getConsulta());
            ps.setString(11, r.getData());
            ps.setString(12, r.getProfisional());
            if ((verificaCidade(r.getUsuario().getCidade()) == true) && (verificaUBS(r.getUbs()) == true)) {
                if ((!r.getUsuario().getSus().equals("")) && (!r.getUsuario().getNome().equals("")) && (!r.getUsuario().getDn().equals("")) && (!r.getUsuario().getEndereco().equals(""))
                        && (!r.getUsuario().getCidade().equals("")) && (!r.getUbs().equals("")) && (!r.getData().equals(""))) {
                    if (referencia.equals("exame")) {//exame
                        if ((!r.getExame().equals("")) && (!r.getTipo_exame().equals("")) && (!r.getProfisional().equals(""))) {
                            r.setConsulta("NULL");
                            ps.setString(10, r.getConsulta());
                            ps.executeUpdate();
                            return "Exame Salvo com sucesso!";
                        }
                    } else if (referencia.equals("consulta")) {//consulta
                        if ((!r.getConsulta().equals(""))) {
                            r.setExame("NULL");
                            r.setTipo_exame("NULL");
                            r.setProfisional("NULL");
                            ps.setString(8, r.getExame());
                            ps.setString(9, r.getTipo_exame());
                            ps.setString(12, r.getProfisional());
                            ps.executeUpdate();
                            return "Consulta Salvo com sucesso!";
                        }
                    }
                }
            } else {
                if (verificaCidade(r.getUsuario().getCidade()) == false) {
                    return "Cidade não existe!";
                }
                if (verificaUBS(r.getUbs()) == false) {
                    return "Ubs não existe!";
                }
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            Conexao.close(con, ps);
        }
        return "Registro não salvo!";
    }

    @Override
    public String atualizar(Registro r) {
        String sql = "UPDATE registros SET sus=?, nome=?,dn=? ,endereco=?, cidade=?, ubs=?, exame=?, tipo_exame=?, consulta=?, data=?, profissional=? WHERE cod=? ";
        Connection con = Conexao.conexao();
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, r.getUsuario().getSus());
            ps.setString(2, r.getUsuario().getNome());
            ps.setString(3, r.getUsuario().getDn());
            ps.setString(4, r.getUsuario().getEndereco());
            ps.setString(5, r.getUsuario().getCidade());
            ps.setString(6, r.getUbs());
            ps.setString(7, r.getExame());
            ps.setString(8, r.getTipo_exame());
            ps.setString(9, r.getConsulta());
            ps.setString(10, r.getData());
            ps.setString(11, r.getProfisional());
            ps.setInt(12, r.getCod());
            ps.executeUpdate();
            System.out.println("atualizado");

            return "Atualizado!";
        } catch (SQLException ex) {
            System.out.println("ERRO " + ex.getMessage());
        } finally {
            Conexao.close(con, ps);
        }
        return "Erro ao atualizar!";
    }

    @Override
    public String deletar(int cod) {
        Connection con = Conexao.conexao();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement("DELETE FROM registros WHERE cod='" + cod + "'");
            ps.executeUpdate();
            return "Apagado com sucesso!";
        } catch (SQLException ex) {
            System.out.println("ERRO " + ex.getMessage());
        } finally {
            Conexao.close(con, ps);
        }
        return "Erro ao apagar!";
    }

    @Override
    public ArrayList<Registro> listar(String sql) {
        Connection con = Conexao.conexao();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Registro r = new Registro();
                Usuario u = new Usuario();
                u.setSus(rs.getString("sus"));
                u.setNome(rs.getString("nome"));
                u.setDn(rs.getString("dn"));
                u.setEndereco(rs.getString("endereco"));
                u.setCidade(rs.getString("cidade"));

                r.setCod(rs.getInt("cod"));
                r.setConsulta(rs.getString("consulta"));
                r.setExame(rs.getString("exame"));
                r.setTipo_exame(rs.getString("tipo_exame"));
                r.setUbs(rs.getString("ubs"));
                r.setProfisional(rs.getString("profissional"));
                r.setData(rs.getString("data"));
                r.setUsuario(u);
                lista.add(r);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            Conexao.close(con, ps, rs);
        }
        return lista;
    }

    public boolean verificaCidade(String cidade) {
        for (int i = 0; i < cidades.length; i++) {
            if (cidades[i].equals(cidade)) {
                return true;
            }
        }
        return false;
    }

    public boolean verificaUBS(String UBS) {
        for (int i = 0; i < listaUBS.length; i++) {
            if (listaUBS[i].equals(UBS)) {
                return true;
            }
        }
        return false;
    }

    public int contador(String sql) {
        Connection con = Conexao.conexao();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps=con.prepareStatement(sql);
            
            rs=ps.executeQuery();
            while(rs.next()){
                return rs.getInt("COUNT(*)");
            }
        } catch (SQLException ex) {
          
        }
      
        return 0;
    }
}
