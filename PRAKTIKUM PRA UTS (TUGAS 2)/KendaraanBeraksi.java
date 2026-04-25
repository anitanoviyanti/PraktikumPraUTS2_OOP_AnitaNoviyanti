abstract class Kendaraan {
    abstract void bergerak();
}

class Mobil extends Kendaraan {
    @Override
    void bergerak() {
        System.out.println("Mobil bergerak dengan roda");
    }
}

class Sepeda extends Kendaraan {
    @Override
    void bergerak() {
        System.out.println("Sepeda bergerak dengan pedal");
    }
}

public class KendaraanBeraksi {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        mobil.bergerak();

        Kendaraan sepeda = new Sepeda();
        sepeda.bergerak();
    }
}