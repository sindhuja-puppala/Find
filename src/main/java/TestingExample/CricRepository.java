package TestingExample;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
public interface CricRepository extends JpaRepository <Cricketer,Integer> {

}
