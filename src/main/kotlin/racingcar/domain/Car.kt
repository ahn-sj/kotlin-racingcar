package racingcar.domain

class Car(
    val name: String,
    var distance: Int = 0,
) {
    init {
        require(name.length <= MAX_NAME_LENGTH) { "자동차 이름은 5자 이하만 가능합니다. input = $name" }
    }

    fun move() {
        distance++
    }

    fun isMovable(number: Int): Boolean {
        return number >= MOVE_CONDITION
    }

    fun isMaxDistance(max: Int): Boolean {
        return distance == max
    }

    companion object {
        private const val MAX_NAME_LENGTH = 5
        private const val MOVE_CONDITION = 4
    }
}
