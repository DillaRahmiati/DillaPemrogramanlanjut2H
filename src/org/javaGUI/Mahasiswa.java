package org.javaGUI;

public class Mahasiswa {
    private String Nama;
    private String NIM;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim) {
        this.Nama = nama;
        this.NIM = nim;

    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getJenjangPendidikan() {
        char kodeJP = NIM.charAt(0);
        if (kodeJP == '1') {
            return "S1 (SARJANA)";
        } else if (kodeJP == '2') {
            return "S2 (MAGISTER)";
        } else if (kodeJP == '3') {
            return "S3 (DOKTOR)";
        }
        return "UKNKNOWN";
    }

    public String getTahunMasuk() {
        char kd1 = NIM.charAt(1);
        char kd2 = NIM.charAt(2);

        return "20" + kd1 + kd2;
    }

    public String getFakultas() {
        char kodeFK = NIM.charAt(3);
        if (kodeFK == '1') {
            return "TARBIYAH DAN KEGURUAN";
        } else if (kodeFK == '2') {
            return "SYARI'AH DAN HUKUM";
        } else if (kodeFK == '3') {
            return "USHULUDDIN";
        } else if (kodeFK == '4') {
            return "DAKWAH & KOMUNIKASI";
        } else if (kodeFK == '5') {
            return "SAINS DAN TEKNOLOGI";
        } else if (kodeFK == '6') {
            return "psikologi";
        } else if (kodeFK == '7') {
            return "EKONOMI DAN ILMU SOSIAL";
        } else if (kodeFK == '8') {
            return "PERTANIAN DAN PETERNAKAN";
        }
        return "UNKNOWN";
    }

    public String getJurusan() {
        char kodeJurusan = NIM.charAt(5);
        if (kodeJurusan == '1') {
            return "TEKNIK INFORMATIKA";
        } else if (kodeJurusan == '2') {
            return "TEKNIK INDUSTRI";
        } else if (kodeJurusan == '3') {
            return "SISTEM INFORMASI";
        } else if (kodeJurusan == '4') {
            return "MATEMATIKA";
        } else if (kodeJurusan == '5') {
            return "TEKNIK ELEKTRO";
        }
        return "UNKNOWN";
    }
    public String getJenisKelamin() {
        char kodeJk = NIM.charAt(6);
        if (kodeJk == '1') {
            return "LAKI-LAKI";
        } else if (kodeJk == '2') {
            return "PEREMPUAN";
        }
        return "UNKNOWN";
    }
    public String getNoUrutMahasiswa() {
        char kd1 = NIM.charAt(7);
        char kd2 = NIM.charAt(8);
        char kd3 = NIM.charAt(9);
        char kd4 = NIM.charAt(10);

        return "" + kd1+kd2+kd3+kd4;
    }
}