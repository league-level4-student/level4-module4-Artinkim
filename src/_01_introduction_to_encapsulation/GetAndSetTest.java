package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GetAndSetTest {
	EncapsulateTheData ed = new EncapsulateTheData();
	@Test
	void degrees() {
		ed.setDegreesTurned(30);
		assertEquals(30,ed.getDegreesTurned());
		ed.setDegreesTurned(-2);
		assertEquals(30,ed.getDegreesTurned());
		ed.setDegreesTurned(0);
		ed.setDegreesTurned(370);
		assertEquals(0,ed.getDegreesTurned());
	}
	@Test 
	void items() {
		ed.setItemsReceived(12);
		assertEquals(12,ed.getItemsReceived());
		ed.setItemsReceived(-2);
		assertEquals(0,ed.getItemsReceived());
		ed.setItemsReceived(-2);
		ed.setItemsReceived(4);
		assertEquals(4,ed.getItemsReceived());
	}
	void nomenclature() {
		ed.setNomenclature("Hello");
		assertEquals("Hello",ed.getNomenclature());
		ed.setNomenclature("");
		assertEquals(" ",ed.getNomenclature());
		ed.setNomenclature("ok");
		ed.setNomenclature(" ");
		assertEquals(" ",ed.getNomenclature());
	}
	void Object() {
		int a = 2;
		int b = 5;
		ed.setMemberObj(a);
		assertEquals(ed.getMemberObj(),b);
		double w = 2;
		double k = 1;
		ed.setMemberObj(w);
		assertEquals(ed.getMemberObj(),k);
		String s = " hi";
		Object n= 1;
		ed.setMemberObj(s);
		assertEquals(ed.getMemberObj(),n);
	}

}
