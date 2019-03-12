public class Element{
	private int type;
	private int intValue;
	private double doubleValue;
	private String stringValue;
	public static final int INTS = 0;
	public static final int DOUBLES = 1;
	public static final int STRINGS = 2;

	public Element(int valType, int intVal, double doubleVal, String stringVal){
		type = valType;
		intValue = intVal;
		doubleValue = doubleVal;
		stringValue = stringVal;
	}

	public int getType(){
		return type
	}

	public int getInt(){
		return intValue;
	}

	public double getDouble(){
		return doubleValue;
	}

	public String getString(){
		return stringValue;
	}

	public String toString(){
		ans = "";
		if (type == INTS) ans += intValue;
		if (type == DOUBLES) ans += doubleValue;
		if (type == STRINGS) ans += stringValue;
		return ans;
	}


}


