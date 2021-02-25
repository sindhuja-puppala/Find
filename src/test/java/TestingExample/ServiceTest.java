package TestingExample;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ServiceTest {

	@Autowired 
	private CricService cricSer;
	@MockBean
	private CricRepository cricrepo;
	
	@Test
	public void  getCricketerListTest()
	{
		Cricketer e=new Cricketer();
		e.setJerseyno(1);
		e.setName("virat");
		e.setTeam("Rcb");
		e.setTestranking(101);
		
		Cricketer e2=new Cricketer();
		e2.setJerseyno(2);
		e2.setName("dhoni");
		e2.setTeam("chennai");
		e2.setTestranking(102);
		
		List<Cricketer> elist=new ArrayList<>();
		elist.add(e);
		elist.add(e2);
		Mockito.when(cricrepo.findAll()).thenReturn(elist);
		assertThat(cricSer.getAll()).isEqualTo(elist);
	
	}
	/*@Test
	public void  createTest()
	{
		Cricketer e=new Cricketer();
		e.setJerseyno(3);
		e.setName("rahul");
		e.setTeam("punjab");
		e.setTestranking(105);
		Mockito.when(cricrepo.save(e)).thenReturn(e);
		assertThat(cricSer.add(e)).isEqualTo(e);
	}*/
	/*@Test
	  public void getCricketerByIdTest() {
		Cricketer e2=new Cricketer();
		e2.setJerseyno(2);
		e2.setName("dhoni");
		e2.setTeam("chennai");
		e2.setTestranking(102); 
		 Optional<Cricketer> e=Optional.of(e2);
		 Mockito.when(cricrepo.findById(2)).thenReturn(e);
		 assertThat(cricSer.findById(2)).isEqualTo(e);
	 }*/
	
	@Test
    public void testDeleteEmployee() {
       Cricketer c = new Cricketer(1,"virat",101,"Rcb");
       cricrepo.save(c);
       cricrepo.delete(c);
   }
}
