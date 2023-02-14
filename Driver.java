

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		int userInput = 0;
		Scanner scc = new Scanner(System.in);
		// ask user for their name
		System.out.println("Please Enter your full-Name");
		String userName = scc.nextLine();
		
		int nameAsciiSum = 0;
		
		for(int i=0;i<userName.length();i++) {
			int charAscii = (int)userName.charAt(i);
			nameAsciiSum = nameAsciiSum + charAscii; 
		}
		
		boolean flag;
		while(1>0) {
			do {
				try {
					System.out.println("Choose any one of the option:\n ");
					System.out.println("1. Convert Binary to Other Formats "
							+ "\n"
							+ "2. Convert Decimal to Other Formats"
							+ "\n"
							+ "3. Convert Octal to Other Formats"
							+ "\n"
							+ "4. Convert HexaDecimal to Other Formats"
							+ "\n"
							+ "5. Exit");
					userInput = scc.nextInt();
					scc.nextLine();
					flag = false;
					if (userInput < 1 && userInput > 5)
						throw new Exception("Input out of range: " + userInput);
				} catch (Exception e) {
					System.out.println("Only 1 to 5 are accepted...");
					flag = true;
					scc.nextLine();
				}
			} while (flag);

			if(userInput==1) {
				System.out.println("Please Enter a Binary Value to Convert");
				String binaryValue = scc.nextLine();
				BinaryConvertor binaryConvertor = new BinaryConvertor();
				System.out.println("Decimal Representation: "+binaryConvertor.convertToDecimal(binaryValue));
				System.out.println("Octal Representation: "+binaryConvertor.convertToOctal(binaryValue));
				System.out.println("Hexa-Decimal Representation: "+binaryConvertor.convertToHexaDecimal(binaryValue));	
			}
			else if(userInput==2) {
				System.out.println("Please Enter a Decimal Value to Convert");
				int decimalNumber = scc.nextInt();
				scc.nextLine();
				DecimalConvertor dc = new DecimalConvertor();
				System.out.println("Binary Representation: "+dc.convertToBinary(decimalNumber));
				System.out.println("Octal Representation: "+dc.convertToOctal(decimalNumber));
				System.out.println("Hexa-Decimal Representation: "+dc.convertToHexaDecimal(decimalNumber));	
			}
			else if(userInput==3) {
				System.out.println("Please Enter a Octal Value to Convert");
				String octalNumber = scc.nextLine();
				OctalConvertor oc = new OctalConvertor();
				System.out.println("Binary Representation: "+oc.convertOctalToBinary(octalNumber));
				System.out.println("Decimal Representation: "+oc.convertOctalToDecimal(octalNumber));
				System.out.println("Hexa-Decimal Representation: "+oc.convertOctalToDecimal(octalNumber));
			}
			else if(userInput==4) {
				System.out.println("Please Enter a Hexa-Decimal Value to Convert");
				String hexa = scc.nextLine();
				HexaDecimalConvertor hc = new HexaDecimalConvertor();
				System.out.println("Binary Representation: "+hc.convertToBinary(hexa));
				System.out.println("Decimal Representation: "+hc.convertToDecimal(hexa));
				System.out.println("Octal Representation: "+hc.convertToOctal(hexa));
			}
			else if(userInput==5) {
				break;
			}
		}
		
		NameConvertor nameConvertor = new NameConvertor();
		System.out.println("Binary format for Name: "+nameConvertor.convertNameToBinary(nameAsciiSum));
		System.out.println("Hexa-Decimal format for Name: "+nameConvertor.convertNameToHexaDecimal(nameAsciiSum));
		System.out.println("Octal format for Name: "+nameConvertor.convertNameToOctal(nameAsciiSum));
		
		scc.close();
	}
}