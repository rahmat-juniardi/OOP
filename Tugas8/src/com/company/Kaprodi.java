package com.company;

import java.util.ArrayList;

public class Kaprodi extends Akademisi{
    private ArrayList<Mahasiswa> mahasiswa;

    public Kaprodi(){mahasiswa = new ArrayList<Mahasiswa>();}

    public void setMahasiswa(Mahasiswa m){ mahasiswa.add(m);}

    public void cetak(){
        System.out.println("Kaprodi : ");
        super.cetak();
        System.out.println("\nMahasiswa : ");
        for (int i=0; i<mahasiswa.size(); i++){
            mahasiswa.get(i).cetak();
        }
        System.out.println("+============================================+");
    }

}
