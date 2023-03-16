/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Indonesia
 */
class Tabung extends Lingkaran{
    private int tinggi;
    
    public Tabung(int radius, int tinggi){
        super(radius);
        this.tinggi = tinggi;
    }
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    public int getTinggi(){
        return tinggi;
    }
    
    public double volume(){
        return luas() * tinggi;
    }
    
    public double luasPermukaan(){
        return 2 * luas() + Math.PI * radius * tinggi;
    }
    
}
