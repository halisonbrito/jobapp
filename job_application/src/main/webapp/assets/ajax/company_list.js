$(document).ready(function () {

    var url = "http://localhost:8080/companies";

    var table = $('#tableCompany').DataTable({
        dom: 'lBfrtip',
        "processing": true,
        "paging": false,
        "ajax": {
            "url": url,
            dataSrc: ''
        },
        "columns": [
            {"data": "name"},
            {"data": "businessType"},
            {"data": "description"},
            {"data": "phone"}
        ]
    });

    $("#addCompanyBtn").on('click', function () {
        window.location.replace("http://localhost:8080/test/addcompany");
    })

    $('#tableCompany').on('click', 'tbody tr', function () {

        //id = table.row(this).data().id;
        //$('#tmSessionType').val(table.row(this).data().sessionType);

        $('#name').val(table.row(this).data().name);
        $('#businessType').val(table.row(this).data().businessType);
        $('#description').val(table.row(this).data().description);
        $('#phone').val(table.row(this).data().phone);
        $('#id').val(table.row(this).data().id);


        $('#myModal').modal('show');

    });
});

function deleteAction() {
    console.log("test");
    $.ajax({
        url: "http://localhost:8080/companies/" + $("#id").val(),
        type: 'DELETE',
        success: function (session) {
            window.location.replace("http://localhost:8080/test/companies");
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
    var nameP = $("#name").val();
    var descriptionP = $("#description").val();
    var businessTypeP = $("#businessType").val();
    var phoneP = $("#phone").val();
    var idP = $("#id").val();

    var dataObject = {
        name: nameP, description: descriptionP, businessType: businessTypeP,
        phone: phoneP, id: idP
    };

    var jsonData = JSON.stringify(dataObject);

    $.ajax({
        url: "http://localhost:8080/companies",
        type: 'PUT',
        data: jsonData,
        contentType: 'application/json',   // Sends
        success: function (session) {
            window.location.replace("http://localhost:8080/test/companies");
        },
        error: function (data) {
            console.log("error");
        }
    });
}