package Model;

public class studentAllMarksModel {
	private float MicoController;
	private float MicroProcessor;
	private float DigitalElectronics;
	private float ControlSystem;
	private float AnologCircuit;
	private float SignalAndSignal;
	private float totalMarks;
	private int StudentId;
	private int studentFkId;

	private float agg;

	public float getStudentAgg() {
		return agg;
	}

	public void setStudentAgg(float agg) {
		this.agg = agg;
	}

	public int getStudentFkId() {
		return studentFkId;
	}

	public void setStudentFkId(int studentFkId) {
		this.studentFkId = studentFkId;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int StudentId) {
		this.StudentId = StudentId;
	}

	public float getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(float totalMarks) {
		this.totalMarks = totalMarks;
	}

	public float getMicoController() {
		return MicoController;
	}

	public void setMicoController(float micoController) {
		MicoController = micoController;
	}

	public float getMicroProcessor() {
		return MicroProcessor;
	}

	public void setMicroProcessor(float microProcessor) {
		MicroProcessor = microProcessor;
	}

	public float getDigitalElectronics() {
		return DigitalElectronics;
	}

	public void setDigitalElectronics(float digitalElectronics) {
		DigitalElectronics = digitalElectronics;
	}

	public float getControlSystem() {
		return ControlSystem;
	}

	public void setControlSystem(float controlSystem) {
		ControlSystem = controlSystem;
	}

	public float getAnologCircuit() {
		return AnologCircuit;
	}

	public void setAnologCircuit(float anologCircuit) {
		AnologCircuit = anologCircuit;
	}

	public float getSignalAndSignal() {
		return SignalAndSignal;
	}

	public void setSignalAndSignal(float signalAndSignal) {
		SignalAndSignal = signalAndSignal;
	}

	@Override
	public String toString() {
		return "studentAllMarksModel [MicoController=" + MicoController + ", MicroProcessor=" + MicroProcessor
				+ ", DigitalElectronics=" + DigitalElectronics + ", ControlSystem=" + ControlSystem + ", AnologCircuit="
				+ AnologCircuit + ", SignalAndSignal=" + SignalAndSignal + ", totalMarks=" + totalMarks + ", StudentId="
				+ StudentId + "]";
	}
}
