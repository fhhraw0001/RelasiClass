class RelasiMahasiswaMain {
    public static void main(String[]args){
        MataKuliah Mk1 = new MataKuliah("00P", 7);
        MataKuliah Mk2 = new MataKuliah("Basis Data", 6);
        MataKuliah Mk3 = new MataKuliah("Bahasa Jawa", 3);
        MataKuliah MkArr[] = {Mk1, Mk2, Mk3};
        Mahasiswa Mhs = new Mahasiswa("Rania", MkArr);
        Mhs.tampilData();
    }
    
}
