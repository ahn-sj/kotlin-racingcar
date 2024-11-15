# kotlin-racingcar

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