/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nosqltools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultTreeCellRenderer;
import org.fife.ui.rtextarea.*;
import org.fife.ui.rsyntaxtextarea.*;
import org.json.simple.parser.JSONParser;


/**
 *
 * @author RebeccaKai
 */
public class MainForm extends javax.swing.JFrame {

    private final JSONUtilities json_util = new JSONUtilities();
    private final Utilities util = new Utilities();
    StringBuilder sb = new StringBuilder();
    private File file = null;
    RSyntaxTextArea textArea;
    JSONParser parser = new JSONParser();

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        textArea = new RSyntaxTextArea(20, 60);
        textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JSON);
        textArea.setCodeFoldingEnabled(true);
        textArea.setAntiAliasingEnabled(true);
        RTextScrollPane sp = new RTextScrollPane(textArea);
        sp.setFoldIndicatorEnabled(true);
        Panel_Text.add(sp);
        Save.setEnabled(false);
        
        Panel_Text.setVisible(false);
        Panel_Table.setVisible(false);
        Panel_Hierarchical.setVisible(false);
        Panel_Compare.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        Panel_Connections = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        Panel_Views = new javax.swing.JPanel();
        Panel_Text = new javax.swing.JPanel();
        Panel_Hierarchical = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTreeHierarchicalJson = new javax.swing.JTree();
        Panel_Table = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table_JSON = new javax.swing.JTable();
        Panel_Compare = new javax.swing.JPanel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        Compare_Button = new javax.swing.JButton();
        Text_MessageBar = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_File = new javax.swing.JMenu();
        Import_JSON = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        Menu_Views = new javax.swing.JMenu();
        View_Text = new javax.swing.JMenuItem();
        View_Hierarchical = new javax.swing.JMenuItem();
        View_Table = new javax.swing.JMenuItem();
        Menu_Operations = new javax.swing.JMenu();
        Op_Compare = new javax.swing.JMenuItem();
        Op_Validate = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(150);
        jSplitPane1.setPreferredSize(new java.awt.Dimension(568, 453));

        jScrollPane2.setViewportView(jTree1);

        javax.swing.GroupLayout Panel_ConnectionsLayout = new javax.swing.GroupLayout(Panel_Connections);
        Panel_Connections.setLayout(Panel_ConnectionsLayout);
        Panel_ConnectionsLayout.setHorizontalGroup(
            Panel_ConnectionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
        );
        Panel_ConnectionsLayout.setVerticalGroup(
            Panel_ConnectionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        jSplitPane1.setLeftComponent(Panel_Connections);

        Panel_Text.setLayout(new java.awt.BorderLayout());

        jScrollPane4.setViewportView(jTreeHierarchicalJson);

        javax.swing.GroupLayout Panel_HierarchicalLayout = new javax.swing.GroupLayout(Panel_Hierarchical);
        Panel_Hierarchical.setLayout(Panel_HierarchicalLayout);
        Panel_HierarchicalLayout.setHorizontalGroup(
            Panel_HierarchicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1344, Short.MAX_VALUE)
        );
        Panel_HierarchicalLayout.setVerticalGroup(
            Panel_HierarchicalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_HierarchicalLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane3.setSize(Panel_Table.getSize());

        Table_JSON.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(Table_JSON);
        Table_JSON.setSize(Panel_Table.getSize());

        javax.swing.GroupLayout Panel_TableLayout = new javax.swing.GroupLayout(Panel_Table);
        Panel_Table.setLayout(Panel_TableLayout);
        Panel_TableLayout.setHorizontalGroup(
            Panel_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TableLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Panel_TableLayout.setVerticalGroup(
            Panel_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_TableLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
        );

        Panel_Compare.setPreferredSize(new java.awt.Dimension(1203, 511));

        jSplitPane2.setResizeWeight(0.5);
        jSplitPane2.setToolTipText("");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jSplitPane2.setLeftComponent(jScrollPane1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        jSplitPane2.setRightComponent(jScrollPane5);

        Compare_Button.setText("Compare");
        Compare_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Compare_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_CompareLayout = new javax.swing.GroupLayout(Panel_Compare);
        Panel_Compare.setLayout(Panel_CompareLayout);
        Panel_CompareLayout.setHorizontalGroup(
            Panel_CompareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CompareLayout.createSequentialGroup()
                .addGroup(Panel_CompareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_CompareLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_CompareLayout.createSequentialGroup()
                        .addGap(482, 482, 482)
                        .addComponent(Compare_Button)))
                .addContainerGap())
        );
        Panel_CompareLayout.setVerticalGroup(
            Panel_CompareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_CompareLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Compare_Button)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Panel_ViewsLayout = new javax.swing.GroupLayout(Panel_Views);
        Panel_Views.setLayout(Panel_ViewsLayout);
        Panel_ViewsLayout.setHorizontalGroup(
            Panel_ViewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 1344, Short.MAX_VALUE)
            .addGroup(Panel_ViewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel_Hierarchical, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel_ViewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel_Table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel_ViewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_ViewsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel_Compare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Panel_ViewsLayout.setVerticalGroup(
            Panel_ViewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_Text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
            .addGroup(Panel_ViewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel_Hierarchical, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel_ViewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Panel_Table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Panel_ViewsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Panel_ViewsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Panel_Compare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        Panel_Hierarchical.setSize(Panel_Views.getSize());
        Panel_Table.setSize(Panel_Views.getSize());

        jSplitPane1.setRightComponent(Panel_Views);

        Text_MessageBar.setEditable(false);
        Text_MessageBar.setForeground(new java.awt.Color(255, 0, 0));
        Text_MessageBar.setText("This is the message Bar");
        Text_MessageBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_MessageBarActionPerformed(evt);
            }
        });

        Menu_File.setText("File");
        Menu_File.setName(""); // NOI18N

        Import_JSON.setText("Import JSON file");
        Import_JSON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Import_JSONActionPerformed(evt);
            }
        });
        Menu_File.add(Import_JSON);

        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        Menu_File.add(Save);

        jMenuBar1.add(Menu_File);

        Menu_Views.setText("Views");

        View_Text.setText("Text");
        View_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_TextActionPerformed(evt);
            }
        });
        Menu_Views.add(View_Text);

        View_Hierarchical.setText("Hierarchical");
        View_Hierarchical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_HierarchicalActionPerformed(evt);
            }
        });
        Menu_Views.add(View_Hierarchical);

        View_Table.setText("Table");
        View_Table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_TableActionPerformed(evt);
            }
        });
        Menu_Views.add(View_Table);

        jMenuBar1.add(Menu_Views);

        Menu_Operations.setText("Operations");

        Op_Compare.setText("Compare");
        Op_Compare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Op_CompareActionPerformed(evt);
            }
        });
        Menu_Operations.add(Op_Compare);

        Op_Validate.setText("Validate");
        Menu_Operations.add(Op_Validate);

        jMenuBar1.add(Menu_Operations);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Text_MessageBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Text_MessageBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void View_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_TextActionPerformed
        Panel_Text.setVisible(true);
        Panel_Hierarchical.setVisible(false);
        Panel_Table.setVisible(false);
        Panel_Compare.setVisible(false);
    }//GEN-LAST:event_View_TextActionPerformed

    private void View_HierarchicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_HierarchicalActionPerformed
        Panel_Text.setVisible(false);
        Panel_Hierarchical.setVisible(true);
        Panel_Table.setVisible(false);
        Panel_Compare.setVisible(false);
        
        if (file == null) {
            jTreeHierarchicalJson.setVisible(false);
            JOptionPane.showMessageDialog(null, "No file was chosen", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            jTreeHierarchicalJson.setVisible(true);
            jTreeHierarchicalJson.setModel(json_util.makeJtreeModel(file.getName()));
            setImageIcon();
        }
    }//GEN-LAST:event_View_HierarchicalActionPerformed

    private void View_TableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_TableActionPerformed
        // TODO add your handling code here:
        Panel_Text.setVisible(false);
        Panel_Hierarchical.setVisible(false);
        Panel_Table.setVisible(true);
        Panel_Compare.setVisible(false);

        String[] json_field_names = json_util.getFields();
        String[][] json_row_data = json_util.getRows(json_field_names);
        DefaultTableModel model = (DefaultTableModel) Table_JSON.getModel();
        Table_JSON.setModel(new DefaultTableModel(json_row_data, json_field_names));

    }//GEN-LAST:event_View_TableActionPerformed

    private void Import_JSONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Import_JSONActionPerformed
        final JFileChooser fc = new JFileChooser();
        String[] ext_array = new String[]{"txt", "json"};
        String ext = util.formatExtentsions(ext_array);
        file = null;
        sb.setLength(0);

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files (" + ext + ")", ext_array);
        fc.setFileFilter(filter);

        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) 
        {
            Save.setEnabled(true);
            file = fc.getSelectedFile();
            sb.append(util.readFromFile(file));
                        
            Panel_Text.setVisible(true);
            Panel_Hierarchical.setVisible(false);
            Panel_Table.setVisible(false);

            textArea.setText("");
            textArea.setText(sb.toString());
            if (json_util.isValid(sb.toString())) 
            {
                json_util.isDataParsed(textArea.getText());
                Text_MessageBar.setText("JSON File has been loaded successfully");
            } 
            else 
            {
                sb.setLength(0);
                JOptionPane.showMessageDialog(this, "Incorrect JSON format", "Validation Error", JOptionPane.ERROR_MESSAGE);
           
                try
                {
                    Object obj = parser.parse(sb.toString());
                }
                catch(org.json.simple.parser.ParseException pe)
                {
                   Text_MessageBar.setText("Error on line: " + json_util.getLineNumber(pe.getPosition(), textArea.getText()) + " - " + pe);
                }
            }
        }
    }//GEN-LAST:event_Import_JSONActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        Object obj = null;
        
        try 
        {
            obj = parser.parse(textArea.getText());
            try
            {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.write(textArea.getText());
                writer.close();
                Text_MessageBar.setText("JSON File has been saved successfully");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch(org.json.simple.parser.ParseException pe)
        {
           Text_MessageBar.setText("Error in line: " + json_util.getLineNumber(pe.getPosition(), textArea.getText()) + " - " + pe);
        }
    }//GEN-LAST:event_SaveActionPerformed

    private void Text_MessageBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_MessageBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_MessageBarActionPerformed

    private void Op_CompareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Op_CompareActionPerformed

        Panel_Text.setVisible(false);
        Panel_Hierarchical.setVisible(false);
        Panel_Table.setVisible(false);
        Panel_Compare.setVisible(true);

    }//GEN-LAST:event_Op_CompareActionPerformed

    private void Compare_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Compare_ButtonActionPerformed

        //validate both text areas 
        if (json_util.isValid(jTextArea1.getText()) && json_util.isValid(jTextArea2.getText())) 
        {
            Text_MessageBar.setText("JSON in has been loaded successfully... start comparing");
            //call compare_result method found in JSONUtilitites
            String comp_result = json_util.compareResult(jTextArea1.getText(), jTextArea2.getText());
            Text_MessageBar.setText(comp_result);
        } 
        else 
        {
            JOptionPane.showMessageDialog(this, "Incorrect JSON format", "Validation Error", JOptionPane.ERROR_MESSAGE);
            Text_MessageBar.setText("Compare failed");
        }
    }//GEN-LAST:event_Compare_ButtonActionPerformed

    public void setImageIcon() {
        ImageIcon leafIcon = createImageIcon("resources/json_node.png");

        if (leafIcon != null) {
            DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
            renderer.setLeafIcon(leafIcon);
            jTreeHierarchicalJson.setCellRenderer(renderer);
        }
    }

    private ImageIcon createImageIcon(String path) {
        java.net.URL imgUrl = getClass().getResource(path);
        if (imgUrl != null) {
            return new ImageIcon(imgUrl);
        } else {
            Text_MessageBar.setText("Leaf icon file specified does not exist");
            return null;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Compare_Button;
    private javax.swing.JMenuItem Import_JSON;
    private javax.swing.JMenu Menu_File;
    private javax.swing.JMenu Menu_Operations;
    private javax.swing.JMenu Menu_Views;
    private javax.swing.JMenuItem Op_Compare;
    private javax.swing.JMenuItem Op_Validate;
    private javax.swing.JPanel Panel_Compare;
    private javax.swing.JPanel Panel_Connections;
    private javax.swing.JPanel Panel_Hierarchical;
    private javax.swing.JPanel Panel_Table;
    private javax.swing.JPanel Panel_Text;
    private javax.swing.JPanel Panel_Views;
    private javax.swing.JMenuItem Save;
    private javax.swing.JTable Table_JSON;
    private javax.swing.JTextField Text_MessageBar;
    private javax.swing.JMenuItem View_Hierarchical;
    private javax.swing.JMenuItem View_Table;
    private javax.swing.JMenuItem View_Text;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTree jTree1;
    public javax.swing.JTree jTreeHierarchicalJson;
    // End of variables declaration//GEN-END:variables
}
