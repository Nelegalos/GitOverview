package by.serge.personal.training.GitOverview.entity;

public class Car {
	@Override
	public String toString() {
		return "Car [id=" + id + "]";
	}

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Car() {
		super();
	}

}
