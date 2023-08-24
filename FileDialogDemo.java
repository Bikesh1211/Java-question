import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.*;

public class FileDialogDemo extends JFrame
{
   private static final int DEFAULT_WIDTH = 300;
   private static final int DEFAULT_HEIGHT = 400;
   private JLabel label;
   private JFileChooser chooser;

  public FileDialogDemo(){
      // set up menu bar
      JMenuBar menuBar = new JMenuBar();
      setJMenuBar(menuBar);
      JMenu menu = new JMenu("File");
      menuBar.add(menu);

      JMenuItem openItem = new JMenuItem("Open");
      menu.add(openItem);
      chooser = new JFileChooser();
      JPanel panel = new JPanel();

      label = new JLabel();
      panel.add(label);
      add(label);
      openItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
               chooser.setCurrentDirectory(new File("."));
               int result = chooser.showSaveDialog(FileDialogDemo.this);
               if (result == JFileChooser.APPROVE_OPTION){
				   File fileToSave = chooser.getSelectedFile();
    				System.out.println("Save as file: " + fileToSave.getAbsolutePath());
	   }
               System.out.println("Result: "+result);
            }
         });

      JMenuItem exitItem = new JMenuItem("Exit");
      menu.add(exitItem);
	  exitItem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
               System.exit(0);
         	}
      });

      setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
      setVisible(true);
   }
   public static void main(String[] args){
	   new FileDialogDemo();
   }
}
