package TestingExample;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	@Entity
	public class Cricketer {

		@Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
		 
		  private int jerseyno;
		
		  private String name;
		
		  private String team;
		
		  private int testranking;
		public int getJerseyno() {
			return jerseyno;
		}
		public void setJerseyno(int jerseyno) {
			this.jerseyno = jerseyno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getTeam() {
			return team;
		}
		public void setTeam(String team) {
			this.team = team;
		}
		public int getTestranking() {
			return testranking;
		}
		public void setTestranking(int testranking) {
			this.testranking = testranking;
		}
		
		 public Cricketer() {
		  }
		  public Cricketer(int jerseyno,String name, int testranking,  String team) {
			  this.jerseyno= jerseyno;
			  this.name= name;
			  this.team= team;
			  this.testranking=testranking;
		  }
		  
		
		
	}




