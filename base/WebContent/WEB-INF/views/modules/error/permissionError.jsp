<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>权限不足</title>
</head>
<body>
	<div id="main">
		<div class="error-container">
			<div class="well">
				<h1 class="grey lighter smaller">
					<span class="blue bigger-125"> <i
						class="ace-icon fa fa-sitemap"></i> itcuc.com
					</span> 权限不足 <span class="red">${exc}</span>
				</h1>

				<hr />
				<h3 class="lighter smaller">别乱跑,这里你不该来,回去吧.</h3>

				<div>
					<div class="space"></div>
					<h4 class="smaller">请尝试如下方式:</h4>

					<ul class="list-unstyled spaced inline bigger-110 margin-15">
						<li><i class="ace-icon fa fa-hand-o-right blue"></i> 回到主页</li>

						<li><i class="ace-icon fa fa-hand-o-right blue"></i> 色诱管理员</li>

						<li><i class="ace-icon fa fa-hand-o-right blue"></i> 黑了我们</li>
					</ul>
				</div>

				<hr />
				<div class="space"></div>

				<div class="center">
					<a href="javascript:history.back()" class="btn btn-grey"> <i
						class="ace-icon fa fa-arrow-left"></i> 返回
					</a> <a href="/index" class="btn btn-primary"> <i
						class="ace-icon fa fa-tachometer"></i> 主页
					</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>