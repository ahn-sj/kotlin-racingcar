package racingcar

class Cars(val cars: List<Car>) {
    fun move(numberGenerator: NumberGenerator) {
        cars.filter { it.isMovable(numberGenerator.generate()) }
            .forEach(Car::move)
    }

    fun print(displaySymbol: String) {
        cars.forEach { println("${it.name} : ${displaySymbol.repeat(it.distance)}") }
        println()
    }

    fun getWinners(): List<Car> {
        return cars.filter { it -> it.isMaxDistance(cars.maxOf { it.distance }) }
    }

    companion object {
        private const val CAR_NAME_DELIMITER = ","

        fun joined(carNames: String): Cars {
            return Cars(carNames.split(CAR_NAME_DELIMITER).map { Car(it) })
        }
    }
}
