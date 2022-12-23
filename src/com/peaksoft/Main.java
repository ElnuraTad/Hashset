
package com.peaksoft;

import com.peaksoft.atm.CashMachine;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TADZHIBAEVA ELNURA
 */

public class Main {
    public static void main(String[] args) throws IOException {


        CashMachine cashMachine =  new CashMachine();
         cashMachine.addMoney(200, 100, 55,
                 20, 10);
         cashMachine.getMoney(100);

        int[] nominal = {100, 500, 1000, 5000}; //массив имеющихся купюр
        int[] count = new int[nominal.length]; //кол-во купюр выдать
        int index = nominal.length - 1;

        while (index != -1) {
            int money = 0;
            count[index] = money / nominal[index];
            money %= nominal[index];
            index--;
        }

        for (int i = 0; i < count.length; i++) {
            System.out.printf("Номинал в %d руб. = %d шт.\n", nominal[i], count[i]);
        }


    }
}





