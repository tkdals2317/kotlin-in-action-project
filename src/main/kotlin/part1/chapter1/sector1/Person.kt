package part1.chapter1.sector1

data class Person(val name: String, // '데이터' 클래스
                  val age: Int? = null) // 널이 될 수 있는 타입(Int?)과 파라미터 디폴트 값

fun main() { // 최상위 함수
    val persons = listOf(
        Person("영희"),
        Person("철수", age = 29) // 이름 붙인 파라미터
    )

    val oldest = persons.maxBy { it.age ?: 0 } // 람다 식과 엘비스 연산자

    println("나이가 가장 많은 사람 : $oldest") // 문자열 템플릿, 출력 시 toString 자동 생성
}
