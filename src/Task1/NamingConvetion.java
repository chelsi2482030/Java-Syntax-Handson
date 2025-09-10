package Task1;

class NamingConvention {
    public static void main(String[] args) {
        String namaLengkapMahasiswa="Chelsi Enatalia N Parhusip";
        String nimMahasiswa="2482030";
        double ipkMahasiswa=3.82;
        boolean statusAktifKuliah=true;
        String alamatMahasiswa="permata regency,bumiwangi ciparay";
        int jumlahSks=22;

        //tampilkan semua data
        System.out.println("===DATA MAHASISWA");
        System.out.println("Nama Lengkap :" + namaLengkapMahasiswa);
        System.out.println("NIM" + nimMahasiswa);
        System.out.println("IPK" + ipkMahasiswa);
        System.out.println("Status Kuliah :" + (statusAktifKuliah? "Aktif" : "Tidak Aktif"));
        System.out.println("Jumlah SKS : " + jumlahSks);
    }
}
