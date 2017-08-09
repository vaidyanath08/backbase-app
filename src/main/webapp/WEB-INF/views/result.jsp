<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Login</title>

<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script>
	function getTransactionDetails(url, ID) {

		$.ajax({
			type : 'GET',
			url : url,
			dataType : 'json',
			success : function(res) {
				console.log(res);

				getDetail(res, ID);

			}
		});

	}

	function getDetail(data, ID) {
		
		$('#' + ID).html("");

		if (ID === 'showData3') {

			$('#' + ID).append(data);
		}

		else {

			console.log(data);
			console.log(ID);
			var i;
			var names;
			for (i = 0; i < data.length; i++) {
				console.log(data[i].id);
				names = "<b>id:</b>" + data[i].id + "\t\t<b>type:</b>"
						+ data[i].details.type + "\t\t<b>Posted Date:</b>"
						+ data[i].details.posted + "\t\t<b>Completed Date:</b>"
						+ data[i].details.completed + "\t\t\t\t<b>Amount:</b>"
						+ data[i].details.value.amount + "</br>";

				$('#' + ID).append(names);

			}
		}
	}
</script>

</head>
<body>
	<div class="container">
		<div class="content">
			<a href="<c:url value="/j_spring_security_logout" />"> Logout</a>

			<div>
				<br />
				<br />
				<h2>Transaction Details :</h2>
				<button name="click" value="click"
					onclick="getTransactionDetails('<%= request.getContextPath() %>/transactions/transactionlist','showData1')">Get
					All Transactions</button>
				<div id="showData1"></div>

			</div>
			<div>
				<br />
				<br />
				<h2>Transactions on Type Details :</h2>
				<button name="click" value="click"
					onclick="getTransactionDetails('<%= request.getContextPath() %>/transactions/transactionlist/sandbox-payment','showData2')">Get
					Transaction On Type</button>
				 <div id="showData2"></div>

			</div>
			<div>
				<br />
				<br />
				<h2>Amount Details On TransactionType :</h2>
				<button name="click" value="click"
					onclick="getTransactionDetails('<%= request.getContextPath() %>/transactions/transactionlist/totaltxnAmount/sandbox-payment','showData3')">Get
					Total Amount On Transaction</button>
				<div id="showData3"></div>

			</div>


		</div>
	</div>
</body>
</html>
