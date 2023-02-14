

public class OctalConvertor {

	public int convertOctalToDecimal(String octalNumber) {
		return Integer.parseInt(octalNumber,8);
	}
	public String convertOctalToHexaDecimal(String octalNumber) {
		
		int decimalValue = convertOctalToDecimal(octalNumber);
		String hexaDecimal = Integer.toHexString(decimalValue);
		return hexaDecimal.toUpperCase();
	}
	
	public String convertOctalToBinary(String octalNumber) {
		
		int decimalValue = convertOctalToDecimal(octalNumber);
		String binaryValue = Integer.toBinaryString(decimalValue);
		return binaryValue;
		
	}
}
