/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan48;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Kalkulator
 */

public class Latihan48 {

    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();
        calc.setValue1(7);
        calc.setValue2(5);
        
        //output
        System.out.println("VALUE 1 = " + calc.getValue1());
        System.out.println("VALUE 2 = " + calc.getValue2());
        calc.setNameProject();
        calc.setNoteProject("This Project shown you how to manage method in java");
        System.out.println("Result Add is = " + calc.add(calc.getValue1(),calc.getValue2()));
        System.out.println("Result Minus is = " + calc.minus(calc.getValue1(), calc.getValue2()));
        System.out.println("Result Multiple is = " + calc.multiplication(calc.getValue1(), calc.getValue2()));
        System.out.println("Result Division is = " + calc.division(calc.getValue1(), calc.getValue2()));
    }
    
}
