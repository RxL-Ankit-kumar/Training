package test

class Employee {

    String empName
    Integer empNumber
    String location

    static hasMany = [departments:Department]

    Employee(String empName, Integer empNumber, String location) {
        this.empName = empName
        this.empNumber = empNumber
        this.location = location
    }
    static constraints = {

    }
}
