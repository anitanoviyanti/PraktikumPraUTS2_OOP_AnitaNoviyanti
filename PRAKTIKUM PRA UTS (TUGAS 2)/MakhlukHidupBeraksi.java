abstract class MakhlukHidup {
    abstract void bernapas();
}

class Manusia extends MakhlukHidup {
    @Override
    void bernapas() {
        System.out.println("Manusia bernapas dengan paru-paru");
    }
}

class Hewan extends MakhlukHidup {
    @Override
    void bernapas() {
        System.out.println("Hewan bernapas dengan berbagai cara");
    }
}

public class MakhlukHidupBeraksi {
    public static void main(String[] args) {
        MakhlukHidup manusia = new Manusia();
        manusia.bernapas();

        MakhlukHidup hewan = new Hewan();
        hewan.bernapas();
    }
}