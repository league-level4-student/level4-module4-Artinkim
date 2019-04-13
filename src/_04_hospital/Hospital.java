package _04_hospital;

import java.util.ArrayList;

public class Hospital {
	ArrayList<Patient> pa = new ArrayList<Patient>();
	ArrayList<Doctor> da = new ArrayList<Doctor>();

	void addPatient(Patient p) {
		pa.add(p);
	}

	void addDoctor(Doctor d) {
		da.add(d);
	}

	ArrayList<Patient> getPatients() {
		return pa;
	}

	ArrayList<Doctor> getDoctors() {
		return da;
	}

	public void assignPatientsToDoctors() throws DoctorFullException  {
		// TODO Auto-generated method stub
		int i = 0;
		for (Doctor d : da) {
			while(d.getPatients().size()<3 && i <pa.size()) {
				d.assignPatient(pa.get(i));
				i++;
			}
		}
	}
}
