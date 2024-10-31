public class Main {
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n*factorial(n-1);
	}
	public static int sumFactorial(int n) {
		if(n==0) {
			return 1;
		}
		return n+sumFactorial(n-1);
	}
	public static int digitTotal(int n) {
		int digit = n%10;
		if(n==0) {
			return 1;
		}
		return 1+digitTotal(n-1);
	}
	public static int division(int a,int b) {
		if(b==0) {
			return 0;
		}
		return 1+division(a,b-a);
	}
    public static int remainder(int a, int b) {
        if (b < a) {
            return b; 
        }
        return remainder(a, b - a);
    }
    public static boolean isMultiple(int x, int y) {
        if (y == 0 || x < 0 ) {
            return false; 
        }
        if (x == 0) {
            return true; 
        }
        return isMultiple(x-y, y);
    }
    public static boolean isPrime(int number, int divisor) {
        if (number < 2 || number % divisor == 0) {
            return false; 
        }
        if (divisor * divisor > number) {
            return true;
        }
        return isPrime(number, divisor + 1);
    }
    public static boolean allEvenOrOdd(int n,int countE , int countO) {
    	int digit=n%10;
    	if (n == 0) {
        	return (countE ==0 && countO > 0)|| (countO == 0 && countE >0);
    	}
    	if (digit%2==0){
    		return allEvenOrOdd(n/10,countE+1,countO);
    	}else {
    		return allEvenOrOdd(n/10,countE,countO+1);
    	}
    	
    }
	
	public static void main(String[] args) {
		System.out.print(allEvenOrOdd(40021002, 0, 0));
	}
	
	
	
}
