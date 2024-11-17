# kotlin-racingcar

### TODO
- private val로 선언하고 필요에 따라 getter를 사용하는 방법으로 하는게 권장되는게 맞는지 알아보기
  - 공식 문서에 있으려나..?

---

## 3단계

### 셀프 피드백

- if로 validate를 하기보다 코틀린 표준 라이브러리를 사용하기
  - require, checkNotNull 등
- 람다 인자에 사용되는 방법이 여러가지 알아보고 어느때 사용해야 하는지 정리하기
  - 메서드 레퍼런스 사용 (::)
  - 암시적 변수 사용 (it)
  - 명시적 변수 사용 (car -> car.move())
- 특정 횟수만큼 단순 반복일때 for-loop보다 repeat 함수 사용하기 (코틀린 표준 라이브러리)
  - inline 함수가 무엇인지 알아보기
  - https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/repeat.html
```kotlin
@kotlin.internal.InlineOnly
public inline fun repeat(times: Int, action: (Int) -> Unit) {
    contract { callsInPlace(action) }

    for (index in 0 until times) {
        action(index)
    }
}
```


### 피드백

- 2단계의 Expression은 의미를 가지는 객체로 분리
  - Calculator에서의 Expression은 충분한 의미를 가지는 개념이기 때문에 ok ! [피드백](https://github.com/next-step/kotlin-racingcar/pull/1653#discussion_r1844950653)
- 상수 또는 변수의 이름으로 조금 더 의미를 부여하도록 변경
  - as-is: WHITE_SPACE
  - to-be: TOKEN_DELIMITER
- for-loop를 내재화 시켜보기
  - 



### 요구 사항 분석

- 주어진 횟수동안 N개의 자동차는 전진 또는 멈출 수 있다.
- 사용자는 N대의 자동차를 M번 이동할 것인지 입력 가능하다.
- 0~9 사이의 무작위 값을 구해서 4~9이면 전진하고, 0~3은 멈춘다.
- 매 횟수마다 상태를 출력한다.
- 모든 로직에 단위테스트를 구현한다. 단, UI(System.in, System.out)는 제외한다.
- 핵심 로직을 담당하는 코드와 UI를 담당하는 코드를 구분한다



## 2단계

### 피드백

- class로 선언하는 것과 object로 선언하는 것의 차이
  - class는 다중 인스턴스 생성이 가능한 반면, object는 싱글톤으로 생성됨
    - *상태를 가지지 않는다는 의미는 아직 잘 이해하지 못함
    - *object에 fun이 class.method의 형태로 호출해서 static 메서드인줄 알았는데 그렇지 않음
  - 
- companion object
  - 클래스 정의와 동시에 객체를 생성
- 구체적인 자료형 (Name, Money 등)
- !! 연산자 사용을 지양
  - requireNotNull, checkNotNull