package test

class Department {

    String departmentName
    Integer departmentId
    String location

    static hasMany = [employees:Employee]

    Department(String departmentName, Integer departmentId, String location) {
        this.departmentName = departmentName
        this.departmentId = departmentId
        this.location = location
    }
    static constraints = {
    }
}
