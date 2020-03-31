/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagemcn.dados;

import java.util.ArrayList;


public interface CRUD_Interface {
  public String salvar(Registro r,String referencia);
  public String atualizar(Registro r);
  public String deletar(int cod);
  public ArrayList<Registro>listar(String sql);  
}
