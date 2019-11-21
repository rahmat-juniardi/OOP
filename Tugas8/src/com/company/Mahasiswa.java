package com.company;

import java.util.ArrayList;

public class Mahasiswa extends Akademisi{
    private String semester;
    private ArrayList<Matkul> daftarMatkul;

    public Mahasiswa(){ daftarMatkul = new ArrayList<Matkul>();}

    public void setSemester(String semester) { this.semester = semester; }
    public String getSemester() { return semester; }

    public void setDaftarMatkul(Matkul m) { daftarMatkul.add(m); }
    public int getJumlahMatkul(){return daftarMatkul.size();}

    public void cetak(){
        System.out.println("+============================================+");
        super.cetak();
        System.out.println("Semester      : " + semester);
        System.out.println("Matakuliah yang diambil : " + getJumlahMatkul() + "\n");
        for (int i=0; i<getJumlahMatkul();i++){
            daftarMatkul.get(i).cetak();
        }


    }
}
