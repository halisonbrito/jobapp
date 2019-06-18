$(document).ready(function () {
	
	$("#").on('click', function (evt) {
		
        var studentId = $("#studentId").val();
        var firstName = $("#firstName").val();
        var lastName = $("#lastName").val();
        var relationship = $("#relationship").val();
        var company = $("#company").val();
        var jobTitle = $("#jobTitle").val();
        var cemail = $("#cemail").val();
        var cphone = $("#cphone").val();
        var pemail = $("#pemail").val();
        var pphone = $("#pphone").val();
        
        var listContact = [{email:cemail,phone:cphone,type:'Company'}
        				  ,{email:pemail,phone:pphone,type:'Personal'}];

		var dataObject = { studentId:studentId, firstName:firstName, contacts:listContact,
					 relationship:relationship, company:company, jobTitle:jobTitle };
		
		var jsonData = JSON.stringify(dataObject);
		
		
        $.ajax({
            url: "http://localhost:888/references",
            type: 'POST',
            data: jsonData,
            contentType: 'application/json',   // Sends
            success: function (session) {
                $("#sucess").text("Success!");
                $("#error").text("");
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
        })		
		
		
		
		
		
	});
	
});