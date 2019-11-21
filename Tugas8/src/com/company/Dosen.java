package com.company;

import java.util.ArrayList;

public class Dosen extends Akademisi{
    private int gaji;
    private ArrayList<Matkul> matkul = new ArrayList<Matkul>();

    public Dosen(){this.gaji = 0;}

    public void setGaji(int gaji) { this.gaji = gaji; }
    public int getGaji() { return gaji; }

    public void getMatkul(Matkul m){ matkul.add(m);}

    public void cetak(){
        super.cetak();
        System.out.println("Matkul diampu : " + matkul.get(0).getNama_mk());
        System.out.println("Gaji perbulan : " + gaji);

    }
}
