import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class SHS extends Student{
    String school3;
    String accomplishments3;
    String dateOfAttendance3;
    String graduationDate3;
    String strand;
    
    public SHS (String LRN, String name, 
            String birthdate, int age, String placeOfBirth, String currentAddress, 
            String permanentAddress, char sex, String citizenship,String religion, 
            double height, double weight, String bloodType, String contactNumber, 
            String email, String school1, String accomplishments1, String dateOfAttendance1, 
            String graduationDate1, String school2, String accomplishments2, 
            String dateOfAttendance2, String graduationDate2, 
            String school3, String accomplishments3, String dateOfAttendance3, String graduationDate3, 
            int gradeLevel ,String strand) {
        this.name = name;
        this.LRN = LRN;
        this.birthdate = birthdate;
        this.age = age;
        this.placeOfBirth = placeOfBirth;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
        this.sex = sex;
        this.citizenship = citizenship;
        this.religion = religion;
        this.height = height;
        this.weight = weight;
        this.bloodType = bloodType;
        this.contactNumber = contactNumber;
        this.email = email;
        this.school1 = school1;
        this.accomplishments1 = accomplishments1;
        this.dateOfAttendance1 = dateOfAttendance1;
        this.graduationDate1 = graduationDate1;
        this.school2 = school2;
        this.accomplishments2 = accomplishments2;
        this.dateOfAttendance2 = dateOfAttendance2;
        this.graduationDate2 = graduationDate2;
        this.gradeLevel = gradeLevel;
        this.school3 = school3;
        this.accomplishments3 = accomplishments3;
        this.dateOfAttendance3 = dateOfAttendance3;
        this.graduationDate3 = graduationDate3;
        this.strand = strand;
    }

    @Override
    public void savestudent() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("SHSstudents.txt", true))) {  // false to overwrite the file
            writer.write("LRN: " + this.LRN + ", ");
            writer.write("Name: " + this.name + ", ");
            writer.write("Birthdate: " + this.birthdate + ", ");
            writer.write("Age: " + this.age + ", ");
            writer.write("Place of Birth: " + this.placeOfBirth + ", ");
            writer.write("Current Address: " + this.currentAddress + ", ");
            writer.write("Permanent Address: " + this.permanentAddress + ", ");
            writer.write("Sex: " + this.sex + ", ");
            writer.write("Citizenship: " + this.citizenship + ", ");
            writer.write("Religion: " + this.religion + ", ");
            writer.write("Height: " + this.height + ", ");
            writer.write("Weight: " + this.weight + ", ");
            writer.write("Blood Type: " + this.bloodType + ", ");
            writer.write("Contact Number: " + this.contactNumber + ", ");
            writer.write("Email: " + this.email + ", ");
            writer.write("School 1: " + this.school1 + ", ");
            writer.write("Accomplishments 1: " + this.accomplishments1 + ", ");
            writer.write("Date of Attendance 1: " + this.dateOfAttendance1 + ", ");
            writer.write("Year Graduated 1: " + this.graduationDate1 + ", ");
            writer.write("School 2: " + this.school2 + ", ");
            writer.write("Accomplishments 2: " + this.accomplishments2 + ", ");
            writer.write("Date of Attendance 2: " + this.dateOfAttendance2 + ", ");
            writer.write("Year Graduated 2: " + this.graduationDate2 + ", ");
            writer.write("School 3: " + this.school3 + ", ");
            writer.write("Accomplishments 3: " + this.accomplishments3 + ", ");
            writer.write("Date of Attendance 3: " + this.dateOfAttendance3 + ", ");
            writer.write("Year Graduated 3: " + this.graduationDate3 + ", ");
            writer.write("Grade Level: " + this.gradeLevel + ", ");
            writer.write("Strand: " + this.strand);
            writer.newLine();  // Ensure we add a line break for each student record
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void clearFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("SHSstudents.txt", false))) {
            writer.write("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}