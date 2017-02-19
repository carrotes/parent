<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/WEB-INF/views/include/head.jsp"%>

<title>胡萝卜联盟</title>
</head>
<body class="no-skin">

	<!--  login and regist -->
	<!-- #section:basics/navbar.layout -->
	<div id="navbar" class="navbar navbar-default    navbar-collapse">
		<script type="text/javascript">
			try {
				ace.settings.check('navbar', 'fixed')
			} catch (e) {
			}
		</script>

		<div class="navbar-container" id="navbar-container">
			<!-- #section:basics/sidebar.mobile.toggle -->
			<button type="button" class="navbar-toggle menu-toggler pull-left"
				id="menu-toggler" data-target="#sidebar">
				<span class="sr-only">Toggle sidebar</span> <span class="icon-bar"></span>

				<span class="icon-bar"></span> <span class="icon-bar"></span>
			</button>

			<!-- /section:basics/sidebar.mobile.toggle -->
			<div class="navbar-header pull-left">
				<!-- #section:basics/navbar.layout.brand -->
				<a href="index" class="navbar-brand"> ${logo } <span
					class="white" id="id-text2">${productName}</span>
				</a>

				<!-- /section:basics/navbar.layout.brand -->

				<!-- #section:basics/navbar.toggle -->
				<button class="pull-right navbar-toggle navbar-toggle-img collapsed"
					type="button" data-toggle="collapse" data-target=".navbar-buttons">
					<span class="sr-only">Toggle user menu</span> <img
						src="getHead?userId=${user.userId}" alt="user image" />
				</button>

				<!-- /section:basics/navbar.toggle -->
			</div>

			<!-- #section:basics/navbar.dropdown -->
			<div
				class="navbar-buttons navbar-header pull-right  collapse navbar-collapse"
				role="navigation">
				<ul class="nav ace-nav">
					<li class="transparent"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#"> <i
							class="ace-icon fa fa-bell icon-animated-bell"></i>
					</a>

						<div
							class="dropdown-menu-right dropdown-navbar dropdown-menu dropdown-caret dropdown-close">
							<div class="tabbable">
								<ul class="nav nav-tabs">
									<li class="active"><a data-toggle="tab"
										href="#navbar-tasks">提醒<span class="badge badge-danger">4</span>
									</a></li>

									<li><a data-toggle="tab" href="#navbar-messages"> 消息 <span
											class="badge badge-danger">5</span>
									</a></li>
								</ul>
								<!-- .nav-tabs -->

								<div class="tab-content">
									<div id="navbar-tasks" class="tab-pane in active">
										<ul class="dropdown-menu-right dropdown-navbar dropdown-menu">
											<li class="dropdown-content">
												<ul class="dropdown-menu dropdown-navbar">
													<li><a href="#">
															<div class="clearfix">
																<span class="pull-left">Software Update</span> <span
																	class="pull-right">65%</span>
															</div>

															<div class="progress progress-mini">
																<div style="width: 65%" class="progress-bar"></div>
															</div>
													</a></li>

													<li><a href="#">
															<div class="clearfix">
																<span class="pull-left">Hardware Upgrade</span> <span
																	class="pull-right">35%</span>
															</div>

															<div class="progress progress-mini">
																<div style="width: 35%"
																	class="progress-bar progress-bar-danger"></div>
															</div>
													</a></li>

													<li><a href="#">
															<div class="clearfix">
																<span class="pull-left">Unit Testing</span> <span
																	class="pull-right">15%</span>
															</div>

															<div class="progress progress-mini">
																<div style="width: 15%"
																	class="progress-bar progress-bar-warning"></div>
															</div>
													</a></li>

													<li><a href="#">
															<div class="clearfix">
																<span class="pull-left">Bug Fixes</span> <span
																	class="pull-right">90%</span>
															</div>

															<div
																class="progress progress-mini progress-striped active">
																<div style="width: 90%"
																	class="progress-bar progress-bar-success"></div>
															</div>
													</a></li>
												</ul>
											</li>

											<li class="dropdown-footer"><a href="#"> 查看详情 <i
													class="ace-icon fa fa-arrow-right"></i>
											</a></li>
										</ul>
									</div>
									<!-- /.tab-pane -->

									<div id="navbar-messages" class="tab-pane">
										<ul class="dropdown-menu-right dropdown-navbar dropdown-menu">
											<li class="dropdown-content">
												<ul class="dropdown-menu dropdown-navbar">
													<li><a href="#"> <img
															src="${ctxStatic}/assets/avatars/avatar.png"
															class="msg-photo" alt="Alex's Avatar" /> <span
															class="msg-body"> <span class="msg-title">
																	<span class="blue">Alex:</span> Ciao sociis natoque
																	penatibus et auctor ...
															</span> <span class="msg-time"> <i
																	class="ace-icon fa fa-clock-o"></i> <span>a
																		moment ago</span>
															</span>
														</span>
													</a></li>

													<li><a href="#"> <img
															src="${ctxStatic}/assets/avatars/avatar3.png"
															class="msg-photo" alt="Susan's Avatar" /> <span
															class="msg-body"> <span class="msg-title">
																	<span class="blue">Susan:</span> Vestibulum id ligula
																	porta felis euismod ...
															</span> <span class="msg-time"> <i
																	class="ace-icon fa fa-clock-o"></i> <span>20
																		minutes ago</span>
															</span>
														</span>
													</a></li>

													<li><a href="#"> <img
															src="${ctxStatic}/assets/avatars/avatar4.png"
															class="msg-photo" alt="Bob's Avatar" /> <span
															class="msg-body"> <span class="msg-title">
																	<span class="blue">Bob:</span> Nullam quis risus eget
																	urna mollis ornare ...
															</span> <span class="msg-time"> <i
																	class="ace-icon fa fa-clock-o"></i> <span>3:15
																		pm</span>
															</span>
														</span>
													</a></li>

													<li><a href="#"> <img
															src="${ctxStatic}/assets/avatars/avatar2.png"
															class="msg-photo" alt="Kate's Avatar" /> <span
															class="msg-body"> <span class="msg-title">
																	<span class="blue">Kate:</span> Ciao sociis natoque
																	eget urna mollis ornare ...
															</span> <span class="msg-time"> <i
																	class="ace-icon fa fa-clock-o"></i> <span>1:33
																		pm</span>
															</span>
														</span>
													</a></li>

													<li><a href="#"> <img
															src="${ctxStatic}/assets/avatars/avatar5.png"
															class="msg-photo" alt="Fred's Avatar" /> <span
															class="msg-body"> <span class="msg-title">
																	<span class="blue">Fred:</span> Vestibulum id penatibus
																	et auctor ...
															</span> <span class="msg-time"> <i
																	class="ace-icon fa fa-clock-o"></i> <span>10:09
																		am</span>
															</span>
														</span>
													</a></li>
												</ul>
											</li>

											<li class="dropdown-footer"><a href="#"> 查看所有<i
													class="ace-icon fa fa-arrow-right"></i>
											</a></li>
										</ul>
									</div>
									<!-- /.tab-pane -->
								</div>
								<!-- /.tab-content -->
							</div>
							<!-- /.tabbable -->
						</div> <!-- /.dropdown-menu --></li>

					<!-- #section:basics/navbar.user_menu -->
					<li class="light-blue"><a data-toggle="dropdown" href="#"
						class="dropdown-toggle"> <img class="nav-user-photo"
							src="getHead?userId=${user.userId }" alt="${user.userName }的头像" />
							<span class="user-info"> <small>欢迎,</small>
								${user.userName}
						</span> <i class="ace-icon fa fa-caret-down"></i>
					</a>

						<ul
							class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
							<li><a href="javascript:void(0);" id="userSetting"> <i
									class="ace-icon fa fa-cog"></i> 个人设置
							</a></li>

							<li><a href="javascript:void(0)" id="userProfile"> <i
									class="ace-icon fa fa-user"></i> 个人信息
							</a></li>

							<li class="divider"></li>

							<li><a href="javascript:void(0);" id="layOut"> <i
									class="ace-icon fa fa-power-off"></i> 退出登录
							</a></li>
						</ul></li>

					<!-- /section:basics/navbar.user_menu -->
				</ul>
			</div>

			<!-- /section:basics/navbar.dropdown -->
		</div>
		<!-- /.navbar-container -->
	</div>

	<!-- /section:basics/navbar.layout -->
	<div class="main-container" id="main-container">
		<script type="text/javascript">
			try {
				ace.settings.check('main-container', 'fixed')
			} catch (e) {
			}
		</script>

		<!-- #section:basics/sidebar -->
		<div id="sidebar" class="sidebar                  responsive">
			<script type="text/javascript">
				try {
					ace.settings.check('sidebar', 'fixed')
				} catch (e) {
				}
			</script>
			<!-- 快捷方式 -->
			<div class="sidebar-shortcuts" id="sidebar-shortcuts">
				<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
					<button class="btn btn-success">
						<i class="ace-icon fa fa-signal"></i>
					</button>

					<button class="btn btn-info">
						<i class="ace-icon fa fa-pencil"></i>
					</button>

					<!-- #section:basics/sidebar.layout.shortcuts -->
					<button class="btn btn-warning">
						<i class="ace-icon fa fa-users"></i>
					</button>

					<button class="btn btn-danger" onclick="$('.sidebar').toggleClass('menu-min')">
						<i class="ace-icon fa fa-reply"></i>
					</button>

					<!-- /section:basics/sidebar.layout.shortcuts -->
				</div>

				<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
					<span class="btn btn-success"></span> <span class="btn btn-info"></span>

					<span class="btn btn-warning"></span> <span class="btn btn-danger"></span>
				</div>
			</div>
			<!-- end 快捷方式 -->
			<!-- /.sidebar-shortcuts -->

			<ul class="nav nav-list">
				<c:forEach var="fun" items="${list}" varStatus="num">
					<li class=""><a href="javascript:void(0);"
						class="dropdown-toggle"
						onclick="loadFunctions('system/function/show?functionId=${fun.functionId}&userId=${user.userId}')">
							<i class="menu-icon ${fun.functionIcon }"></i> <span
							class="menu-text h4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${fun.functionName}</span>
					</a></li>
				</c:forEach>
			</ul>
			<!-- /.nav-list -->

			<!-- #section:basics/sidebar.layout.minimize -->
			<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
				<i class="ace-icon fa fa-angle-double-left"
					data-icon1="ace-icon fa fa-angle-double-left"
					data-icon2="ace-icon fa fa-angle-double-right"></i>
			</div>
			<ul class="nav nav-list hidden-md hidden-lg" id="phoneFunctionScop">

			</ul>
			<!-- /section:basics/sidebar.layout.minimize -->
			<script type="text/javascript">
				try {
					ace.settings.check('sidebar', 'collapsed')
				} catch (e) {
				}
			</script>
		</div>


		<!-- /section:basics/sidebar -->
		<div class="main-content">
			<div class="main-content-inner">
				<div class="page-content hidden-xs">
					<div class="row">
						<div class="col-xs-12">
							<!-- PAGE CONTENT BEGINS -->
							<div class="">
								<button data-target="#sidebar2" data-toggle="collapse"
									type="button" class="pull-left navbar-toggle collapsed">
									<span class="sr-only">Toggle sidebar</span> <i
										class="ace-icon fa fa-dashboard white bigger-125"></i>
								</button>

								<div id="sidebar2"
									class="sidebar h-sidebar navbar-collapse collapse">
									<ul class="nav nav-list" data-target="#" id="pcFunctionScop">

									</ul>
									<!-- /.nav-list -->
								</div>
								<!-- .sidebar -->
							</div>
							<!-- PAGE CONTENT ENDS -->
						</div>
						<!-- /.col -->
					</div>
					<!-- /.row -->
				</div>
				<!-- /.page-content -->
			</div>
			<div class="main-content-inner">
				<div class="col-xs-12">
					<div class="page-content" id="ajax-target">
						<div class="spinner">
							<div class="double-bounce1"></div>
							<div class="double-bounce2"></div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- /.main-content -->

		<div class="footer">
			<div class="footer-inner">
				<!-- #section:basics/footer -->
				<div class="footer-content">
					<span class="bigger-120">${logo} ${productName} ${copyright }
						${year } </span> &nbsp; &nbsp; <span class="action-buttons"> <a
						href="#"> <i class="ace-icon fa fa-qq light-blue bigger-150"></i>
					</a> <a href="#"> <i class="ace-icon fa fa-weixin green bigger-150"></i>
					</a>
					</span>
				</div>

				<!-- /section:basics/footer -->
			</div>
		</div>

		<a href="#" id="btn-scroll-up"
			class="btn-scroll-up btn btn-sm btn-inverse"> <i
			class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
		</a>
	</div>
	<!-- inline scripts related to this page -->
	<div class="modal fade" id="widget-modal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
				</div>
				<div class="modal-body"></div>
				<div class="modal-footer">
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<%@ include file="/WEB-INF/views/include/script.jsp"%>
	<script src='${ctxBase}/sys/com.itcuc.system.js'></script>
	<script src='${ctxBase}/sys/com.itcuc.public.function.js'></script>
</body>
</html>