/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Acer
 */
public class empat {

    public static void main(String[] args) throws IOException {
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Tuliskan pesan : ");

        for (int i = 0; i < 5; i++) {
            String data = bufReader.readLine();
            System.out.println("Anda Menulis : " + data);
            if (data.equals("exit")) {
                System.out.println("Terima kasih telah mengisi");
                break;

            }
        }
    }
}
