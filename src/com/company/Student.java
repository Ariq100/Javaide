//package com.company;
//
//public class Student {
//    private int studentId;
//    private String studentName;
//    private String studentGrade;
//
//        public Student(int studentId, String studentName, String studentGrade) {
//            this.studentId = studentId;
//            this.studentName = studentName;
//            this.studentGrade = studentGrade;
//        }
//
//        public void setStudentId(int studentId) { this.studentId = studentId;}
//
//        public int getStudentId() { return this.studentId;}
//
//        public void setStudentName(String studentName) { this.studentName = studentName;}
//
//        public String getStudentName() { return this.studentName = studentName;}
//
//        public void setStudentGrade(String studentGrade) { this.studentGrade = studentGrade;}
//
//        public String getStudentGrade() { return this.studentGrade;}
//
//        public void introduction() {
//            System.out.println("*********** Student Introduction ************");
//            System.out.println("ID : " + this.studentId);
//            System.out.println("Name : " + this.studentName);
////            System.out.println(this.studentName + " studies in " + this.studentGrade + " grade.");
//        }
//}

//package com.company;
//
//public class Parent extends GrandParent {
//    private String name;
//    private int bankBalance;
//
//    public Parent(String name, int bankBalance) {
//        this.name = name;
//        this.bankBalance = bankBalance;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getBankBalance() {
//        return bankBalance;
//    }
//
//    public void setBankBalance(int bankBalance) {
//        this.bankBalance = bankBalance;
//    }
//
//    public void printName() {
//        super.printName();
//        System.out.println("Called from Parent");
//    }
//
//    public int printBankBalance() {
//        return this.bankBalance;
//    }
//}