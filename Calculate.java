public class Calculate
{

		public static int square(int base)
		{
			int sq = base * base;
			return sq;
		}
		public static int cube(int base)
		{
			int cu = base * base * base;
			return cu;
		}
		public static double average(double first, double second) //double average method
		{
			double av = (first + second)/2.0;
			return av;
		}
		public static double average(double first, double second, double third) //triple average method
		{
			double avr = (first + second + third)/3.0;
			return avr;
		}
		public static double toDegrees(double radian)
		{
			double degree = radian * 180 / 3.14159;
			return degree;
		}
		public static double toRadians(double degree)
		{
			double radian = degree * 3.14159 / 180;
			return radian;
		}
		public static double discriminant(double a, double b, double c)
		{
			double descrim = b * b - 4 * a * c;
			return descrim;
		}
		public static String toImproperFrac(int lar, int num, int den)
		{
			int frac = lar * den + num;
			return frac + "/" + den;
		}
		public static String toMixedNum(int num, int den)
		{
			int lar = num / den;
			int imp = num % den;
			return lar + "_" + imp + "/" + den;
		}
		public static String foil(int fir, int sec, int thi, int fou, String x)
		{
			int a = fir * thi;
			int b = fir * fou + thi * sec;
			int c = sec * fou;
			return a + x + "^2 + " + b + x + " + " + c;
		}
		public static boolean isDivisibleBy(int num, int div)
		{
			if (div == 0)
			{
				throw new IllegalArgumentException("The divisor can't be zero!!!!");
			}
			else
			{
				boolean out = false;
				if (num % div == 0)
				{	
					out = true;
				}
				return out;
			}
		}
		public static double absValue(double num)
		{
			if (num < 0)
				num = num * (-1);
			return num;
		}
		public static double max(double num1, double num2)
		{
			double max = num1;
			if (max < num2)
				max = num2;
			return max;
		}
		public static double max(double num1, double num2, double num3)
		{
			double max = num1;
			if (max < num2)
				max = num2;
			if (max < num3)
				max = num3;
			return max;
		}
		public static int min(int num1, int num2)
		{
			int min = num1;
			if (min > num2)
				min = num2;
			return min;
		}
		public static double round2(double star)
		{ //10.543  //second example:10.649
			int neg = 1;
			if (star < 0)
			{
				neg = -1;
			}
			star *= neg;
			double fin = (int)(star * 1000); //10543  //10649
			fin = (int)fin % 10; //3  //9
			if (fin >= 5)
				fin = (int)(star * 100 + 1); //none  //1065.9
			else
				fin = (int)(star * 100); //1054.3  //none
			fin = fin / 100 * neg; //10.54  //10.65
			return fin; //10.54  //10.65
		}
		public static double exponent(double base, int exp)
		{
			if (exp < 0)
			{
				throw new IllegalArgumentException("The exponent can't be a negative number!!!!");
			}
			else
			{	
				double fin = base;
				if (exp == 0)
				{
					if (base == 0)
					{
						throw new IllegalArgumentException("I can't do 0 to the power of 0 for some reason!");
					}
					else
					{
						fin = 1;
					}
				}
				else
				{	
					for (fin = base; exp > 1; exp--)
					{
						fin *= base;
					}
				}	
				return fin;
			}
		}
		public static int factorial(int n)
		{
			if (n < 0)
			{
				throw new IllegalArgumentException("Can't be a negative number!!!!");
			}
			else
			{
				int fin = 1;
				for (fin = 1; n > 1; n--)
				{
					fin *= n;
				}
				return fin;
			}
		}
		public static boolean isPrime(int pri)
		{
			int n = pri - 1; //n is dividing and pri is base
			boolean fin = true; //fin is boolean and decides if it is prime
			while (n > 1) //as long as n isn't one and not pri it will find if it's prime
				if (isDivisibleBy(pri, n) == true) //if the code is able to divide something pri is not prime
				{
					fin = false; //changed pri to false (not prime)
					n = 0; //stop the cycle
				}
				else 
				{
					n -= 1; //else repeat with the next number to see if it is divisable
				}
			return fin; //return if it is prime or not
		}
		public static int gcf(int fir, int sec)
		{
			int n = (min(fir, sec));
			while (n > 0)
			{
				if ((sec % n == 0) && (fir % n == 0))
				{		
					return n;
				}
				n --;
			}
			return 1;
		}
		public static double sqrt(double S)
		{
			if (S < 0)
			{
				throw new IllegalArgumentException("Can't be a negative number!!!!");
			}
			else
			{	
				double x = S / 2;
				while (absValue(x * x - S) >= 0.0005 )
				{
					x = (x + S / x) / 2;
				}
				return round2(x);
			}
		}
		public static String quadForm(double a, double b, double c)
		{
			String fin = "";
			double end1 = 0;
			double end2 = 0;
			double root = discriminant(a, b, c);
			if (root < 0)
			{
				return ("no real roots");
			}
			else if (root == 0)
			{
				end1 = ((-1) * (b)) / (2 * a);
				end1 = round2(end1);
				fin = end1 + "";
				return fin;
			}
			else
			{
				end1 = ((-1) * (b) + sqrt(root)) / (2 * a);
				end1 = round2(end1);
				end2 = ((-1) * (b) - sqrt(root)) / (2 * a);
				end2 = round2(end2);
				if (end2 < end1)
				{
					fin = end2 + " and " + end1;
				}
				else
				{
					fin = end1 + " and " + end2;
				}
				return fin;
			}
		}
}


//public class CalculateLibrary {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	}

//}
