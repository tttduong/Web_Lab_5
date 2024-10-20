<%-- 
    Document   : form_result
    Created on : Oct 18, 2024, 2:03:57 PM
    Author     : Administrator
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
      
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles.css">
        <title>Result Page</title>
    </head>
    <body>
         <h1>School of Computer Science & Engineering</h1>
        <hr>
        <h2>Register Form</h2>
    <form action="" method="get">
        <input type="hidden" name="action" value="add">  
        <table>
            <tr>
                <td><label for="fullname">Full Name</label></td>
                <td><span>${user.fullName}</span></td>
            </tr>
            <tr>
                <td><label for="id">ID</label></td>
                <td><span>${user.id}</span></td>

            </tr>
            <tr>
                <td><label for="email">Email</label></td>
                <td><span>${user.email}</span></td>
            </tr>
            <tr>
                <td><label>Gender</label></td>
                <td>
                    <span>${user.gender}</span>
                   
                </td>
            </tr>
            <tr>
                <td><label for="study">Field of study</label></td>
                <td>
                    <span style="text-transform: uppercase">${user.study}</span>
                    
                </td>
            </tr>
            <tr>
                <td><label>List of subjects</label></td>
                <td class="checkbox">
<!--                    <label> <input type="checkbox" name="subjects"  value="principle_of_ee_1"/>Principle of EE 1</label>
                    <label><input type="checkbox" name="subjects"  value="computer_network"/>Computer Network </label>
                    <label> <input type="checkbox" name="subjects"  value="web_application_development"/>Web Application Development </label>
                    <label> <input type="checkbox" name="subjects"  value="object_oriented_programming"/>Object Oriented Programming</label>
                    <label><input type="checkbox" name="subjects"  value="computer_graphics"/>Computer Graphics</label>-->
                    
                    <ul style="list-style: none; padding-left: 0; margin-left: 0">
                        <c:forEach var="subject" items="${user.subject}">
                           <li style="text-decoration: none; text-transform: capitalize">${subject}</li>
                        </c:forEach>
                    </ul>
                </td>
            </tr>
            <tr>
                <td><label for="comment">Comments</label></td>
                <td>
                    <!--<textarea id="comment" cols="40" rows="3"></textarea>-->
                    <span>${user.comment}</span>
                </td>
            </tr>
            <tr>
                <td> <input id="submitBtn" type="submit" value="Submit"/></td>
                <td>
                    <input id="resetBtn" type="reset" value="Reset"/>
                    

                </td>
            </tr>
        </table>
 
       
    </form>
        
        <form action="" method="get">
        <input type="hidden" name="action" value="submit">
    </form>
                
    <script>
    // Vô hiệu hóa nút
    document.getElementById("submitBtn").disabled = true;
    document.getElementById("resetBtn").disabled = true;
    // Kích hoạt lại nút 
    // document.getElementById("submitBtn").disabled = false;
    window.onload = function() {
        // Lấy tất cả các mục trong danh sách hiển thị môn học
        var subjects = document.querySelectorAll('ul li');

        subjects.forEach(function(subject) {
            // Lấy văn bản hiện tại, thay thế dấu gạch dưới bằng khoảng trắng
            var formattedText = subject.innerText.replace(/_/g, ' ');
            // Viết hoa chữ cái đầu
            formattedText = formattedText.split(' ').map(function(word) {
                return word.charAt(0).toUpperCase() + word.slice(1);
            }).join(' ');

            // Cập nhật nội dung
            subject.innerText = formattedText;
        });
    };
    
    </script>
    </body>
</html>
