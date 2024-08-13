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
public class BaiTap01 {
    public static void main(String[]args){
        double a,b;
        String kq="";
        Scanner sc = new Scanner(System.in);
        System.out.println("====Giai PT Bac Nhat====");
        System.out.println("Gia tri a =");
        a=sc.nextDouble();
        System.out.println("gia tri b =");
        b=sc.nextDouble();
        if(a==0){
            if(b==0){
                kq=("phuong trinh co vo so nghiem");
            }else{
                kq=("Phuong trinh vo nghiem");
            }
        }else{
            kq ="Phuong trinh co nghiem x =" + (-b/a);
        }
        System.out.println(kq);
    }
}
