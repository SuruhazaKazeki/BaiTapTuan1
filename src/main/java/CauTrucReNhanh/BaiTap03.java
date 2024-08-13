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
public class BaiTap03 {
    public static void main(String[]args){
        double n1,n2,n3,min;
        Scanner s=new Scanner(System.in);
        System.out.print("Nhap vao 3 phan tu: ");
        n1=s.nextDouble();
        n2=s.nextDouble();
        n3=s.nextDouble();
        min=n1;
        if(min>n2)
        {
            min=n2;
        }
        if(min>n3){
            min=n3;
        }
        System.out.println("So nho nhat la :"+min);
        
    }
}
