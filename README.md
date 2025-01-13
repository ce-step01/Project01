# 🛤 *Parkpal*
**반가워요!🙋‍♀️ 당신의 즐거운 산책 메이트 *Parkpal*이에요🍀🍃**
<br/>
<br/>

## 🤸‍♀️Contributor

| ![박지혜](https://avatars.githubusercontent.com/u/153366521?v=4) | ![박진현](https://avatars.githubusercontent.com/u/193213283?s=400&u=a2ff434fa5c27a5567884503751aafc69e9167fe&v=4) | ![서소원](https://avatars.githubusercontent.com/u/79669001?v=4)| ![석혜진](https://avatars.githubusercontent.com/u/127267532?v=4) |
|:--------------------:|:--------------------:|:--------------------:|:--------------------:|
| [박지혜](https://github.com/parkjhhh) | [박진현](https://github.com/jinhyunpark929) | [서소원](https://github.com/PleaseErwin) | [석혜진](https://github.com/HyeJinSeok) |
<br/>

## 📢Project Overview
JDBC와 MySQL을 활용하여 서울시 공원 정보를 효율적으로 검색할 수 있는 데이터베이스 시스템을 구현했습니다.  
사용자들이 손쉽게 원하는 공원 정보를 찾을 수 있도록 **특정 키워드를 활용한 공원 이름 검색 기능**을 제공합니다.
<br/>
<br/>

## 🗂Project Structure

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
<br/>

## 🛠Skill Stack

<img src="https://img.shields.io/badge/java-FF0000?style=for-the-badge&logo=java&logoColor=white"> <img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> <img src="https://img.shields.io/badge/linux-FCC624?style=for-the-badge&logo=linux&logoColor=black"> <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white">
<br/>
<br/>

## 🔍Main Features

**1. 전체 공원 정보 검색**  
```c
public static void getparkInfo() {
		try {
			EndView.parkView(ParkDAO.getAllparkInfo());
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("모든 공원 정보 검색 오류");
		}
	}
```
<details>
<summary>Result</summary>
    
![Parkpal1](https://github.com/user-attachments/assets/1993c690-0dab-4537-b075-ab4cff87c833)  
</details>
<br/>

**2. 특정 키워드가 포함된 공원 검색**  
```c
public static void getparkInfo(String keyword) {
		try {
			EndView.allParkView(ParkDAO.getparkInfo(keyword));
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.showError("공원 정보 검색 오류");
		}
	}
```
<details>
<summary>Result</summary>
    
![Parkpal2](https://github.com/user-attachments/assets/ab1bce79-395a-452c-86d1-6ba95891eaf1)
</details>
<br/>

**3. 리스트 내 신규 공원 추가**  
```c
public static boolean addPark(int num, String parkName, String openingDate, String principalSpecies,
			String directions, String location, String officeNumber, String keyFacilities) {
		boolean result = false;

		try {
			result = ParkDAO.addParkInfo(num, parkName, openingDate, principalSpecies, directions, location, officeNumber, keyFacilities);
			System.out.println("추가 완료");
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("공원 정보 추가 오류");
		}
		return result;
	}
```
<details>
<summary>Result</summary>
    
![Parkpal3_1](https://github.com/user-attachments/assets/917d2889-ab63-412a-b101-99a1c6b614da)

**정상적으로 추가 완료**
![Parkpal3_2](https://github.com/user-attachments/assets/a8812e8b-e662-4668-a734-75cbf8338860)
</details>
<br/>

**4. 특정 지역의 주요 식물 분포 변경**
```c
public static boolean updatePark(String principalSpecies, String location) {
		boolean result = false;
		try {
			result = ParkDAO.updateParkinfo(principalSpecies, location);
			System.out.println("업데이트 완료");
		} catch (SQLException s) {
			s.printStackTrace();
			EndView.showError("공원 정보 수정 오류");
		}
		return result;
	}
```
<details>
<summary>Result</summary>
    
![Parkpal4](https://github.com/user-attachments/assets/7c0a1482-d8b4-40a3-b063-68db760405a7)
</details>
<br/>
  
**5. 공원명 내 특정 키워드를 포함한 공원 정보 삭제**
```c
public static boolean deletePark(String parkName) {
		boolean result = false;
		try {
			result = ParkDAO.deleteParkInfo(parkName);
			System.out.println("삭제 완료");
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.showError("공원 정보 삭제 오류");

		}
		return result;
	}
}
```
<details>
<summary>Result</summary>
    
![Parkpal5_1](https://github.com/user-attachments/assets/f22f0b42-dfb3-44a7-a24d-f13af3af6e26)

**정상적으로 삭제 완료**
![Parkpal5_2](https://github.com/user-attachments/assets/bdd2bc4e-33ca-4158-a9a5-440092d1c68c)
</details>
<br/>

## 🚩Troubleshooting
<br/>

### Issue 1. CSV 형식 데이터의 DBeaver 테이블 변환 실패

```
error code: Can't init data transfer, Can't create or update target table
```
#### Solution : CSV 파일 스키마의 불필요한 공백 제거로 DBeaver 테이블 변환 성공
<br/>

---
<br/>

### Issue 2. 데이터베이스 연결 중 Connection reset 예외 발생

```
java.sql.SQLRecoverableException: IO 오류: Connection reset, connect lapse 1 ms., Authentication lapse 0 ms.
    at oracle.jdbc.driver.T4CConnection.logon(T4CConnection.java:794)
    at oracle.jdbc.driver.PhysicalConnection.connect(PhysicalConnection.java:688)
    at oracle.jdbc.driver.T4CDriverExtension.getConnection(T4CDriverExtension.java:39)
```

 #### Solution : dbinfo.properties 파일 내 Oracle 드라이버 삭제 후 MySQL 드라이버로 수정
<br/>
![cap1](https://github.com/user-attachments/assets/14f82218-412e-4c20-9e12-f1be0779d8f2)

<br/>

---
<br/>

### Issue 3. 데이터베이스 연결 중 Connection reset 예외 발생

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

```
# 발생한 오류
System.out.println("DB 설정 파일 로드 중 오류 발생: " + e.getMessage());
```


#### Solution : JDBC 드라이버가 정상적으로 로드되지 않으므로, Class.forName(p.getProperty("jdbc.driverClassName")); 대신 Class.forName(p.getProperty("jdbc.driver"));로 수정함


```
# dbinfo.properties

jdbc.driverClassName=com.mysql.cj.jdbc.Driver
jdbc.url=jdbc:mysql://127.0.0.1:3306/fisa
jdbc.username=user01
jdbc.password=user01

# 추가된 부분 
jdbc.driver=com.mysql.cj.jdbc.Driver
```

<br/>

---

<br/>

### Issue 4. 로컬 파일을 브랜치에 푸시한 후, main과 병합하고 main을 풀(pull)하는 과정에서 오류 발생

![cap2](https://github.com/user-attachments/assets/d27c8779-8090-437a-bfb9-c81c4fd1e628)

#### Solution : 충돌 파일들을 수동으로 수정하여 강제로 병합함


```
git add src/controller/Controller.java
git add src/park/view/StartView.java
```

 <br/><br/>
 문제5)

MySQL과의 연결 문제로 Communication link failure 오류가 발생함

![cap3](https://github.com/user-attachments/assets/aacb6750-13a2-412b-8d85-b1a71699271f)

해결5)

Oracle VirtualBox의 서버 실행 및 MobaXterm 로그인해 mysql에 접속함

![cap4](https://github.com/user-attachments/assets/029b1b3e-051d-4423-bb6c-9d49ff3356fa)


## ✒Retrospective



## 📑Reference

+ [서울시 주요 공원현황] <https://data.seoul.go.kr/dataList/OA-394/S/1/datasetView.do>

