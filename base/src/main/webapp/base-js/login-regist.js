//添加验证规则
jQuery.validator.addMethod("isRightfulString", function(value, element) {
	return this.optional(element) || /^[A-Za-z0-9_-]+$/.test(value);
}, "判断是否为合法字符(a-zA-Z0-9-_)");

jQuery(function() {
	$("#warning").show();
	$("#loginSubmit").on('click',function(){
		$("#login").submit();
	})
	
	
	$("#login").validate({
		debug : false,
		errorElement : 'div',
		errorClass : 'help-block red',
		onkeyup : false,
		rules : {
			user_account : {
				required : true,
				minlength : 5,
				isRightfulString : true
			},
			user_password : {
				required : true,
				minlength : 5
			}
		},
		messages : {
			user_account : {
				required : "帐号不能为空",
				minlength : "帐号格式不正确",
				isRightfulString : "不能包含特殊字符"
			},
			user_password : {
				required : "密码不能为空",
				minlength : "密码格式不正确"
			}
		},
		submitHandler : function(form) {
			$(form).ajaxSubmit({
				success:function(result){
					if(result.state==1){
						location.href=result.data;
					}else{
						$("#wrong").text(result.message);
						$("#wrong").removeClass("hidden");
					}
				}
			});
		}
	})
})