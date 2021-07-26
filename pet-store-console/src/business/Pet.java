package business;

import java.time.LocalDate;

public class Pet {
	
	private int id;
	private String type;
	private String breed;
	private String name;
	private LocalDate birthDate;
	private String gender;
	private String disposition;
	private boolean available;
	
	public Pet(int id, String type, String breed, String name, LocalDate birthDate, String gender, String disposition,
			boolean available) {
		super();
		this.id = id;
		this.type = type;
		this.breed = breed;
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
		this.disposition = disposition;
		this.available = available;
	}

	public Pet(String type, String breed, String name, LocalDate birthDate, String gender, String disposition,
			boolean available) {
		super();
		this.type = type;
		this.breed = breed;
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
		this.disposition = disposition;
		this.available = available;
	}

	public Pet() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDisposition() {
		return disposition;
	}

	public void setDisposition(String disposition) {
		this.disposition = disposition;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", type=" + type + ", breed=" + breed + ", name=" + name + ", birthDate=" + birthDate
				+ ", gender=" + gender + ", disposition=" + disposition + ", available=" + available + "]";
	}

}
