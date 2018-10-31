import java.util.Objects;

/**
 * This object represents a hybrid car. 
 * Extends from {@link Car}.
 * @author Tim
 *
 */
public class HybridCar extends Car
{
	private String engineDisplacement;
	private String batteryCapacity;

	public HybridCar(String brand, String modelName, int price, String enginePower, String engineDisplacement, String batteryCapacity)
	{
		super(brand, modelName, price, enginePower);
		
		this.engineDisplacement = engineDisplacement;
		this.batteryCapacity = batteryCapacity;
	}

	/**
	 * Returns a string representing the engine displacement of this car.
	 * @return A string representing the engine displacement of this car.
	 */
	public String getEngineDisplacement()
	{
		return this.engineDisplacement;
	}
	
	/**
	 * Returns a string representing the battery capacity of this car.
	 * @return A string representing the battery capacity of this car.
	 */
	public String getBatteryCapacity()
	{
		return this.batteryCapacity;
	}
	
	/**
	 * Returns a new instance of this object based on the given data.
	 * @param data data to be used
	 * @return A new instance of this object based on the given data.
	 */
	public static HybridCar read(String[] data)
	{
		String brand = data[0];
		String modelName = data[1];
		String engineDisplacement = data[2];
		String enginePower = data[3];
		String batteryCapacity = data[4];
		int price = Integer.valueOf(data[5].split("\\s")[0]);
		
		return new HybridCar(brand, modelName, price, enginePower, engineDisplacement, batteryCapacity);
	}
	
	/**
	 * Returns true if the given object is equal to this object, false otherwise.
	 */
	@Override
	public boolean equals(Object object)
	{
		if (this == object)
		{
			return true;
		}
		
		if (!(object instanceof HybridCar))
		{
			return false;
		}
		
		HybridCar car = (HybridCar) object;
		
		return this.getBrand().equals(car.getBrand()) &&
				this.getModelName().equals(car.getModelName()) &&
				this.getEnginePower().equals(car.getEnginePower()) &&
				this.getEngineDisplacement().equals(car.getEngineDisplacement()) &&
				this.getBatteryCapacity().equals(car.getBatteryCapacity()) &&
				this.getPrice() == car.getPrice();
	}
	
	/**
	 * Returns the hash code of this object.
	 */
	@Override
	public int hashCode()
	{
		return Objects.hash(this.getBrand(), this.getModelName(), this.getEnginePower(), this.getPrice(), this.getEngineDisplacement(), this.getBatteryCapacity());
	}

	/**
	 * Returns a textual representation of this object.
	 */
	@Override
	public String toString() {
		return String.format("HYBRID_CAR %s, %s, %s, %s, %s, %d euro", this.getBrand(), this.getModelName(), this.getEngineDisplacement(), this.getEnginePower(), this.getBatteryCapacity(), this.getPrice());
	}
}
