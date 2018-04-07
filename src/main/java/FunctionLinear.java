/**
 * Линейная функция вида F = A * X + B
 */
public class FunctionLinear implements Function {
    private double argumentA;
    private double argumentB;

    /**
     * Конструктор класса
     *
     * @param argumentA - аргумент A
     * @param argumentB - аргумент B
     */
    public FunctionLinear(double argumentA, double argumentB) {
        this.argumentA = argumentA;
        this.argumentB = argumentB;
    }

    @Override
    public double fun(double x) {
        return argumentA * x + argumentB;
    }
}
