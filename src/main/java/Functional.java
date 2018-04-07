/**
 * Интерфейс функционала
 */
public interface Functional {
    /**
     * @param function - аргумент функционала (функция, имеющая метод fun())
     * @return - сумма значений функции на концах отрезка и в его середине
     */
    double calculate(Function function);

    /**
     * @param function - аргумент функционала (функция, имеющая метод fun())
     * @return - определенный интеграл на отрезке [a; b]
     */
    double definiteIntegral(Function function);
}
