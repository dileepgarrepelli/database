package repository;

import com.dileep.database.entity.Employee;
import com.dileep.database.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void shouldSaveUser() {
        Employee employee = new Employee(1, "Amy", 3500.0);
        Employee save = employeeRepository.save(employee);
    }
}
