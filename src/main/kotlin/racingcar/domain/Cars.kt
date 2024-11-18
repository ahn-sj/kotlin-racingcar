package racingcar.domain

class Cars(val cars: List<Car>) {
    fun move(numberGenerator: NumberGenerator) {
        cars.filter { it.isMovable(numberGenerator.generate()) }
            .forEach(Car::move)
    }

    fun print(displaySymbol: String) {
        cars.forEach { println("${it.name} : ${displaySymbol.repeat(it.distance)}") }
        println()
    }

    fun getWinners(): Winners {
        return Winners.from(cars.filter { it -> it.isMaxDistance(cars.maxOf { it.distance }) })
    }

    companion object {
        fun joined(carNames: CarNames): Cars {
            return Cars(carNames.names.map { Car(it) })
        }
    }
}
