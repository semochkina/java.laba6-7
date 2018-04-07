/**
 * Функционал определенный интеграл на отрезке [a; b]
 */
public class FunctionalIntegral implements Functional {
    /** начало отрезка */
    private double segmentBegin;
    /** конец отрезка */
    private double segmentEnd;

    public FunctionalIntegral(double segmentBegin, double segmentEnd) {
        this.segmentBegin = segmentBegin;
        this.segmentEnd = segmentEnd;
        if (segmentBegin >= segmentEnd) {
            throw new RuntimeException("Начало отрезка должно быть меньше конца отрезка");
        }
    }

    @Override
    public double calculate(Function function) {
        return function.fun(segmentBegin) + function.fun(segmentEnd) + function.fun((segmentBegin + segmentEnd) / 2.);
    }

    @Override
    public double definiteIntegral(Function function) {
        double result = 0.;
        // производим интегрирование методом прямоугольников
        double dx = 0.000001;
        double x = segmentBegin;
        do {
            double valueFun = function.fun(x);
            if (valueFun == Double.NaN) {
                // определения функции не содержится в данной точке
                throw new RuntimeException("For x=" + x + " " + function.getClass() + " return NaN");
            }
            result += valueFun * dx;
            x += dx;
        } while (x < segmentEnd);
        return result;
    }
}
