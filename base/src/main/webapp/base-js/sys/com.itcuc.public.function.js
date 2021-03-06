function pageRedirect(url, id) {
	showWait();
	$(id).load(url + "?ts=" + Math.random(), function() {
		hideWait();
	});
}

function pageSubmit(url, id, target) {
	var options = {
		target : target,
		url : url,
		type : "post"
	}
	
	$(id).submit(function(){
		$(this).ajaxSubmit(options);
	})
}

function modalShow(url,target){
	var options = {
			backdrop:false,
			show:true,
			remote:url
	}
	$(target).modal(options);
	$(target).on("hidden.bs.modal", function() {  
	  $(this).removeData("bs.modal"); 
	  /*modal页面加载$()错误,由于移除缓存时加载到<span style="color: rgb(51, 51, 255);"><div class="modal-content"></div></span>未移除的数据，手动移除加载的内容*/
	  $(this).find(".modal-content").children().remove();  
	});
}

/**
 * Cookie utils
 * @param c_name
 * @param value
 * @param expiredays
 * @returns
 */
function setCookie(c_name, value, expiredays) {
    var exdate = new Date()
    exdate.setDate(exdate.getDate() + expiredays)
    document.cookie = c_name + "=" + escape(value)
            + ((expiredays == null) ? "" : ";expires=" + exdate.toGMTString())
}

function getCookie(c_name) {
    if (document.cookie.length > 0) {
        c_start = document.cookie.indexOf(c_name + "=");
        if (c_start != -1) {
            c_start = c_start + c_name.length + 1;
            c_end = document.cookie.indexOf(";", c_start);
            if (c_end == -1) {
                c_end = document.cookie.length;
            }
            return unescape(document.cookie.substring(c_start, c_end));
        }
    }
    return "";
}

function clearCookie(c_name) {
    setCookie(c_name, "", -1);
}