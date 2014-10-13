package GUI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
 
public class UserList extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final ActionListener ActionListener = null;
	private boolean DEBUG = false;
	private JButton btnAdd;
	private JButton btnDelete;
	private JButton btnMainMenu;
	private JButton btnLogout;
 
    public UserList() {
    	setSize(new Dimension(1366, 768));
 
        String[] columnNames = {"First Name",
                                "Last Name",
                                "Email"};
 
        Object[][] data = {
        		
        {"Kathy", "Smith", new Integer(5), new Boolean(false)},
        {"John", "Doe", new Integer(3), new Boolean(true)},
        {"Sue", "Black", new Integer(2), new Boolean(false)},
        {"Jane", "White", new Integer(20), new Boolean(true)},
        {"Joe", "Brown", new Integer(10), new Boolean(false)}
        };
 
        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);
        table.setRowSelectionAllowed(true);
 
        if (DEBUG) {
            table.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    printDebugData(table);
                }
            });
        }
        setLayout(null);
 
        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 205), new Color(255, 255, 255), new Color(0, 0, 205), new Color(255, 255, 255)), new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255))));
        scrollPane.setViewportBorder(new CompoundBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 205), new Color(255, 255, 255), new Color(0, 0, 205), new Color(255, 255, 255)), null));
        scrollPane.setBounds(190, 92, 590, 360);
 
        //Add the scroll pane to this panel.
        add(scrollPane);
        
        JLabel lblUserlist = new JLabel("Userlist");
        lblUserlist.setForeground(new Color(0, 0, 205));
        lblUserlist.setFont(new Font("Helvetica", Font.BOLD, 32));
        lblUserlist.setHorizontalAlignment(SwingConstants.CENTER);
        lblUserlist.setBounds(603, 157, 118, 33);
        add(lblUserlist);
        
        JButton btnAdd = new JButton("Add");
        btnAdd.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 255)));
        btnAdd.setForeground(new Color(0, 0, 205));
        btnAdd.setOpaque(true);
        btnAdd.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {

          String firstName = JOptionPane.showInputDialog(null, "First Name", 1);
          String lastName = JOptionPane.showInputDialog(null, "Last Name", 2);
          String eMail = JOptionPane.showInputDialog(null, "Email", 3);
          
        	}
        });
        
        btnAdd.setBounds(620, 569, 117, 29);
        add(btnAdd);
       
        
        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnDelete.setBounds(975, 229, 117, 29);
        add(btnDelete);
        
        JButton btnMainMenu = new JButton("Main menu");
        btnMainMenu.setBounds(318, 572, 89, 23);
        add(btnMainMenu);
        
        JButton btnLogOut = new JButton("Log out");
        btnLogOut.setBounds(465, 572, 89, 23);
        add(btnLogOut);
    
        JLabel lblNewLabel = new JLabel("Background");
        lblNewLabel.setBackground(new Color(245, 245, 245));
        lblNewLabel.setForeground(new Color(245, 255, 250));
        lblNewLabel.setOpaque(true);
        lblNewLabel.setBounds(10, 11, 1360, 768);
        add(lblNewLabel);
    }
 
    private void printDebugData(JTable table) {
        int numRows = table.getRowCount();
        int numCols = table.getColumnCount();
        javax.swing.table.TableModel model = table.getModel();
 
        System.out.println("Value of data: ");
        for (int i=0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j=0; j < numCols; j++) {
                System.out.print("  " + model.getValueAt(i, j));
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("SimpleTableDemo");
        frame.setSize(1366, 768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        UserList newContentPane = new UserList();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window
        
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
     

        }
        });
    }
    
    public void addActionListener(ActionListener l) {
		btnAdd.addActionListener(l);
		btnDelete.addActionListener(l);
		btnLogout.addActionListener(l);
		btnMainMenu.addActionListener(l);
		
	}

	public static ActionListener getActionlistener() {
		return ActionListener;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public JButton getBtnMainMenu() {
		return btnMainMenu;
	}

	public JButton getBtnLogout() {
		return btnLogout;
	}
    
    
}
