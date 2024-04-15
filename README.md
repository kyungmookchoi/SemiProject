## 📆 프로젝트 개요
---
><p><strong>프로젝트</strong>: 쇼핑몰 형식의 소가전 중고거래 사이트</p>
><p><strong>기획 및 제작</strong>: 서원진, 윤소영, 강승권, 최경묵, 김성호</p>
><p><strong>제작 기간</strong>: 2023.08.14 ~ 2023. 09.15 
><p><strong>배포일</strong>: 2023.09.15</p>


## :open_file_folder: 목차
 팀원 소개
 Tech Stacks
 기능 구현

## 👨‍👨‍👧‍👧 팀원 소개

><p><strong>팀원</strong>: 윤소영</p>
>상품 상세, 회원 프로필, 후기페이지, 관리자페이지 일부 개발

><p><strong>팀원</strong>: 강승권</p>
>공지사항, 1:1문의, 결제, 관리자페이지 일부 개발

><p><strong>팀원</strong>: 최경묵</p>
>메인 페이지, 상품관련페이지(리스트, 등록, 수정, 삭제) 개발, 소셜로그인

><p><strong>팀원</strong>: 김성호</p>
>마이페이지, 정보 수정, 구매내역/판매내역, 1대1 채팅, 회원 탈퇴 개발





## 🔨 Tech Stacks
---

<img src="https://img.shields.io/badge/Design-%23121011?style=for-the-badge"> ![Bootstrap](https://img.shields.io/badge/bootstrap-%238511FA.svg?style=for-the-badge&logo=bootstrap&logoColor=white) <br/>

<img src="https://img.shields.io/badge/IDE-%23121011?style=for-the-badge"> ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white)<br/>

<img src="https://img.shields.io/badge/Server Hosting-%23121011?style=for-the-badge"> ![AWS](https://img.shields.io/badge/AWS-%23FF9900.svg?style=for-the-badge&logo=amazon-aws&logoColor=white) <br/>

<img src="https://img.shields.io/badge/DB-%23121011?style=for-the-badge"> ![Oracle](https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white) <br/>

<img src="https://img.shields.io/badge/Languages-%23121011?style=for-the-badge"> ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white) ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E) <br/>

<img src="https://img.shields.io/badge/OS-%23121011?style=for-the-badge"> ![Windows](https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white) <br/>

<img src="https://img.shields.io/badge/Server-%23121011?style=for-the-badge"> ![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black) <br/>

<img src="https://img.shields.io/badge/Other-%23121011?style=for-the-badge"> ![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white) ![Notion](https://img.shields.io/badge/Notion-%23000000.svg?style=for-the-badge&logo=notion&logoColor=white) ![Slack](https://img.shields.io/badge/Slack-4A154B?style=for-the-badge&logo=slack&logoColor=white) ![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white) 


## :rocket: <a id="function-implementation">기능 구현</a>
### 1.일반

#### 1-1.일반 회원가입

![회원가입](https://github.com/sungho9941/SemiProject/assets/26131124/751e9cea-b927-4f71-b6bf-ca9c57df1bd7)

* 먼저 회원 가입을 진행해야 사이트 내 기능을 이용할 수 있다.
  
#### 1-2.카카오 회원가입

![카카오회원가입](https://github.com/sungho9941/SemiProject/assets/26131124/b946a734-c0b9-4d96-9bf0-11df03b563a2)

* REST API중 HttpURLConnection을 사용하여 구현
* 최초 로그인 시 이메일, 프로필 사진,닉네임 등을 가져올 수 있다
* 실제로 사업자 등록을 하고 비즈 앱 신청을 해야만 유저의 다른 정보들을 가져올 수 있기에 현재는 이메일을 아이디로 써서 로그인

#### 1-3.프로필 사진 등록

![프로필사진등록](https://github.com/sungho9941/SemiProject/assets/26131124/ade66b5e-e59f-4721-88b2-1c8121812df7)

* 사진 등록시 바로 확인이 가능하게끔 비동기 방식으로 구현

#### 1-4.상품 등록

![상품등록](https://github.com/sungho9941/SemiProject/assets/26131124/6f230951-7421-4d8a-b581-f02dfb7e52d8)

* 판매자가 등록한 상품 상세 설명이 있으며, 판매자 정보나 후기도 확인할 수 있음
* 상품 관련 이미지를 최대 5개까지 등록할 수 있음

#### 1-5.판매자 프로필 확인

![판매자프로필](https://github.com/sungho9941/SemiProject/assets/26131124/dfd0a883-67c7-462d-bcc0-4e16b4a1d7b1)

* 판매자의 자기소개, 판매글, 별점등의 정보를 확인할 수 있음

#### 1-6.결제

![상품결제](https://github.com/sungho9941/SemiProject/assets/26131124/99f4a235-37f8-47f9-9c92-aa976e501a3e)

* PortOne API를 HttpsURLConnection으로 구현

#### 1-7.신고

![신고](https://github.com/sungho9941/SemiProject/assets/26131124/c79e1786-711e-46e2-8b37-49deda514be1)

* 규칙을 위반한 판매자를 신고할 수 있고 최대 3장의 사진 등록 가능

#### 1-8.구매내역&후기

![구매내역후기](https://github.com/sungho9941/SemiProject/assets/26131124/c2abbb57-424e-4214-872b-302a1bf73545)

* 로그인한 사용자의 구매내역과 판매내역을 확인할 수 있고 구매한 상품의 후기를 등록할 수 있음

#### 1-9.결제취소

![결제취소](https://github.com/sungho9941/SemiProject/assets/26131124/4aa982c2-4656-43e6-80aa-b876b78afc14)

* PortOne 결제 API를 이용해 결제 취소

#### 1-10.내 찜목록

![내찜목록](https://github.com/sungho9941/SemiProject/assets/26131124/5339cef8-7a56-4485-8d26-2946ac4aad7f)

* 상품상세페이지에서 찜한 목록 출력

#### 1-11.내게 쓴 후기

![후기](https://github.com/sungho9941/SemiProject/assets/26131124/262fd759-cdc9-4a68-85c3-0d202b7e4812)

* 내 상품을 구매한 사용자의 후기 글 목록 출력

#### 1-12.상품 관리

![상품관리](https://github.com/sungho9941/SemiProject/assets/26131124/656cda31-1f76-4985-aeb9-9f5c839139f0)

* 내가 등록한 상품 목록 출력 및 상품 상세페이지 바로가기

#### 1-13.1대1 채팅

![채팅](https://github.com/sungho9941/SemiProject/assets/26131124/f38d5949-34c1-46fb-bf17-56199157794e)

* 톡 버튼을 눌러 해당 상품의 판매자와 1대1 채팅 및 지난 대화내역 불러오기 기능 구현

### 2.Admin
#### 2-1.공지사항

![공지사항운영자](https://github.com/sungho9941/SemiProject/assets/26131124/364ebd1f-472d-49e2-b865-5935800c65af)

* SummerNote API를 적용
* 관리자만 추가, 수정, 삭제 가능
* 조회수, 페이징, 검색 기능 구현

#### 2-2.1대1 문의

![1대1문의](https://github.com/sungho9941/SemiProject/assets/26131124/58172ee3-6eb0-4b22-a6a4-94b9877e6a7e)

* SummerNote API를 적용
* 글쓴이만 추가, 수정, 삭제 가능
* 조회수, 페이징, 검색 기능 구현

#### 2-3.1대1 문의 답글

![1대1문의답글](https://github.com/sungho9941/SemiProject/assets/26131124/96588b9b-a7e5-4c1e-a881-b9639e0f97ac)

* 1대1 문의시 관리자가 답글 달기 가능

#### 2-4.회원정보 수정 및 정지

![회원정보수정및정지](https://github.com/sungho9941/SemiProject/assets/26131124/37082ed5-d906-431d-90ad-406b151c08fa)

* 관리자가 회원 정보를 수정하거나 임시로 정지시킬 수 있는 기능 구현

#### 2-5.결제관리, 상품관리, 신고관리

![결제신고관리등](https://github.com/sungho9941/SemiProject/assets/26131124/d54ad0a1-756a-4b24-b17c-850c132c32ee)

* 상품관리 페이지에서 상품 판매상태 비동기 처리
* 회원이 구매했거나 결제취소한 목록을 확인할 수 있음
* 신고당한 회원 정보 확인 가능

### 3.회원탈퇴
#### 3-1.회원탈퇴

![회원탈퇴](https://github.com/sungho9941/SemiProject/assets/26131124/4a97ec2e-233a-47d0-9a2d-e61a717acf4a)

* 비밀번호 검증 후 회원을 탈퇴할 수 있음
