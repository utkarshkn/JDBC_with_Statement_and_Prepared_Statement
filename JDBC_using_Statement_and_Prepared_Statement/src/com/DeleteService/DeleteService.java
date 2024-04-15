package com.DeleteService;

import com.DeleteDAO.DeleteDAO;

public class DeleteService {

	public void DeleteSD() throws Exception {
		DeleteDAO i = new DeleteDAO();
		i.DeleteSD();
	}

	public void DeletePSD() throws Exception {
		DeleteDAO a = new DeleteDAO();
		a.DeletePSD();
	}
	public void DeletePSP(String name) throws Exception {
		DeleteDAO i = new DeleteDAO();
		i.DeletePSP(name);
	}
}
