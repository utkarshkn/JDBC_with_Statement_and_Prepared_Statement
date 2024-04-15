package com.UpdateService;

import com.UpdateDAO.UpdateDAO;

public class UpdateService {

	public void UpdateSD() throws Exception {
		UpdateDAO i = new UpdateDAO();
		i.UpdateSD();
	}

	public void UpdatePSD() throws Exception {
		UpdateDAO i = new UpdateDAO();
		i.UpdatePSD();
	}
	public void UpdatePSP(int id, String name) throws Exception {
		UpdateDAO i = new UpdateDAO();
		i.UpdatePSP(id,name);
	}
}
