$(document).ready(function () {
	
	var url = "http://localhost:8080/applications";
	
	var table = $('#tableApplications').DataTable({
	       dom: 'lBfrtip',
	        "processing": true,
	        "ajax": {
	            "url": url,
	            dataSrc: ''
	        },
	        "columns": [
	            {"data": "processBeginningDate"},
	            {"data": "description"},
	            {"data": "position"},
	            {"data": "salary"},
				{"data": "studentName"},
				{"data": "companyName"},
	            ]
	    });

	$("#addAppBtn").on('click', function () {
		window.location.replace("http://localhost:8080/test/addapplication");
	})

	$('#tableApplications').on( 'click', 'tbody tr', function () {

		//id = table.row(this).data().id;
		//$('#tmSessionType').val(table.row(this).data().sessionType);

		$('#processBeginningDate').val(table.row(this).data().processBeginningDate);
		$('#description').val(table.row(this).data().description);
		$('#approved').val(table.row(this).data().approved);
		$('#position').val(table.row(this).data().position);
		$('#salary').val(table.row(this).data().salary);
		$('#id').val(table.row(this).data().id);
		$('#studentId').val(table.row(this).data().studentId);
		$('#companyId').val(table.row(this).data().companyId);


		$('#myModal').modal('show');

	} );

});

function deleteAction() {
	$.ajax({
		url: "http://localhost:8080/applications/"+$("#id").val(),
		type: 'DELETE',
		success: function (session) {
			window.location.replace("http://localhost:8080/test/applications");
		},
		error: function (data) {
			$("#sucess").text("");

			var messages = "";

			if (data.responseJSON.validationMessages) {
				$.each(data.responseJSON.validationMessages, function (index, errorMessage) {
					messages += errorMessage + "<br>"
				});
			} else {
				messages = data.responseJSON.userMessage;
			}

			$("#error").text("");
			$("#error").append(messages);
		}
	});
};

function updateAction() {
	let processBeginningDateP = $("#processBeginningDate").val();
	let descriptionP = $("#description").val();
	let approvedP = $("#approved").val();
	let positionP = $("#position").val();
	let salaryP = $("#salary").val();
	let idP = $("#id").val();
	let studentIdP = $("#studentId").val();
	let companyIdP = $("#companyId").val();

	let dataObject = { processBeginningDate:processBeginningDateP, description:descriptionP, approved:approvedP,
		position:positionP, salary: salaryP, id:idP};

	let jsonData = JSON.stringify(dataObject);

	$.ajax({
		url: "http://localhost:8080/applications",
		type: 'PUT',
		data: jsonData,
		contentType: 'application/json',   // Sends
		success: function (session) {
			window.location.replace("http://localhost:8080/test/applications");
		},
		error: function (data) {
			console.log("error");
		}
	});
}

