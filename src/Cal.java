public class Cal {

    private final double num1;
    private final double num2;

    public Cal(final double num1, final double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
<<<<<<< Updated upstream
        return this.num1 + this.num2; // TODO: add code
=======
        return this.num1 + this.num2;
>>>>>>> Stashed changes
    }


    public double multiply() {
        return 0.0; // TODO: add code
    }

    public double diff() {
        return 0.0; // TODO: add code
    }

<<<<<<< Updated upstream
    public Object notNull(final Object input) {
        if (input == null) {
            throw new IllegalArgumentException("Bad Args");
        }
=======
    public Object notNull(final Object input)
    {
        if(input == null)
            throw new IllegalArgumentException("Bad Args");
>>>>>>> Stashed changes
        return input;
    }
}


