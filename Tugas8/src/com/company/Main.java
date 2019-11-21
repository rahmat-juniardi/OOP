package com.company;

public class Main {

    public static void main(String[] args) {
        // membuat objek kaprodi
        Kaprodi kaprodi = new Kaprodi();
        kaprodi.setId("1842324");
        kaprodi.setNama("Nur Rochmah");
        kaprodi.setJk("Perempuan");

	    // membuat objek matkul
        Matkul mk1 = new Matkul("PBO");
        Matkul mk2 = new Matkul("Sdata");
        Matkul mk3 = new Matkul("Basis Data");

        // membuat object Dosen
        Dosen dsn1 = new Dosen();
        dsn1.setId("1835431");
        dsn1.setNama("Adhi Prahara");
        dsn1.setJk("Laki-laki");
        dsn1.setGaji(5000000);

        Dosen dsn2 = new Dosen();
        dsn2.setId("1835131");
        dsn2.setNama("Rusydi Umar");
        dsn2.setJk("Laki-laki");
        dsn2.setGaji(8000000);

        Dosen dsn3 = new Dosen();
        dsn3.setId("1835341");
        dsn3.setNama("Anna Hendri Soleliza Jones");
        dsn3.setJk("Perempuan");
        dsn3.setGaji(6000000);

        // relasikan Matkul pada dosen dan dosen pengampu pada Matkul
        mk1.getDosen(dsn1);
        mk2.getDosen(dsn2);
        mk3.getDosen(dsn3);
        dsn1.getMatkul(mk1);
        dsn2.getMatkul(mk2);
        dsn3.getMatkul(mk3);

        // membuat object mahasiswa den mendaftarkan matkulnya
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setId("1800018276");
        mhs1.setNama("Rahmat Juniardi");
        mhs1.setJk("Laki-laki");
        mhs1.setSemester("3");
        mhs1.setDaftarMatkul(mk1);
        mhs1.setDaftarMatkul(mk2);
        mhs1.setDaftarMatkul(mk3);

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setId("1800018261");
        mhs2.setNama("Akhmad Hasan Kuncahyo");
        mhs2.setJk("Laki-laki");
        mhs2.setSemester("3");
        mhs2.setDaftarMatkul(mk1);
        mhs2.setDaftarMatkul(mk2);
        mhs2.setDaftarMatkul(mk3);

        // mendaftarkan mahasiswa ke kaprodi
        kaprodi.setMahasiswa(mhs1);
        kaprodi.setMahasiswa(mhs2);
        kaprodi.cetak();


    }
}
