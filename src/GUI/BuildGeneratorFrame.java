package GUI;

import java.awt.*;

import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.border.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;

public class BuildGeneratorFrame extends JFrame {
	private JPanel	contentPane;
	private JTable _readyTable;
	private JTable _buildTable;
	private JComboBox _cbBranch;
	private JPanel _readyPane;
	private JScrollPane _readyScrollPane;
	private JButton btnLeft;
	private JButton btnRight;
	private JPanel _buildPane;
	private JScrollPane _buildScrollPane;
	private JButton btnGenerateBuild;
	
	private static final long	serialVersionUID	= 2430123846134786326L;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuildGeneratorFrame frame = new BuildGeneratorFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public BuildGeneratorFrame() {
		setTitle("Build Generator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 959, 755);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		_cbBranch = new JComboBox();
		
		JLabel lblBranch = new JLabel("Branch :");
		
		_readyPane = new JPanel();
		_readyPane.setBorder(new TitledBorder(null, "Issues ready for build", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		_buildPane = new JPanel();
		_buildPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Issues to build", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		btnRight = new JButton("------>");
		
		btnLeft = new JButton("<------");
		
		btnGenerateBuild = new JButton("Generate Build");
		
		JLabel lblPorject = new JLabel("Project :");
		
		JComboBox _cbProject = new JComboBox();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnGenerateBuild, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addComponent(lblBranch)
									.addGap(18)
									.addComponent(_cbBranch, 0, 307, Short.MAX_VALUE))
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addComponent(lblPorject)
									.addGap(18)
									.addComponent(_cbProject, 0, 306, Short.MAX_VALUE))
								.addComponent(_readyPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnLeft, 0, 0, Short.MAX_VALUE)
								.addComponent(btnRight, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(36)
							.addComponent(_buildPane, GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPorject)
						.addComponent(_cbProject, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblBranch)
								.addComponent(_cbBranch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(5)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(_buildPane, GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
								.addComponent(_readyPane, GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(292)
							.addComponent(btnRight)
							.addGap(18)
							.addComponent(btnLeft)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnGenerateBuild, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(0))
		);
		_buildPane.setLayout(new BorderLayout(0, 0));
		
		_buildScrollPane = new JScrollPane();
		_buildPane.add(_buildScrollPane, BorderLayout.CENTER);
		
		_buildTable = new JTable();
		_buildTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Issue ID"
			}
		));
		_buildScrollPane.setViewportView(_buildTable);
		_readyPane.setLayout(new BorderLayout(0, 0));
		
		_readyScrollPane = new JScrollPane();
		_readyPane.add(_readyScrollPane);
		
		_readyTable = new JTable();
		_readyTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Issue ID"
			}
		));
		_readyScrollPane.setViewportView(_readyTable);
		contentPane.setLayout(gl_contentPane);
	}
}
