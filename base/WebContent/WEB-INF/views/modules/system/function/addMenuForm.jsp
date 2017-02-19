<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>添加菜单</title>
</head>

<body>
	<div id="main">
		<script src="${ctxBase}/form/com.itcuc.form.js"></script>
		<div class="page-header">
			<h1>添加菜单</h1>
		</div>
		<div class="row">
			<div class="col-xs-12">
				<form class="form-horizontal" role="form" id="form" action="system/function/addNewMenu" method="post">
					<!-- #section:elements.form -->
					<div class="form-group">
						<div class="col-sm-9">
							<input type="text" id="functionName" placeholder="输入名称"
								name="functionName" class="col-xs-10 col-sm-5" />
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-9">
							<input type="text" id="functionURL" placeholder="输入URL"
								name="functionUrl" class="col-xs-10 col-sm-5" />
						</div>
					</div>


					<div class="form-group">
						<div class="col-xs-10 col-sm-5">
							<!-- #section:plugins/input.select2 -->
							<select multiple id="state" name="roles"
								class="select2 tag-input-style" data-placeholder="点击选择角色">
							</select>
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-9">
							<div class="btn-group" data-toggle="buttons">
								<label class="btn btn-warning btn-xs active">
									<input type="radio"
									name="functionDisabled" id="option2" autocomplete="off" value="1" checked> 禁用
								</label> 
								<label class="btn btn-success btn-xs "> 
									<input type="radio"
									name="functionDisabled" id="option3" autocomplete="off" value="0"> 启用
								</label>
							</div>
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-9">
							<input type="text" id="functionIcon" placeholder="点击选择图标"
								readonly name="functionIcon" class="col-xs-10 col-sm-5"
								onclick="modalShow('system/icon/getIcons?ts='+Math.random(),'#widget-modal');" />
						</div>
					</div>
				</form>
				<div class="form-group">
					<div class="col-sm-9">
						<button class="btn btn-white btn-info btn-round" id="btnSubmit" onclick="$('#form').submit()">
							<i class="ace-icon fa fa-floppy-o bigger-120 blue"></i>提交
						</button>
						<button class="btn btn-white btn-default btn-round"
							onclick="pageRedirect('system/function/${backUrl}','#ajax-target')">
							<i class="ace-icon fa fa-undo bigger-120 red"></i>返回
						</button>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script>
		jQuery(function($) {
			$("#widget-modal").on("hidden.bs.modal", function() {
				var icon = getCookie("icon");
				clearCookie("icon");
				$("#functionIcon").removeClass("has-error").val(icon);
			});

			getRoles();
		})
		function getRoles() {
			$.getJSON("system/role/getRoles", function(result) {
				$("#state").empty();
				if (result.state == 1) {
					for (i in result.data) {
						var roleId = result.data[i].roleId;
						var roleName = result.data[i].roleName;
						var $option = '<option value="'+ roleId +'">'
								+ roleName + '</option>';
						$("#state").append($option);
					}
				} else {
					var $option = '<option>' + 暂无数据 + '</option>'
					$("#state").append($option);
				}
			})
		}
	</script>
	<script>
	jQuery(function($){
		$("#form").validate({
			errorElement: 'div',
			errorClass: 'help-block',
			rules : {
				functionName : {
					required:true,
					maxlength:4
				},
				functionUrl : {
					required : true
				},
				functionIcon : {
					required : true
				}
			},
			messages : {
				functionName:{required:"请输入菜单名称",maxlength:"请控制在四个字以内"},
				functionUrl:{required:"请输入url"},
				functionIcon:{required:"请选择图标"}
			},
			highlight: function (e) {
				$(e).closest('.form-group').removeClass('has-info').addClass('has-error');
			},
	
			success: function (e) {
				$(e).closest('.form-group').removeClass('has-error');//.addClass('has-info');
				$(e).remove();
			},
			submitHandler: function(form){
				showWait();
				$(form).ajaxSubmit({
					target: "ajax-target"
				})
				hideWait();
			}
		})
	})
</script>
</body>
</html>