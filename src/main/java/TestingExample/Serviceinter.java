package TestingExample;

import java.util.List;

public interface Serviceinter {

	List<Cricketer> getAll();
	Cricketer findById(Integer jerseyno);

	Object update(int jerseyno, Cricketer cricketer);

}
