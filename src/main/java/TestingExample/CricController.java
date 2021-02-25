package TestingExample;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping
	
	public class CricController {
		@Autowired
		private CricService cricService;
		@Autowired
		private CricRepository cricRepository;
	 @ResponseBody
		@GetMapping("/cricketer")
		public List<Cricketer> getAll()
		{
			return cricService.getAll();
		}
		@GetMapping("details/{Id}")
		public Cricketer getCricketer(@PathVariable("Id") int jerseyno)
		{
			return this.cricService.findById(jerseyno);
		}
		@PostMapping("post")
		public void addEmp(@RequestBody Cricketer cricketer)
		{
			cricService.add(cricketer);
		}
		
		@DeleteMapping("/cricketer")
		public void delete(@RequestParam int jerseyno)
		{
			 cricService.deleteById(jerseyno);
		}
		@PutMapping("/put/{jerseyno}")
		public  ResponseEntity<String> update(@PathVariable(value = "jerseyno") Integer jerseyno,  @RequestBody Cricketer e){
			Cricketer e2 =cricRepository.findById(jerseyno).orElse(null);//Throw(() -> new RecordNotFoundException("No record found  on this id "+ id));
			e2.setName(e.getName());
			e2.setTeam(e.getTeam());
			e2.setTestranking(e.getTestranking());
			cricRepository.save(e2);
			return new ResponseEntity<String>("Record updated successfully", HttpStatus.OK);
			
		}
		
		
}
