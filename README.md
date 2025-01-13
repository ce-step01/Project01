# 🛤 Parkpal
**반가워요!🙋‍♀️ 당신의 즐거운 산책 메이트 Parkpal이에요🍀🍃**


## 🤸‍♀️ 팀원 소개

| ![박지혜](https://avatars.githubusercontent.com/u/153366521?v=4) | ![박진현](https://avatars.githubusercontent.com/u/193213283?s=400&u=a2ff434fa5c27a5567884503751aafc69e9167fe&v=4) | ![서소원](https://avatars.githubusercontent.com/u/79669001?v=4)| ![석혜진](https://avatars.githubusercontent.com/u/127267532?v=4) |
|:--------------------:|:--------------------:|:--------------------:|:--------------------:|
| [박지혜](https://github.com/parkjhhh) | [박진현](https://github.com/jinhyunpark929) | [서소원](https://github.com/PleaseErwin) | [석혜진](https://github.com/HyeJinSeok) |


## 📢 프로젝트 소개
JDBC와 MySQL을 활용하여 서울시 공원 정보를 효율적으로 검색할 수 있는 데이터베이스 시스템을 구현했습니다.  
사용자들이 손쉽게 원하는 공원 정보를 찾을 수 있도록 주요 식물별, 지하철 노선별, 지역별 등 다양한 검색 기능을 제공합니다.

## 🗂 프로젝트 구조

```
📦 Parkpal
├─ src
│  ├─ Controller
│  │  └─ parkController
│  ├─ Park.Model
│  │  └─ parkModelDAO
│  ├─ Park.Model.DTO
│  │  └─ parkModelDTO
│  ├─ Park.Model.Util
│  │  └─ parkDbutil
│  └─ Park.View
│     ├─ parkStartview
│     └─ parkEndview
└─ README.md
```

## 🛠 기술 스택

<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> <img src="https://img.shields.io/badge/linux-FCC624?style=for-the-badge&logo=linux&logoColor=black">

## ⚙ 아키텍처


## 🔍 주요 기능

## 🔫 Troubleshooting
---
문제1) 

CSV 형식의 데이터를 DBeaver에서 테이블로 변환하지 못함

```
error code: Can't init data transfer, Can't create or update target table
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

![cap1](https://github.com/user-attachments/assets/14f82218-412e-4c20-9e12-f1be0779d8f2)

dbinfo.properties 파일에서 MySQL 대신 Oracle 드라이버를 잘못 설정했기에, 이를 수정함 

 <br/><br/>

문제3)

STS와 DB 간의 연결 오류 발생 원인을 추적하기 위해 간단한 콘솔 출력문을 삽입함

```
# DBUtil.java

    static {
        try {
            // dbinfo.properties 파일 로드
            p.load(new FileInputStream("dbinfo.properties"));
            System.out.println("dbinfo.properties 파일 로드 완료");

            // 파일 내용을 출력하여 확인
            System.out.println("jdbc.driver: " + p.getProperty("jdbc.driver"));
            System.out.println("jdbc.url: " + p.getProperty("jdbc.url"));
            System.out.println("jdbc.username: " + p.getProperty("jdbc.username"));
            System.out.println("jdbc.password: " + p.getProperty("jdbc.password"));

            // JDBC 드라이버 로드
            Class.forName(p.getProperty("jdbc.driverClassName"));
            System.out.println("JDBC 드라이버가 정상적으로 로드되었습니다.");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 로드 실패: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("DB 설정 파일 로드 중 오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }
```

해결3)

Class.forName(p.getProperty("jdbc.driverClassName")); 대신 Class.forName(p.getProperty("jdbc.driver"));로 수정함

```
# dbinfo.properties

jdbc.driverClassName=com.mysql.cj.jdbc.Driver
jdbc.url=jdbc:mysql://127.0.0.1:3306/fisa
jdbc.username=user01
jdbc.password=user01

# 추가된 부분 
jdbc.driver=com.mysql.cj.jdbc.Driver
```


## ✒ 회고



## 📑 참조

+ [서울시 주요 공원현황] <https://data.seoul.go.kr/dataList/OA-394/S/1/datasetView.do>

