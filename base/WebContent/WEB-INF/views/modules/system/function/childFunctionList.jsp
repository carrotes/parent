<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>${functionName }</title>
</head>
<body>
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal"
			aria-hidden="true">×</button>
		<h4 class="modal-title" id="myModalLabel">${functionName }</h4>
	</div>
	<div class="modal-body">
	<table id="simple-table"
				class="table table-striped table-bordered table-hover">
				<thead>
					<tr>
						<th>名称</th>
						<th class="hidden-xs">URL</th>
						<th class="hidden-480">图标</th>
						<th class="hidden-480"><i
							class="ace-icon fa fa-clock-o bigger-110 hidden-480"></i> 角色</th>
						<th class="hidden-480">状态</th>
						<th>操作</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach var="function" items="${mapList}">
						<tr>
							<td>${function.functionName }</td>
							<td class="hidden-xs">${function.functionUrl }</td>
							<td class="hidden-480"><i
								class="menu-icon ${function.functionIcon}"></i></td>
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
								<div>
									<div class="inline pos-rel">
										<button class="btn btn-minier btn-primary dropdown-toggle"
											data-toggle="dropdown" data-position="auto">
											<i class="ace-icon fa fa-cog icon-only bigger-110"></i>
										</button>

										<ul
											class="dropdown-menu dropdown-only-icon dropdown-yellow dropdown-menu-right dropdown-caret dropdown-close">
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
	</div>
	<!-- #section:basics/footer -->
	<div class="modal-footer">
		<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
	</div>
	<!-- /.span -->
</body>
</html>