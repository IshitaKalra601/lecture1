/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture1;

/**
 *
 * @author jyoti
 */
public class lecture1class {
    public double radius;
    public String name;
    public lecture1class(double r){
        radius = r;
    }
    public double areaCircle(){
        return 3.14*radius*radius;
    }
    public String names(){
        return name;
    }
    
}
