# 공부한걸 실습해보는 repository

<hr>

## 1. [Java] try-catch (feat. try-with-resource)
1. try-catch 문에서 하나의 try 에 이어서 여러개의 catch로 예외를 잡을때 예외의 순서에 주의 해야합니다.
2. 자바 8 이상의 try-catch 문에서 자원해제를 해야한다면 try-with-resource 를 사용하자
3. catch 문을 통해서 기존의 예외를 커스텀 예외로 전환해서 던져주는 경우 주의할 점
### 정리한 글 https://parkadd.tistory.com/66
<br>
<hr>

## 2. [Java] equals() 와 hashcode 는 언제 사용하고 왜 사용될까?
1. equals() 메서드와 비교연산자 "=="
2. 객체의 동일성 비교와 동등성 비교
3. hashCode 메서드
4. HashTable 에서 사용되는 hashCode와 equals 메서드
### 정리한 글 https://parkadd.tistory.com/68
<br>
<hr>

## 3. [JAVA] 커스텀 예외의 4가지 Best Practices
1. Always Provide a Benefit (항상 혜택을 제공하라)
2. Follow the Naming Convention (네이밍 컨벤션을 따라가라)
3. Provide Javadoc Comments for Your Exception Class (예외 클래스에 대한 Javadoc 주석제공)
4. Provider Constructor That Sets the Cause
### 정리한 글 https://parkadd.tistory.com/69
<br>
<hr>

## 4. [Spring] @ModelAttribute @RequestParam @RequestBody 차이
### 정리한 글 https://parkadd.tistory.com/70