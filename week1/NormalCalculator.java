/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author Admin
 */
public class NormalCalculator {
    private double memory ;

    public NormalCalculator() {
        this.memory = memory;
    }

    

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }
    
    public void changeMemory(String operator, double number){
        switch(operator){
            case"+":
                memory = memory + number;
                break;
            case"-":
                memory = memory - number;
                break;
            case"*":
                memory = memory * number;
                break;
            case"/":
                if(number == 0){
                    System.out.println("Invalid");
                    break;
                }else{
                memory = memory / number;
                break;
                case"=":
                System.out.println("Result: ");
                }
        }
    }
}

