/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imagemcn.dados;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TableModel extends AbstractTableModel {

    private List<Registro> lista;
    private String[] colunas = new String[]{
        "COD", "SUS", "NOME", "DT.NASC.", "ID", "ENDEREÇO", "CID", "UBS", "CONSULTA", "EXAME", "TIPO EXAME", "PROFISSIONAL", "DATA"};

    public TableModel(List<Registro> lista) {
        this.lista = lista;
    }

    public void addRow(Registro r) {
        this.lista.add(r);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    public String idade(String dn) throws java.lang.NumberFormatException {
        int anod = 0;
        String a[]=dn.split("/");
        try {
            anod = Integer.valueOf(a[2]);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("AQUI" + e.getMessage());
        }
        Calendar data = new GregorianCalendar();
        int ano = data.get(Calendar.YEAR);
        int anoG = 0;
        anoG = ano - anod;
        return (anoG < 10) ? "0" + anoG : "" + anoG;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return lista.get(rowIndex).getCod();
            case 1:
                return lista.get(rowIndex).getUsuario().getSus();
            case 2:
                return lista.get(rowIndex).getUsuario().getNome();
            case 3:
                return lista.get(rowIndex).getUsuario().getDn();
            case 4:
                return idade(lista.get(rowIndex).getUsuario().getDn());
            case 5:
                return lista.get(rowIndex).getUsuario().getEndereco();
            case 6:
                return lista.get(rowIndex).getUsuario().getCidade();
            case 7:
                return lista.get(rowIndex).getUbs();
            case 8:
                return lista.get(rowIndex).getConsulta();
            case 9:
                return lista.get(rowIndex).getExame();
            case 10:
                return lista.get(rowIndex).getTipo_exame();
            case 11:
                return lista.get(rowIndex).getProfisional();
            case 12:
                return lista.get(rowIndex).getData();

        }
        return null;
    }

}
