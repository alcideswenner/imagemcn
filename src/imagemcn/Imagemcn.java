/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagemcn;

import imagemcn.dados.RegistroDao;

/**
 *
 * @author centr
 */
public class Imagemcn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Imagemcn i = new Imagemcn();
       // i.expExcel("alcides22112211.xls");
        RegistroDao dao=new RegistroDao();
        System.out.println(dao.contador("SELECT COUNT(*) FROM registros where consulta='PEDIATRA'"));
    }
    
}
