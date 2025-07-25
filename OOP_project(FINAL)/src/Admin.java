import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author APC
 */
public class Admin extends javax.swing.JFrame {

    private ArrayList<Student> student;
    
    public Admin(ArrayList<Student> student) {
        this.student = student;
        initComponents();
        
        addFocusListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SHStable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        JHStable = new javax.swing.JTable();
        BackButton1 = new javax.swing.JButton();
        jButtonLoad = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();
        LRNsearch = new javax.swing.JTextField();
        LRNsearchButton = new javax.swing.JButton();
        NAMEsearch = new javax.swing.JTextField();
        NAMEsearchButton = new javax.swing.JButton();
        RBEC = new javax.swing.JButton();
        SPA = new javax.swing.JButton();
        STE = new javax.swing.JButton();
        STEM = new javax.swing.JButton();
        ABM = new javax.swing.JButton();
        HUMSS = new javax.swing.JButton();
        GAS = new javax.swing.JButton();
        TVL = new javax.swing.JButton();
        CreateJHS = new javax.swing.JButton();
        CreateSHS = new javax.swing.JButton();

        BackButton.setText("BACK");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SHStable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "LRN", "Grade Level", "School Attended", "Strand"
            }
        ));
        jScrollPane1.setViewportView(SHStable);

        JHStable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "LRN", "Grade Level", "School Attended", "Specialization"
            }
        ));
        jScrollPane2.setViewportView(JHStable);

        BackButton1.setText("BACK");
        BackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton1ActionPerformed(evt);
            }
        });

        jButtonLoad.setText("Load All Students");
        jButtonLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadActionPerformed(evt);
            }
        });

        jLabel1.setText("JUNIOR HIGH");

        jLabel2.setText("SENIOR HIGH");

        jButtonUpdate.setText("View and Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        LRNsearch.setText("Search LRN");
        LRNsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LRNsearchActionPerformed(evt);
            }
        });

        LRNsearchButton.setText("Search");
        LRNsearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LRNsearchButtonActionPerformed(evt);
            }
        });

        NAMEsearch.setText("Search Name");
        NAMEsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEsearchActionPerformed(evt);
            }
        });

        NAMEsearchButton.setText("Search");
        NAMEsearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAMEsearchButtonActionPerformed(evt);
            }
        });

        RBEC.setText("RBEC");
        RBEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBECActionPerformed(evt);
            }
        });

        SPA.setText("SPA");
        SPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPAActionPerformed(evt);
            }
        });

        STE.setText("STE");
        STE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STEActionPerformed(evt);
            }
        });

        STEM.setText("STEM");
        STEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STEMActionPerformed(evt);
            }
        });

        ABM.setText("ABM");
        ABM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABMActionPerformed(evt);
            }
        });

        HUMSS.setText("HUMSS");
        HUMSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HUMSSActionPerformed(evt);
            }
        });

        GAS.setText("GAS");
        GAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GASActionPerformed(evt);
            }
        });

        TVL.setText("TVL");
        TVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TVLActionPerformed(evt);
            }
        });

        CreateJHS.setText("Create Student");
        CreateJHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateJHSActionPerformed(evt);
            }
        });

        CreateSHS.setText("Create Student");
        CreateSHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateSHSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(STEM, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ABM, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HUMSS, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(GAS, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TVL, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CreateSHS))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BackButton1)
                                .addGap(45, 45, 45)
                                .addComponent(jButtonLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jButtonUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(22, 22, 22)
                                .addComponent(RBEC, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SPA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(STE)
                                .addGap(206, 206, 206)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LRNsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LRNsearchButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NAMEsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(NAMEsearchButton))
                            .addComponent(CreateJHS, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane1))
                .addGap(45, 45, 45))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonLoad, jButtonUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BackButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LRNsearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LRNsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NAMEsearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NAMEsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(RBEC)
                    .addComponent(SPA)
                    .addComponent(STE)
                    .addComponent(CreateJHS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(STEM)
                    .addComponent(ABM)
                    .addComponent(HUMSS)
                    .addComponent(GAS)
                    .addComponent(TVL)
                    .addComponent(CreateSHS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonLoad, jButtonUpdate});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {LRNsearchButton, NAMEsearchButton});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void addFocusListeners() {
        LRNsearch.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                LRNsearch.setText("");
                if (!"".equals(LRNsearch.getText())) {
                    LRNsearch.setText("");
                }
            }
        });
        NAMEsearch.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                NAMEsearch.setText("");
                if (!"".equals(NAMEsearch.getText())) {
                    NAMEsearch.setText(""); 
                }
            }
        });
    }
    
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        Landing_Page land = new Landing_Page(student);
        land.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void BackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton1ActionPerformed
        Landing_Page land = new Landing_Page(student);
        land.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButton1ActionPerformed

    private void jButtonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadActionPerformed
        // JHS table
        DefaultTableModel jhsModel = (DefaultTableModel) JHStable.getModel();
        jhsModel.setRowCount(0);
        Set<String> addedJHS = new HashSet<>();

        for (Student stud : student) {
            if (stud instanceof JHS) {
                JHS jhsStudent = (JHS) stud;
                

                if (addedJHS.contains(jhsStudent.LRN)) {
                    continue; // Skip if already added
                }

                addedJHS.add(jhsStudent.LRN);

                Object[] row = {
                    jhsStudent.name,          // Name
                    jhsStudent.LRN,           // LRN
                    jhsStudent.gradeLevel,    // Grade Level
                    jhsStudent.school2,       // School 2
                    jhsStudent.spec // Specialization
                };

                jhsModel.addRow(row);
            }
            
        }
        
        // SHS table
        DefaultTableModel shsModel = (DefaultTableModel) SHStable.getModel();
        shsModel.setRowCount(0);
        Set<String> addedSHS = new HashSet<>();

        for (Student stud : student) {
            if (stud instanceof SHS) {
                SHS shsStudent = (SHS) stud;

                if (addedJHS.contains(shsStudent.LRN)) {
                    continue; // Skip if already added
                }

                addedJHS.add(shsStudent.LRN);

                Object[] row = {
                    shsStudent.name,          // Name
                    shsStudent.LRN,           // LRN
                    shsStudent.gradeLevel,    // Grade Level
                    shsStudent.school3,       // School 3
                    shsStudent.strand         // Srand
                };

                shsModel.addRow(row);
            }
        }
    }//GEN-LAST:event_jButtonLoadActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // JHS table model
        DefaultTableModel jhsModel = (DefaultTableModel) JHStable.getModel();
        // SHS table model
        DefaultTableModel shsModel = (DefaultTableModel) SHStable.getModel();

        // Get selected rows from both tables
        int jhsSelectedRow = JHStable.getSelectedRow();
        int shsSelectedRow = SHStable.getSelectedRow();

        // Check for selection validity
        if (jhsSelectedRow != -1 && shsSelectedRow != -1) {
            JOptionPane.showMessageDialog(this, "Please select a single row from one table only.");
            return;
        }

        if (jhsSelectedRow == -1 && shsSelectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");
            return;
        }

        // Determine the selected table and pass the corresponding object
        if (jhsSelectedRow != -1) {
            // Retrieve the selected JHS student object
            String lrn = (String) jhsModel.getValueAt(jhsSelectedRow, 1); // Assuming column 1 is LRN
            for (Student stud : student) {
                if (stud instanceof JHS && ((JHS) stud).LRN.equals(lrn)) {
                    JHS jhsStudent = (JHS) stud;

                    // Open the EditStudentFrame with the selected JHS student
                    JHS_Edit editFrame = new JHS_Edit(student, jhsStudent);
                    editFrame.setVisible(true);
                    this.dispose();
                    break;
                }
            }
        } else if (shsSelectedRow != -1) {  
            // Retrieve the selected SHS student object
            String lrn = (String) shsModel.getValueAt(shsSelectedRow, 1); // Assuming column 1 is LRN
            for (Student stud : student) {
                if (stud instanceof SHS && ((SHS) stud).LRN.equals(lrn)) {
                    SHS shsStudent = (SHS) stud;

                    // Open the EditStudentFrame with the selected SHS student
                    SHS_Edit editFrame = new SHS_Edit(student, shsStudent);
                    editFrame.setVisible(true);
                    this.dispose();
                    break;
                }
            }
    }

        
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void LRNsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LRNsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LRNsearchActionPerformed

    private void LRNsearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LRNsearchButtonActionPerformed
        // Get the LRN search input
        String searchLRN = LRNsearch.getText().trim();

        // JHS table
        DefaultTableModel jhsModel = (DefaultTableModel) JHStable.getModel();
        jhsModel.setRowCount(0);
        Set<String> addedJHS = new HashSet<>();

        for (Student stud : student) {
            if (stud instanceof JHS) {
                    JHS jhsStudent = (JHS) stud;

                    // Check if student matches the LRN search criteria
                    if (!searchLRN.isEmpty() && !jhsStudent.LRN.equalsIgnoreCase(searchLRN)) {
                        continue;
                    }

                    if (addedJHS.contains(jhsStudent.LRN)) {
                        continue; // Skip if already added
                    }

                    addedJHS.add(jhsStudent.LRN);

                    Object[] row = {
                        jhsStudent.name,          // Name
                        jhsStudent.LRN,           // LRN
                        jhsStudent.gradeLevel,    // Grade Level
                        jhsStudent.school2,       // School 2
                        jhsStudent.spec           // Specialization
                    };

                    jhsModel.addRow(row);
                }
            }

        // SHS table
        DefaultTableModel shsModel = (DefaultTableModel) SHStable.getModel();
        shsModel.setRowCount(0);
        Set<String> addedSHS = new HashSet<>();

        for (Student stud : student) {
            if (stud instanceof SHS) {
                SHS shsStudent = (SHS) stud;

                // Check if student matches the LRN search criteria
                if (!searchLRN.isEmpty() && !shsStudent.LRN.equalsIgnoreCase(searchLRN)) {
                    continue;
                }

                if (addedSHS.contains(shsStudent.LRN)) {
                    continue; // Skip if already added
                }

                addedSHS.add(shsStudent.LRN);

                Object[] row = {
                    shsStudent.name,          // Name
                    shsStudent.LRN,           // LRN
                    shsStudent.gradeLevel,    // Grade Level
                    shsStudent.school3,       // School 3
                    shsStudent.strand         // Strand
                };

                shsModel.addRow(row);
            }
        }
    }//GEN-LAST:event_LRNsearchButtonActionPerformed

    private void NAMEsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMEsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NAMEsearchActionPerformed

    private void NAMEsearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NAMEsearchButtonActionPerformed
        // Retrieve the name entered in the NAME search text field
        String searchName = NAMEsearch.getText().trim().toLowerCase();

        // JHS table
        DefaultTableModel jhsModel = (DefaultTableModel) JHStable.getModel();
        jhsModel.setRowCount(0);
        Set<String> addedJHS = new HashSet<>();

        for (Student stud : student) {
            if (stud instanceof JHS) {
                JHS jhsStudent = (JHS) stud;

                // Check if the name contains the search keyword (case-insensitive)
                if (!jhsStudent.name.toLowerCase().contains(searchName)) {
                    continue; // Skip if name doesn't match
                }

                if (addedJHS.contains(jhsStudent.LRN)) {
                    continue; // Skip if already added
                }

                addedJHS.add(jhsStudent.LRN);

                Object[] row = {
                    jhsStudent.name,          // Name
                    jhsStudent.LRN,           // LRN
                    jhsStudent.gradeLevel,    // Grade Level
                    jhsStudent.school2,       // School 2
                    jhsStudent.spec           // Specialization
                };

                jhsModel.addRow(row);
            }
        }

        // SHS table
        DefaultTableModel shsModel = (DefaultTableModel) SHStable.getModel();
        shsModel.setRowCount(0);
        Set<String> addedSHS = new HashSet<>();

        for (Student stud : student) {
            if (stud instanceof SHS) {
                SHS shsStudent = (SHS) stud;

                // Check if the name contains the search keyword (case-insensitive)
                if (!shsStudent.name.toLowerCase().contains(searchName)) {
                    continue; // Skip if name doesn't match
                }

                if (addedSHS.contains(shsStudent.LRN)) {
                    continue; // Skip if already added
                }

                addedSHS.add(shsStudent.LRN);

                Object[] row = {
                    shsStudent.name,          // Name
                    shsStudent.LRN,           // LRN
                    shsStudent.gradeLevel,    // Grade Level
                    shsStudent.school3,       // School 3
                    shsStudent.strand         // Strand
                };

                shsModel.addRow(row);
            }
        }
    }//GEN-LAST:event_NAMEsearchButtonActionPerformed

    private void RBECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBECActionPerformed
       // JHS table
        DefaultTableModel jhsModel = (DefaultTableModel) JHStable.getModel();
        jhsModel.setRowCount(0);
        Set<String> addedJHS = new HashSet<>();

        for (Student stud : student) {
            if (stud instanceof JHS) {
                JHS jhsStudent = (JHS) stud;

                // Check if the specialization (spec) is "RBEC"
                if (!"RBEC".equalsIgnoreCase(jhsStudent.spec)) {
                    continue; // Skip if not RBEC
                }

                if (addedJHS.contains(jhsStudent.LRN)) {
                    continue; // Skip if already added
                }

                addedJHS.add(jhsStudent.LRN);

                Object[] row = {
                    jhsStudent.name,          // Name
                    jhsStudent.LRN,           // LRN
                    jhsStudent.gradeLevel,    // Grade Level
                    jhsStudent.school2,       // School 2
                    jhsStudent.spec           // Specialization
                };

                jhsModel.addRow(row);
            }
        }
    }//GEN-LAST:event_RBECActionPerformed

    private void SPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPAActionPerformed
        // JHS table
        DefaultTableModel jhsModel = (DefaultTableModel) JHStable.getModel();
        jhsModel.setRowCount(0);
        Set<String> addedJHS = new HashSet<>();

        for (Student stud : student) {
            if (stud instanceof JHS) {
                JHS jhsStudent = (JHS) stud;

                // Check if the specialization (spec) is "RBEC"
                if (!"SPA".equalsIgnoreCase(jhsStudent.spec)) {
                    continue; // Skip if not RBEC
                }

                if (addedJHS.contains(jhsStudent.LRN)) {
                    continue; // Skip if already added
                }

                addedJHS.add(jhsStudent.LRN);

                Object[] row = {
                    jhsStudent.name,          // Name
                    jhsStudent.LRN,           // LRN
                    jhsStudent.gradeLevel,    // Grade Level
                    jhsStudent.school2,       // School 2
                    jhsStudent.spec           // Specialization
                };

                jhsModel.addRow(row);
            }
        }
    }//GEN-LAST:event_SPAActionPerformed

    private void STEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STEActionPerformed
        // JHS table
        DefaultTableModel jhsModel = (DefaultTableModel) JHStable.getModel();
        jhsModel.setRowCount(0);
        Set<String> addedJHS = new HashSet<>();

        for (Student stud : student) {
            if (stud instanceof JHS) {
                JHS jhsStudent = (JHS) stud;

                // Check if the specialization (spec) is "RBEC"
                if (!"STE".equalsIgnoreCase(jhsStudent.spec)) {
                    continue; // Skip if not RBEC
                }

                if (addedJHS.contains(jhsStudent.LRN)) {
                    continue; // Skip if already added
                }

                addedJHS.add(jhsStudent.LRN);

                Object[] row = {
                    jhsStudent.name,          // Name
                    jhsStudent.LRN,           // LRN
                    jhsStudent.gradeLevel,    // Grade Level
                    jhsStudent.school2,       // School 2
                    jhsStudent.spec           // Specialization
                };

                jhsModel.addRow(row);
            }
        }
    }//GEN-LAST:event_STEActionPerformed

    private void STEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STEMActionPerformed
        // JHS table
        DefaultTableModel shsModel = (DefaultTableModel) SHStable.getModel();
        shsModel.setRowCount(0);
        Set<String> addedSHS = new HashSet<>();

        for (Student stud : student) {
            if (stud instanceof SHS) {
                SHS shsStudent = (SHS) stud;

                // Check if the specialization (spec) is "RBEC"
                if (!"STEM".equalsIgnoreCase(shsStudent.strand)) {
                    continue; // Skip if not RBEC
                }

                if (addedSHS.contains(shsStudent.LRN)) {
                    continue; // Skip if already added
                }

                addedSHS.add(shsStudent.LRN);

                Object[] row = {
                    shsStudent.name,          // Name
                    shsStudent.LRN,           // LRN
                    shsStudent.gradeLevel,    // Grade Level
                    shsStudent.school2,       // School 2
                    shsStudent.strand         // Specialization
                };

                shsModel.addRow(row);
            }
        }
    }//GEN-LAST:event_STEMActionPerformed

    private void ABMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABMActionPerformed
        // JHS table
        DefaultTableModel shsModel = (DefaultTableModel) SHStable.getModel();
        shsModel.setRowCount(0);
        Set<String> addedSHS = new HashSet<>();

        for (Student stud : student) {
            if (stud instanceof SHS) {
                SHS shsStudent = (SHS) stud;

                // Check if the specialization (spec) is "RBEC"
                if (!"ABM".equalsIgnoreCase(shsStudent.strand)) {
                    continue; // Skip if not RBEC
                }

                if (addedSHS.contains(shsStudent.LRN)) {
                    continue; // Skip if already added
                }

                addedSHS.add(shsStudent.LRN);

                Object[] row = {
                    shsStudent.name,          // Name
                    shsStudent.LRN,           // LRN
                    shsStudent.gradeLevel,    // Grade Level
                    shsStudent.school2,       // School 2
                    shsStudent.strand         // Specialization
                };

                shsModel.addRow(row);
            }
        }
    }//GEN-LAST:event_ABMActionPerformed

    private void HUMSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HUMSSActionPerformed
        // JHS table
        DefaultTableModel shsModel = (DefaultTableModel) SHStable.getModel();
        shsModel.setRowCount(0);
        Set<String> addedSHS = new HashSet<>();

        for (Student stud : student) {
            if (stud instanceof SHS) {
                SHS shsStudent = (SHS) stud;

                // Check if the specialization (spec) is "RBEC"
                if (!"HUMSS".equalsIgnoreCase(shsStudent.strand)) {
                    continue; // Skip if not RBEC
                }

                if (addedSHS.contains(shsStudent.LRN)) {
                    continue; // Skip if already added
                }

                addedSHS.add(shsStudent.LRN);

                Object[] row = {
                    shsStudent.name,          // Name
                    shsStudent.LRN,           // LRN
                    shsStudent.gradeLevel,    // Grade Level
                    shsStudent.school2,       // School 2
                    shsStudent.strand         // Specialization
                };

                shsModel.addRow(row);
            }
        }
    }//GEN-LAST:event_HUMSSActionPerformed

    private void GASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GASActionPerformed
        // JHS table
        DefaultTableModel shsModel = (DefaultTableModel) SHStable.getModel();
        shsModel.setRowCount(0);
        Set<String> addedSHS = new HashSet<>();

        for (Student stud : student) {
            if (stud instanceof SHS) {
                SHS shsStudent = (SHS) stud;

                // Check if the specialization (spec) is "RBEC"
                if (!"GAS".equalsIgnoreCase(shsStudent.strand)) {
                    continue; // Skip if not RBEC
                }

                if (addedSHS.contains(shsStudent.LRN)) {
                    continue; // Skip if already added
                }

                addedSHS.add(shsStudent.LRN);

                Object[] row = {
                    shsStudent.name,          // Name
                    shsStudent.LRN,           // LRN
                    shsStudent.gradeLevel,    // Grade Level
                    shsStudent.school2,       // School 2
                    shsStudent.strand         // Specialization
                };

                shsModel.addRow(row);
            }
        }
    }//GEN-LAST:event_GASActionPerformed

    private void TVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TVLActionPerformed
        // JHS table
        DefaultTableModel shsModel = (DefaultTableModel) SHStable.getModel();
        shsModel.setRowCount(0);
        Set<String> addedSHS = new HashSet<>();

        for (Student stud : student) {
            if (stud instanceof SHS) {
                SHS shsStudent = (SHS) stud;

                // Check if the specialization (spec) is "RBEC"
                if (!"TVL".equalsIgnoreCase(shsStudent.strand)) {
                    continue; // Skip if not RBEC
                }

                if (addedSHS.contains(shsStudent.LRN)) {
                    continue; // Skip if already added
                }

                addedSHS.add(shsStudent.LRN);

                Object[] row = {
                    shsStudent.name,          // Name
                    shsStudent.LRN,           // LRN
                    shsStudent.gradeLevel,    // Grade Level
                    shsStudent.school2,       // School 2
                    shsStudent.strand         // Specialization
                };

                shsModel.addRow(row);
            }
        }
    }//GEN-LAST:event_TVLActionPerformed

    private void CreateJHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateJHSActionPerformed
        String studentType = "JHS";
        studentCreation sc= new studentCreation(studentType, student);
        sc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CreateJHSActionPerformed

    private void CreateSHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateSHSActionPerformed
        String studentType = "SHS";
        studentCreation sc= new studentCreation(studentType, student);
        sc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CreateSHSActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ArrayList<Student> student = new ArrayList<>();
        java.awt.EventQueue.invokeLater(() -> new Admin(student).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ABM;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton BackButton1;
    private javax.swing.JButton CreateJHS;
    private javax.swing.JButton CreateSHS;
    private javax.swing.JButton GAS;
    private javax.swing.JButton HUMSS;
    private javax.swing.JTable JHStable;
    private javax.swing.JTextField LRNsearch;
    private javax.swing.JButton LRNsearchButton;
    private javax.swing.JTextField NAMEsearch;
    private javax.swing.JButton NAMEsearchButton;
    private javax.swing.JButton RBEC;
    private javax.swing.JTable SHStable;
    private javax.swing.JButton SPA;
    private javax.swing.JButton STE;
    private javax.swing.JButton STEM;
    private javax.swing.JButton TVL;
    private javax.swing.JButton jButtonLoad;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
