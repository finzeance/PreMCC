/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Indonesia
 */
class Kerucut extends Lingkaran {
    private int tinggi;
    private int pelukis;
    
    public Kerucut(int radius, int tinggi, int pelukis){
        super(radius);
        this.tinggi = tinggi;
        this.pelukis = pelukis;
    }
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    public int getTinggi(){
        return tinggi;
    }
    
    public void setPelukis(int pelukis){
        this.pelukis = pelukis;
    }
    
    public int getPelukis(){
        return pelukis;
    }
    
    public double volume(){
        return luas() * tinggi * 1/3;
    }
    
    public double luasSelimut(){
        return Math.PI * radius * pelukis;
    }
    
    public double luasPermukaan(){
        return luas() + luasSelimut();
    }
    
}
