
// Interface kendaraan yang memiliki mesin
interface EngineVehicle {
    void startEngine();
}

// Interface kendaraan berbahan bakar
interface FuelVehicle {
    void isiBahanBakar();
}

// Interface kendaraan listrik
interface ElectricVehicle {
    void isiBaterai();
}

// Interface kendaraan yang dikayuh
interface PedalVehicle {
    void mengayuh();
}

// Kelas mobil listrik
class MobilListrik implements EngineVehicle, ElectricVehicle {

    public void startEngine() {
        System.out.println("Menyalakan mesin mobil listrik...");
    }

    public void isiBaterai() {
        System.out.println("Mengisi baterai mobil listrik...");
    }
}

// Kelas mobil bensin
class MobilBensin implements EngineVehicle, FuelVehicle {

    public void startEngine() {
        System.out.println("Menyalakan mesin mobil bensin...");
    }

    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar mobil bensin...");
    }
}

// Kelas sepeda
class Sepeda implements PedalVehicle {

    public void mengayuh() {
        System.out.println("Sepeda sedang dikayuh...");
    }
}

// Kelas sepeda listrik
class SepedaListrik implements ElectricVehicle, PedalVehicle {

    public void isiBaterai() {
        System.out.println("Mengisi baterai sepeda listrik...");
    }

    public void mengayuh() {
        System.out.println("Sepeda listrik sedang dikayuh...");
    }
}

// Program utama
public class latihan3 {

    public static void main(String[] args) {

        MobilListrik mobilListrik = new MobilListrik();
        MobilBensin mobilBensin = new MobilBensin();
        Sepeda sepeda = new Sepeda();
        SepedaListrik sepedaListrik = new SepedaListrik();

        // Menjalankan mobil listrik
        System.out.println("=== MOBIL LISTRIK ===");
        mobilListrik.startEngine();
        mobilListrik.isiBaterai();

        // Menjalankan mobil bensin
        System.out.println("\n=== MOBIL BENSIN ===");
        mobilBensin.startEngine();
        mobilBensin.isiBahanBakar();

        // Menjalankan sepeda
        System.out.println("\n=== SEPEDA ===");
        sepeda.mengayuh();

        // Menjalankan sepeda listrik
        System.out.println("\n=== SEPEDA LISTRIK ===");
        sepedaListrik.isiBaterai();
        sepedaListrik.mengayuh();
    }
}
