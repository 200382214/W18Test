/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classlab;



/**
 *
 * @author Dhvanit
 */
public class Circle {
    private double radius;
    private String name;
    private double pi=3.14;
    public Circle(double radius, String name) {
            setName(name);
            setRadius(radius);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double GetArea(){
        return radius * radius * pi;
    }
    public double GetPerimiter(){
        return 2* pi * radius;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
