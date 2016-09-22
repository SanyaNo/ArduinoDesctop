package com.arduino.ui;

import java.awt.Dimension;
import java.awt.FlowLayout;
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
import com.arduino.model.Note;

@Component("leftPanel")
public class LeftPanel extends JPanel {

	private JTree menu;

	private Object selectedNode = "";

	private JFrame win;
	
	@Autowired
	Dispatcher dispatcher;
	
	@Autowired
	private SheetArea sheetArea;

	public LeftPanel() {

		// TODO fit tree hierarchy

		DefaultMutableTreeNode node = new DefaultMutableTreeNode("Sheets");
		//populateSheetNode(node);
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
				MyWindow win = (MyWindow) menu.getParent().getParent().getParent().getParent().getParent().getParent()
						.getParent();
				sheetArea = (SheetArea) win.getSheetArea();
				sheetArea.removeAll();
				List<Note> score = dispatcher.getScore(title);
				//sif (!title.equals("Sheets")) sheetArea.paintScore(score, title);
				
				win.validate();
				win.repaint();

			}
		});

		Border innerBorder = BorderFactory.createTitledBorder("Menu");
		Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
		setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));

		JScrollPane scroll = new JScrollPane(menu);
		add(scroll, new FlowLayout());

		scroll.setPreferredSize(new Dimension(150, 650));

	}

//	public void populateSheetNode(DefaultMutableTreeNode node) {
//
//		ArrayList<Sheet> sheet = Dispatcher.getSheets();
//		for (Sheet sh : sheet) {
//
//			node.add(new DefaultMutableTreeNode(sh.getName()));
//
//		}
//	}

	public Object getSelectedNode() {
		return selectedNode;
	}

	public void setSelectedNode(Object selectedNode) {
		this.selectedNode = selectedNode;
	}

}