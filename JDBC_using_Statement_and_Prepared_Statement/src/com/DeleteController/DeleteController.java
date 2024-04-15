package com.DeleteController;

import com.DeleteService.DeleteService;

public class DeleteController {

	public static void main(String[] args) throws Exception {
		
		DeleteService ds = new DeleteService();
		ds.DeleteSD();
		ds.DeletePSD();
		ds.DeletePSP("Pranav");
	}
}
