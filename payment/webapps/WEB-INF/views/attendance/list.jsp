<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="panel-body">
    <form id ="firstUpdateForm" action="/payment/app/attendance/upload" method="post"
        enctype="multipart/form-data" class="form-horizontal" role="form" target="hidden_frame">
        <div class="modal-body">
            <div class="form-group">
            <label class="col-sm-3 control-label">上传文件</label>
            <div class="col-sm-5">
                <input type="file" id="file" name="file">
            </div>
            </div>
        </div>
        <div class="modal-footer">
            <div id="firstUploadSucceed" style="display: none;">
                <strong>新增成功！</strong><span id="firstUploadSucceedMsg"></span>
            </div>
            <div id="firstUploadFailed" style="display: none;">
                <strong>对不起！新增失败</strong><span id="firstUploadFailedMsg"></span>
            </div>
            <button id="createPeriadBtn" type="submit" class="btn btn-default">确定 </button>
        </div>
    </form> 
    <iframe name='hidden_frame' id="hidden_frame" style='display:none'></iframe>
</div>
</body>
</html>