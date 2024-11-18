package racingcar.domain

class CarNames(val names: List<CarName>) {
    companion object {
        private const val CAR_NAME_DELIMITER = ","

        fun from(names: String): CarNames {
            return CarNames(names.split(CAR_NAME_DELIMITER).map { CarName(it) })
        }
    }
}
