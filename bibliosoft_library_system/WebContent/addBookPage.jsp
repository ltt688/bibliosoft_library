<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
</head>
<body>
	<div class="panel admin-panel">
		<div class="panel-head" id="add">
			<strong><span class="icon-pencil-square-o"></span>Add Book</strong>
		</div>
		<div class="body-content">
			<form method="post" class="form-x" action="">
				<div class="form-group">
					<div class="label">
						<label>ID:</label>
					</div>
					<div class="label" style="background-color:#99CCCC;text-align:center;">
					<%
					String showId=request.getAttribute("id").toString();
					out.print(showId);
					%>
					</div>
				</div>

				<div class="form-group">
					<div class="label">
						<label>Title:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="title"
							data-validate="required:Please input Book Name" />
						<div class="tips"></div>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label>Author:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="author"
							data-validate="required:Please input Book Writer" />
						<div class="tips"></div>
					</div>
				</div>
				
				
				<div class="form-group">
					<div class="label">
						<label>Publisher:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="publisher"
							data-validate="required:Please input Book Translator" />
						<div class="tips"></div>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label>Book Info:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="book_info"
							data-validate="required:Please input Book Translator" />
						<div class="tips"></div>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label>China Type:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="china_type"
							data-validate="required:Please input Book Translator" />
						<div class="tips"></div>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label>Science Type:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="science_type"
							data-validate="required:Please input Book Translator" />
						<div class="tips"></div>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label>Publish Date:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="publish_date"
							data-validate="required:Please input Book Translator" />
						<div class="tips"></div>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label>Book Price:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="book_price"
							data-validate="required:Please input Book Translator" />
						<div class="tips"></div>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label>Book State:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="book_state"
							data-validate="required:Please input Book Translator" />
						<div class="tips"></div>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label>Location:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="location"
							data-validate="required:Please input Book Translator" />
						<div class="tips"></div>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label></label>
					</div>
					<div class="field">
						<button class="button bg-main icon-check-square-o" type="submit">
							submit</button>
					</div>
				</div>
			</form>
		</div>
	</div>

</body>
</html>