package racingcar.view

import racingcar.view.DisplayConstant.Companion.MOVE_DISTANCE_SYMBOL

class Cars(
    private val cars: List<Car>,
    private val movementHandler: MovementHandler,
) {
    fun move() {
        cars.forEach { car ->
            if (movementHandler.isMovable()) {
                car.move()
            }
        }
    }

    fun print() {
        cars.forEach { car -> println(MOVE_DISTANCE_SYMBOL.repeat(car.distance)) }
        println()
    }
}
