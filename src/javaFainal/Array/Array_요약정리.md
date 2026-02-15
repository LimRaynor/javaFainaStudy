# Java 기초 - 배열(Array) 패키지 요약 정리

---

## 1. Array (배열)

- **배열** : 같은 타입의 변수를 여러 개 저장하는 자료구조
- 크기가 **고정**됨 (선언 시 크기 지정)
- 인덱스는 **0부터** 시작

### 선언 및 초기화

```java
// 방법 1 : 선언과 초기화 분리
int[] score;
score = new int[5];

// 방법 2 : 선언과 동시에 초기화
int[] score = new int[5];   // 5개의 int를 담는 배열
```

### 사용법

```java
score[0] = 10;                  // 0번째에 값 입력
System.out.println(score[0]);   // 0번째 값 호출 -> 10
int count = score.length;       // 배열 길이 -> 5
```

---

## 2. ArrayInitialization (배열 초기화)

- 선언과 동시에 **값을 직접 넣어** 초기화 가능

```java
int[] score = {10, 20, 30, 40, 50};   // 값을 직접 지정
```

### 마지막 요소 접근

```java
score[4]                    // 직접 인덱스 지정
score[score.length - 1]     // 배열 길이를 이용 (더 유연함)
```

> `score.length - 1` : 배열의 마지막 인덱스를 구하는 공식

---

## 3. ArrayList (리스트 배열)

- **ArrayList** : 크기가 **동적으로 변하는** 배열
- `import java.util.ArrayList;` 필요
- 일반 배열과 달리 **추가/삭제가 자유로움**

```java
ArrayList<Integer> scoreList = new ArrayList<>();
scoreList.add(10);          // 값 추가
scoreList.add(20);
scoreList.add(30);
```

### 주요 메서드

| 메서드                   | 설명                          |
|--------------------------|-------------------------------|
| `add(값)`                | 맨 뒤에 값 추가              |
| `add(인덱스, 값)`        | 특정 위치에 값 삽입           |
| `remove(인덱스)`         | 특정 위치의 값 삭제           |

```java
scoreList.add(2, 200);    // 2번 인덱스에 200 삽입
scoreList.remove(2);      // 2번 인덱스 값 삭제
```

> **배열 vs ArrayList** : 크기가 고정이면 배열, 동적으로 변하면 ArrayList

---

## 4. NullPointerException (빈칸 참조)

- **null** : 비어있다는 의미 (값이 없음)
- **NullPointerException** : `null`인 변수에서 메서드를 호출하려 할 때 발생하는 에러

```java
String[] names = new String[2];        // 선언만 하고 값을 넣지 않음
System.out.println(names[0].length()); // NullPointerException 발생!
```

> `names[0]`은 `null` 상태인데 `.length()`를 호출했기 때문에 에러 발생

---

## 배열 비교 요약

| 구분        | 일반 배열 (`[]`)           | ArrayList                    |
|-------------|----------------------------|------------------------------|
| 크기        | **고정** (변경 불가)       | **동적** (자동 조절)         |
| 선언        | `int[] arr = new int[5];`  | `ArrayList<Integer> list = new ArrayList<>();` |
| 값 추가     | `arr[0] = 10;`             | `list.add(10);`              |
| 중간 삽입   | 불가                       | `list.add(인덱스, 값);`      |
| 중간 삭제   | 불가                       | `list.remove(인덱스);`       |
| 타입        | 기본형 사용 가능 (`int`)   | 래퍼 클래스 필요 (`Integer`) |
