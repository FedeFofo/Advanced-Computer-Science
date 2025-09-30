public class Cat { // 1. Made "public" lowercase, 2. Updated "Cats" to "Cat" to reflect the file name
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
	public Cat(String name, String breed) { // 3. Added String breed as a parameter, 
		// updated the name of the method (cat -> Cat) so that it is recognized as a constructor of the class
		this.name = name; // 4. Added "this" to both variables in the constructor to ensure the instance variables were set properly
		this.breed = breed;
		this.isHungry = true; // 5. Updated yes to true because it is a boolean
		livesRemaining = 9;
	}

	public String getName() { // 6. Made the getter return a String instead of nothing
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getIsHungry(){ // 7. Fixed camelCase in method name 
		// (getishungry -> getIsHungry) and made the getter return a boolean instead of nothing
		return isHungry;
	}

	public void feed() { // 8. Made the method a void function, since it does not return anything
		this.isHungry = false;
	}

	public boolean equals(Cat other) {
		return this.name.equals(other.name) && this.breed.equals(other.breed) 
		// 9. Used the equals() method to properly compare Strings
			&& this.livesRemaining == other.livesRemaining; 
			// 10. Used two equals signs instead of one to properly compare ints
	}

	public String toString() {
		String toString = name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.";
		return toString; 
		// 11. Updated method to return the toString instead of printing it to the console
	}

	public String getBreed() {
		return breed;
	}
	// 18. Added getter method for breed

	public void setBreed(String breed) {
		this.breed = breed;
	}
	// 19. Added setter method for breed
}