# Project<br/><br/><br/>
 


## 🤸‍♀️ 팀원 소개

<table>
  <tbody>
    <tr>
      <td align="center"><a href=""><img src="width="100px;" alt=""/><br /><sub><b> 박지혜<https://github.com/parkjhhh> </b></sub></a><br /></td>
      <td align="center"><a href=""><img src="" width="100px;" alt=""/><br /><sub><b> 박진현<https://github.com/jinhyunpark929> </b></sub></a><br /></td>
      <td align="center"><a href=""><img src="" width="100px;" alt=""/><br /><sub><b> 서소원<https://github.com/PleaseErwin> </b></sub></a><br /></td>
      <td align="center"><a href=""><img src="" width="100px;" alt=""/><br /><sub><b> 석혜진<https://github.com/HyeJinSeok> </b></sub></a><br /></td>
  </tbody>
</table>


## 🛠 기술 스택

<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> <img src="https://img.shields.io/badge/linux-FCC624?style=for-the-badge&logo=linux&logoColor=black">


## 📢 프로젝트 소개
+ 기획의도


## 🖥 개발 기간


**2025-01-09 ~ 2025-01-13**
+ 2025-01-09 : 데이터 전처리 및 기획
+ 2025-01-10 : JDBC 코드 작성

## ⌨ 개발 환경



## ⚙ MVC


## 🔫 Troubleshooting
---
문제1) 

CSV 형식의 데이터를 DBeaver에서 테이블로 변환하지 못함

```
오류코드 : Can't init data transfer, Can't create or update target table
```

해결1)

CSV 파일 전처리 시, 스키마에 불필요한 공백이 남아 있었음. 이를 제거하니 테이블 변환이 성공적으로 이뤄짐

<br/><br/>

문제2)

데이터베이스 연결 중 Connection reset 예외가 발생함

```
java.sql.SQLRecoverableException: IO 오류: Connection reset, connect lapse 1 ms., Authentication lapse 0 ms.
    at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:794)
    at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:688)
    at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:39)
``` 

해결2)

dbinfo.properties 파일에서 MySQL 대신 Oracle 드라이버를 잘못 설정했기에, 이를 수정함 

 <br/><br/>
  

## ✒ 회고
---


## 📑 참조
---
+ [서울시 주요 공원현황] <https://data.seoul.go.kr/dataList/OA-394/S/1/datasetView.do>

