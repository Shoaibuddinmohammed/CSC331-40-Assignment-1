

public class DecimalConvertor {

	public String convertToBinary(int decimalNumber) {
		return Integer.toBinaryString(decimalNumber);
	}
	public String convertToOctal(int decimalNumber) {
		return Integer.toOctalString(decimalNumber);
	}
	public String convertToHexaDecimal(int decimalNumber) {
		return Integer.toHexString(decimalNumber).toUpperCase();
	}
}
