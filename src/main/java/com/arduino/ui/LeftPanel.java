package com.arduino.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.border.Border;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.arduino.dispatcher.Dispatcher;
import com.arduino.model.Sheet;

@Component("leftPanel")
public class LeftPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private JFrame myWindow;

	@Autowired
	Dispatcher dispatcher;

	@Autowired
	private SheetArea sheetArea;

	private JTree menu;

	private Object selectedNode = "";

	public LeftPanel() {

		// TODO fit tree hierarchy

		DefaultMutableTreeNode node = new DefaultMutableTreeNode("Sheets");
		// populateSheetNode(node);
		menu = new JTree(node);
		menu.setShowsRootHandles(true);
		menu.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent e) {
				DefaultMutableTreeNode node = (DefaultMutableTreeNode) menu.getLastSelectedPathComponent();

				/* if nothing is selected */
				if (node == null)
					return;

				/* retrieve the node that was selected */
				selectedNode = node.getUserObject();
				String title = selectedNode.toString();
				/* React to the node selection. */
				sheetArea.removeAll();
				// List<Tone> score = dispatcher.getScore(title);
				// if (!title.equals("Sheets")) sheetArea.paintScore(score,
				// title);

				myWindow.validate();
				myWindow.repaint();

			}
		});

		Border innerBorder = BorderFactory.createTitledBorder("Menu");
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

		JScrollPane scroll = new JScrollPane(menu);
		add(scroll, new FlowLayout());

		scroll.setPreferredSize(new Dimension(150, 650));

	}

	public void populateSheetNode(DefaultMutableTreeNode node) {

		List<Sheet> sheets = dispatcher.findAll();
		for (Sheet sh : sheets) {
			node.add(new DefaultMutableTreeNode(sh.getName()));
		}
	}

	public Object getSelectedNode() {
		return selectedNode;
	}

	public void setSelectedNode(Object selectedNode) {
		this.selectedNode = selectedNode;
	}

}