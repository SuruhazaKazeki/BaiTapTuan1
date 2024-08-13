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
public class BaiTap05 {
    public static void main(String[]args){
        double km,giaTien=0;
        
        Scanner s=new Scanner(System.in);
        System.out.print("Nhap so km: ");
        km = s.nextDouble();
        if (km<=1)
        {
            giaTien=15000;
        }else if (km<=5){
            giaTien=15000+(km-1)*13500;
        }else if(km<120){
            giaTien=15000+4*13500+(km-5)*11000;
        }else if(km >120){
            giaTien=(15000+4*13500+(km-5)*11000)-(15000+4*13500+(km-5)*11000)*10/100 ;
        }
        System.out.println("So tien phai tra cho chuyen di la: "+ giaTien+"VND");
    }
}
