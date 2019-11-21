package com.company;

import java.util.ArrayList;

public class Matkul extends Akademisi {
    private String nama_mk;
    Dosen dosen = new Dosen();

    public String getNama_mk() { return nama_mk; }
    public void setNama_mk(String nama_mk) { this.nama_mk = nama_mk; }

    public Matkul(){this.nama_mk = "";}
    public Matkul(String nama_mk) { this.nama_mk = nama_mk; }

    public void getDosen(Dosen d){ this.dosen = d;}

    public void cetak(){
        System.out.println("  Matakuliah     : " + nama_mk);
        System.out.println("  Dosen pengampu : " + dosen.getNama());
    }


}
