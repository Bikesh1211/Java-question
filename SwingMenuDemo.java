import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

public class SwingMenuDemo extends JFrame{
	SwingMenuDemo(){
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);

		JMenuItem openItem = new JMenuItem("Open");
		openItem.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
		fileMenu.add(openItem);

		JMenuItem saveItem = new JMenuItem("Save");
		saveItem.setEnabled(false);
		fileMenu.add(saveItem);

		JMenu helpMenu = new JMenu("Help");
		helpMenu.setMnemonic('H');
		menuBar.add(helpMenu);
		JMenuItem aboutItem = new JMenuItem("About", 'A');
		helpMenu.add(aboutItem);

		JMenu editMenu = new JMenu("Edit");
		menuBar.add(editMenu);

		JMenuItem cutItem = new JMenuItem("Cut", new ImageIcon("cut.png"));
		//cutItem.setHorizontalTextPosition(SwingConstants.LEFT);
		editMenu.add(cutItem);

		JMenuItem copyItem = new JMenuItem("Copy");
		editMenu.add(copyItem);

		JMenuItem pasteItem = new JMenuItem("Paste");
		editMenu.add(pasteItem);

		JMenu optionsMenu = new JMenu("Options");
		editMenu.add(optionsMenu);

		JCheckBoxMenuItem readonlyItem = new JCheckBoxMenuItem("Read-only");
		JRadioButtonMenuItem insertItem = new JRadioButtonMenuItem("Insert");
    	optionsMenu.add(readonlyItem);
    	optionsMenu.add(insertItem);

    	JPopupMenu popup = new JPopupMenu();
   	    JMenuItem item = new JMenuItem("Cut");
   	    JMenuItem item2 = new JMenuItem("Select All");
	    popup.add(item);
	    popup.add(item2);

	    JPanel panel = new JPanel();
	    JLabel label = new JLabel("Hello Menu");
	    add(panel);

	    panel.add(label);
	    panel.setComponentPopupMenu(popup);

		setSize(300, 300);
    	setVisible(true);
	}
	public static void main(String[] args) {
		new SwingMenuDemo();
	}
}