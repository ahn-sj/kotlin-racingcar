package racingcar.domain

class Car(
    val name: CarName,
    var distance: Int = 0,
) {
    fun move() {
        distance++
    }

    fun isMovable(number: Int): Boolean {
        return number >= MOVE_CONDITION
    }

    fun isMaxDistance(max: Int): Boolean {
        return distance == max
    }

    fun getCarNameValue(): String {
        return name.value
    }

    companion object {
        private const val MOVE_CONDITION = 4
    }
}
