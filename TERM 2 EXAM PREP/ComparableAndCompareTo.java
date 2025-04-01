import java.util.Objects;

class Student implements Comparable<Student> {  // Use generic Comparable<Student>
    private Integer code;
    private String firstName;
    private String email;

    public Student() {
        super();
    }

    public Student(Integer code, String firstName, String email) {
        super();
        this.code = code;
        this.firstName = firstName;
        this.email = email;
    }

    // Getters and setters
    public Integer getCode() { return code; }
    public void setCode(Integer code) { this.code = code; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    // Improved equals() method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;
        return Objects.equals(code, student.code) &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(email, student.email);
    }

    // Improved hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(code, firstName, email);
    }

    // Proper compareTo implementation
    @Override
    public int compareTo(Student other) {
        // Null check (optional, depending on requirements)
        if (other == null) {
            throw new NullPointerException("Cannot compare with null");
        }

        // Compare by code first
        int codeCompare = this.code.compareTo(other.code);
        if (codeCompare != 0) {
            return codeCompare;
        }

        // If codes are equal, compare by firstName
        int firstNameCompare = this.firstName.compareTo(other.firstName);
        if (firstNameCompare != 0) {
            return firstNameCompare;
        }

        // If firstNames are equal, compare by email
        return this.email.compareTo(other.email);
    }

    @Override
    public String toString() {
        return "Student [code=" + code + ", firstName=" + firstName + ", email=" + email + "]";
    }
}