<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title> 签证世界后台管理系统</title>
  <!-- Tell the browser to be responsive to screen width -->
  <!-- <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport"> -->
  <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="${base}/references/public/bootstrap/css/bootstrap.css">
  <!-- <link rel="stylesheet" href="${base}/references/public/font-awesome/css/font-awesome.min.css"> -->
  <!-- <link rel="stylesheet" href="${base}/references/public/dist/newvisacss/css/ionicons.min.css"> -->
  <!-- <link rel="stylesheet" href="${base}/references/public/plugins/datatables/dataTables.bootstrap.css"> -->
  <!-- <link rel="stylesheet" href="${base}/references/public/plugins/select2/select2.css"> -->
  <link rel="stylesheet" href="${base}/references/public/dist/newvisacss/css/AdminLTE.css">
  <link rel="stylesheet" href="${base}/references/public/dist/newvisacss/css/skins/skin-blue.css">
  <link rel="stylesheet" href="${base}/references/public/dist/newvisacss/css/skins/_all-skins.css">
  <!-- <script src="${base}/references/public/dist/newvisacss/js/html5shiv/html5shiv.js"></script>
  <script src="${base}/references/public/dist/newvisacss/js/respond/respond.min.js"></script> -->
  <link rel="stylesheet" href="${base}/references/public/css/pikaday.css">
  <link rel="stylesheet" href="${base}/references/public/css/style.css">
  <script src="${base}/references/public/plugins/jQuery/jquery-3.2.1.js"></script>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <!-- Main Header -->
  <header class="main-header">

    <!-- Logo -->
    <a href="${base}/" class="logo">
      <span class="logo-lg"> 签证世界后台管理系统</span>
    </a>

    <!-- Header Navbar -->
    <nav class="navbar navbar-static-top" role="navigation">

      <!-- Navbar Right Menu -->
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <li><img class="headPortrait-img" alt="" src="${base}/references/public/dist/newvisacss/img/TouXiang.jpg"></li>
          <li class="dropdown messages-menu">
            <span class="dian"></span>
          </li>
          <li class="dropdown messages-menu">
            <a href="#" class="dropdown-toggle name" data-toggle="dropdown">${loginuser.fullName}</a>
          </li>
          <li class="setUp-li">
             <a href="javascript:;">设置<img class="setUp" src="${base}/references/public/dist/newvisacss/img/setUp.jpg"></a>
          </li>
          <li class="signOut-li">
             <a href="${base}/admin/logout.html">退出<img class="setUp" src="${base}/references/public/dist/newvisacss/img/signOut.jpg"></a>
          </li>
          
        </ul>
      </div>
    </nav>
  </header>

