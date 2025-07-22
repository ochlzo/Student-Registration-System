
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class studentCreation extends javax.swing.JFrame {

    private ArrayList<Student> student;
    String studentType;
    
    public studentCreation(String studentType, ArrayList<Student> student) {
        this.student = student;
        this.studentType = studentType;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        textFieldLRN = new javax.swing.JTextField();
        jButtonEnter = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Enter LRN");

        textFieldLRN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldLRNActionPerformed(evt);
            }
        });

        jButtonEnter.setText("ENTER");
        jButtonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(175, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(173, 173, 173))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(78, 78, 78)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textFieldLRN)
                        .addComponent(jButtonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(79, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Back)
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addContainerGap(179, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addComponent(textFieldLRN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jButtonEnter)
                    .addContainerGap(108, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldLRNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldLRNActionPerformed

    }//GEN-LAST:event_textFieldLRNActionPerformed

    private void jButtonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterActionPerformed
        String lrnInput = textFieldLRN.getText().trim(); // Get and trim input

        // Check if the input is empty
        if (lrnInput.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your LRN");
        } else if (!lrnInput.matches("\\d{12}")) { // Validate if input is exactly 12 digits
            JOptionPane.showMessageDialog(null, "LRN must be a 12-digit number");
        } else {

            // Check if the LRN already exists in the list
            boolean exists = false;
            for (Student s : student) {
                if (s.LRN.equals(lrnInput)) {
                    exists = true;
                    break;
                }
            }

            if (exists) {
                // Prompt if the LRN exists
                JOptionPane.showMessageDialog(null, "You are already registered");
            } else {
                // Open the registration frame
                if (studentType == "JHS") {
                    JHS_Frame2 jf = new JHS_Frame2(lrnInput, student);
                    jf.setVisible(true);
                    this.dispose();
                }
                
                if (studentType == "SHS") {
                    SHS_Frame2 sf = new SHS_Frame2(lrnInput, student);
                    sf.setVisible(true);
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_jButtonEnterActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        Admin admin = new Admin(student);
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ArrayList<Student> student = new ArrayList<>();
        String studentType = null;
        java.awt.EventQueue.invokeLater(() -> new studentCreation(studentType, student).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton jButtonEnter;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField textFieldLRN;
    // End of variables declaration//GEN-END:variables
}
