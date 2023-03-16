/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Indonesia
 */
class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=================================== LINGKARAN ===================================");
        Lingkaran lingkaran = new Lingkaran(10);
        lingkaran.radius = 10;
        System.out.println("1. Luas lingkaran dengan radius " + lingkaran.radius + " adalah "+lingkaran.luas()+ " cm^2 \n");
        System.out.println("2. Keliling lingkaran dengan radius " + lingkaran.radius + " adalah " +lingkaran.keliling() + " cm \n");

        System.out.println("=================================== BOLA ===================================");
        Bola bola = new Bola(10);
        bola.radius = 10;
        System.out.println("1. Volume bola dengan radius " + bola.radius + " adalah " +bola.volume()+ " cm^3 \n");
        System.out.println("2. Luas permukaan bola dengan radius " + bola.radius + " adalah " +bola.luasPermukaan() + " cm^2 \n");
        
        System.out.println("=================================== TABUNG ===================================");
        Tabung tabung = new Tabung(10, 20);
        tabung.radius = 10;
        System.out.println("1. Volume tabung dengan radius " + tabung.radius + " dan tinggi " +tabung.getTinggi()+ " adalah " +tabung.volume()+ " cm^3 \n");
        System.out.println("2. Luas permukaan tabung dengan radius " + tabung.radius + " dan tinggi " +tabung.getTinggi()+ " adalah " +tabung.luasPermukaan()+ " cm^2 \n");
        
        System.out.println("=================================== KERUCUT ===================================");
        Kerucut kerucut = new Kerucut(9, 12, 15);
        kerucut.radius = 9;
        System.out.println("1. Volume kerucut dengan radius " + kerucut.radius + " dan tinggi " +kerucut.getTinggi()+ " adalah " +kerucut.volume()+ " cm^3 \n");
        System.out.println("2. Luas permukaan kerucut dengan radius " + kerucut.radius + ", tinggi " +kerucut.getTinggi()+ " dan garis pelukis " +kerucut.getPelukis()+ " adalah " +kerucut.luasPermukaan()+ " cm^2 \n");
        System.out.println("3. Luas selimut kerucut dengan radius " + kerucut.radius + ", tinggi " +kerucut.getTinggi()+ " dan garis pelukis " +kerucut.getPelukis()+ " adalah " +kerucut.luasSelimut()+ " cm^2 \n");
    }
    
}
