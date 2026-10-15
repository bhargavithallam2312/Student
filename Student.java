public  class Student {
    public int id;
    private String name;
    private String department;
    private int year;
    private String phone;

    public Student(int id, String name, String department, int year, String phone) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.year = year;
        this.phone = phone;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getYear() {
        return year;
    }

    public String getPhone() {
        return phone;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Department: " + department +
                ", Year: " + year +
                ", Phone: " + phone;
    }
}