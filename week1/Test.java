    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package week1;

    import java.util.Scanner;

    /**
     *
     * @author Admin
     */
    public class Test {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            NormalCalculator nc = new NormalCalculator();

            System.out.println("Enter number: ");
            double so = sc.nextDouble();
            nc.getMemory();


            while(true){
            String op = Validator.checkOperation("Enter operator: ");

            if(op == "="){
                System.out.println("Result" + nc.getMemory());
                return;
            }else 
            {
                System.out.println("Enter number: ");
                so = sc.nextDouble();
                nc.changeMemory(op, so);

                System.out.println("Memory = " + nc.getMemory());
            }
            }
        }
    }
