

public class NameConvertor {

	public String convertNameToBinary(int asciiValueofName) {
		return Integer.toBinaryString(asciiValueofName);
	}
	public  String convertNameToHexaDecimal(int asciiValueofName) {
		return Integer.toHexString(asciiValueofName).toUpperCase();
	}
	public  String convertNameToOctal(int asciiValueofName) {
		return Integer.toOctalString(asciiValueofName);
	}
	
}
