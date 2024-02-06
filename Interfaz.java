package Poyecto3D;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class Interfaz extends JPanel {
	JFrame Vent; 
	JSlider S1,S2,S3,S4;
	boolean arrastrar=false;
	JToolBar toolBar;
	JLabel l1,l2,l3,l4,l5;
	public Interfaz() {
		Vent=new JFrame("Transformaciones en 3D");
		Vent.setSize(1200,700);

		Border line = BorderFactory.createLineBorder(new Color(0, 255, 255), 2);
		Border etchedRaised = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
		
		//panel slider1
		JPanel ps1=new JPanel(new GridLayout(1,1));
		ps1.setBackground(Color.BLACK);
		ps1.setBounds(12, 30, 170, 150);
		Border titled1 = BorderFactory.createTitledBorder(line, "Rotación en X", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 255, 255));
		Border compound1 = BorderFactory.createCompoundBorder(titled1, etchedRaised);
		ps1.setBorder(compound1);
		
		//panel slider 2
		JPanel ps2=new JPanel(new GridLayout(1,1));
		ps2.setBackground(Color.BLACK);
		ps2.setBounds(12, 30, 170, 150);
		Border titled2 = BorderFactory.createTitledBorder(line, "Rotación en Y", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 255, 255));
		Border compound2 = BorderFactory.createCompoundBorder(titled2, etchedRaised);
		ps2.setBorder(compound2);
		
		//panel slider3
		JPanel ps3=new JPanel(new GridLayout(1,1));
		ps3.setBackground(Color.BLACK);
		ps3.setBounds(12, 30, 170, 150);
		Border titled3 = BorderFactory.createTitledBorder(line, "Rotación en Z", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 255, 255));
		Border compound3 = BorderFactory.createCompoundBorder(titled3, etchedRaised);
		ps3.setBorder(compound3);
		
		//panel slider4
		JPanel ps4=new JPanel(new GridLayout(1,1));
		ps4.setBackground(Color.BLACK);
		ps4.setBounds(12, 30, 170, 150);
		Border titled4 = BorderFactory.createTitledBorder(line, "Escalar", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 255, 255));
		Border compound4 = BorderFactory.createCompoundBorder(titled4, etchedRaised);
		ps4.setBorder(compound4);
		
		//slider1
		S1=new JSlider(JSlider.HORIZONTAL,0,360,0);
		S1.setMinorTickSpacing(10);
		S1.setMajorTickSpacing(60);
		S1.setPaintTicks(true);
		S1.setPaintLabels(true);
		
		S1.setBorder(null);
		S1.setForeground(new Color(240, 240, 240));
		S1.setBackground(Color.BLACK);
		
		//slider2
		S2=new JSlider(JSlider.HORIZONTAL,0,360,0);
		S2.setMinorTickSpacing(10);
		S2.setMajorTickSpacing(60);
		S2.setPaintTicks(true);
		S2.setPaintLabels(true);
		
		S2.setBorder(null);
		S2.setForeground(new Color(240, 240, 240));
		S2.setBackground(Color.BLACK);
		
		//slider3
		S3=new JSlider(JSlider.HORIZONTAL,0,360,0);
		S3.setMinorTickSpacing(10);
		S3.setMajorTickSpacing(60);
		S3.setPaintTicks(true);
		S3.setPaintLabels(true);
		
		S3.setBorder(null);
		S3.setForeground(new Color(240, 240, 240));
		S3.setBackground(Color.BLACK);
		
		//slider4
		S4=new JSlider(JSlider.HORIZONTAL,100,2300,1000);
		S4.setMinorTickSpacing(50);
		S4.setMajorTickSpacing(100);
		S4.setPaintTicks(true);
		S4.setPaintLabels(true);
		
		S4.setBorder(null);
		S4.setForeground(new Color(240, 240, 240));
		S4.setBackground(Color.BLACK);
		
		Vent.add(S4,BorderLayout.EAST);
		
		ps1.add(S1); ps2.add(S2); ps3.add(S3);ps4.add(S4);
		
		JPanel sur=new JPanel(new GridLayout(1,3));
		sur.add(ps1);sur.add(ps2);sur.add(ps3);

		
		JPanel sur2=new JPanel(new GridLayout(1,1));
		sur2.add(ps4);

		JPanel surt=new JPanel(new GridLayout(2,1));
		surt.add(sur);surt.add(sur2);
		Vent.add(surt,BorderLayout.SOUTH);
		
		//Toolbar
		crearBarraH();
		
		
		
		
		
		
		
		
		//panel vista superior
		JPanel panel1 = new JPanel(new GridLayout(1,1));
		panel1.setBackground(Color.BLACK);
		panel1.setBounds(12, 30, 170, 150);
		Border titledv1 = BorderFactory.createTitledBorder(line, "Vista superior", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 255, 255));
		Border compoundv1 = BorderFactory.createCompoundBorder(titledv1, etchedRaised);
		panel1.setBorder(compoundv1);
		
		//panel vista lateral
		JPanel panel2 = new JPanel(new GridLayout(1,1));
		panel2.setBackground(Color.BLACK);
		panel2.setBounds(12, 185, 170, 150);
		Border titledv2 = BorderFactory.createTitledBorder(line, "Vista lateral", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 255, 255));
		Border compoundv2 = BorderFactory.createCompoundBorder(titledv2, etchedRaised);
		panel2.setBorder(compoundv2);
		
		//panel vista frontal
		JPanel panel3 = new JPanel(new GridLayout(1,1));
		panel3.setBackground(Color.BLACK);
		panel3.setBounds(12, 340, 170, 150);
		Border titledv3 = BorderFactory.createTitledBorder(line, "Vista frontal", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 255, 255));
		Border compoundv3 = BorderFactory.createCompoundBorder(titledv3, etchedRaised);
		panel3.setBorder(compoundv3);
		
		//panel general
		JPanel panel = new JPanel(new GridLayout(3,1));
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 51, 193, 500);
		Border titled = BorderFactory.createTitledBorder(line, "Vistas ortográficas", TitledBorder.CENTER, TitledBorder.TOP, null,new Color(0, 255, 255));
		Border compound = BorderFactory.createCompoundBorder(titled, etchedRaised);
		panel.setBorder(compound);
		//panel1.add(S1);//PRUEBA
		panel.add(panel1);panel.add(panel2);panel.add(panel3);
		Vent.add(panel,BorderLayout.WEST);
		
		
		
		
		
		Vent.getContentPane().setBackground(Color.BLACK);
		
		Vent.setVisible(true);
		Vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void crearBarraH() {
		toolBar = new JToolBar("Operaciones rapidas",JToolBar.HORIZONTAL);
		toolBar.setForeground(new Color(128, 0, 128));
		toolBar.setBackground(Color.BLACK);
		//Prueba 2 //toolBar.add(S1);
		Vent.add(toolBar,BorderLayout.NORTH);
		
		l1=new JLabel(" Escalar: ");
		l2=new JLabel(" Reflejar: ");
		l3=new JLabel(" Rotar: ");
		l4=new JLabel(" Trasladar: ");
		l5=new JLabel(" Sentido de rotación: ");
		l1.setForeground(Color.WHITE);
		l2.setForeground(Color.WHITE);
		l3.setForeground(Color.WHITE);
		l4.setForeground(Color.WHITE);
		l5.setForeground(Color.WHITE);


		URL ruta=getClass().getResource("/Poyecto3D/rec/mas1.png");
		Action A1=new AbstractAction("", new ImageIcon(ruta)){
			public void actionPerformed(ActionEvent arg0) {
				
			}};
			A1.putValue(Action.SHORT_DESCRIPTION,"Escalar la figura (+)");
        JButton bA1=new JButton(A1);
        bA1.setBackground(Color.BLACK);
        toolBar.add(l1);
        toolBar.add(bA1);
        
        ruta=getClass().getResource("/Poyecto3D/rec/menos.png");
		Action A2=new AbstractAction("", new ImageIcon(ruta)){
			public void actionPerformed(ActionEvent arg0) {
				
			}};
			A2.putValue(Action.SHORT_DESCRIPTION,"Escalar la figura (-)");
        JButton bA2=new JButton(A2);
        bA2.setBackground(Color.BLACK);
        toolBar.add(bA2);
        
        ruta=getClass().getResource("/Poyecto3D/rec/refx.png");
		Action A3=new AbstractAction("", new ImageIcon(ruta)){
			public void actionPerformed(ActionEvent arg0) {
				
			}};
			A3.putValue(Action.SHORT_DESCRIPTION,"Reflejar la figura en X");
        JButton bA3=new JButton(A3);
        bA3.setBackground(Color.BLACK);
        toolBar.add(l2);
        toolBar.add(bA3);
        
        ruta=getClass().getResource("/Poyecto3D/rec/refy.png");
		Action A4=new AbstractAction("", new ImageIcon(ruta)){
			public void actionPerformed(ActionEvent arg0) {
				
			}};
			A4.putValue(Action.SHORT_DESCRIPTION,"Reflejar la figura en Y");
        JButton bA4=new JButton(A4);
        bA4.setBackground(Color.BLACK);
        toolBar.add(bA4);
        
        ruta=getClass().getResource("/Poyecto3D/rec/refz.png");
		Action A5=new AbstractAction("", new ImageIcon(ruta)){
			public void actionPerformed(ActionEvent arg0) {
				
			}};
			A5.putValue(Action.SHORT_DESCRIPTION,"Reflejar la figura en Z");
        JButton bA5=new JButton(A5);
        bA5.setBackground(Color.BLACK);
        toolBar.add(bA5);
        
        ruta=getClass().getResource("/Poyecto3D/rec/rotx.png");
		Action A6=new AbstractAction("", new ImageIcon(ruta)){
			public void actionPerformed(ActionEvent arg0) {
				
			}};
			A6.putValue(Action.SHORT_DESCRIPTION,"Rotar la figura en X");
        JButton bA6=new JButton(A6);
        bA6.setBackground(Color.BLACK);
        toolBar.add(l3);
        toolBar.add(bA6);
        
        ruta=getClass().getResource("/Poyecto3D/rec/roty.png");
		Action A7=new AbstractAction("", new ImageIcon(ruta)){
			public void actionPerformed(ActionEvent arg0) {
				
			}};
			A7.putValue(Action.SHORT_DESCRIPTION,"Rotar la figura en Y");
        JButton bA7=new JButton(A7);
        bA7.setBackground(Color.BLACK);
        toolBar.add(bA7);
        
        ruta=getClass().getResource("/Poyecto3D/rec/rotz.png");
		Action A8=new AbstractAction("", new ImageIcon(ruta)){
			public void actionPerformed(ActionEvent arg0) {
				
			}};
			A8.putValue(Action.SHORT_DESCRIPTION,"Rotar la figura en Z");
        JButton bA8=new JButton(A8);
        bA8.setBackground(Color.BLACK);
        toolBar.add(bA8);
        
        //sentido de rotacion
        toolBar.add(l5);
        ruta=getClass().getResource("/Poyecto3D/rec/sentido.png");
		Action As=new AbstractAction("", new ImageIcon(ruta)){
			public void actionPerformed(ActionEvent arg0) {
				
			}};
			As.putValue(Action.SHORT_DESCRIPTION,"Rotar en sentido de las manecillas");
        JButton bAs=new JButton(As);
        bAs.setBackground(Color.BLACK);
        toolBar.add(bAs);
        ruta=getClass().getResource("/Poyecto3D/rec/contra.png");
		Action Ac=new AbstractAction("", new ImageIcon(ruta)){
			public void actionPerformed(ActionEvent arg0) {
				
			}};
			Ac.putValue(Action.SHORT_DESCRIPTION,"Rotar en contra de las manecillas");
        JButton bAc=new JButton(Ac);
        bAc.setBackground(Color.BLACK);
        toolBar.add(bAc);
        
        
        ruta=getClass().getResource("/Poyecto3D/rec/trasx.png");
		Action A9=new AbstractAction("", new ImageIcon(ruta)){
			public void actionPerformed(ActionEvent arg0) {
				
			}};
			A9.putValue(Action.SHORT_DESCRIPTION,"Trasladar la figura en X");
        JButton bA9=new JButton(A9);
        bA9.setBackground(Color.BLACK);
        toolBar.add(l4);
        toolBar.add(bA9);
        
        ruta=getClass().getResource("/Poyecto3D/rec/trasy.png");
		Action A10=new AbstractAction("", new ImageIcon(ruta)){
			public void actionPerformed(ActionEvent arg0) {
				
			}};
			A10.putValue(Action.SHORT_DESCRIPTION,"Trasladar la figura en Y");
        JButton bA10=new JButton(A10);
        bA10.setBackground(Color.BLACK);
        toolBar.add(bA10);
        
        ruta=getClass().getResource("/Poyecto3D/rec/trasz.png");
		Action A11=new AbstractAction("", new ImageIcon(ruta)){
			public void actionPerformed(ActionEvent arg0) {
				
			}};
			A11.putValue(Action.SHORT_DESCRIPTION,"Trasladar la figura en Z");
        JButton bA11=new JButton(A11);
        bA11.setBackground(Color.BLACK);
        toolBar.add(bA11);
        
        ruta=getClass().getResource("/Poyecto3D/rec/salir.png");
		Action Asalir=new AbstractAction("", new ImageIcon(ruta)){
			public void actionPerformed(ActionEvent arg0) {
				
			}};
			Asalir.putValue(Action.SHORT_DESCRIPTION,"Salir");
        JButton bAsalir=new JButton(Asalir);
        bAsalir.setBackground(Color.BLACK);
        toolBar.add(bAsalir);
	}
	
	public static void main(String[] args) {
		new Interfaz();
	}
   
}
