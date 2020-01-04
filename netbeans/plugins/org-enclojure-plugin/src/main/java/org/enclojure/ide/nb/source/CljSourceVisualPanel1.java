package org.enclojure.ide.nb.source;

import java.util.logging.Level;
import javax.swing.JPanel;
import org.enclojure.ide.core.LogAdapter;

public final class CljSourceVisualPanel1 extends JPanel {

    private static final LogAdapter LOG = new LogAdapter(CljSourceVisualPanel1.class.getName());

    /** Creates new form CljSourceVisualPanel1 */
    public CljSourceVisualPanel1() {
        initComponents();
        LOG.log(Level.INFO,"ctor");
    }

    @Override
    public String getName() {
        return "Enter clojure SOURCE file name and namespace.";
    }

    public boolean _isValid = true;

//    @Override
//    public boolean isValid () { return _isValid;}
//
//    public void setValid (boolean v) { _isValid= v;}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        filenameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        projectTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        createdFileTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sourceRootsComboBox = new javax.swing.JComboBox();
        packagesComboBox = new javax.swing.JComboBox();

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(CljSourceVisualPanel1.class, "CljSourceVisualPanel1.jLabel2.text")); // NOI18N

        filenameTextField.setText(org.openide.util.NbBundle.getMessage(CljSourceVisualPanel1.class, "CljSourceVisualPanel1.filenameTextField.text")); // NOI18N
        filenameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filenameTextFieldActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(CljSourceVisualPanel1.class, "CljSourceVisualPanel1.jLabel3.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(CljSourceVisualPanel1.class, "CljSourceVisualPanel1.jLabel4.text")); // NOI18N

        projectTextField.setEditable(false);
        projectTextField.setText(org.openide.util.NbBundle.getMessage(CljSourceVisualPanel1.class, "CljSourceVisualPanel1.projectTextField.text")); // NOI18N
        projectTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectTextFieldActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(CljSourceVisualPanel1.class, "CljSourceVisualPanel1.jLabel5.text")); // NOI18N

        createdFileTextField.setEditable(false);
        createdFileTextField.setText(org.openide.util.NbBundle.getMessage(CljSourceVisualPanel1.class, "CljSourceVisualPanel1.createdFileTextField.text")); // NOI18N
        createdFileTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createdFileTextFieldActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(CljSourceVisualPanel1.class, "CljSourceVisualPanel1.jLabel6.text")); // NOI18N

        packagesComboBox.setEditable(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(createdFileTextField)
                            .addComponent(projectTextField)
                            .addComponent(sourceRootsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(packagesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(filenameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(filenameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(packagesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sourceRootsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(projectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(createdFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void filenameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filenameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filenameTextFieldActionPerformed

    private void projectTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectTextFieldActionPerformed

    private void createdFileTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createdFileTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createdFileTextFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField createdFileTextField;
    public javax.swing.JTextField filenameTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JComboBox packagesComboBox;
    public javax.swing.JTextField projectTextField;
    public javax.swing.JComboBox sourceRootsComboBox;
    // End of variables declaration//GEN-END:variables
}

