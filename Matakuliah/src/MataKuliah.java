class MataKuliah {
    public String namaMk;
    public int sks;
    
    public MataKuliah(){
    }
    
    public MataKuliah(String na,int sk){
        namaMk = na;
        sks =  sk;
    }
    
    public void tampilData(){
        System.out.println("Nama MK = "+namaMk);
        System.out.println("SKS = "+sks);
    }
}

