package racingcar.domain

class Winners(val winners: List<String>) {
    init {
        require(winners.isNotEmpty()) { "우승자는 반드시 1명 이상 존재해야 합니다." }
    }

    fun display(): String {
        return winners.joinToString(WINNERS_DELIMITER)
    }

    companion object {
        private const val WINNERS_DELIMITER = ", "

        fun from(filter: List<Car>): Winners {
            return Winners(filter.map { it.getCarNameValue() })
        }
    }
}
