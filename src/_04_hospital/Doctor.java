package _04_hospital;

import java.util.ArrayList;

public abstract class Doctor {
	ArrayList<Patient> pa = new ArrayList<Patient>();

	abstract boolean performsSurgery();

	abstract boolean akesHouseCalls();

	void add() {

	}

}
