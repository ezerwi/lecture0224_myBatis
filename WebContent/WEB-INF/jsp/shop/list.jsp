<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8" />
    <title>::: Spring with MyBatis :::</title>
</head>

<body>
    <h3>가게 목록</h3>

    <table style="width: 100%;" border="1">
        <thead>
            <tr>
                <th>번호</th>
                <th>가게명</th>
                <th>위치</th>
                <th>상태</th>
                <th>보기</th>
                <th>수정</th>
                <th>삭제</th>
            </tr>
        </thead>
        
        <tbody>
            <c:if test="${!empty listShop}">
                <c:forEach items="${listShop}" var="shop" varStatus="status">
                    <tr>
                        <td style="text-align: center;">
                            <c:out value="${shop.shopNo}" />
                        </td>
                        
                        <td style="text-align: left;">
                            <c:out value="${shop.shopName}" />
                        </td>
                        
                        <td style="text-align: left;">
                            <c:out value="${shop.shopLocation}" />
                        </td>
                        
                        <td style="text-align: center;">
                            <c:out value="${shop.shopStatus}" />
                        </td>
                        
                        <td style="text-align: center;">
                            <a href="<c:url value="/shop/view/${shop.shopNo}" />">
                                <input type="button" id="button_view" name="button_view" value="보기" />
                            </a>
                        </td>
                        
                        <td style="text-align: center;">
                            <a href="<c:url value="/shop/edit/${shop.shopNo}" />">
                                <input type="button" id="button_edit"  name="button_edit" value="수정" />
                            </a>
                        </td>
                        
                        <td style="text-align: center;">
                            <a href="<c:url value="/shop/remove/${shop.shopNo}" />">
                                <input type="button" id="button_remove"  name="button_remove" value="삭제" />
                            </a>
                        </td>
                        
                    </tr>
                </c:forEach>
            </c:if>
            
            <c:if test="${empty listShop}">
                <tr>
                    <td style="text-align: center;" 
                        colspan="7">목록이 존재하지 않습니다.</td>
                </tr>
            </c:if>
            
        </tbody>
    </table>

    <div style="text-align: right; padding-top: 10px;">
        <a href="<c:url value="/shop/add" />">
            <input type="button" id="button_add"  name="button_add" value="등록" />
        </a>
    </div>
</body>
</html>
