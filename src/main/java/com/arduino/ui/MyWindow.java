package com.arduino.ui;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.arduino.dispatcher.Dispatcher;
import com.arduino.utils.Designer;

@Component("myWindow")
public class MyWindow extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6660880333546295329L;

	@Autowired
	private Dispatcher dispatcher;
	
	@Autowired
	@Qualifier("leftPanel")
	private JPanel  leftPanel;
	
	
	private JMenuBar  toolbar;
	
	@Autowired
	@Qualifier("sheetArea")
	private JPanel  sheetArea;

	public MyWindow() {

		super("Arduino Project");
		Designer.setNumbusLookAndFeel();
		setDefaultWindowProperties();

	}


	public void setDefaultWindowProperties() {

		setIcon();
		setLayout(new BorderLayout());
		pack();
		setSize(1000, 800);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void setIcon() {
		this.setIconImage(new ImageIcon("./resources/pics/icon.png").getImage());
	}

	public Dispatcher getDispatcher() {
		return dispatcher;
	}

	public void setDispatcher(Dispatcher dispatcher) {
		this.dispatcher = dispatcher;
	}

	public JPanel getLeftPanel() {
		return leftPanel;
	}

	public void setLeftPanel(JPanel leftPanel) {
		this.leftPanel = leftPanel;
	}

	public JMenuBar getToolbar() {
		return toolbar;
	}

	public void setToolbar(JMenuBar toolbar) {
		this.toolbar = toolbar;
	}

	public JPanel getSheetArea() {
		return sheetArea;
	}

	public void setSheetArea(JPanel sheetArea) {
		this.sheetArea = sheetArea;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
