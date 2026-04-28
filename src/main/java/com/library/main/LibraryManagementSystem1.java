/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.library.main;

import javax.swing.SwingUtilities;
import com.library.ui.Dashboard;

public class LibraryManagementSystem1 {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });

    }
}



