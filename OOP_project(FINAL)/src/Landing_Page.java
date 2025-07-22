import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.*;

public class Landing_Page extends javax.swing.JFrame {
   
    ArrayList<Student> student = new ArrayList<>();
    private String LRN;
    
    public Landing_Page(ArrayList<Student> student) {
        this.LRN = LRN;
        this.student = student;
        initComponents();
        
        student.clear();
        
        // Load data from JHSstudents.txt
        try (BufferedReader reader = new BufferedReader(new FileReader("JHSstudents.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(", ");
                String lrn = getField(fields, "LRN");
                String name = getField(fields, "Name");
                String birthdate = getField(fields, "Birthdate");
                int age = Integer.parseInt(getField(fields, "Age"));
                String placeOfBirth = getField(fields, "Place of Birth");
                String currentAddress = getField(fields, "Current Address");
                String permanentAddress = getField(fields, "Permanent Address");
                char sex = getField(fields, "Sex").charAt(0);
                String citizenship = getField(fields, "Citizenship");
                String religion = getField(fields, "Religion");
                double height = Double.parseDouble(getField(fields, "Height"));
                double weight = Double.parseDouble(getField(fields, "Weight"));
                String bloodType = getField(fields, "Blood Type");
                String contactNumber = getField(fields, "Contact Number");
                String email = getField(fields, "Email");
                String school1 = getField(fields, "School 1");
                String accomplishments1 = getField(fields, "Accomplishments 1");
                String dateOfAttendance1 = getField(fields, "Date of Attendance 1");
                String graduationDate1 = getField(fields, "Year Graduated 1");
                String school2 = getField(fields, "School 2");
                String accomplishments2 = getField(fields, "Accomplishments 2");
                String dateOfAttendance2 = getField(fields, "Date of Attendance 2");
                String graduationDate2 = getField(fields, "Year Graduated 2");
                int gradeLevel = Integer.parseInt(getField(fields, "Grade Level"));
                String specialization = getField(fields, "Specialization");

                JHS jhsStudent = new JHS(lrn, name, birthdate, age, placeOfBirth, currentAddress, permanentAddress,
                        sex, citizenship, religion, height, weight, bloodType, contactNumber, email, school1,
                        accomplishments1, dateOfAttendance1, graduationDate1, school2, accomplishments2,
                        dateOfAttendance2, graduationDate2, gradeLevel, specialization);
                student.add(jhsStudent);
            }
            System.out.println("JHS students loaded successfully!");
        } catch (IOException e) {
            System.out.println("Error loading JHS student data: " + e.getMessage());
        }

        // Load data from SHSstudents.txt
        try (BufferedReader reader = new BufferedReader(new FileReader("SHSstudents.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(", ");
                String lrn = getField(fields, "LRN");
                String name = getField(fields, "Name");
                String birthdate = getField(fields, "Birthdate");
                int age = Integer.parseInt(getField(fields, "Age"));
                String placeOfBirth = getField(fields, "Place of Birth");
                String currentAddress = getField(fields, "Current Address");
                String permanentAddress = getField(fields, "Permanent Address");
                char sex = getField(fields, "Sex").charAt(0);
                String citizenship = getField(fields, "Citizenship");
                String religion = getField(fields, "Religion");
                double height = Double.parseDouble(getField(fields, "Height"));
                double weight = Double.parseDouble(getField(fields, "Weight"));
                String bloodType = getField(fields, "Blood Type");
                String contactNumber = getField(fields, "Contact Number");
                String email = getField(fields, "Email");
                String school1 = getField(fields, "School 1");
                String accomplishments1 = getField(fields, "Accomplishments 1");
                String dateOfAttendance1 = getField(fields, "Date of Attendance 1");
                String graduationDate1 = getField(fields, "Year Graduated 1");
                String school2 = getField(fields, "School 2");
                String accomplishments2 = getField(fields, "Accomplishments 2");
                String dateOfAttendance2 = getField(fields, "Date of Attendance 2");
                String graduationDate2 = getField(fields, "Year Graduated 2");
                String school3 = getField(fields, "School 3");
                String accomplishments3 = getField(fields, "Accomplishments 3");
                String dateOfAttendance3 = getField(fields, "Date of Attendance 3");
                String graduationDate3 = getField(fields, "Year Graduated 3");
                int gradeLevel = Integer.parseInt(getField(fields, "Grade Level"));
                String strand = getField(fields, "Strand");

                SHS shsStudent = new SHS(lrn, name, birthdate, age, placeOfBirth, currentAddress, permanentAddress,
                        sex, citizenship, religion, height, weight, bloodType, contactNumber, email, school1,
                        accomplishments1, dateOfAttendance1, graduationDate1, school2, accomplishments2,
                        dateOfAttendance2, graduationDate2, school3, accomplishments3, dateOfAttendance3,
                        graduationDate3, gradeLevel, strand);
                student.add(shsStudent);
            }
            System.out.println("SHS students loaded successfully!");
        } catch (IOException e) {
            System.out.println("Error loading SHS student data: " + e.getMessage());
        }
    }

    // Helper method to get field value by key
    private String getField(String[] fields, String key) {
        for (String field : fields) {
            String[] keyValue = field.split(": ");
            if (keyValue[0].trim().equals(key)) {
                return keyValue.length > 1 ? keyValue[1].trim() : "";
            }
        }
        return "";
    } 
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textFieldLRN = new javax.swing.JTextField();
        jButtonEnter = new javax.swing.JButton();
        Admin = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LnPulse-Logo2.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("REGISTER");

        jLabel2.setText("Enter your Learner's Reference Number (LRN)");

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

        Admin.setText("Admin");
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Admin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textFieldLRN)
                        .addComponent(jButtonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Admin)
                .addGap(52, 52, 52)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldLRN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEnter)
                .addContainerGap(136, Short.MAX_VALUE))
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
            LRN = lrnInput;

            // Check if the LRN already exists in the list
            boolean exists = false;
            for (Student s : student) {
                if (s.LRN.equals(LRN)) {
                    exists = true;
                    break;
                }
            }   

            if (exists) {
                // Prompt if the LRN exists
                JOptionPane.showMessageDialog(null, "You are already registered");
            } else {
                // Open the registration frame
                Register_Page registerFrame = new Register_Page(LRN, student);
                registerFrame.setVisible(true);
                setVisible(false); // Close the current frame if needed
            }
        }
    }//GEN-LAST:event_jButtonEnterActionPerformed

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        Admin_Verification av = new Admin_Verification(LRN, student);
        av.setVisible(true);
        this.dispose();
        /*Admin admin = new Admin(student);
        admin.setVisible(true);
        this.dispose();*/
    }//GEN-LAST:event_AdminActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ArrayList<Student> student = new ArrayList<>();
        java.awt.EventQueue.invokeLater(() -> new Landing_Page(student).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admin;
    private javax.swing.JButton jButtonEnter;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField textFieldLRN;
    // End of variables declaration//GEN-END:variables
}
