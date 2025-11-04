public class ekspedisi {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("masukkan jarak pengiriman (km)");
    int jarak = input.nextInt();
    System.out.println("masukkan berat barang (kg)");
    double berat = input.nextDouble();
    System.out.println("masukkan panjang barang (cm)");
    double panjang = input.nextDouble();
    System.out.println("masukkan lebar barang (cm)");
    double lebar = input.nextDouble();
    System.out.println("masukkan tinggi barang (cm)");
    double tinggi = input.nextDouble();

    int tarifPerKg;
    if (jarak >= 10 && jarak <= 120) {
        tarifPerKg = 250;
    }else if (jarak > 120) {
        tarifPerKg = 600;
    }else {
        System.out.println();
    }
       }
            }