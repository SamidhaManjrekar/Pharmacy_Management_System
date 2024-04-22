/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package con.Pharmacy.Pages;

import dao.PharmacyUtils;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author samidhamanjrekar
 */
public class OpenPdf {
    public static void openById(String id) {
        try {
            String filePath = PharmacyUtils.billPath + File.separator + id + ".pdf";
            File file = new File(filePath);
            if (file.exists()) {
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + file.getAbsolutePath());
            } else {
                JOptionPane.showMessageDialog(null, "File does not exist at path: " + filePath);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}

