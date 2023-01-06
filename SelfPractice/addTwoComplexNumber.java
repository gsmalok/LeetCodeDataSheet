package SelfPractice;

// import javax.naming.spi.DirStateFactory.Result;

public class addTwoComplexNumber {
    
    int real , image;

    public  addTwoComplexNumber(int r, int i) {
        this.real = r;
        this.image = i;
    }

    //  function to print real number 

    public  void printRealNumber() {
        System.out.println(this.real + " i" + this.image);
    }

    // function for add 

    public static addTwoComplexNumber add(addTwoComplexNumber n1, addTwoComplexNumber n2 ) {
        addTwoComplexNumber result = new addTwoComplexNumber(0,0);
        
        // adding real part both real number 
        result.real = n1.real + n2.real;

        // adding image part both image number 

        result.image = n1.image + n2.image;



        return result;
    }

public static void main(String[] args) {
    
    // creating two complex numbers
		addTwoComplexNumber c1 = new addTwoComplexNumber(9, 5);
		addTwoComplexNumber c2 = new addTwoComplexNumber(10, 5);

		// printing complex numbers

		addTwoComplexNumber res = add(c1, c2);

		// displaying addition
		// System.out.println("\nAddition is :");
		res.printRealNumber();

}
    }
