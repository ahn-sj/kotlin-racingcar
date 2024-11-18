package racingcar.view.v2

import racingcar.domain.Winners

class CarNameOutputView {
    fun outputWinners(winners: Winners) {
        println(winners.winners + WINNER_MESSAGE)
    }

    companion object {
        private const val WINNER_MESSAGE = "가 최종 우승했습니다."
    }
}
