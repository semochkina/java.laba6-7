/**
 * Функция вида F = A * X * X + B
 */
public class FunctionSquare implements Function {
    private double argumentA;
    private double argumentB;

    /**
     * Конструктор класса
     *
     * @param argumentA - аргумент A
     * @param argumentB - аргумент B
     */
    public FunctionSquare(double argumentA, double argumentB) {
        this.argumentA = argumentA;
        this.argumentB = argumentB;
    }

    @Override
    public double fun(double x) {
        return argumentA * x * x + argumentB;
    }
}
