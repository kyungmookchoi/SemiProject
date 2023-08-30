<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
</head>
<body>
    <div class="container-fluid">
	
		<div class="row justify-content-center my-4">
			<h1 class="col-md-7 text-center">상품등록</h1>
		</div>
		
		<div class="row justify-content-center my-4">
			<form class="col-md-7" action="./add" method="post" id="frm" enctype="multipart/form-data">
			
				<div class="mb-3">
				  <label for="pic" class="form-label">사진첨부</label>
				  <input type="file" name="photos" class="form-control" id="pic" placeholder="+">
				</div>
				<div class="mb-3">
				  <label for="pic" class="form-label">사진첨부</label>
				  <input type="file" name="photos" class="form-control" id="pic" placeholder="+">
				</div>
				<div class="mb-3">
				  <label for="pic" class="form-label">사진첨부</label>
				  <input type="file" name="photos" class="form-control" id="pic" placeholder="+">
				</div>	
				
						
				
				<div id="fileList" class="my-5"></div>
				<div class="mb-3">
				  <label for="writer" class="form-label">작성자</label>
				  <input type="text" name="userId" readonly value="${member.userId}"  class="form-control" id="userId">
				</div>
				
                <div class="mb-3">
                    <label for="proName" class="form-label">제목</label>
                    <input type="text" name="proName"  class="form-control" id="proName" placeholder="제목 입력">
                  </div>
                  
                  <label for="catNo">카테고리 선택:</label>
				    <select id="catNo" name="catNo">
				        <option value="1001">에어컨</option>
				        <option value="1002">냉장고</option>
				        <option value="1003">TV</option>
				        <option value="1004">노트북</option>
				    </select>

               
                  <div class="mb-3">
                    <label for="proStatus" class="form-label">상태</label>
                    <input name="proStatus" id="proStatus0" type="radio" value="0" checked>
                    <label for="proStatus0">중고상품</label>
                    <input name="proStatus" id="proStatus1" type="radio" value="1">
                    <label for="proStatus1">새상품</label>
                </div>
                <div class="mb-3">
                    <label for="exchange" class="form-label">교환</label>
                    <input name="exchange" id="exchange0" type="radio" value="0" checked>
                    <label for="exchange0">교환불가</label>
                    <input name="exchange" id="exchange1" type="radio" value="1">
                    <label for="exchange1">교환가능</label>
                </div>
                  <div class="mb-3">
                    <label for="proPrice" class="form-label">가격</label>
                    <input type="text" name="proPrice" class="form-control" id="proPrice" placeholder="가격 입력">
                    원
                  </div>
		
				<div class="mb-3">
				  <label for="proContents" class="form-label">내용</label>
				  <textarea name="proContents" class="form-control" id="proContents" placeholder="내용 입력" rows="7"></textarea>
				</div>

                <div class="mb-3">
                    <label for="proAmount" class="form-label">수량</label>
                    <input type="text" name="proAmount" class="form-control" id="proAmount" placeholder="수량 입력">
                    개
                  </div>
				
				
				
							
				<div class="mb-3">
					<button class="my btn btn-danger" type="submit" id="btn">글쓰기</button>
				</div>
			
			</form>
		</div>
	</div>


</body>
</html>