package calculator

import java.util.function.BiFunction

enum class Operator(val operation: BiFunction<Double, Double, Double>) {
    ADD(BiFunction { left, right -> left + right }),
    SUBTRACT(BiFunction { left, right -> left - right }),
    MULTIPLY(BiFunction { left, right -> left * right }),
    DIVIDE(BiFunction { left, right -> left / right }), ;

    fun apply(
        left: Double,
        right: Double,
    ): Double {
        return operation.apply(left, right)
    }
}
