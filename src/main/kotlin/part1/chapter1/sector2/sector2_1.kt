package part1.chapter1.sector2

class sector2_1 {
    // 리스트 2.1 코틀린 'Hello, World!'
    fun main(args : Array<String>) {
        println("Hello, world!")
    }

    // 함수 구조
    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    // 식이 본문인 함수
    fun maxV2(a: Int, b: Int): Int = if (a > b) a else b

    // 식이 본문인 함수는 반환 타입 생략이 가능하다
    fun maxV3(a: Int, b: Int) = if (a > b) a else b

    // 변수 타입 생략
    val question = "삶, 우주 , 그리고 모든 것에 대한 궁극적인 질문"
    val answer1 = 42

    // 변수 타입 명시
    val answer2: Int = 42

    // 부동 소수점의 변수 타입 : Double
    val yearToCompute = 7.5e6

    // 초기화 식을 사용하지 않고 변수를 선언하려면 변수 타입을 반드시 명시
    fun answerFun() {
        val answer3: Int
        answer3 = 42
    }

    // 어떤 블록이 실행될 때 오직 한 초기화 문장만 실행됨을 컴파일러가 확인할 수 있다면 조건에 따라 val 값을 다른 여러 값으로 초기화 할 수 있다.
    fun messageFun() {
        val message: String
        if (canPerformOperation()) {
            message = "Success"
            // ... 연산을 수행한다.
        } else {
            message = "Failed"
        }
    }

    fun canPerformOperation(): Boolean {
        return false
    }


    // val 참조 자체는 불변일지라도 그 참조가 가리키는 객체의 내부 값은 변경될 수 있다는 사실을 기억하자
    fun languagesFun() {
        val languages = arrayListOf("Java")
        languages.add("Kotlin")
    }

    fun varTest() {
        var answer = 42
        //answer = "no answer" // "Error: type mismatch" 컴파일 오류 발생
    }

    // 리스트 2.2 문자열 템플릿 사용
    fun mainV2(args : Array<String>) {
        val name = if (args.size > 0) args[0] else "Kotlin"
        println("Hello, $name!") // Bob을 인자로 넘기면 "Hello, Bob!"을 출력하고 아무 인자도 없으면 "Hello, Kotlin!"을 출력한다.
    }

    // 복잡한 식도 중괄호({})로 둘러싸서 문자열 템플릿 안에 넣을 수 있다.
    fun mainV3(args : Array<String>) {
        if (args.size > 0)
            println("Hello, ${args[0]}!")
    }

    // 중괄호로 둘러싼 식 안에서 큰 따옴표를 사용할 수 도 있다.
    fun mainV4(args : Array<String>) {
        println("Hello, ${if (args.size > 0) args[0] else "someone"}!")
    }

}