import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

public class PrimitivesApp {

	public static void main(String[] args) {
		// char type - p.85
		
		char a1 = 'A';
		char a2 = 'a';
		char a3 = 65;
		char a4 = 97;
		char copyright = 169;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(copyright);
		
		// binary and unary operators pp. 88 - 91
		int count = 1;
		// binary + operator
		count = count + 1;
		// unary ++ operator
		count++;
		System.out.println("count = "+count);
		
		// compound assignment p. 93
		count+=10;
		System.out.println("count = "+count);
		
		// implicit casting p.96
		double grade = 93;
		double d = 95.0;
		int i = 86, j = 91;
		double average = (d+i+j)/3;
		System.out.println("avg="+average);
		
		//explicit cast
		int grade2 = (int) 93.75;
		System.out.println("grade="+grade2);
		int average2 = ((int)d+i+j) / 3;
		int remainder = ((int)d+i+j) % 3;
		System.out.println("average = "+average2+", remainder="+remainder);
		
		// p.103 Math class
		// round
		double percent = Math.round(.0325);
		System.out.println("percent="+percent);
		// round to thousandths place (3 decimals)
		percent = (double)Math.round(.0325 * 1000) / 1000;
		System.out.println("percent="+percent);
		
		//pow
		System.out.println(Math.pow(2, 3));
		
		//sqrt
		System.out.println(Math.sqrt(25));
		
		// min/max
		System.out.println(Math.min(11.7, 23.4));
		System.out.println(Math.max(11.7, 23.4));
		
		// random
		System.out.println(Math.random());
		// die roll (1 - 6)
		int die = (int)(Math.random()*6)+1;
		System.out.println("die = "+die);
		// random # 1 to 100
		int rand = (int)(Math.random()*100)+1;
		System.out.println("rand = "+rand);
		
		// NumberFormat p. 105
		double price = 11222.575;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println("formatted price = "+currency.format(price));
		
		double majority = .505;
		NumberFormat pct = NumberFormat.getPercentInstance();
		System.out.println(pct.format(majority));
		
		double miles = 15341.253;
		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(1);
		System.out.println(number.format(miles));
		
		// BigDecimal p. 113
		BigDecimal subtotal = new BigDecimal("100.05");
		BigDecimal discountPct = new BigDecimal(".1");
		final BigDecimal SALES_TAX_PCT = new BigDecimal(".05");
		BigDecimal discountAmt = subtotal.multiply(discountPct);
		discountAmt = discountAmt.setScale(2, RoundingMode.HALF_UP);
		
		BigDecimal totalBeforeTax = subtotal.subtract(discountAmt);
		BigDecimal salesTax = totalBeforeTax.multiply(SALES_TAX_PCT);
		BigDecimal total = totalBeforeTax.add(salesTax);
		
		System.out.println("Subtotal: \t"+currency.format(subtotal));
		System.out.println("Discount Pct: \t"+pct.format(discountPct));
		System.out.println("Discount Amt: \t"+currency.format(discountAmt));
		System.out.println("Total Before Tax: \t"+currency.format(totalBeforeTax));
		System.out.println("Sales Tax: \t"+currency.format(salesTax));
		System.out.println("total: \t"+currency.format(total));
		
		
		
		
		
		
		

	}

}
