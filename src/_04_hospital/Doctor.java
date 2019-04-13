package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> pa = new ArrayList<Patient>();

	public boolean performsSurgery() {
		return false;
	}

	public boolean makesHouseCalls() {
		return false;
	}

	ArrayList<Patient> getPatients() {
		return pa;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		if (pa.size() >= 3) {
			throw new DoctorFullException();
		} else {
			pa.add(patient);
		}

	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for(Patient p:pa) {
			p.checkPulse();
		}
	}
}
