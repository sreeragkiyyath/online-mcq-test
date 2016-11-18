<%-- 
    Document   : ExamPage
    Created on : Nov 18, 2016, 11:45:09 AM
    Author     : Students
--%>

<%@page import="com.mcq.bean.McqBean"%>
<%@page import="com.mcq.manager.McqManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Online examination </h1>    
        <div class="mcqsection">
            <%
                McqManager mcqManager = new McqManager();
                McqBean bean = mcqManager.getData();
                String question = bean.getQuestion();
                String option1 = bean.getOption1();
                String option2 = bean.getOption2();
                String option3 = bean.getOption3();

            %>
            <hr/>
            1.
            <%= question%><br/>
            <input type="radio" name="group1" value="Water"><%=option1%><br>
            <input type="radio" name="group1" value="Water"><%=option2%><br>
            <input type="radio" name="group1" value="Water"><%=option3%><br>
            <hr/>
        </div>

        <div class="mcqsection">
            <%

                bean = mcqManager.getData();
                question = bean.getQuestion();
                option1 = bean.getOption1();
                option2 = bean.getOption2();
                option3 = bean.getOption3();

            %>
            <hr/>
            2.
            <%= question%><br/>
            <input type="radio" name="group2" value="option1"><%=option1%><br>
            <input type="radio" name="group2" value="option2"><%=option2%><br>
            <input type="radio" name="group2" value="option3"><%=option3%><br>
            <hr/>
        </div>
            <input type="submit" action="submitAnswer"/>
    </body>
</html>
