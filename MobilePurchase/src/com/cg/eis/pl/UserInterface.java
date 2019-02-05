package com.cg.eis.pl;

import com.cg.eis.service.MobileService;

public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileService ms = new MobileService();
		ms.delByMobileId(2);
		ms.showMobInRange(10000, 15000);
		ms.mobAvailabilty();
		ms.getMobileList();
	}

}
