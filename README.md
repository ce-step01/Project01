# 프로젝트소개
## 🤸‍♂️프로젝트 목적
✔ **정규표현식 이해 및 활용**

✔ **가상머신에 mysql 구축하여 외부 접속 환경 구축**
  + DB 구축 및 계정 생성


## 🤸‍♂️팀원소개
<table>
  <tbody>
    <tr>
      <td align="center">
        <a href="https://github.com/parkjhhh">
          <img src="https://avatars.githubusercontent.com/u/153366521?v=4" width="150px;" alt="박지혜"/>
          <br /><sub><b> 박지혜 </b></sub>
        </a>
        <br />
      </td>
      <td align="center">
        <a href="https://github.com/JaeHee-devSpace">
          <img src="https://avatars.githubusercontent.com/u/193316939?v=4" width="150px;" alt="박재희"/>
          <br /><sub><b> 박재희 </b></sub>
        </a>
        <br />
      </td>
      <td align="center">
        <a href="https://github.com/wild-turkey">
          <img src="https://github.com/user-attachments/assets/0596f1ff-ab90-49f0-9dd4-c306c63a397b" width="150px;" alt="김지훈"/>
          <br /><sub><b> 김지훈 </b></sub>
        </a>
        <br />
      </td>
      <td align="center">
        <a href="https://github.com/riyeong0916">
          <img src="https://avatars.githubusercontent.com/u/193798531?v=4" width="150px;" alt="김리영"/>
          <br /><sub><b> 김리영 </b></sub>
        </a>
        <br />
      </td>
    </tr>
  </tbody>
</table>

## 🤸‍♂환경 구축
**VirtualBox Network 설정**
+ 가상머신(VM)이 호스트 시스템과 동일한 네트워크에 연결되도록 구성하는 방식 → 가상머신이 물리적인 네트워크 장치와 직접 통신할 수 있는 환경을 제공



## 🚀 프로젝트 이름

> **간단한 프로젝트 소개**  
> SQL 정규표현식을 이해하고 예제를 만들어 풀이하였습니다. 


## 🚀 기술 스택

- **Backend**: MySQL

---

## 💡 주요 기능

✔️ **주요기능1**  
✔️ **주요기능2**  
✔️ **주요기능3**   

---

## 📂 프로젝트 구조

1. 가격 범위에 따른 거래 필터링
   가격이 소수점 두 자리로 끝나는 거래만 선택.

```sql

SELECT trade_id, price
FROM stock_trades
WHERE price LIKE '%.%'
  AND LENGTH(SUBSTRING_INDEX(price, '.', -1)) = 2
  AND LENGTH(SUBSTRING_INDEX(price, '.', 1)) > 0;
```

<details>
  <summary>풀이</summary>

```sql
SELECT trade_id, price
FROM stock_trades
WHERE price REGEXP '^[0-9]+\\.[0-9]{2}$';
```

  
 **REGEXP** : 정규표현식을 활용한 문자열 검색을 필터링 가능하게 하는 조건문
   

**^** : 문자열 시작

**[0-9]+**: 0부터 9까지의 문자열을 반환한다. 뒤에 +를 붙여서 한번 이상 반복하는 연속적인 문자열을 전부 반환한다.

**\\.** : 소수점을 그대로 반환한다.

**[0-9]{2}** : 0부터 9까지의 문자열을 {2}를 사용해 2개만 반환한다.

**$** : 문자열의 끝을 의미한다.




</details>














<details>
  <summary>클릭하여 더보기</summary>
  
  여기에 토글할 내용이 들어갑니다.
  
  예시:
  - 항목 1
  - 항목 2
  - 항목 3
  
</details>


