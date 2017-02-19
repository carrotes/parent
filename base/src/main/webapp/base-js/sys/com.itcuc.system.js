
function loadFunctions(url) {
	$.getJSON(url,function(result) {
		if (result.state == 1) {
			$("#pcFunctionScop").empty();
			$("#phoneFunctionScop").empty();
			for ( var i in result.data) {
				functionUrl = result.data[i].functionUrl;
				functionIcon = result.data[i].functionIcon;
				functionName = result.data[i].functionName;
				$liPC = $('<li class="hover"><a data-trigger="ajax" href="javascript:void(0);" onclick="getPage(\''
						+ functionUrl
						+ '\')" data-target="#ajax-target"> <i class="menu-icon '
						+ functionIcon
						+ '"></i> <span class="menu-text">'
						+ functionName + '</span></a> </li>');
				$("#pcFunctionScop").append($liPC);

				$liPhone = $('<li class=""><a data-trigger="ajax" href="javascript:void(0);" class="dropdown-toggle" onclick="getPage(\''
						+ functionUrl
						+ '\')" data-target="#ajax-target"><i class="menu-icon '
						+ functionIcon
						+ '"></i> <span class="menu-text h4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'
						+ functionName + '</span></a></li>');

				$("#phoneFunctionScop").append($liPhone);
			}
		} else {
		}
	})
}

function getPage(url){
	showWait();
	$("#ajax-target").load(url+"?ts="+Math.random(),function(){
		hideWait();
	});
}