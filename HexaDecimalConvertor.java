

public class HexaDecimalConvertor {

	public String convertToBinary(String hexaDecimalString) {
		int decimal = convertToDecimal(hexaDecimalString);
		return Integer.toBinaryString(decimal);
	}
	public String convertToOctal(String hexaDecimalString) {
		int decimal = convertToDecimal(hexaDecimalString);
		return Integer.toOctalString(decimal);
	}
	public int convertToDecimal(String hexaDecimalString) {
		return Integer.parseInt(hexaDecimalString,16);
	}
}
