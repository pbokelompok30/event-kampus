/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eventkampus;

import java.util.Random;

/**
 *
 * @author ZuraNation
 */
public class admin {
    public static void main(String[] args){
        Random random = new Random();
        int number=0;
        for(int counter=1; counter<=1;counter++){
        number = 1+random.nextInt(100);
        System.out.format("Kode Pembayaran : %03d\n",number);
        }
       
    }
}
