<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>功能菜单</title>
</head>
<body>
	<script src="${ctxBase}/list/com.itcuc.list.js"></script>
	<div class="page-header">
		<h1>
			功能菜单 <small><a href="javascript:void(0);" onclick="getPage('/system/function/addMenu?back=functionList')"
				class="btn btn-white btn-info btn-bold btn-minier" data-trigger="ajax" data-target="#ajax-target">&nbsp;添加菜单</a></small>
		</h1>
	</div>
	<!-- /.page-header -->

	<div class="row">
		<div class="col-xs-12">
			<!-- PAGE CONTENT BEGINS -->
			<table id="simple-table"
				class="table table-striped table-bordered table-hover">
				<thead>
					<tr>
						<th class="center"></th>
						<th>名称</th>
						<th class="hidden-xs">URL</th>
						<th class="hidden-480"><i
							class="ace-icon fa fa-diamond bigger-110"></i>图标</th>

						<th class="hidden-480"><i
							class="ace-icon fa fa-user bigger-110"></i> 角色</th>
						<th class="hidden-480">状态</th>

						<th>操作</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach var="function" items="${mapList}">
						<tr>
							<td class="center"><a data-toggle="modal"
								data-backdrop="false" data-target="#widget-modal"
								href="system/function/childFunction?functionId=${function.functionId}&functionName=${function.functionName}">
									<i class="ace-icon fa fa-search-plus bigger-120 green"></i>
							</a></td>

							<td>${function.functionName }</td>
							<td class="hidden-xs">${function.functionUrl }</td>
							<td class="hidden-480"><i
								class="menu-icon ${function.functionIcon}">&nbsp;&nbsp;${function.functionIcon }</i></td>
							<td class="hidden-480"><c:forEach var="role"
									items="${function.functionRoles }">
									<span class="label label-sm label-info">${role.roleName}</span>
								</c:forEach></td>

							<td class="hidden-480"><c:if
									test="${function.functionDisabled == 1}">
									<span class="label label-sm label-danger">停用</span>
								</c:if> <c:if test="${function.functionDisabled == 0}">
									<span class="label label-sm label-success">启用</span>
								</c:if></td>
							<td>
								<div class="hidden-sm hidden-xs btn-group">
									<button class="btn btn-xs btn-success">
										<i class="ace-icon fa fa-plus bigger-120"></i>
									</button>

									<button class="btn btn-xs btn-info">
										<i class="ace-icon fa fa-pencil bigger-120"></i>
									</button>

									<button class="btn btn-xs btn-danger">
										<i class="ace-icon fa fa-trash-o bigger-120"></i>
									</button>
								</div>

								<div class="hidden-md hidden-lg">
									<div class="inline pos-rel">
										<button class="btn btn-minier btn-primary dropdown-toggle"
											data-toggle="dropdown" data-position="auto">
											<i class="ace-icon fa fa-cog icon-only bigger-110"></i>
										</button>

										<ul
											class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
											<li><a href="#" class="tooltip-info" data-rel="tooltip"
												title="View"> <span class="green"> <i
														class="ace-icon fa fa-plus bigger-120"></i>
												</span>
											</a></li>

											<li><a href="#" class="tooltip-success"
												data-rel="tooltip" title="Edit"> <span class="green">
														<i class="ace-icon fa fa-pencil-square-o bigger-120"></i>
												</span>
											</a></li>

											<li><a href="#" class="tooltip-error" data-rel="tooltip"
												title="Delete"> <span class="red"> <i
														class="ace-icon fa fa-trash-o bigger-120"></i>
												</span>
											</a></li>
										</ul>
									</div>
								</div>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<!-- /.col -->
		</div>

	</div>
	<script>
		
	</script>
</body>
</html>