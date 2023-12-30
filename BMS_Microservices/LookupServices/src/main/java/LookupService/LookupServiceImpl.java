package LookupService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import LookupDao.LookupDao;
import LookupDao.LookupDaoImpl;


public class LookupServiceImpl implements LookupService {

	private final LookupDao lookupDao;

    @Autowired
    public LookupServiceImpl(LookupDaoImpl lookupDao) {
        this.lookupDao = lookupDao;
    }
    
	public List<String> getAllUsernames() {
		
		try {
			return lookupDao.getAllUserNameFromDB();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
