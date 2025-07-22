import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class SHS_Frame2 extends javax.swing.JFrame {
    
    private String LRN;
    private ArrayList<Student> student;
    int age;
    String mi = "A.";
    String fullName;
    String fullAddress1;
    String fullAddress2;
    char sex;
    String city1;
    String province1;
    String city2;
    String province2;
    String bloodtype;
    String strand;
    String dateOfAttendance1;
    String dateOfAttendance2;
    String dateOfAttendance3;
    int gradeLevel;
    
    public SHS_Frame2(String LRN, ArrayList<Student> student) {
        this.student = student;
        this.LRN = LRN;
        initComponents();
        
        jLabelLRN.setText(LRN);
        inputSuffix.setText("");
        LastNameErrorMessage.setVisible(false);
        FirstNameErrorMessage.setVisible(false);
        BirthDateErrorMessage.setVisible(false);
        BirthPlaceErrorMessage.setVisible(false);
        CurrentAddressErrorMessage.setVisible(false);
        PermanentAddressErrorMessage.setVisible(false);
        CitizanshipErrorMessage.setVisible(false);
        ReligionErrorMessage.setVisible(false);
        HeightErrorMessage.setVisible(false);
        WeightErrorMessage.setVisible(false);
        CPnumErrorMessage.setVisible(false);
        SexErrorMessage.setVisible(false);
        ErrorMessage1.setVisible(false);
        ErrorMessage2.setVisible(false);
        ErrorMessage3.setVisible(false);
        ErrorMessage4.setVisible(false);
        ErrorMessage5.setVisible(false);
        ErrorMessage6.setVisible(false);
        ErrorMessage6.setVisible(false);
        ErrorMessage7.setVisible(false);
        ErrorMessage8.setVisible(false);
        ErrorMessage9.setVisible(false);
        addFocusListeners();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        inputBirthPlace = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        comboBoxStrand = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel39 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        inputSchool2 = new javax.swing.JTextField();
        inputStreetandBarangay2 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        inputAccomplish2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        inputAttendanceDateFrom2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        inputStreetandBarangay = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        inputCitizenship = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inputReligion = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputHeight = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        inputWeight = new javax.swing.JTextField();
        BackButton = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxBloodType = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabelLRN = new javax.swing.JLabel();
        inputLastName = new javax.swing.JTextField();
        inputCPnum = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        inputFirstName = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Confirm = new javax.swing.JButton();
        inputSchool = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        inputSuffix = new javax.swing.JTextField();
        inputAccomplish = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        inputBirthDate = new javax.swing.JTextField();
        inputAttendanceDateFrom = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        inputSchool3 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        inputAccomplish3 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        comboBoxGradeLevel = new javax.swing.JComboBox<>();
        inputProvince = new javax.swing.JComboBox<>();
        inputMunicipalCity = new javax.swing.JComboBox<>();
        inputProvince2 = new javax.swing.JComboBox<>();
        inputMunicipalCity2 = new javax.swing.JComboBox<>();
        jLabel57 = new javax.swing.JLabel();
        LastNameErrorMessage = new javax.swing.JLabel();
        FirstNameErrorMessage = new javax.swing.JLabel();
        BirthDateErrorMessage = new javax.swing.JLabel();
        inputMI = new javax.swing.JComboBox<>();
        CurrentAddressErrorMessage = new javax.swing.JLabel();
        PermanentAddressErrorMessage = new javax.swing.JLabel();
        SexErrorMessage = new javax.swing.JLabel();
        CitizanshipErrorMessage = new javax.swing.JLabel();
        HeightErrorMessage = new javax.swing.JLabel();
        WeightErrorMessage = new javax.swing.JLabel();
        CPnumErrorMessage = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        ErrorMessage1 = new javax.swing.JLabel();
        ErrorMessage2 = new javax.swing.JLabel();
        ErrorMessage4 = new javax.swing.JLabel();
        ErrorMessage5 = new javax.swing.JLabel();
        ErrorMessage3 = new javax.swing.JLabel();
        ErrorMessage6 = new javax.swing.JLabel();
        BirthPlaceErrorMessage = new javax.swing.JLabel();
        ReligionErrorMessage = new javax.swing.JLabel();
        inputAttendanceDateTo = new javax.swing.JTextField();
        inputGraduate = new javax.swing.JTextField();
        inputGraduate2 = new javax.swing.JTextField();
        inputAttendanceDateTo2 = new javax.swing.JTextField();
        inputAttendanceDateFrom3 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        ErrorMessage7 = new javax.swing.JLabel();
        inputAttendanceDateTo3 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        ErrorMessage8 = new javax.swing.JLabel();
        inputGraduate3 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        ErrorMessage9 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputBirthPlace.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel14.setText("Place of Birth");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel15.setText("Sex");

        jLabel28.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel28.setText("Grade Level");

        jLabel48.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel48.setText("Strand");

        comboBoxStrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STEM", "ABM", "HUMSS", "GAS", "TVL" }));

        jLabel37.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel37.setText("YYYY");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setText("Kindergarten");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");

        inputSchool2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inputStreetandBarangay2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inputStreetandBarangay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputStreetandBarangay2ActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel40.setText("Name of School");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel16.setText("Permanent Address");

        inputAccomplish2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel17.setText("Street and Barangay");

        jLabel41.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel41.setText("Accomplishments / Awards / Honors Received");

        inputAttendanceDateFrom2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel18.setText("Municipality / City");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel19.setText("Province");

        jLabel20.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel20.setText("Municipality / City");

        jLabel21.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel21.setText("Province");

        inputStreetandBarangay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel22.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel22.setText("Current Address");

        jLabel23.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel23.setText("Street and Barangay");

        inputCitizenship.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel6.setText("Citizenship");

        inputReligion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel24.setText("Religion");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LnPulse-Logo2.png"))); // NOI18N

        inputHeight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel25.setText("Height (cm)");

        jLabel26.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel26.setText("Weight (kg)");

        inputWeight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BackButton.setText("BACK");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel27.setText("Blood Type");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel2.setText("Learner's Reference Number");

        comboBoxBloodType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "B+", "B", "O+", "O", "AB+", "AB" }));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("NAME AND DETAILS");

        jLabelLRN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inputLastName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inputCPnum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel5.setText("Name");

        jLabel29.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel29.setText("Cellphone Number");

        inputFirstName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inputEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel7.setText("Last Name");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel8.setText("First Name");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel9.setText("M.I.");

        jLabel42.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel42.setText("Date of Attendance YYYY");

        jLabel44.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel44.setText("YYYY");

        jLabel46.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel46.setText("Year Graduated YYYY");

        jLabel30.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel30.setText("E-mail Address");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel47.setText("Elementary");

        jLabel31.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel31.setText("ACADEMICS");

        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        inputSchool.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inputSchool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSchoolActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel32.setText("Name of School");

        inputSuffix.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inputAccomplish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel10.setText("Suffix (Optional)");

        jLabel33.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel33.setText("Accomplishments / Awards / Honors Received");

        inputBirthDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inputBirthDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBirthDateActionPerformed(evt);
            }
        });

        inputAttendanceDateFrom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inputAttendanceDateFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAttendanceDateFromActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel11.setText("Date of Birth MM/DD/YYYY");

        jLabel34.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel34.setText("Date of Attendance YYYY");

        inputSchool3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel49.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel49.setText("Name of School");

        inputAccomplish3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel50.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel50.setText("Accomplishments / Awards / Honors Received");

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel56.setText("Junior High School");

        comboBoxGradeLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11", "12" }));

        inputProvince.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Albay", "Camarines Norte", "Camarines Sur", "Catanduanes", "Masbate", "Sorgoson" }));
        inputProvince.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputProvinceActionPerformed(evt);
            }
        });

        inputMunicipalCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ligao", "Bacacay", "Camalig", "Daraga", "Guinobatan", "Jovellar", "Legazpi", "Libon", "Malilipot", "Malinao", "Manito", "Oas", "Pio Duran", "Polangui", "Rapu-Rapu", "Santo Domingo", "Tabaco", "Tiwi" }));
        inputMunicipalCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMunicipalCityActionPerformed(evt);
            }
        });

        inputProvince2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Albay", "Camarines Norte", "Camarines Sur", "Catanduanes", "Masbate", "Sorgoson" }));
        inputProvince2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputProvince2ActionPerformed(evt);
            }
        });

        inputMunicipalCity2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ligao", "Bacacay", "Camalig", "Daraga", "Guinobatan", "Jovellar", "Legazpi", "Libon", "Malilipot", "Malinao", "Manito", "Oas", "Pio Duran", "Polangui", "Rapu-Rapu", "Santo Domingo", "Tabaco", "Tiwi" }));
        inputMunicipalCity2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMunicipalCity2ActionPerformed(evt);
            }
        });

        jLabel57.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel57.setText("Year Graduated YYYY");

        LastNameErrorMessage.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        LastNameErrorMessage.setForeground(new java.awt.Color(255, 0, 51));
        LastNameErrorMessage.setText("Must only contain alphabet characters");

        FirstNameErrorMessage.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        FirstNameErrorMessage.setForeground(new java.awt.Color(255, 0, 51));
        FirstNameErrorMessage.setText("Must only contain alphabet characters");

        BirthDateErrorMessage.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BirthDateErrorMessage.setForeground(new java.awt.Color(255, 0, 51));
        BirthDateErrorMessage.setText("Must be in the format MM/DD/YYYY");

        inputMI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A.", "B.", "C.", "D.", "E.", "F.", "G.", "H.", "I.", "J.", "K.", "L.", "M.", "N.", "O.", "P.", "Q.", "R.", "S.", "T.", "U.", "V.", "W.", "X.", "Y.", "Z." }));
        inputMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMIActionPerformed(evt);
            }
        });

        CurrentAddressErrorMessage.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        CurrentAddressErrorMessage.setForeground(new java.awt.Color(255, 0, 51));
        CurrentAddressErrorMessage.setText("Should not contain special characters");

        PermanentAddressErrorMessage.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        PermanentAddressErrorMessage.setForeground(new java.awt.Color(255, 0, 51));
        PermanentAddressErrorMessage.setText("Should not contain special characters");

        SexErrorMessage.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        SexErrorMessage.setForeground(new java.awt.Color(255, 0, 51));
        SexErrorMessage.setText("Select one option");

        CitizanshipErrorMessage.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        CitizanshipErrorMessage.setForeground(new java.awt.Color(255, 0, 51));
        CitizanshipErrorMessage.setText("Should not contain special characters");

        HeightErrorMessage.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        HeightErrorMessage.setForeground(new java.awt.Color(255, 0, 51));
        HeightErrorMessage.setText("Invalid Input");

        WeightErrorMessage.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        WeightErrorMessage.setForeground(new java.awt.Color(255, 0, 51));
        WeightErrorMessage.setText("Invalid Input");

        CPnumErrorMessage.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        CPnumErrorMessage.setForeground(new java.awt.Color(255, 0, 51));
        CPnumErrorMessage.setText("Must be exactly 11 digits");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setText(" -");

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel38.setText(" -");

        ErrorMessage1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ErrorMessage1.setForeground(new java.awt.Color(255, 0, 51));
        ErrorMessage1.setText("Must be in the format YYYY");

        ErrorMessage2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ErrorMessage2.setForeground(new java.awt.Color(255, 0, 51));
        ErrorMessage2.setText("Must be in the format YYYY");

        ErrorMessage4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ErrorMessage4.setForeground(new java.awt.Color(255, 0, 51));
        ErrorMessage4.setText("Must be in the format YYYY");

        ErrorMessage5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ErrorMessage5.setForeground(new java.awt.Color(255, 0, 51));
        ErrorMessage5.setText("Must be in the format YYYY");

        ErrorMessage3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ErrorMessage3.setForeground(new java.awt.Color(255, 0, 51));
        ErrorMessage3.setText("Must be in the format YYYY");

        ErrorMessage6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ErrorMessage6.setForeground(new java.awt.Color(255, 0, 51));
        ErrorMessage6.setText("Must be in the format YYYY");

        BirthPlaceErrorMessage.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        BirthPlaceErrorMessage.setForeground(new java.awt.Color(255, 0, 51));
        BirthPlaceErrorMessage.setText("Should not contain special characters");

        ReligionErrorMessage.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ReligionErrorMessage.setForeground(new java.awt.Color(255, 0, 51));
        ReligionErrorMessage.setText("Should not contain special characters");

        inputAttendanceDateTo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inputGraduate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inputGraduate2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inputGraduate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputGraduate2ActionPerformed(evt);
            }
        });

        inputAttendanceDateTo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        inputAttendanceDateFrom3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel43.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel43.setText("Date of Attendance YYYY");

        ErrorMessage7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ErrorMessage7.setForeground(new java.awt.Color(255, 0, 51));
        ErrorMessage7.setText("Must be in the format YYYY");

        inputAttendanceDateTo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel45.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel45.setText(" YYYY");

        ErrorMessage8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ErrorMessage8.setForeground(new java.awt.Color(255, 0, 51));
        ErrorMessage8.setText("Must be in the format YYYY");

        inputGraduate3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        inputGraduate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputGraduate3ActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel51.setText("Year Graduated YYYY");

        ErrorMessage9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ErrorMessage9.setForeground(new java.awt.Color(255, 0, 51));
        ErrorMessage9.setText("Must be in the format YYYY");

        jLabel52.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel52.setText(" -");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(490, 490, 490)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboBoxGradeLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(inputCPnum, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(comboBoxBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(358, 358, 358))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboBoxStrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputStreetandBarangay2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(inputMunicipalCity2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(inputProvince2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel39)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputStreetandBarangay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(inputMunicipalCity, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(inputProvince, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BackButton)
                                    .addComponent(jLabel4))
                                .addGap(329, 329, 329)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CurrentAddressErrorMessage))
                            .addComponent(jLabel31)
                            .addComponent(CPnumErrorMessage)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel56)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel32)
                                                    .addComponent(inputSchool, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel33)
                                                    .addComponent(inputAccomplish, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel47))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ErrorMessage1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(inputAttendanceDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel40)
                                                    .addComponent(inputSchool2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel41)
                                                    .addComponent(inputAccomplish2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel49)
                                                    .addComponent(inputSchool3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel50)
                                                    .addComponent(inputAccomplish3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(inputAttendanceDateFrom2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ErrorMessage4)
                                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(inputAttendanceDateFrom3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(ErrorMessage7))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel44)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel37)
                                                    .addGap(102, 102, 102))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(inputAttendanceDateTo)
                                                    .addGap(8, 8, 8)))
                                            .addGap(4, 4, 4)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel57)
                                                .addComponent(inputGraduate)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(ErrorMessage5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(ErrorMessage2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addComponent(inputAttendanceDateTo2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(ErrorMessage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ErrorMessage6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel46)
                                                .addComponent(inputGraduate2))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inputAttendanceDateTo3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ErrorMessage8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ErrorMessage9)
                                                    .addComponent(inputGraduate3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(116, 116, 116)
                                                .addComponent(Confirm))
                                            .addComponent(jLabel51))))))
                        .addContainerGap(217, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(SexErrorMessage)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(inputCitizenship, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24)
                                            .addComponent(inputReligion, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CitizanshipErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ReligionErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25)
                                            .addComponent(inputHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(inputWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(HeightErrorMessage)
                                        .addGap(18, 18, 18)
                                        .addComponent(WeightErrorMessage))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PermanentAddressErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabelLRN, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LastNameErrorMessage))
                                    .addComponent(inputLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(inputFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(FirstNameErrorMessage)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(inputMI, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputSuffix, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BirthDateErrorMessage)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BirthPlaceErrorMessage)
                                    .addComponent(inputBirthPlace, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BackButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelLRN, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputMI, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(LastNameErrorMessage)
                            .addComponent(FirstNameErrorMessage)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BirthDateErrorMessage)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(inputSuffix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel10))
                        .addComponent(BirthPlaceErrorMessage)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputBirthPlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(CurrentAddressErrorMessage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputStreetandBarangay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputMunicipalCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(PermanentAddressErrorMessage))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel17))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputStreetandBarangay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputMunicipalCity2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(inputProvince2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputWeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputReligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inputCitizenship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(SexErrorMessage))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CitizanshipErrorMessage)
                    .addComponent(HeightErrorMessage)
                    .addComponent(WeightErrorMessage)
                    .addComponent(ReligionErrorMessage))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCPnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel48))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxGradeLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(comboBoxStrand, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CPnumErrorMessage)
                .addGap(11, 11, 11)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputSchool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jLabel37)
                            .addComponent(jLabel34)
                            .addComponent(jLabel57))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputAccomplish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputAttendanceDateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputAttendanceDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputGraduate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ErrorMessage1)
                            .addComponent(ErrorMessage2)
                            .addComponent(ErrorMessage3))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputGraduate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(ErrorMessage6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(39, 39, 39))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel40)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inputSchool2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel41)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(inputAccomplish2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputAttendanceDateFrom2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputAttendanceDateTo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel42)
                                .addComponent(jLabel44)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ErrorMessage4)
                            .addComponent(ErrorMessage5))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Confirm)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel56)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel49)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inputSchool3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel50)
                                        .addComponent(jLabel43))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(inputAccomplish3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputAttendanceDateFrom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel45)
                                    .addComponent(jLabel51))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputAttendanceDateTo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputGraduate3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ErrorMessage8)
                                    .addComponent(ErrorMessage7)
                                    .addComponent(ErrorMessage9))))
                        .addContainerGap(50, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputStreetandBarangay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputStreetandBarangay2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputStreetandBarangay2ActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        Admin admin = new Admin(student);
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void addFocusListeners() {
        // Save the default border for resetting later
        Border defaultBorder = BorderFactory.createLineBorder(Color.BLACK, 1);

        // Add focus listener to inputLastName
        //inputLastName.setBorder(defaultBorder);
        inputLastName.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputLastName.setBorder(defaultBorder);// Reset border when focused
                LastNameErrorMessage.setVisible(false);
            }
        });
        inputFirstName.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputFirstName.setBorder(defaultBorder);// Reset border when focused
                FirstNameErrorMessage.setVisible(false);
            }
        });
        inputBirthDate.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputBirthDate.setBorder(defaultBorder);// Reset border when focused
                BirthDateErrorMessage.setVisible(false);
            }
        });
        inputBirthPlace.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputBirthPlace.setBorder(defaultBorder);// Reset border when focused
                BirthPlaceErrorMessage.setVisible(false);
            }
        });
        inputStreetandBarangay.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputStreetandBarangay.setBorder(defaultBorder);// Reset border when focused
                CurrentAddressErrorMessage.setVisible(false);
            }
        });
        inputStreetandBarangay2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputStreetandBarangay2.setBorder(defaultBorder);// Reset border when focused
                PermanentAddressErrorMessage.setVisible(false);
            }
        });
        inputCitizenship.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputCitizenship.setBorder(defaultBorder);// Reset border when focused
                CitizanshipErrorMessage.setVisible(false);
            }
        });
        inputReligion.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputReligion.setBorder(defaultBorder);// Reset border when focused
                ReligionErrorMessage.setVisible(false);
            }
        });
        inputHeight.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputHeight.setBorder(defaultBorder);// Reset border when focused
                HeightErrorMessage.setVisible(false);
            }
        });
        inputWeight.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputWeight.setBorder(defaultBorder);// Reset border when focused
                WeightErrorMessage.setVisible(false);
            }
        });
        inputCPnum.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputCPnum.setBorder(defaultBorder);
                CPnumErrorMessage.setVisible(false);
            }
        });
        jRadioButton1.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                SexErrorMessage.setVisible(false);
            }
        });
        jRadioButton2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                SexErrorMessage.setVisible(false);
            }
        });
        inputEmail.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputEmail.setBorder(defaultBorder);
            }
        });
        inputSchool.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputSchool.setBorder(defaultBorder);
            }
        });
        inputSchool2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputSchool2.setBorder(defaultBorder);
            }
        });
        inputSchool3.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputSchool3.setBorder(defaultBorder);
            }
        });
        inputAccomplish.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputAccomplish.setBorder(defaultBorder);
            }
        });
        inputAccomplish2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputAccomplish2.setBorder(defaultBorder);
            }
        });
        inputAccomplish3.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputAccomplish3.setBorder(defaultBorder);
            }
        });
        inputAttendanceDateFrom.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputAttendanceDateFrom.setBorder(defaultBorder);
                ErrorMessage1.setVisible(false);
            }
        });
        inputAttendanceDateTo.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputAttendanceDateTo.setBorder(defaultBorder);
                ErrorMessage2.setVisible(false);
            }
        });
        inputGraduate.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputGraduate.setBorder(defaultBorder);
                ErrorMessage3.setVisible(false);
            }
        });
        inputAttendanceDateFrom2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputAttendanceDateFrom2.setBorder(defaultBorder);
                ErrorMessage4.setVisible(false);
            }
        });
        inputAttendanceDateTo2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputAttendanceDateTo2.setBorder(defaultBorder);
                ErrorMessage5.setVisible(false);
            }
        });
        inputGraduate2.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputGraduate2.setBorder(defaultBorder);
                ErrorMessage6.setVisible(false);
            }
        });
        inputAttendanceDateFrom3.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputAttendanceDateFrom3.setBorder(defaultBorder);
                ErrorMessage7.setVisible(false);
            }
        });
        inputAttendanceDateTo3.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputAttendanceDateTo3.setBorder(defaultBorder);
                ErrorMessage8.setVisible(false);
            }
        });
        inputGraduate3.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                inputGraduate3.setBorder(defaultBorder);
                ErrorMessage9.setVisible(false);
            }
        });
        
    }
    
    private String capitalizeWords(String input) {
        return Arrays.stream(input.split(" "))
                     .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                     .collect(Collectors.joining(" "));
    }
    
    public boolean isValidDouble(String input) {
        try {
            Double.parseDouble(input); // Use Double.parseDouble(input) for floating-point numbers
            return true; // If parsing succeeds, the input is a valid number
        } catch (NumberFormatException e) {
            return false; // If parsing fails, the input is not a number
        }
    }
    
    public boolean isValidInt(String input) {
        try {
            Integer.parseInt(input); // Use Double.parseDouble(input) for floating-point numbers
            return true; // If parsing succeeds, the input is a valid number
        } catch (NumberFormatException e) {
            return false; // If parsing fails, the input is not a number
        }
    }
    
    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        boolean isValid = true; // Tracks the overall validity of all inputs
        // Validate last name
        String lastName = inputLastName.getText().trim();
        if (inputLastName.getText().isEmpty()) {
            inputLastName.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        } else if (!lastName.matches("[A-Za-z]+")) {
            inputLastName.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            LastNameErrorMessage.setVisible(true);
            isValid = false;
        } else {
            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        }
          
        // Validate first name
        String firstName = inputFirstName.getText().trim();
        if (inputFirstName.getText().isEmpty()) {
            inputFirstName.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        } else if (!firstName.matches("[A-Za-z ]+")) {
            inputFirstName.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            FirstNameErrorMessage.setVisible(true);
            isValid = false;
        } else {
            firstName = Arrays.stream(firstName.split(" "))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
        }
            
        // Validate birthdate
        String birthDate = inputBirthDate.getText().trim();
        if (inputBirthDate.getText().isEmpty()) {
            inputBirthDate.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        } else if (!birthDate.matches("\\d{2}/\\d{2}/\\d{4}")){
            inputBirthDate.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            BirthDateErrorMessage.setVisible(true);
            isValid = false;
        } else {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            LocalDate BirthDate = LocalDate.parse(inputBirthDate.getText(), formatter);
            LocalDate currentDate = LocalDate.now();
            Period Age = Period.between(BirthDate, currentDate);
            age = Age.getYears();
        }
            
        // Validate birth place
        String birthPlace = inputBirthPlace.getText().trim();
        if (inputBirthPlace.getText().isEmpty()) {
            inputBirthPlace.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        } else if (!birthPlace.matches("[A-Za-z0-9, .-]+")) {
            inputBirthPlace.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            BirthPlaceErrorMessage.setVisible(true);
            isValid = false;
        } else {
            birthPlace = Arrays.stream(birthPlace.split(" "))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
        }
        
        // Validate current address
        String streetAndBarangay1 = inputStreetandBarangay.getText().trim();
        if (inputStreetandBarangay.getText().isEmpty()) {
            inputStreetandBarangay.setBorder(BorderFactory.createLineBorder(Color.RED, 2));// Reset border when focused
            isValid = false;
        } else if (!streetAndBarangay1.matches("[A-Za-z0-9, .-]+")) {
            inputStreetandBarangay.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            CurrentAddressErrorMessage.setVisible(true);
            isValid = false;
        } else {
            streetAndBarangay1 = capitalizeWords(streetAndBarangay1);
        }
            
        //Validate permanent address
        String streetAndBarangay2 = inputStreetandBarangay2.getText().trim();
        if (inputStreetandBarangay2.getText().isEmpty()) {
            inputStreetandBarangay2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));// Reset border when focused
            isValid = false;
        } else if (!streetAndBarangay2.matches("[A-Za-z0-9, .-]+")) { 
            inputStreetandBarangay2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            PermanentAddressErrorMessage.setVisible(true);
            isValid = false;
        } else {
            streetAndBarangay2 = capitalizeWords(streetAndBarangay2);
        }
            
        // Validate citizenship
        String citizenship = inputCitizenship.getText().trim();
        if (inputCitizenship.getText().isEmpty()) {
            inputCitizenship.setBorder(BorderFactory.createLineBorder(Color.RED, 2));// Reset border when focused
            isValid = false;
        } else if (!citizenship.matches("[A-Za-z]+")) {
            inputCitizenship.setBorder(BorderFactory.createLineBorder(Color.RED, 2));// Reset border when focused
            CitizanshipErrorMessage.setVisible(true);
            isValid = false;
        } else {
            citizenship = capitalizeWords(citizenship);
        }
               
        // Validate religion
        String religion = inputReligion.getText().trim();
        if (inputReligion.getText().isEmpty()) {
            inputReligion.setBorder(BorderFactory.createLineBorder(Color.RED, 2));// Reset border when focused
            isValid = false;
        } else if (!religion.matches("[A-Za-z ]+")) {
            inputReligion.setBorder(BorderFactory.createLineBorder(Color.RED, 2));// Reset border when focused
            ReligionErrorMessage.setVisible(true);
            isValid = false;
        } else {
            religion = capitalizeWords(religion);
        }
            
        // Validate Height
        if (inputHeight.getText().trim().isEmpty()) {
            inputHeight.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        } else if (!isValidDouble((inputHeight.getText()))) {
            inputHeight.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            HeightErrorMessage.setVisible(true);
            isValid = false;
        }
            
        // Validate Weight
        if (inputWeight.getText().trim().isEmpty()) {
            inputWeight.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        } else if (!isValidDouble((inputWeight.getText()))) {
            inputWeight.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            WeightErrorMessage.setVisible(true);
            isValid = false;
        }
            
        if (inputCPnum.getText().isEmpty()) {
            inputCPnum.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        }
        else if (!inputCPnum.getText().matches("\\d{11}")) {
            inputCPnum.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            CPnumErrorMessage.setVisible(true);
            isValid = false;
        } 
            
        if (!jRadioButton1.isSelected() && !jRadioButton2.isSelected()) {
            SexErrorMessage.setVisible(true);
            isValid = false;
        }
           
        if (inputEmail.getText().isEmpty()) {
            inputEmail.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        }
            
        if (inputSchool.getText().isEmpty()) {
            inputSchool.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        } 
            
        if (inputSchool2.getText().isEmpty()) {
            inputSchool2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        } 
        
        if (inputSchool3.getText().isEmpty()) {
            inputSchool3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        }
           
        if (inputAccomplish.getText().isEmpty()) {
            inputAccomplish.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        } 
            
        if (inputAccomplish2.getText().isEmpty()) {
            inputAccomplish2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        }
        
        if (inputAccomplish3.getText().isEmpty()) {
            inputAccomplish3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        }
            
        // Validate attendance dates and graduate years
        String attendanceDateFrom = inputAttendanceDateFrom.getText().trim();
        String attendanceDateTo = inputAttendanceDateTo.getText().trim();
        String graduate = inputGraduate.getText().trim();
        String attendanceDateFrom2 = inputAttendanceDateFrom2.getText().trim();
        String attendanceDateTo2 = inputAttendanceDateTo2.getText().trim();
        String graduate2 = inputGraduate2.getText().trim();
        String attendanceDateFrom3 = inputAttendanceDateFrom3.getText().trim();
        String attendanceDateTo3 = inputAttendanceDateTo3.getText().trim();
        String graduate3 = inputGraduate3.getText().trim();
        
        //School1
        if (attendanceDateFrom.isEmpty()) {
            inputAttendanceDateFrom.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        } else if (!attendanceDateFrom.matches("\\d{4}")) {
            inputAttendanceDateFrom.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            ErrorMessage1.setVisible(true);
            isValid = false;
        }
        
        if (attendanceDateTo.isEmpty()) {
            inputAttendanceDateTo.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        } else if (!attendanceDateTo.matches("\\d{4}")) {
            inputAttendanceDateTo.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            ErrorMessage2.setVisible(true);
            isValid = false;
        } else if (isValidInt(attendanceDateFrom)) {
            if (Integer.parseInt(attendanceDateTo) < Integer.parseInt(attendanceDateFrom)){
                inputAttendanceDateTo.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                isValid = false;
            }
       } 
        
        if (graduate.isEmpty()) {
            inputGraduate.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        } else if (!graduate.matches("\\d{4}")) {
            inputGraduate.setBorder(BorderFactory.createLineBorder(Color.RED, 2));  
            ErrorMessage3.setVisible(true);
            isValid = false;
        } else if (isValidInt(attendanceDateTo)) {
            if (Integer.parseInt(graduate) < Integer.parseInt(attendanceDateTo)){
                inputGraduate.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                isValid = false;
            }
       }
        
        //School2
        if (attendanceDateFrom2.isEmpty()) {
            inputAttendanceDateFrom2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        } else if (!attendanceDateFrom2.matches("\\d{4}")) {
            inputAttendanceDateFrom2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            ErrorMessage4.setVisible(true);
            isValid = false;
        }
        
        if (attendanceDateTo2.isEmpty() ) {
            inputAttendanceDateTo2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        } else if (!attendanceDateTo2.matches("\\d{4}")) {
            inputAttendanceDateTo2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            ErrorMessage5.setVisible(true);
            isValid = false;
        } else if (isValidInt(attendanceDateFrom2)) {
            if (Integer.parseInt(attendanceDateTo2) < Integer.parseInt(attendanceDateFrom2)){
                inputAttendanceDateTo2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                isValid = false;
            }
       }
        
        if (graduate2.isEmpty()) {
            inputGraduate2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        } else if (!graduate2.matches("\\d{4}")) {
            inputGraduate2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            ErrorMessage6.setVisible(true);
            isValid = false;
        } else if (isValidInt(attendanceDateTo2)) {
            if (Integer.parseInt(graduate2) < Integer.parseInt(attendanceDateTo2)){
                inputGraduate2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                isValid = false;
            }
       }
        
        //School3
        if (attendanceDateFrom3.isEmpty()) {
            inputAttendanceDateFrom3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        } else if (!attendanceDateFrom3.matches("\\d{4}")) {
            inputAttendanceDateFrom3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            ErrorMessage7.setVisible(true);
            isValid = false;
        } 
        
        if (attendanceDateTo3.isEmpty() ) {
            inputAttendanceDateTo3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        } else if (!attendanceDateTo3.matches("\\d{4}")) {
            inputAttendanceDateTo3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            ErrorMessage8.setVisible(true);
            isValid = false;
        } else if (isValidInt(attendanceDateFrom3)) {
            if (Integer.parseInt(attendanceDateTo3) < Integer.parseInt(attendanceDateFrom3)){
                inputAttendanceDateTo3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                isValid = false;
            }
        }
        
        if (graduate3.isEmpty()) {
            inputGraduate3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            isValid = false;
        } else if (!graduate3.matches("\\d{4}")) {
            inputGraduate3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            ErrorMessage9.setVisible(true);
            isValid = false;
        } else if (isValidInt(attendanceDateTo3)) {
            if (Integer.parseInt(graduate3) < Integer.parseInt(attendanceDateTo3)){
                inputGraduate3.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
                isValid = false;
            }
       }
        
        if (isValid) {
            
            fullName = firstName + " " + mi + " " + lastName;
            
            if (jRadioButton1.isSelected()) {
                sex = 'M';
            } else {
                sex = 'F';
            }
            
            switch (comboBoxBloodType.getSelectedIndex()) {
                case 0:
                bloodtype = "A+";
                break;
                case 1:
                bloodtype = "A"; 
                break;
                case 2:
                bloodtype = "B+"; 
                break;
                case 3:
                bloodtype = "B"; 
                break;
                case 4:
                bloodtype = "O+";
                break;
                case 5:
                bloodtype = "O";
                break;
                case 6:
                bloodtype = "AB+";
                break;
                case 7:
                bloodtype = "AB ";
                break;
            }
            
            switch (comboBoxStrand.getSelectedIndex()) {
                case 0:
                strand = "STEM";
                break;
                case 1:
                strand = "ABM";
                break;
                case 2:
                strand = "HUMSS";
                break;
                case 3:
                strand = "GAS";
                break;
                case 4:
                strand = "TVL";
                break;
            }
            
            switch (comboBoxGradeLevel.getSelectedIndex()) {
                case 0:
                gradeLevel = 11;
                break;
                case 1:
                gradeLevel = 12; 
                break;
            }
            
            
            fullAddress1 = streetAndBarangay1 + " " + city1 + " " + province1;
            fullAddress2 = streetAndBarangay2 + " " + city2 + " " + province2;
            dateOfAttendance1 =  attendanceDateFrom + " - " + attendanceDateTo;
            dateOfAttendance2 =  attendanceDateFrom2 + " - " + attendanceDateTo2;
            dateOfAttendance3 =  inputAttendanceDateFrom3.getText() + " - " + inputAttendanceDateTo3.getText();
            
            SHS shs = new SHS(LRN, fullName,
                inputBirthDate.getText(), age, inputBirthPlace.getText(), fullAddress1,
                fullAddress2, sex, inputCitizenship.getText(),inputReligion.getText(),
                Double.parseDouble(inputHeight.getText()), Double.parseDouble(inputWeight.getText()), bloodtype, inputCPnum.getText(),
                inputEmail.getText(), inputSchool.getText(), inputAccomplish.getText(), dateOfAttendance1,
                inputGraduate.getText(), inputSchool2.getText(), inputAccomplish2.getText(),
                dateOfAttendance2, inputGraduate2.getText(), 
                inputSchool3.getText(), inputAccomplish3.getText(),
                dateOfAttendance3, inputGraduate3.getText(), 
                gradeLevel, strand);

            student.add(shs);
            shs.savestudent();
            
            JOptionPane.showMessageDialog(this, "You are now registered!", "Success", JOptionPane.INFORMATION_MESSAGE);
            Admin admin = new Admin(student);
            admin.setVisible(true);
            this.dispose(); 
        } else {
            JOptionPane.showMessageDialog(this, "Check invalid inputs", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ConfirmActionPerformed

    private void inputSchoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSchoolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSchoolActionPerformed

    private void inputBirthDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBirthDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBirthDateActionPerformed

    private void inputProvinceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputProvinceActionPerformed
        int selectedProvinceIndex = inputProvince.getSelectedIndex();
        province1 = inputProvince.getItemAt(selectedProvinceIndex); // Update province1
        inputMunicipalCity.removeAllItems();

        switch (selectedProvinceIndex) {
            case 0: // Albay
                String[] albayCities = {"Ligao", "Bacacay", "Camalig", "Daraga", "Guinobatan", "Jovellar", "Legazpi", 
                                        "Libon", "Malilipot", "Malinao", "Manito", "Oas", "Pio Duran", "Polangui", 
                                        "Rapu-rapu", "Santo Domingo", "Tabaco", "Tiwi"};
                for (String city : albayCities) {
                    inputMunicipalCity.addItem(city);
                }
                break;
            case 1: // Camarines Norte
                String[] camarinesNorteCities = {"Daet", "Basud", "Capalonga", "Jose Panganiban", "Labo", "Mercedes", 
                                                 "Paracale", "San Lorenzo Ruiz", "Sta. Elena", "Talisay", "Vinzons"};
                for (String city : camarinesNorteCities) {
                    inputMunicipalCity.addItem(city);
                }
                break;
            case 2: // Camarines Sur
                String[] camarinesSurCities = {"Naga City", "Iriga City", "Caramoan", "Pili", "Buhi", "Calabanga", 
                                               "Canaman", "Garchitorena", "Goa", "Lagonoy", "Libmanan", "Magarao", 
                                               "Milaor", "Minalabac", "Nabua", "Ocampo", "Pasacao", "Presentacion", 
                                               "Ragay", "San Fernando", "San Jose", "Sipocot", "Siruma", "Tigaon", 
                                               "Tinambac"};
                for (String city : camarinesSurCities) {
                    inputMunicipalCity.addItem(city);
                }
                break;
            case 3: // Catanduanes
                String[] catanduanesCities = {"Virac", "Bato", "Bagamanoc", "Baras", "Caramoran", "Gigmoto", "Pandan", 
                                              "San Andres", "San Miguel", "Viga"};
                for (String city : catanduanesCities) {
                    inputMunicipalCity.addItem(city);
                }
                break;
            case 4: // Masbate
                String[] masbateCities = {"Masbate City", "Aroroy", "Baleno", "Balud", "Batuan", "Cataingan", "Cawayan", 
                                          "Claveria", "Dimasalang", "Esperanza", "Mandaon", "Milagros", "Mobo", 
                                          "Monreal", "Palanas", "Pio V. Corpuz", "Placer", "San Fernando", "San Jacinto", 
                                          "San Pascual", "Uson"};
                for (String city : masbateCities) {
                    inputMunicipalCity.addItem(city);
                }
                break;
            case 5: // Sorsogon
                String[] sorsogonCities = {"Sorsogon City", "Bacon District", "Bulusan", "Casiguran", "Castilla", 
                                           "Donsol", "Gubat", "Irosin", "Juban", "Magallanes", "Matnog", "Pilar", 
                                           "Prieto Diaz", "Sta. Magdalena"};
                for (String city : sorsogonCities) {
                    inputMunicipalCity.addItem(city);
                }
                break;
            default:
                inputMunicipalCity.addItem("No cities available");
        }
    }//GEN-LAST:event_inputProvinceActionPerformed
    
    private void inputMunicipalCity2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMunicipalCity2ActionPerformed
        if (inputMunicipalCity2.getSelectedIndex() >= 0) {
            city2 = (String) inputMunicipalCity2.getSelectedItem(); // Update city2
        }
    }//GEN-LAST:event_inputMunicipalCity2ActionPerformed

    private void inputProvince2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputProvince2ActionPerformed
        int selectedProvinceIndex = inputProvince2.getSelectedIndex();
        province2 = inputProvince2.getItemAt(selectedProvinceIndex); // Update province2
        inputMunicipalCity2.removeAllItems();

        switch (selectedProvinceIndex) {
            case 0: // Albay
                String[] albayCities = {"Ligao", "Bacacay", "Camalig", "Daraga", "Guinobatan", "Jovellar", "Legazpi", 
                                        "Libon", "Malilipot", "Malinao", "Manito", "Oas", "Pio Duran", "Polangui", 
                                        "Rapu-rapu", "Santo Domingo", "Tabaco", "Tiwi"};
                for (String city : albayCities) {
                    inputMunicipalCity2.addItem(city);
                }
                break;
            case 1: // Camarines Norte
                String[] camarinesNorteCities = {"Daet", "Basud", "Capalonga", "Jose Panganiban", "Labo", "Mercedes", 
                                                 "Paracale", "San Lorenzo Ruiz", "Sta. Elena", "Talisay", "Vinzons"};
                for (String city : camarinesNorteCities) {
                    inputMunicipalCity2.addItem(city);
                }
                break;
            case 2: // Camarines Sur
                String[] camarinesSurCities = {"Naga City", "Iriga City", "Caramoan", "Pili", "Buhi", "Calabanga", 
                                               "Canaman", "Garchitorena", "Goa", "Lagonoy", "Libmanan", "Magarao", 
                                               "Milaor", "Minalabac", "Nabua", "Ocampo", "Pasacao", "Presentacion", 
                                               "Ragay", "San Fernando", "San Jose", "Sipocot", "Siruma", "Tigaon", 
                                               "Tinambac"};
                for (String city : camarinesSurCities) {
                    inputMunicipalCity2.addItem(city);
                }
                break;
            case 3: // Catanduanes
                String[] catanduanesCities = {"Virac", "Bato", "Bagamanoc", "Baras", "Caramoran", "Gigmoto", "Pandan", 
                                              "San Andres", "San Miguel", "Viga"};
                for (String city : catanduanesCities) {
                    inputMunicipalCity2.addItem(city);
                }
                break;
            case 4: // Masbate
                String[] masbateCities = {"Masbate City", "Aroroy", "Baleno", "Balud", "Batuan", "Cataingan", "Cawayan", 
                                          "Claveria", "Dimasalang", "Esperanza", "Mandaon", "Milagros", "Mobo", 
                                          "Monreal", "Palanas", "Pio V. Corpuz", "Placer", "San Fernando", "San Jacinto", 
                                          "San Pascual", "Uson"};
                for (String city : masbateCities) {
                    inputMunicipalCity2.addItem(city);
                }
                break;
            case 5: // Sorsogon
                String[] sorsogonCities = {"Sorsogon City", "Bacon District", "Bulusan", "Casiguran", "Castilla", 
                                           "Donsol", "Gubat", "Irosin", "Juban", "Magallanes", "Matnog", "Pilar", 
                                           "Prieto Diaz", "Sta. Magdalena"};
                for (String city : sorsogonCities) {
                    inputMunicipalCity2.addItem(city);
                }
                break;
            default:
                inputMunicipalCity2.addItem("No cities available");
        }
    }//GEN-LAST:event_inputProvince2ActionPerformed

    private void inputMunicipalCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMunicipalCityActionPerformed
        if (inputMunicipalCity.getSelectedIndex() >= 0) {
            city1 = (String) inputMunicipalCity.getSelectedItem(); // Update city1
        }
    }//GEN-LAST:event_inputMunicipalCityActionPerformed

    private void inputAttendanceDateFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAttendanceDateFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAttendanceDateFromActionPerformed

    private void inputMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMIActionPerformed
        if (inputMI.getSelectedIndex() >= 0) {
            mi = (String) inputMI.getSelectedItem();
        }
    }//GEN-LAST:event_inputMIActionPerformed

    private void inputGraduate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputGraduate2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputGraduate2ActionPerformed

    private void inputGraduate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputGraduate3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputGraduate3ActionPerformed
    
    
    
    public static void main(String args[]) {
        ArrayList<Student> student = new ArrayList<>();
        String LRN = null;
        java.awt.EventQueue.invokeLater(() -> new SHS_Frame(LRN, student).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel BirthDateErrorMessage;
    private javax.swing.JLabel BirthPlaceErrorMessage;
    private javax.swing.JLabel CPnumErrorMessage;
    private javax.swing.JLabel CitizanshipErrorMessage;
    private javax.swing.JButton Confirm;
    private javax.swing.JLabel CurrentAddressErrorMessage;
    private javax.swing.JLabel ErrorMessage1;
    private javax.swing.JLabel ErrorMessage2;
    private javax.swing.JLabel ErrorMessage3;
    private javax.swing.JLabel ErrorMessage4;
    private javax.swing.JLabel ErrorMessage5;
    private javax.swing.JLabel ErrorMessage6;
    private javax.swing.JLabel ErrorMessage7;
    private javax.swing.JLabel ErrorMessage8;
    private javax.swing.JLabel ErrorMessage9;
    private javax.swing.JLabel FirstNameErrorMessage;
    private javax.swing.JLabel HeightErrorMessage;
    private javax.swing.JLabel LastNameErrorMessage;
    private javax.swing.JLabel PermanentAddressErrorMessage;
    private javax.swing.JLabel ReligionErrorMessage;
    private javax.swing.JLabel SexErrorMessage;
    private javax.swing.JLabel WeightErrorMessage;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboBoxBloodType;
    private javax.swing.JComboBox<String> comboBoxGradeLevel;
    private javax.swing.JComboBox<String> comboBoxStrand;
    private javax.swing.JTextField inputAccomplish;
    private javax.swing.JTextField inputAccomplish2;
    private javax.swing.JTextField inputAccomplish3;
    private javax.swing.JTextField inputAttendanceDateFrom;
    private javax.swing.JTextField inputAttendanceDateFrom2;
    private javax.swing.JTextField inputAttendanceDateFrom3;
    private javax.swing.JTextField inputAttendanceDateTo;
    private javax.swing.JTextField inputAttendanceDateTo2;
    private javax.swing.JTextField inputAttendanceDateTo3;
    private javax.swing.JTextField inputBirthDate;
    private javax.swing.JTextField inputBirthPlace;
    private javax.swing.JTextField inputCPnum;
    private javax.swing.JTextField inputCitizenship;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputFirstName;
    private javax.swing.JTextField inputGraduate;
    private javax.swing.JTextField inputGraduate2;
    private javax.swing.JTextField inputGraduate3;
    private javax.swing.JTextField inputHeight;
    private javax.swing.JTextField inputLastName;
    private javax.swing.JComboBox<String> inputMI;
    private javax.swing.JComboBox<String> inputMunicipalCity;
    private javax.swing.JComboBox<String> inputMunicipalCity2;
    private javax.swing.JComboBox<String> inputProvince;
    private javax.swing.JComboBox<String> inputProvince2;
    private javax.swing.JTextField inputReligion;
    private javax.swing.JTextField inputSchool;
    private javax.swing.JTextField inputSchool2;
    private javax.swing.JTextField inputSchool3;
    private javax.swing.JTextField inputStreetandBarangay;
    private javax.swing.JTextField inputStreetandBarangay2;
    private javax.swing.JTextField inputSuffix;
    private javax.swing.JTextField inputWeight;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelLRN;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
