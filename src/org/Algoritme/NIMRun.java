package org.Algoritme;

public class NIMRun {
    public static void main(String[] args) {
        String nim = "12050126068";
        NIM objNim = new NIM();
        objNim.setNim(nim);
        System.out.println("Jenjang Pendidikan= "+objNim.getJenjangPendidikan());
        System.out.println("Tahun Masuk= "+objNim.getTahunMasuk());
        System.out.println("Fakultas= "+objNim.getFakultas());
        System.out.println("Jurusan= "+objNim.getJurusan());
        System.out.println("Jenis Kelamin = "+objNim.getJenisKelamin());
        System.out.println("Nomor Urut Mahasiswa= "+objNim.getNoUrutMahasiswa());
    }
}