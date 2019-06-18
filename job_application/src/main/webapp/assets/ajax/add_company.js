$(document).ready(function () {

    $("#sbCadastrarGrupo").on('click', function (evt) {

        var nameP = $("div #name").val();
        var descriptionP = $("div #description").val();
        var businessTypeP = $("div #businessType").val();
        var phoneP = $("div #phone").val();
        console.log(nameP);

        var dataObject = { name:nameP, description:descriptionP, businessType:businessTypeP,
            phone:phoneP};

        var jsonData = JSON.stringify(dataObject);

        console.log(jsonData);

        $.ajax({
            url: "http://localhost:8080/companies",
            type: 'POST',
            data: jsonData,
            contentType: 'application/json',   // Sends
            success: function (session) {
                window.location.replace("http://localhost:8080/addlist");
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