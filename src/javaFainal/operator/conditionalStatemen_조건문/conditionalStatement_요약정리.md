# Java 기초 - 조건문 & 연산자 패키지 요약 정리

---

## 1. MathBasic (수학 기본 연산)

### 산술 연산자

| 연산자 | 의미   | 예시         | 결과 |
|--------|--------|--------------|------|
| `+`    | 덧셈   | `15 + 3`     | 18   |
| `-`    | 뺄셈   | `15 - 3`     | 12   |
| `*`    | 곱셈   | `15 * 3`     | 45   |
| `/`    | 나누기 | `15 / 3`     | 5    |
| `%`    | 나머지 | `15 % 3`     | 0    |

### Math 클래스

```java
Math.max(10, 30);   // 최대값 -> 30
Math.min(10, 30);   // 최소값 -> 10
Math.abs(-30);      // 절대값 -> 30
```

---

## 2. Key (키보드 입력)

- `Scanner` 클래스를 사용하여 사용자 입력을 받음

```java
Scanner scanner = new Scanner(System.in);
int i = scanner.nextInt();       // 정수 입력
Long l = scanner.nextLong();     // long 입력
String s = scanner.next();       // 문자열 입력
```

---

## 3. StringToNumber (문자열-숫자 변환)

### 문자열 -> 숫자

```java
int i = Integer.parseInt("100");    // String -> int
long l = Long.parseLong("100");     // String -> long
```

### 숫자 -> 문자열

```java
String str = String.valueOf(100);   // int -> String
```

---

## 4. Random (무작위 수)

```java
Random random = new Random();
int ran = random.nextInt(4) + 5;   // 5 ~ 8 범위의 난수
```

> **공식** : `random.nextInt(범위) + 시작값`
> - `nextInt(4)` -> 0~3 생성, `+5` -> 5~8

---

## 5. if문 (조건문)

```java
int i = 4;

if (i < 3) {
    System.out.println("True");      // 조건이 참일 때
} else if (i > 5) {
    System.out.println("false");     // 중간 조건 추가
} else {
    System.out.println("...");       // 모두 해당하지 않을 때
}
```

- `if` : 첫 번째 조건
- `else if` : 추가 조건 (여러 개 가능)
- `else` : 위 조건 모두 불만족 시 실행

---

## 6. LogicalOperator (논리 연산자)

| 연산자 | 의미  | 설명                         |
|--------|-------|------------------------------|
| `&&`   | AND   | 두 조건 **모두 참**이면 참   |
| `\|\|` | OR    | 두 조건 중 **하나라도 참**이면 참 |

```java
if (isOverWatch && isTalon) { ... }   // 둘 다 true여야 실행
if (isOverWatch || isTalon) { ... }   // 하나만 true여도 실행
```

---

## 7. NegationOperator (부정 연산자)

- `!` : 값을 반전 (참 -> 거짓, 거짓 -> 참)

```java
if (!isOverWatch) { ... }   // isOverWatch가 false일 때 실행
```

---

## 8. TernaryOperator (삼항 연산자)

- `조건 ? 참일때 값 : 거짓일때 값`
- if-else를 한 줄로 축약

```java
// 삼항 연산자
str = isOverWatch ? "옵치 했다" : "옵치 안 했다";

// 위와 동일한 if문
if (isOverWatch) {
    str = "옵치 했다";
} else {
    str = "옵치 안했다";
}
```

---

## 9. Switch (스위치문)

- 하나의 변수 값에 따라 **여러 분기** 처리
- 각 `case` 끝에 `break` 필수 (없으면 아래 case도 실행됨)
- `default` : 어떤 case에도 해당하지 않을 때

```java
switch (str) {
    case "옵치 했다":
        System.out.println("O");
        break;                      // break 필수!
    case "옵치 안했다":
        System.out.println("X");
        break;
    default:
        System.out.println("?");    // 둘 다 아닐 때
}
```
