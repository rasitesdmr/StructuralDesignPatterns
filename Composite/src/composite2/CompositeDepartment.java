package composite2;

import java.util.ArrayList;
import java.util.List;

public class CompositeDepartment implements Department {

    private int id;
    private String name;

    private List<Department> childDepartments = new ArrayList<>();

    public CompositeDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }

    @Override
    public void printDepartmentName() {
        childDepartments.forEach(Department::printDepartmentName);
    }

}
