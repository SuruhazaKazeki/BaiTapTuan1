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
public class BaiTap02 {
    public static void main(String[]args){
        float x;
        String kq = "";
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap diem TB: ");
        x = sc.nextFloat();
        if(x<4){
            kq=("Yeu");
        }else if(x<6.5){
            kq=("Trung binh");
        }else if(x<8){
            kq=("Kha");
        }else if (x<=10){
            kq=("Gioi");
        }
        System.out.println(kq);
    }
}
