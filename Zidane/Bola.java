/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Indonesia
 */
class Bola extends Lingkaran {
    
    public Bola(int radius){
        super(radius);
    }
    
    public double volume(){
        return Math.PI * Math.pow(radius, 3) * 4/3;
    }
    
    public double luasPermukaan(){
        return luas() * 4;
    }
    
}
