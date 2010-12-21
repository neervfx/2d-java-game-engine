/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Toolbox.java
 *
 * Created on 15.12.2010, 15:59:10
 */

package mapeditor;

import javax.swing.ImageIcon;
import java.awt.*;
import java.io.*;
import engine.game.*;
import javax.imageio.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Philipp
 */
public class Toolbox extends javax.swing.JFrame {

    /** Creates new form Toolbox */
    public Toolbox() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ToolboxTab = new javax.swing.JTabbedPane();
        TileTabPanel = new javax.swing.JPanel();
        TilesetPanel = new tileChooser();
        ImportButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner3.addChangeListener(cameraSpinnerListener);
        jLabel6 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner1.addChangeListener(mapSizeSpinnerListener);
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner2.addChangeListener(mapSizeSpinnerListener);
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bg0TextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        browseButtonBG0 = new javax.swing.JButton();
        browseButtonBG1 = new javax.swing.JButton();
        bg1TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        browseButtonFG = new javax.swing.JButton();
        fgTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tools");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        ToolboxTab.setName("ToolboxTab"); // NOI18N

        TileTabPanel.setName("TileTabPanel"); // NOI18N

        TilesetPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TilesetPanel.setName("TilesetPanel"); // NOI18N
        TilesetPanel.setPreferredSize(new java.awt.Dimension(128, 128));

        org.jdesktop.layout.GroupLayout TilesetPanelLayout = new org.jdesktop.layout.GroupLayout(TilesetPanel);
        TilesetPanel.setLayout(TilesetPanelLayout);
        TilesetPanelLayout.setHorizontalGroup(
            TilesetPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 273, Short.MAX_VALUE)
        );
        TilesetPanelLayout.setVerticalGroup(
            TilesetPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 62, Short.MAX_VALUE)
        );

        ImportButton.setText("Import");
        ImportButton.setName("ImportButton"); // NOI18N
        ImportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout TileTabPanelLayout = new org.jdesktop.layout.GroupLayout(TileTabPanel);
        TileTabPanel.setLayout(TileTabPanelLayout);
        TileTabPanelLayout.setHorizontalGroup(
            TileTabPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TilesetPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
            .add(TileTabPanelLayout.createSequentialGroup()
                .add(81, 81, 81)
                .add(ImportButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 106, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        TileTabPanelLayout.setVerticalGroup(
            TileTabPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(TileTabPanelLayout.createSequentialGroup()
                .add(TilesetPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(ImportButton)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        ToolboxTab.addTab("Tiles", TileTabPanel);

        jPanel1.setName("jPanel1"); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Camera"));
        jPanel3.setName("jPanel3"); // NOI18N

        jSpinner3.setName("jSpinner3"); // NOI18N

        jLabel6.setText("Preferred Height");
        jLabel6.setName("jLabel6"); // NOI18N

        jSpinner4.setName("jSpinner4"); // NOI18N
        jSpinner4.addChangeListener(cameraSpinnerListener);

        jLabel7.setText("Tolerance");
        jLabel7.setName("jLabel7"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel6)
                    .add(jLabel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jSpinner4)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jSpinner3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(jLabel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jSpinner3))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jSpinner4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Map Size"));
        jPanel4.setToolTipText("");
        jPanel4.setName("jPanel4"); // NOI18N

        jSpinner1.setName("jSpinner1"); // NOI18N
        jSpinner1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jSpinner1PropertyChange(evt);
            }
        });

        jSpinner2.setName("jSpinner2"); // NOI18N
        jSpinner2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jSpinner2PropertyChange(evt);
            }
        });

        jLabel4.setText("X");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setText("Y");
        jLabel5.setName("jLabel5"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSpinner1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 13, Short.MAX_VALUE)
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSpinner2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jSpinner1)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .add(jSpinner2))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 105, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ToolboxTab.addTab("Properties", jPanel1);

        jPanel2.setName("jPanel2"); // NOI18N

        bg0TextField.setName("bg0TextField"); // NOI18N

        jLabel1.setText("Background Layer 0");
        jLabel1.setName("jLabel1"); // NOI18N

        browseButtonBG0.setText("Browse");
        browseButtonBG0.setName("browseButtonBG0"); // NOI18N
        browseButtonBG0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonBG0ActionPerformed(evt);
            }
        });

        browseButtonBG1.setText("Browse");
        browseButtonBG1.setName("browseButtonBG1"); // NOI18N
        browseButtonBG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonBG1ActionPerformed(evt);
            }
        });

        bg1TextField.setName("bg1TextField"); // NOI18N

        jLabel2.setText("Background Layer 1");
        jLabel2.setName("jLabel2"); // NOI18N

        browseButtonFG.setText("Browse");
        browseButtonFG.setName("browseButtonFG"); // NOI18N

        fgTextField.setName("fgTextField"); // NOI18N

        jLabel3.setText("Foreground Layer");
        jLabel3.setName("jLabel3"); // NOI18N

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(bg0TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 141, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(browseButtonBG0))
                    .add(jLabel1)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(bg1TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 141, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(browseButtonBG1))
                    .add(jLabel2)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(fgTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 141, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(browseButtonFG))
                    .add(jLabel3))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(bg0TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseButtonBG0))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(bg1TextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseButtonBG1))
                .add(18, 18, 18)
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(fgTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseButtonFG))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        ToolboxTab.addTab("Background", jPanel2);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(ToolboxTab, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(ToolboxTab, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportButtonActionPerformed
        
        javax.swing.JFileChooser jFileChooser1 = new javax.swing.JFileChooser();
        
        int value = jFileChooser1.showOpenDialog(null);
        File tilefile = jFileChooser1.getSelectedFile();
        MapEditor.tilepath = tilefile.getPath();
        MapEditor.tiles = Toolkit.getDefaultToolkit().getImage(tilefile.getAbsolutePath());
        ImageIcon tileicon = new ImageIcon(MapEditor.tiles);
        tileChooser.image = MapEditor.tiles;
        Map.img = MapEditor.tiles;
        while(MapEditor.tiles.getWidth(ImportButton) == -1){} //wait till image is loaded
        TilesetPanel.setPreferredSize(new Dimension(MapEditor.tiles.getWidth(ImportButton), MapEditor.tiles.getHeight(ImportButton)));

    }//GEN-LAST:event_ImportButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MapEditor.toolsCheckBox.setState(false);
    }//GEN-LAST:event_formWindowClosing

    private void browseButtonBG0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonBG0ActionPerformed
        
        javax.swing.JFileChooser jfc =  new javax.swing.JFileChooser();
        jfc.showOpenDialog(null);
        bg0TextField.setText(jfc.getSelectedFile().getPath());
        
        try{
           gameMain.background_layer0 = ImageIO.read(jfc.getSelectedFile());
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_browseButtonBG0ActionPerformed

    private void browseButtonBG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonBG1ActionPerformed

        javax.swing.JFileChooser jfc =  new javax.swing.JFileChooser();
        jfc.showOpenDialog(null);
        bg1TextField.setText(jfc.getSelectedFile().getPath());

        try{
           gameMain.background_layer1 = ImageIO.read(jfc.getSelectedFile());
        }
        catch(Exception e){
        }

    }//GEN-LAST:event_browseButtonBG1ActionPerformed

    private void jSpinner1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jSpinner1PropertyChange
        
    }//GEN-LAST:event_jSpinner1PropertyChange

    private void jSpinner2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jSpinner2PropertyChange
        
    }//GEN-LAST:event_jSpinner2PropertyChange

    ChangeListener mapSizeSpinnerListener = new ChangeListener() {
        public void stateChanged(ChangeEvent e) {
        
            if(Integer.parseInt(jSpinner1.getValue().toString()) < 0){
                jSpinner1.setValue(0);
            }
            if(Integer.parseInt(jSpinner1.getValue().toString()) > 999){
                jSpinner1.setValue(999);
            }
            if(Integer.parseInt(jSpinner2.getValue().toString()) < 0){
                jSpinner2.setValue(0);
            }
            if(Integer.parseInt(jSpinner2.getValue().toString()) > 999){
                jSpinner2.setValue(999);
            }

            Map.setMapSize(Integer.parseInt(jSpinner1.getValue().toString())*16,Integer.parseInt(jSpinner2.getValue().toString())*16);
            MapEditor.mapEdit.setMaximumSize(new Dimension(Map.maxWidth + 7,Map.maxHeight + 50));
        }
    };

    ChangeListener cameraSpinnerListener = new ChangeListener() {
        public void stateChanged(ChangeEvent e) {

            if(Integer.parseInt(jSpinner3.getValue().toString()) < 0){
                jSpinner3.setValue(0);
            }
            if(Integer.parseInt(jSpinner4.getValue().toString()) < 0){
                jSpinner4.setValue(0);
            }

            MapEditor.cameraPrefHeight = Integer.parseInt(jSpinner3.getValue().toString());
            MapEditor.cameraTolerance = Integer.parseInt(jSpinner4.getValue().toString());

        }
    };
    
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton ImportButton;
    public static javax.swing.JPanel TileTabPanel;
    public static javax.swing.JPanel TilesetPanel;
    public static javax.swing.JTabbedPane ToolboxTab;
    public static javax.swing.JTextField bg0TextField;
    public static javax.swing.JTextField bg1TextField;
    private javax.swing.JButton browseButtonBG0;
    private javax.swing.JButton browseButtonBG1;
    private javax.swing.JButton browseButtonFG;
    public static javax.swing.JTextField fgTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JSpinner jSpinner1;
    public static javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    // End of variables declaration//GEN-END:variables

}
