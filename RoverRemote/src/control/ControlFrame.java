package control;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JFrame;

import tools.DataHandler;
import tools.DataSource;

public class ControlFrame extends JFrame implements KeyListener, DataSource {
	DataHandler datahandler;
	String[] datatypes = {DataTypes.DTYPE_KEYPRESS_SOURCE1};
	
	public ControlFrame(DataHandler dh) {
		super("Control Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		datahandler = dh;
		datahandler.addSource(this);
		
		addKeyListener(this);
	}

	public void keyPressed(KeyEvent e) {
		System.out.println("CF: keypressed");
		datahandler.pushData(datatypes[0], e);
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

	public String[] getOfferedDataTypes() {
		return datatypes;
	}
}
