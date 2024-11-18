package racingcar

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import racingcar.domain.Winners

class WinnersTest : StringSpec({

    "우승자는 반드시 1명 이상이어야 한다" {
        // given
        val winners = Winners(listOf("pobi"))

        // when & then
        winners.winners.size shouldBe 1
    }

    "우승자가 1명도 없으면 예외가 발생한다" {
        // when & then
        shouldThrow<IllegalArgumentException> {
            Winners(listOf())
        }
    }
})
