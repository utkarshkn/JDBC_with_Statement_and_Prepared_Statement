package com.UpdateController;

import com.UpdateService.UpdateService;

public class UpdateController {

	public static void main(String[] args) throws Exception {

		UpdateService us = new UpdateService();
		us.UpdateSD();
		us.UpdatePSD();
		us.UpdatePSP(101, "Zak");
		
	}
}
