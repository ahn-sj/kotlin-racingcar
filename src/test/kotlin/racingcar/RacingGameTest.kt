package racingcar

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import racingcar.domain.CarNames
import racingcar.domain.Cars
import racingcar.domain.NumberGenerator
import racingcar.domain.RacingGame
import racingcar.domain.Round

class RacingGameTest : StringSpec({

    fun constant(value: Int): NumberGenerator {
        return object : NumberGenerator {
            override fun generate(): Int = value
        }
    }

    "RacingGame은 자동차 경주 게임을 진행한다" {
        // given
        val carNames = "pobi,crong,honux"
        val racingGame = RacingGame(Cars.joined(CarNames.from(carNames)), Round(5), constant(5))

        // when
        val playedCars = racingGame.play()

        // then
        playedCars.getWinners().winners.size shouldBe 3
    }
})
