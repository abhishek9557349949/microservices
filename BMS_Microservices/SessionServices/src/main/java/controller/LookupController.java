package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LookupController {
    
    @GetMapping ("/getusers")
    public List<String> sessionLogin() throws Exception {
    	List<String> userNames = new ArrayList<String>();
        try {
        	userNames.add("hi");
        	System.out.println("hii");
        	return userNames;
        	//userNames = lookupService.getAllUsernames();
		} catch (Exception e) {
			System.out.println("hiiii");
			e.printStackTrace();
		}
        return userNames;
    }
}
