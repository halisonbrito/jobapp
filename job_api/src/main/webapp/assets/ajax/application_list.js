$(document).ready(function () {
	
	var url = "http://localhost:8080/applications";
	
	var table = $('#tableApplications').DataTable({
	       dom: 'lBfrtip',
	        "processing": true,
            "paging": false,
	        "ajax": {
	            "url": url,
	            dataSrc: ''
	        },
	        "columns": [
	            {"data": "processBeginningDate"},
	            {"data": "description"},
	            {"data": "position"},
	            {"data": "salary"},
                {"data": "approved"},
				{"data": "student","render":function (data,type,row) {
                    return data.name;
                }},
				{"data": "company","render":function (data,type,row) {
                    return data.name;
                }},
	            ]
	    });


	$("#addAppBtn").on('click', function () {
		window.location.replace("http://localhost:8080/add_application.jsp");
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
		$('#studentId').val(table.row(this).data().student.id);
		$('#companyId').val(table.row(this).data().company.id);

        if (table.row(this).data().approved == true){
            $('#apprButton').attr("hidden","true");
        }else {
            $('#apprButton').removeAttr("hidden");
        }

		$('#myModal').modal('show');

	} );


});

function deleteAction() {
	$.ajax({
		url: "http://localhost:8080/applications/"+$("#id").val(),
		type: 'DELETE',
		success: function (session) {
			window.location.replace("http://localhost:8080/list_applications.jsp");
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

function approvedAction() {
    $.ajax({
        url: "http://localhost:8080/applications/setapproved?appId="+$("#id").val()+"&approved=true",
        type: 'PUT',
        success: function (session) {
            window.location.replace("http://localhost:8080/list_applications.jsp");
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
	var processBeginningDateP = $("#processBeginningDate").val();
    var descriptionP = $("#description").val();
    var approvedP = $("#approved").val();
    var positionP = $("#position").val();
    var salaryP = $("#salary").val();
    var idP = $("#id").val();
    var studentIdP = $("#studentId").val();
    var companyIdP = $("#companyId").val();

    var dataObject = { processBeginningDate:processBeginningDateP, description:descriptionP, approved:approvedP,
		position:positionP, salary: salaryP, id:idP};

    var jsonData = JSON.stringify(dataObject);

	$.ajax({
		url: "http://localhost:8080/applications?studId="+studentIdP+"&compId="+companyIdP,
		type: 'PUT',
		data: jsonData,
		contentType: 'application/json',   // Sends
		success: function (session) {
			window.location.replace("http://localhost:8080/list_applications.jsp");
		},
		error: function (data) {
			console.log("error");
		}
	});
}

