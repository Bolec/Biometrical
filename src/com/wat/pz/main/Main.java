package com.wat.pz.main;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;


public class Main {

	public static void main(String[] args){
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (Exception ee) {
			// If Nimbus is not available, you can set the GUI to another look
			// and feel.
		}
		Window window = new Window();

		window.setSize(500, 500);
		
	}
}
