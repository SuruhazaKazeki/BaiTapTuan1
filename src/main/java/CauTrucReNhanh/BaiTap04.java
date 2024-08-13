/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CauTrucReNhanh;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class BaiTap04 {
    public static void main(String[]args){
        double n, du;
        Scanner s= new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        n= s.nextDouble();
        du=n%2;
        if(du==0)
        {
            System.out.println(n+"la so chan");
        }else{
            System.out.println(n+"la so le");
        }
    }
}
