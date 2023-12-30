package LookupService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface LookupService {
	
	List<String> getAllUsernames();
	
}
