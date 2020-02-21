<%@ page language="java" contentType="text/html; charset=UTF-8"   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
    <title>::: Spring with MyBatis :::</title>
    
    <script type="text/javascript">
        function add() {
            document.getElementById('form').submit();
        };
    </script>
    
</head>

<body>
    <h3>가게 등록</h3>

    <form id="form" name="form" action="<c:url value="/shop/add" />" method="post">
        <table style="width: 100%;" border="1">
        
            <thead>
                <tr>
                    <th width="10%">구분</th>
                    <th>내용</th>
                </tr>
            </thead>
            
            <tbody>
                <tr>
                    <td>가게명</td>
                    <td style="text-align: left;">
                        <input type="text" id="shopName" name="shopName" maxlength="20" style="width: 200px;" />
                    </td>
                </tr>
                
                <tr>
                    <td>위치</td>
                    <td style="text-align: left;">
                        <input type="text" id="shopLocation" name="shopLocation" maxlength="100" style="width: 200px;" />
                    </td>
                </tr>
                
                <tr>
                    <td>상태</td>
                    <td style="text-align: left;">
                        <select id="shopStatus" name="shopStatus"> 
                            <option value="">선택</option>
                            <option value="Y">Y</option>
                            <option value="N">N</option>
                        </select>
                    </td>
                </tr>
            </tbody>
            
        </table>
    </form>

    <div style="text-align: right; padding-top: 10px;">
        <input type="button" id="button_add" name="button_add" value="등록" title="등록" onclick="add();" />
        
        <a href="<c:url value="/shop/list" />">
            <input type="button" id="button_list" name="button_list" value="목록" />
        </a>
    </div>
</body>
</html>
