<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta charset="utf-8" />
<meta name="description" content="Restyling jQuery UI Widgets and Elements" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta http-equiv="X-UA-Compatible" content="IE=9" />
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta name="format-detection" content="telephone=no">
<%
    response.setHeader("Pragma","No-cache");
    response.setHeader("Cache-Control","no-cache");
    response.setDateHeader("Expires", -10);
%>

<!-- bootstrap & fontawesome -->
<link rel="stylesheet" href="${ctxStatic}/assets/css/bootstrap.min.css" />
<link rel="stylesheet" href="${ctxStatic}/assets/css/font-awesome.min.css" />

<!-- page specific plugin styles -->
<link rel="stylesheet" href="${ctxStatic}/assets/css/jquery-ui.min.css" />

<!-- text fonts -->
<link rel="stylesheet" href="${ctxStatic}/assets/css/ace-fonts.css" />

<!-- ace styles -->
<link rel="stylesheet" href="${ctxStatic}/assets/css/ace.min.css" />
<!--messenger-->
<%-- <link rel="stylesheet" href="${ctxStatic}/messenger/css/messenger.css" /> --%>
<%-- <link rel="stylesheet" href="${ctxStatic}/messenger/css/messenger-theme-air.css" /> --%>


<!--[if lte IE 9]>
<link rel="stylesheet" href="${ctxStatic}/assets/css/ace-part2.min.css" />
<![endif]-->
<link rel="stylesheet" href="${ctxStatic}/assets/css/ace-skins.min.css" />
<link rel="stylesheet" href="${ctxStatic}/assets/css/ace-rtl.min.css" />

<!--[if lte IE 9]>
<link rel="stylesheet" href="${ctxStatic}/assets/css/ace-ie.min.css" />
<![endif]-->

<%-- <link rel="stylesheet" href="${ctxStatic}/assets/css/bootstrap-datetimepicker.min.css" /> --%>

<!--[if !IE]><!-->
<script type="text/javascript">
    window.jQuery || document.write("<script src='${ctxStatic}/assets/js/jquery.min.js'>"+"<"+"/script>");
</script>
<!--<![endif]-->

<!--[if IE]>
<script type="text/javascript">
window.jQuery || document.write("<script src='${ctxStatic}/assets/js/jquery1x.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

<!-- inline styles related to this page -->

<!-- ace settings handler -->
<script src="${ctxStatic}/assets/js/ace-extra.min.js"></script>
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

<!--[if lte IE 8]>
<script src="${ctxStatic}/assets/js/html5shiv.js"></script>
<script src="${ctxStatic}/assets/js/respond.min.js"></script>
<![endif]-->