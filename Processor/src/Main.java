class Main {
    public static void main(String[] argv){
        Processor p = new Processor("Intel P4", 3, 1.8);
        Laptop l =new Laptop("Toshiba",p);
        l.tampilData();
        
        //contoh lain membuat objek
        Laptop l1 = new Laptop("HP", new Processor("AMD Turion", 2.2, 1.6));
        l1.tampilData();
    }
}
