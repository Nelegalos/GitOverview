package by.serge.personal.training.GitOverview.entity;

public class Truck extends Car {
	private String model;
	private String engine;

	@Override
	public String toString() {
		return "Truck [model=" + model + ", engine=" + engine + "]";
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}
}
