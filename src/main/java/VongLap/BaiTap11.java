/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VongLap;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class BaiTap11 {
        public static void main(String[]args){
       int n,soDao;
       Scanner sc = new Scanner(System.in);
       //b1:Nhap n tu ban phim
       System.out.print("Cho biet n:");
       n = sc.nextInt();
       //b2
       soDao=TimSoDao(n);
       if(soDao==n){
           System.out.println(n+ "La so dao");
       }else{
           System.out.println(n+ "khong phai so dao");
       }
           
    }

    private static int TimSoDao(int n) {
        int soDao=0;
        while(n>0){
            soDao=soDao*10+n%10;
        }
        return soDao;
    }
}
