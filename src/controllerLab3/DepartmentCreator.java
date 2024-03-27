package controllerLab3;

import modelLab3.Group;
import modelLab3.Department;

import java.util.ArrayList;
import java.util.List;


public class DepartmentCreator {


    public Department createDepartment(int groupCount, int maxGroups) {
        Department department = new Department();
        GroupCreator groupCreator = new GroupCreator();
        List<Group> groups = new ArrayList<>();
        for (int i = 0; i < groupCount; i++) {
            groups.add(groupCreator.createTypicalGroup());
        }
        department.setGroups(groups);
        department.setMaxGroups(maxGroups);
        return department;
    }

    public Department createTypicalDepartment() {
        Department department = createDepartment(4, 6);
        return department;
    }
}
