package codeTest;

import com.gwservices.interview.Check;
import com.gwservices.interview.CheckAPI;

public abstract class CodeTestExerciseJdbc {
	
	private CheckAPI _checkAPI;
	
	public CodeTestExerciseJdbc(){
		setCheckAPI(new CheckAPI());
	}	
	
	/**
	 * 
	 * This method needs to return the checks in the database that have not been processed
	 * 
	 * @return
	 */
	public abstract Check[] getEligibleChecks();
	
	
	public void processChecks(){
		Check[] checks = getEligibleChecks();
		if(checks != null){
			for(int i = 0; i < checks.length; i++){
				processCheck(checks[i]);	
			}
		}		
	}

	/**
	 * This method will be responsible for submitting the unprocessed check to the CheckAPI, 
	 * handling any exceptions, capturing any return values and making sure that the check is 
	 * marked as processed(updateProcessedCheck) 
	 * 
	 * @param unprocessedCheck
	 */
	public abstract void processCheck(Check unprocessedCheck);

	public CheckAPI getCheckAPI() {
		return _checkAPI;
	}

	public void setCheckAPI(CheckAPI checkapi) {
		_checkAPI = checkapi;
	}
}
