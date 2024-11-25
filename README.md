# Java Chat Program
#### 간단한 파일 통신에서 다중 사용자 채팅 프로그램까지 구현한 프로젝트
이 프로젝트는 Java 기반으로 TCP 소켓 통신을 활용하여 네트워크 프로그램을 구현하는 과정을 단계적으로 구성했습니다. 초기 PC-to-PC 통신에서 시작하여 양방향 대화와 다중 사용자 채팅 프로그램으로 확장했습니다.

---

## 단계별 설명
### 1단계: PC-to-PC Connection (step1)

**설명**: 단일 클라이언트와 서버 간의 파일 전송 시스템.

**구성 요소**:

`MyServer.java`: 클라이언트로부터 파일 이름을 받아 내용을 반환.

`MyClient.java`: 서버에 파일 이름을 전송하고 내용을 출력.

---

### 2단계: One-Way Server-to-Client (step2)

**설명**: 서버에서 클라이언트로 데이터를 일방적으로 전송.

**구성 요소**:

`MyServer2.java`: 클라이언트와 연결 후 메시지를 전송하는 단방향 서버.

`MyClient2.java`: 서버로부터 데이터를 수신하고 출력.

---

### 3단계: Two-Way Communication (step3)

**설명**: 클라이언트와 서버 간 1회 양방향 데이터 송수신.

**구성 요소**:

`MyServer3.java`: 클라이언트로부터 데이터를 받고 응답을 전송.

`MyClient3.java`: 서버에 데이터를 전송하고 응답을 출력.

---

### 4단계: Chatting (step4)

**설명**: 양방향 실시간 채팅 시스템.

**구성 요소**:

`MyServer4.java`: 채팅 서버.

`MyClient4.java`: 채팅 클라이언트.

---

### 5단계: Multi-Client Chatting (step4)

**설명**: 여러 클라이언트가 참여할 수 있는 실시간 채팅 시스템.

**주요 기능**:

여러 클라이언트가 서버에 동시에 접속 가능.

새로운 사용자의 입장/퇴장 알림 메시지 브로드캐스트.

GUI 기반 채팅 인터페이스 제공(Swing 사용).

**구성 요소**:

`ChatServer.java`: 멀티스레드 기반의 채팅 서버.

`ChatClient.java`: GUI 기반 채팅 클라이언트.


---

## 기술 스택

**언어**: Java 1.8

**네트워크 통신**: TCP 소켓

**GUI**: Java Swing

**멀티스레드**: 사용자별 Thread 처리


---

## 프로젝트 구조

**src/**

├── **step1/**                 # PC-to-PC 통신

│   ├── `MyServer.java`      # 파일 통신 서버

│   ├── `MyClient.java`      # 파일 통신 클라이언트

├── **step2/**                 # 단방향 서버-클라이언트 통신

│   ├── `MyServer2.java`    # 단방향 서버

│   ├── `MyClient2.java`    # 데이터 수신 클라이언트

├── **step3/**                 # 양방향 통신(1회)

│   ├── `MyServer3.java`    # 양방향 통신 서버

│   ├── `MyClient3.java`    # 양방향 통신 클라이언트

├── **step4/**                 # 실시간 양방향 통신

│   ├── `TalkServer.java`    # 양방향 통신 서버

│   ├── `TalkClient.java`    # 양방향 통신 클라이언트

├── **chat/**                 # 다중 사용자 채팅 구현

│   ├── `ChatServer.java`    # 다중 사용자 채팅 서버

│   ├── `ChatClient.java`    # 다중 사용자 채팅 클라이언트

└── `README.md`              # 프로젝트 문서

