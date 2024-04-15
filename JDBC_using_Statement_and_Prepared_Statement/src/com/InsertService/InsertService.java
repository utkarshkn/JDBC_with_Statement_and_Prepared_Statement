package com.InsertService;

import com.InsertDAO.InsertDAO;

public class InsertService {

	public void InsertSD() throws Exception {
		InsertDAO i = new InsertDAO();
		i.InsertSD();
	}

	public void InsertPSD() throws Exception {
		InsertDAO i = new InsertDAO();
		i.InsertPSD();
	}
	public void InsertPSP(int id, String name) throws Exception {
		InsertDAO i = new InsertDAO();
		i.InsertPSP(id,name);
	}
}
