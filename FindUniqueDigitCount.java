class FindUniqueDigitCount {
	public static void main(String[] args) {
		int num = 1234123;
		int count = 0;

        while (num != 0) {
            int rem = num % 10;
            num = num / 10; 
			//System.out.println("num :: "+ num);

            boolean flag = false;
            int temp = num;
            while (temp != 0) {
                int rem1 = temp % 10;
                if (rem1 == rem) {
                    flag = true;
					//System.out.println("rem 1 :: "+ rem1 +"........"+"rem :: "+ rem);
                    break;
                }
                temp = temp / 10;
            }

            if (!flag) {
                count++;
            }
        }

        System.out.println("Unique Count is : " + count);
		
	}
}
