class Mahasiswa {
    public String namaMhs;
    public MataKuliah[] Mk;
    
    public Mahasiswa(){
    }
    
    public Mahasiswa(String nm, MataKuliah[] kul){
        namaMhs = nm;
        Mk = kul;
    }
    
    public void tampilData(){
        System.out.println("Nama Mhs = "+namaMhs);
        for(int i=0; i<Mk.length; i++){
            Mk[i].tampilData();
        }
    }
}
