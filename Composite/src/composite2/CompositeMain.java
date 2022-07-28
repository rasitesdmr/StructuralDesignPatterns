package composite2;

public class CompositeMain {

    public static void main(String[] args) {
        Department salesDepartment = new SalesDepartment(1,"Sales Department");
        Department financeDepartment = new FinancialDepartment(2,"Financial Department");

        CompositeDepartment compositeDepartment = new CompositeDepartment(3,"Head Department");
        compositeDepartment.addDepartment(salesDepartment);
        compositeDepartment.addDepartment(financeDepartment);
        compositeDepartment.printDepartmentName();


    }
}


