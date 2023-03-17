/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Indonesia
 */
class Lingkaran {
    protected int radius;
    
    public Lingkaran(int radius){
        this.radius = radius;
    }
    
    public double luas(){
        return Math.PI * Math.pow(radius, 2);
    }
    
    public double keliling(){
        return Math.PI * 2 * radius;
    }
    
}
