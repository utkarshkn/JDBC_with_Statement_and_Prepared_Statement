package com.InsertController;

import com.InsertService.InsertService;

public class InsertController {

	public static void main(String[] args) throws Exception{
		
		InsertService i  = new InsertService();
		i.InsertSD();
		i.InsertPSD();
		i.InsertPSP(444, "krushna");
		
	}
}
