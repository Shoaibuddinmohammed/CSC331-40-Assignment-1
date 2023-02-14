

public class BinaryConvertor {

	public int convertToDecimal(String binaryString) {	
		return Integer.parseInt(binaryString,2);
	}
	
	public String convertToOctal(String binaryString) {
		int decimal = convertToDecimal(binaryString);
		return Integer.toOctalString(decimal).toUpperCase();
	}
	
	public String convertToHexaDecimal(String binaryString) {	
		int decimal = convertToDecimal(binaryString);
		return Integer.toHexString(decimal).toUpperCase();
	}
}
