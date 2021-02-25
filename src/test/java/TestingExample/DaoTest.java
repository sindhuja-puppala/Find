package TestingExample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

	import java.util.List;

	import org.junit.runner.RunWith;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

	import org.springframework.test.context.junit4.SpringRunner;

	import static org.assertj.core.api.Assertions.assertThat;
	@RunWith(SpringRunner.class)
	//@SpringBootTest
	@DataJpaTest
	class DaoTest {

		@Autowired
		private CricRepository cricrep;
		@Test
		public void saveTest()
		{
			Cricketer e=new Cricketer();
			e.setJerseyno(3);
			e.setName("Rahul");
			e.setTeam("punjab");
			e.setTestranking(103);
			Cricketer esave=cricrep.save(e);
			assertNotNull(esave);
		}  
		@Test
		public void testListProducts() {
		    List<Cricketer> emp = (List<Cricketer>) cricrep.findAll();
		    assertThat(emp).size().isGreaterThan(0);
		}

}
