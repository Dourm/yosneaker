

var login={
		sub:function(){
			var loginName=$("#loginName").val();
			var password=$("#password").val();
			var date = new Date();
			
			$.ajax({
				dataType:"json",
				url:"/admin/userInfo/login.do?t="+date.getTime(),
				data:{loginName:loginName,password:password},
				success :function(r){
					if(r && r.success){
						window.location.href='/admin/shtml/frame.shtml';
					}else{
						document.getElementById("showmsg").style.display="";
						document.getElementById("msgcontent").innerHTML=r.msg;
					}
				}
			});
		}
	}
	function closeMsg(){
		document.getElementById("showmsg").style.display="none";
	}