package TestingExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CricService implements Serviceinter {
	
	
		@Autowired
		private CricRepository cricRepository;

		
		public List<Cricketer> getAll()
		{
			return  cricRepository.findAll();
		}
		
		@Override
		public Cricketer findById(Integer jerseyno) 
		{
			 return cricRepository.findById(jerseyno).orElse(null);
		}
		public void add(Cricketer cricketer) 
		{
			cricRepository.save(cricketer);
		}
		public void deleteById(int jerseynoo)
		{
			cricRepository.deleteById(jerseynoo);	
		}

		public void save(Cricketer cricketer) 
		{
			cricRepository.save(cricketer);
		}
		
		@Override
		public Object update(int jerseyno, Cricketer cricketer) {
			// TODO Auto-generated method stub
			return null;
		}
		
		
		
	}
