/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appCinema;

import appCinema.view.LoginMember;
import appCinema.view.Status;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import static java.util.Objects.hash;

/**
 *
 * @author bourd
 */
public class LoginGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Status s = new Status();
                s.setVisible(true);
            }
        });

        //System.out.println(SHA("CineCine"));
    }

    public static String SHA(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte hash[] = md.digest(input.getBytes(StandardCharsets.UTF_8));
            BigInteger number = new BigInteger(1, hash);
            StringBuilder hexString = new StringBuilder(number.toString(16));
            while (hexString.length() < 32) {
                hexString.insert(0, '0');
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            System.err.println(e.getMessage());
            return "";
        }
    }

}
