package Poyecto3D;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import java.awt.*;

public class Principal extends JPanel {
	JFrame Vent; 
	/**
	 * Create the panel.
	 */
	public Principal() {
		Vent=new JFrame("Transformaciones en 3D");
		Vent.setSize(1000,600);
		
		Vent.setVisible(true);
		Vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Vent.getContentPane().setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setForeground(new Color(128, 0, 128));
		toolBar.setBackground(Color.BLACK);
		toolBar.setBounds(0, 0, 984, 40);
		Vent.getContentPane().add(toolBar);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 51, 193, 500);
		Border line = BorderFactory.createLineBorder(new Color(0, 255, 255), 2);
		Border etchedRaised = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		Border titled = BorderFactory.createTitledBorder(line, "Vistas ortográficas", TitledBorder.CENTER, TitledBorder.TOP, null,new Color(0, 255, 255));
		Border compound = BorderFactory.createCompoundBorder(titled, etchedRaised);
		panel.setBorder(compound);
		
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.BLACK);
		panel1.setBounds(12, 30, 170, 150);
		Border titled1 = BorderFactory.createTitledBorder(line, "Vista superior", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 255, 255));
		Border compound1 = BorderFactory.createCompoundBorder(titled1, etchedRaised);
		panel1.setBorder(compound1);
		panel.add(panel1);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.BLACK);
		panel2.setBounds(12, 185, 170, 150);
		Border titled2 = BorderFactory.createTitledBorder(line, "Vista lateral", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 255, 255));
		Border compound2 = BorderFactory.createCompoundBorder(titled2, etchedRaised);
		panel2.setBorder(compound2);
		panel.add(panel2);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.BLACK);
		panel3.setBounds(12, 340, 170, 150);
		Border titled3 = BorderFactory.createTitledBorder(line, "Vista frontal", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 255, 255));
		Border compound3 = BorderFactory.createCompoundBorder(titled3, etchedRaised);
		panel3.setBorder(compound3);
		panel.add(panel3);
		  
		//panel sliders
		
		JPanel panel_1 = new JPanel();
		
		//panel_1.setBounds(202, 444, 772, 106);
		//Border titleds = BorderFactory.createTitledBorder(line, "", TitledBorder.CENTER, TitledBorder.TOP, null,new Color(0, 255, 255));
		//Border compounds = BorderFactory.createCompoundBorder(titleds, etchedRaised);
		//panel_1.setBorder(compounds);
		
		
		JPanel panels1 = new JPanel();
		panels1.setBackground(Color.BLACK);
		panels1.setBounds(205, 446, 250, 100);
		Border titleds1 = BorderFactory.createTitledBorder(line, "Rotación en X", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 255, 255));
		Border compounds1 = BorderFactory.createCompoundBorder(titleds1, etchedRaised);
		panels1.setBorder(compounds1);
		panel_1.add(panels1);

		Vent.getContentPane().add(panel_1);
		Vent.getContentPane().add(panel);
		Vent.getContentPane().setBackground(Color.BLACK);
		
		/*//panel sliders
		JPanel panels = new JPanel();
		panels.setBackground(Color.BLACK);
		panels.setBounds(10, 51, 193, 500);
		Border titleds = BorderFactory.createTitledBorder(line, "", TitledBorder.CENTER, TitledBorder.TOP, null,new Color(0, 255, 255));
		Border compounds = BorderFactory.createCompoundBorder(titleds, etchedRaised);
		panels.setBorder(compounds);
		
		//slider1
		JSlider slider = new JSlider();
		slider.setBorder(null);
		slider.setValue(0);
		slider.setMajorTickSpacing(60);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setMaximum(360);
		slider.setForeground(new Color(240, 240, 240));
		slider.setBackground(Color.BLACK);
		slider.setBounds(202, 487, 258, 63);
		
		JPanel panels1 = new JPanel();
		panels1.setBackground(Color.BLACK);
		panels1.setBounds(12, 30, 170, 150);
		Border titleds1 = BorderFactory.createTitledBorder(line, "Rotación en el eje x", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 255, 255));
		Border compounds1 = BorderFactory.createCompoundBorder(titleds1, etchedRaised);
		panels1.setBorder(compound1);
		panels1.add(panels1);
		panels.add(panels1);
		Vent.getContentPane().add(panels);
		
		//slider2
		JSlider slider_1 = new JSlider();
		slider_1.setForeground(new Color(240, 240, 240));
		slider_1.setMaximum(360);
		slider_1.setMajorTickSpacing(60);
		slider_1.setMinorTickSpacing(10);
		slider_1.setPaintTicks(true);
		slider_1.setPaintLabels(true);
		slider_1.setValue(0);
		slider_1.setBorder(null);
		slider_1.setBackground(Color.BLACK);
		slider_1.setBounds(459, 487, 258, 63);
		Vent.getContentPane().add(slider_1);
		
		JSlider slider_1_1 = new JSlider();
		slider_1_1.setValue(0);
		slider_1_1.setPaintTicks(true);
		slider_1_1.setPaintLabels(true);
		slider_1_1.setMinorTickSpacing(10);
		slider_1_1.setMaximum(360);
		slider_1_1.setMajorTickSpacing(60);
		slider_1_1.setForeground(SystemColor.menu);
		slider_1_1.setBorder(null);
		slider_1_1.setBackground(Color.BLACK);
		slider_1_1.setBounds(716, 487, 258, 63);
		Vent.getContentPane().add(slider_1_1);
		
		JSlider slider_2 = new JSlider();
		slider_2.setMaximum(2300);
		slider_2.setMinimum(100);
		slider_2.setMajorTickSpacing(100);
		slider_2.setMinorTickSpacing(50);
		slider_2.setValue(1000);
		slider_2.setPaintTicks(true);
		slider_2.setPaintLabels(true);
		slider_2.setBorder(null);
		slider_2.setForeground(new Color(240, 240, 240));
		slider_2.setBackground(Color.BLACK);
		slider_2.setBounds(202, 423, 772, 63);
		Vent.getContentPane().add(slider_2);*/
	}
	public static void main(String[] args) {
		new Principal();
	}
}
