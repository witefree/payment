$(document).ready(
		function() {
			$.ajax({
				type : "POST",
				url : "http://localhost:8080/payment/app/attendance/list",
				dataType : "json",
				data:{name:"wjx"},
				success : function(data) {
					jQuery.each(data,function(i,item){
						alert(item.id+","+item.name);
					});
				},
				error : function (data){
					alert("error");
				}
			});
		});