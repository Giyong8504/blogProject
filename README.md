# 블로그 프로젝트
## 1일차
- 초기 설정
- 엔티티 구성하기
    - 테이블 구조
  - | 컬럼명     | 자료형          | null | 키   | 설명        |
    |---------|--------------|------|-----|-----------|
    | id      | BIGINT       | N    | 기본키 | 일련번호, 기본키 |
    | title   | VARCHAR(255) | N    |     | 게시물의 제목   
    | content | VARCHAR(255) | N    |     | 내용        |
- 리포지터리 생성
  - BlogRepository

---
## 2일차
- 블로그 글 추가 서비스
- 컨트롤러 메서드 코드 작성
  - H2 데이터베이스 저장 테스트 
  - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/1acf40b9-de87-4f8e-b373-6827438b68ff)
  - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/6ce6f3fd-60bc-4f5a-867a-762763722f7e)
- 반복 작업을 줄여줄 BlogApiControllerTest 코드 작성 
- 블로그 글 생성 API 테스트 코드 작성

|       |내용|
|-------|-----------------------------------------------------------------------------|
| Given | 블로그 글 추가에 필요한 요청 객체를 만든다.|
| When    | 블로그 글 추가 API에 요청을 보낸다. 이때 요청타입은 JSON이며 given절에서 미리 만들어둔 객체를 요청 본문으로 함께 보낸다.|
| Then| 응답 코드가 201 Created 인지 확인. blog를 전체 조회해 크기가 1인지 확인하고 실제 저장된 데이터와 요청 값 비교|

---
## 3일차
- 글 목록 조회하기
  - 테스트 코드 작성
  - 
    |       | 내용                                                                 |
    |-------|--------------------------------------------------------------------|
    | Given | 블로그 글을 저장한다.                                                       |
    | When  | 목록 조회 API를 호출한다.                                                   |
    | Then| 응답코드가 200 OK이고, 반환받은 값 중에 0번째 요소의 content와 title이 저장된 값과 같은지 확인한다. |
 
  - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/fa40cc85-eafb-4e61-8f3b-4d48a8e36eda)

<br>

- 블로그 글 조회하는 API 구현
  
    |       | 내용                                                                 |
    |-------|--------------------------------------------------------------------|
    | Given | 블로그 글을 저장한다. |
    | When  | 저장한 블로그 글을 id 값으로 API를 호출한다. |
    | Then| 응답코드가 200 OK 이고, 반환받은 content와 title이 저장된 값과 같은지 확인한다. |
  - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/f57cb56f-6f00-47a5-adf7-f6841bf6e97d)
<br>

- 블로그 글 삭제 API 구현

    |       | 내용                                                                 |
    |-------|--------------------------------------------------------------------|
    | Given | 블로그 글을 저장한다.                                                       |
    | When  | 저장한 블로그 글을 id 값으로 삭제 API를 호출한다. |
    | Then| 응답코드가 200 OK 이고, 블로그 글 리스트를 전체 조회해 조회한 배열 크기가 0인지 확인한다. |
  - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/4107afec-6291-4f35-bd37-17dbf0afb464)
<br>

- 블로그 글 수정 API 구현
  
    |       | 내용                                                                 |
    |-------|--------------------------------------------------------------------|
    | Given | 블로그 글을 저장하고, 블로그 글 수정에 필요한 객체를 만든다. |
    | When  | UPDATE API로 수정요청을 보낸다. 이때, 요청 타입은 JSON이며, given절에서 미리 만들어둔 객체를 요청 본문으로 함께 보낸다. |
    | Then| 응답코드가 200 OK인지 확인한다. 블로그 글 id를 조회한 후에 값이 수정되었는지 확인한다. |
  - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/17a3ed0f-0fa7-4344-80b2-ff1918a7e8ad)

---
## 4일차
- 블로그 글 목록 뷰 구현하기
  - 모델에 전달한 블로그 글 리스트 개수만큼 반복
  - 부트스트랩 사용
  - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/58491839-99f9-4eb5-b7fb-7642ff32d538)
<br>

### 블로그 글 뷰 구현하기
  - 엔티티에 생성, 수정 시간 추가
  - 블로그 글 상세 연결
  - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/9720163f-610d-4b2a-8268-3f00fd329535)
<br>

### 삭제 기능 추가하기
  - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/7cb78d11-bc8c-4d1a-a018-5e6bd7dc9f23)
  - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/f446b7a9-690f-4944-a191-2771890ae0aa)
<br>

### 수정, 생성 뷰 컨트롤러
  - id가 없는 경우 기본 생성자를 이용해 빈 ArticleViewResponse 객체를 만듬.
  - id가 있는 경우 기존 값을 가져오는 findById() 메서드 호출.

### 수정 기능
  - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/b9502db3-a30f-4a3f-a976-cd182482d548)
  - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/7d3d63d3-8a5b-4851-b031-cb5be8d1c4f6)
<br>

### 등록 기능
  - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/38ed863f-0d31-46b2-9c0e-c952f374d710)
  - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/88b60970-fbfb-4d6d-8e73-6be5e56eb1f2)
  - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/672972a3-9b1d-4b49-9fa6-998385356312)

---
## 5일차

### 회원 가입 기능
- 엔티티 테이블 구조

| 컬럼명 | 자료형 | null허용 | 키 | 설명 |
|---|---|---|---|---|
| id | BIGINT | N | 기본키 | 일련번호, 기본키 |
|email|VARCHAR(255)|N|  | 이메일 |
|passaword|VARCHAR(255)|N|  |패스워드(암호화하여 저장)|
|created_at|DATETIME|N|  |생성일자|
|updated_at|DATETIME|N|  |수정일자|

<br>

- 스프링 시큐리티 설정하기
  - 회원 가입 기능
    - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/52ca0d67-6404-4073-a60a-94fefb2e508b)

  - 로그인 기능
    - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/400ea9d5-634c-428a-bd62-865a1edc40eb)
 
  - 로그인 후 article 페이지로 리다이렉트
    - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/c9a3db61-d1a8-497f-840b-0e090448cb82)

  - 로그아웃 기능
    - 로그아웃 후 login 페이지로 리다이렉트
      - ![image](https://github.com/Giyong8504/blogProject/assets/128211712/47849cdb-fe83-480f-b398-b3b61b392455)
---
## 6일차
- JWT 서비스 구현하기
  - 의존성 추가
    - jaxb-api, jjwt-api
  - 토큰 제공자 추가
    - issuer: kky5163@naver.com
    - secret_key: blog-springboot
  - 리프레시 토큰 도메인 구현
  - 토큰 필터 구현
  - 토큰 API 구현

## 7일차
- OAuth
  - google OAuth 2.0 생성 후 설정값 추가
  - OAuth2를 사용하기 위한 스타터 추가
  - 쿠키 관리 클래스 생성
  - OAuth2 서비스 구현
  - OAuth2 설정 파일 생성

## 8일차
- 인증 요청과 관련된 상태를 저장할 저장소 구현
- 인증 성공 시 실행할 핸들러 구현
- 글에 글쓴이 추가
    - 글 수정, 삭제, 글쓴이 확인 로직 추가

## OAuth2 실행
### localhost:8080/login 구글 연동화면 🔽
- ![image](https://github.com/Giyong8504/blogProject/assets/128211712/fed86111-07ea-47e6-b7cf-275ed4f4867c)
  <br>

### 액세스 토큰 🔽
- ![image](https://github.com/Giyong8504/blogProject/assets/128211712/fab8992c-86ec-4fd2-8298-920cb5c5da0f)
  <br>

### 쿠키에 리프레쉬 토큰 저장 🔽
- ![image](https://github.com/Giyong8504/blogProject/assets/128211712/b50e296d-4a0d-4e75-b99d-8b77709a38f7)
  <br>

### 글 등록 🔽
- ![image](https://github.com/Giyong8504/blogProject/assets/128211712/5da3bd60-6d71-435a-b155-94ad91859e5b)
  <br>

### 다른 사람의 글 수정, 삭제 실패 화면 🔽
- ![image](https://github.com/Giyong8504/blogProject/assets/128211712/ab8492ed-d773-4fa4-87ff-cf8f1000fdbd)
  <br>


## 9일차
### ckeditor5 추가
- ![image](https://github.com/Giyong8504/blogProject/assets/128211712/3af46ede-e594-44af-a2ee-056f780cc119)
