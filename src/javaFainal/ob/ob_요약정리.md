# Java 기초 - 객체(OB) 패키지 요약 정리

---

## 1. Class (클래스)

- **클래스** : 객체를 만들기 위한 설계도 (틀)
- 필드(변수)와 메서드(기능)를 묶어서 정의

```java
class Person {
    private String name;   // 필드 (멤버 변수)
    private int age;
}
```

- `private` : 외부에서 직접 접근 불가 (캡슐화)

---

## 2. Constructor (생성자)

- **생성자** : 객체가 생성될 때 자동으로 호출되는 특수 메서드
- 클래스 이름과 동일한 이름을 가짐
- 객체 초기화에 사용

```java
class Person {
    String name;
    int age;

    // 생성자
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

---

## 3. static (정적)

- `static` : 프로그램 실행 시 **처음부터 메모리에 로드**되는 부분
- `static` 메서드는 객체 생성 없이 바로 호출 가능
- `main` 메서드도 `static`이므로 같은 클래스의 `static` 메서드를 바로 호출 가능

```java
public static int add(int x, int y) {
    return x + y;
}

// main에서 바로 호출 가능
System.out.println(add(50, 10));   // 60
```

> 메인 메서드가 길어지면 **메서드를 분리**하여 코드 정리하는 것이 좋음

---

## 4. Overload (오버로드)

- **오버로딩** : 같은 이름의 메서드를 **파라미터를 다르게** 하여 여러 개 정의
- 매개변수의 **개수** 또는 **타입**이 달라야 함

```java
// 매개변수 2개
public static int add(int x, int y) {
    return x + y;
}

// 매개변수 3개 (오버로딩)
public static int add(int x, int y, int z) {
    return x + y + z;
}

// 가변 인자 (0개 이상의 매개변수)
public static int add(int... numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
        sum = sum + numbers[i];
    }
    return sum;
}
```

### 가변 인자 (`...`)

- `int... numbers` : 0개 이상의 int를 받을 수 있음
- 내부적으로 **배열(`[]`)** 형태로 처리됨
- 원하는 개수만큼 인자를 넘길 수 있어 유연함
