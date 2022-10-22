public class mainApp {
    public static void main(String[] args) {
data_pegawai data_pegawai=new data_pegawai("M.SYAMSUL HADY", "14 NOVEMBER 2000", "BERAIM", "20000000");
data_pegawai.cetakdata_pegawai(data_pegawai.Nama);

gaji_pegawai gaji_pegawai = new gaji_pegawai(15000000, 2500000, 2500000);
gaji_pegawai.cetakgaji_pegawai(gaji_pegawai.gajiLembur);

status_pendiikan status_pendiikan = new status_pendiikan("Sarjana Komputer", "Magister Komputer", "Hacker");
status_pendiikan.cetakstatus_pendiikan(status_pendiikan.S2);

jabatan jabatan = new jabatan("Programmer", "Staff");
jabatan.cetakjabatan(jabatan.staff);

    }
}
