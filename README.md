## 1️⃣ 프로젝트 설명
## 2️⃣ 구현한 기능
## 3️⃣ 클래스/메서드 설명
## 4️⃣ 기술 스택
## 5️⃣ 사용 방법
<br><br>


## 1️⃣ 프로젝트 설명
-  0 이상의 정수끼리의 사칙연산, 예외 검사, 결과값 저장 및 삭제 기능을 제공하는 계산기
<br>

## 2️⃣ 구현한 기능
- 원하는 작업 선택 기능(연산, 히스토리 확인, 히스토리 삭제, 계산기 종료
  - 정해진 숫자 이외의 문자 입력 시 에러메세지 출력
<br>

- 0 이상의 정수 2개와 연산자를 입력받아서, 해당 연산을 진행
  - 0 미만의 정수 입력 시 에러 메세지 출력
  - 정수가 아닌 실수 입력 시 예외 발생, 에러 메세지 출력
  - 정수가 아닌 문자 입력 시 예외 발생, 에러 메세지 출력
  - 정해진 연산자가 아닌 다른 문자 입력 시 에러 메세지 출력
  - 나누기 0 입력시 예외 발생, 에러 메세지 출력
<br>

- 연산 결과 기록, 출력, 삭제
  - 연산 완료 시 List 콜렉션에 연산 식, 결과 저장
  - 요청 시 현재 저장되어 있는 모든 목록 출력
  - 요청 시 가장 먼저 저장된 연산 결과 삭제
<br>

- 계산기 종료
<br><br>

## 3️⃣ 클래스, 메서드 설명
- MainApp 클래스
    - 역할 : 실제 사용자가 보게 될 클래스. 계산기 생성 및 시작 기능 사용
<br>

- Calculator 클래스
  - 역할 : '계산기'의 역할을 하는 클래스.
    - 필드값 
      - 연산 기능을 수행할 OperationManager 클래스
      - 예외 처리를 담당하는 Catcher 클래스
      - 연산 기록 관리를 담당하는 HistoryManager 클래스
      - 사용자의 응답을 받는 Scanner 클래스
    - 메서드
      - start 메서드 : 계산기 시작. 원하는 작업 입력받는 메서드
      - operating 메서드 : 연산 진행하는 메서드.
        1) 정수 - 연산자 - 정수 를 차례로 입력받는다
        2) 입력받은 연산자에 따라 알맞은 OperationManager를 생성한다.
        3) 올바른 값을 입력하면 연산을 진행하고, 연산 결과를 save 메서드에 전달한다.
        4) 연산 결과를 출력해서 보여준다.
        5) 연산 과정에서 예외 발생 시 try&catch문을 통해 send 메서드에 전달한다.
      - send 메서드
        1) 계산기 사용 중 발생한 예외를 Catcher 클래스의 exCatchk메서드에게 전달.
      - save 메서드
        1) 전달받은 문자열(연산 결과)를 HistoryManager 클래스의 setList 메서드에게 전달.
      - delete 메서드
        1) HistoryManager 클래스의 delete 메서드 호출
        2) 메서드 실행 완료 이후 기록 삭제 메세지 출력
      - getList 메서드
        1) HistoryManager 클래스의 getList 메서드 호출
<br>

- OperationManager 클래스
  - 역할 : 계산기에서 '연산'을 담당하는 추상클래스
    - 특정 연산이 필요할 때 동적으로 해당 객체를 호출/할당하는 방식으로 다형성 실현
  - 메서드 : int값 2개를 입력받고 double 타입으로 반환하는 calculate 추상 메서드
<br>

- Add, Sub, Multiply, Divide 클래스
  - 역할 : OperationManager 클래스를 상속받아 calculate 메서드를 구현하는, 각 연산에 필요한 객체 클래스
  - 메서드
    - int 값 2개를 입력받아서 각각 덧셈, 뺄셈, 곱셈, 나눗셈 연산을 진행하는 calculate 메서드 구현
<br>

- Catcher 클래스
  - 역할 : 계산기 실행 과정에서 발생하는 예외를 처리하는 예외처리 담당 클래스
  - 메서드 : 예외를 넘겨받아서 처리하는 exCatch 메서드
    - 숫자를 0으로 나누려고 시도할때 발생하는 ArithmeticException 예외 처리
    - 숫자 대신 문자 타입을 입력하려고 할 때 발생하는 InputMismatchException 예외 처리
    - int값 대신 double값을 입력하려고 할 때 발생하는 NumberFormatException 예외 처리
    - 다른 예외가 발생할 경우 예외 메세지를 확인하기 위한 에러메세지 출력
<br>

- HistoryManager 클래스
  - 역할 : 연산 과정 진행 후 결과를 저장/출력/삭제하는 기록 저장 클래스
  - 필드값 : 문자열을 담아둘, 동적으로 길이 확장이 가능한 ArrayList 클래스
  - 메서드
    - 문자열을 입력받아서 ArrayList에 추가하는 setList 메서드
    - ArrayList에 담겨진 문자열들을 한 줄에 하나씩 출력하는 getList 메서드
    - ArrayList의 첫 번째 값을 삭제하는 delete메서드
<br><br>     

## 4️⃣기술 스택
- Language: Java
- IDE: IntelliJ IDEA
- Framework: Java Collections Framework
<br><br>

## 5️⃣ 사용 방법
### - 
