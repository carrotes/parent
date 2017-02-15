function loadFunctions(url) {
	$.getJSON(url,function(result) {
		if (result.state == 1) {
			$("#pcFunctionScop").empty();
			$("#phoneFunctionScop").empty();
			for ( var i in result.data) {
				functionUrl = result.data[i].functionUrl;
				functionIcon = result.data[i].functionIcon;
				functionName = result.data[i].functionName;
				$liPC = $('<li class="hover"><a href="javascript:void(0);" onclick="sendAjax('
						+ functionUrl
						+ ')" data-target="#main-data"> <i class="menu-icon '
						+ functionIcon
						+ '"></i> <span class="menu-text">'
						+ functionName + '</span></a> </li>');
				$("#pcFunctionScop").append($liPC);

				$liPhone = $('<li class=""><a href="javascript:void(0);" class="dropdown-toggle" onclick="sendAjax('
						+ functionUrl
						+ ')" data-target="#main-data"><i class="menu-icon '
						+ functionIcon
						+ '"></i> <span class="menu-text h4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;'
						+ functionName + '</span></a></li>');

				$("#phoneFunctionScop").append($liPhone);
			}
		} else {
		}
	})
}