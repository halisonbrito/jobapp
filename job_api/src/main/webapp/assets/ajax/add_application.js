$(document).ready(function () {

    $.getJSON('http://localhost:8080/companies', function(j){
        var options = '';   
        j.forEach( c => {
        	options += '<option value="' + c.id+ '">' + c.name + '</option>';
        	console.log(c.name)
        	
        });
        $('#company').html(options).show();

    });
	
	
    $("#sbCadastrarGrupo").on('click', function (evt) {

        var processBeginningDateP = $("div #processBeginningDate").val();
        var descriptionP = $("div #description").val();
        var approvedP = $("div #approved").val();
        var positionP = $("div #position").val();
        var salaryP = $("div #salary").val();
        var studentP = $("div #student").val();
        var companyP = $("div #company").val();

        var dataObject = { processBeginningDate:processBeginningDateP, description:descriptionP, approved:approvedP,
            position:positionP, salary:salaryP};

        console.log(dataObject);

        var jsonData = JSON.stringify(dataObject);

        $.ajax({
            url: "http://localhost:8080/applications?studId="+studentP+"&compId="+companyP,
            type: 'POST',
            data: jsonData,
            contentType: 'application/json',   // Sends
            success: function (session) {
                alert("Success !!")
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
        })
    });
});