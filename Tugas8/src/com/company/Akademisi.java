package com.company;

public class Akademisi {
    private String id, nama, jk;

    public String getId(){return id;}
    public String getNama(){return nama;}
    public String getJk(){return jk;}

    public void setId(String id){this.id = id;}
    public void setNama(String nama){this.nama = nama;}
    public void setJk(String jk){this.jk = jk;}

    public void cetak(){
        System.out.println("Id            : " + getId());
        System.out.println("Nama          : " + getNama());
        System.out.println("Jenis Kelamin : " + getJk());
    }


}
