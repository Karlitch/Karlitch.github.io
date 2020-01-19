<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta name="description" content="Free Responsive Html5 Templates">
    <meta name="author" content="">

    <title>PhotoGrap | Free Bootstrap Themes</title>

    <!-- Bootstrap Core CSS -->
    <link href="../../css/bootstrap.min.css" rel="stylesheet" type="text/css">

    <!-- Custom CSS -->
    <link href="../../css/style.css" rel="stylesheet">
    <link rel="stylesheet" href="../../fonts/stylesheet.css">
    <link href="css/mb-comingsoon-iceberg.css" rel="stylesheet" />

    <!-- Custom Fonts -->
    <link href="../../font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- jQuery and Modernizr-->
    <script src="../../js/jquery-2.1.1.js"></script>
    <script src="js/modernizr.custom.97074.js"></script>


    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="../../js/html5shiv.js"></script>
    <script src="../../js/respond.min.js"></script>
    <![endif]-->
</head>

<body class="sub-page">

<%--<header class="sub-header">--%>

<!-- /////////////////////////////////////////Navigation -->
<nav id="menu" class="navbar container">
    <div class="">
        <div class="navbar-header">
            <button type="button" class="btn btn-navbar navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse"><i class="fa fa-bars"></i></button>
            <a href="WEB-INF/jsp/index.jsp" class="navbar-brand visible-xs">PhotoGrap</a>
        </div>
        <div class="collapse navbar-collapse navbar-ex1-collapse">
            <ul class="nav navbar-nav">
                <li><a href="../../../index.jsp">主页</a></li>
                <li><a href="${pageContext.request.contextPath}/show/getShowList">查询</a></li>
                <%--                <li class="dropdown"><a href="archive.jsp" class="dropdown-toggle" data-toggle="dropdown">维修类型 <i class="fa fa-chevron-down"></i></a>--%>
                <%--                    <div class="dropdown-menu" style="margin-left:auto;">--%>
                <%--                        <div class="dropdown-inner">--%>
                <%--                            <ul class="list-unstyled" >--%>
                <%--                                <li><a href="archive.jsp">手机</a></li>--%>
                <%--                                <li><a href="#">家电</a></li>--%>
                <%--                                <li><a href="#">家具</a></li>--%>
                <%--                                <li><a href="#">服饰</a></li>--%>
                <%--                                <li><a href="#">上门服务</a></li>--%>
                <%--                            </ul>--%>

                <%--                        </div>--%>
                <%--                    </div>--%>
                <%--                </li>--%>
                <li><a href="${pageContext.request.contextPath}/hrms/login">登录/注册</a></li>
                <%--                <li><a href="check.jsp">我的订单</a></li>--%>
                <li><a href="../../../about.jsp">关于我们</a></li>
            </ul>
        </div>
    </div>
</nav>


<!-- Navigation -->


<%--</header>--%>
<!-- Header -->



<script src="../../js/bootstrap.min.js"></script>


</body>

</html>
