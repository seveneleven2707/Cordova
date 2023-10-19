스타일 시트 구성 요소
span {color:blue; font-size: 20px;}
 
셀렉터
- css3 스타일 시트의 이름이나 규칙
블록
- {} 이용하여 작성

프로퍼티와 값
- 프로퍼티:값 으로 표현
- 세미콜론으로 분리

주석문
- /* 이 사이에 작성하면 된다 */

CSS3 규칙
- CSS3 스타일은 부모 태그로부터 상속된다
- 스타일 오버라이딩: 동일한 CSS3 프로퍼티에 서로 다른 값을 설정하는 충돌 시 우선순위가 높은 스타일을 적용하는 규칙 
<style> 태그 사이에 스타일 시트 작성

셀렉터
- HTML 태그의 모양을 꾸밀 스타일 시트를 선택하는 기능
- 예를들어 h3 셀렉터를 사용하면 모든 <h3> 태그에 h3 셀렉터의 스타일이 적용된다

태그 이름 셀렉터
- h3, li {color : brown; } 처럼 설정할 수도 있다

class 셀렉터
- .warning {color : brown; } 셀렉터 이름 앞에 점을 붙인 경우, 이 셀렉터는 html 태그의 class 속성으로만 지정할 수 있다
- body.main {background : aliceblue; } body에서만 사용 가능, main은 body 태그에서만 가능
	
전체 셀렉터
- * {color : brown; } 웹 페이지의 모든 태그에 적용된다
	
속성 셀렉터
- input[type=text] {color : brown; } 태그의 속성이 일치하는 경우에만 적용된다
	
가상 클래스 셀렉터
- li:hover {background : green; } <li> 태그 위에 마우스가 올라가면 green을 출력, 내려가면 원래대로 복귀
