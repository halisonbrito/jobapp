$(document).ready(function () {

    var url = "http://localhost:8080/report";

    var table = $('#tableCompany').DataTable({
        dom: 'lBfrtip',
        "processing": true,
        "paging": false,
        "ajax": {
            "url": url,
            dataSrc: ''
        },
        "columns": [
            {"data": "company"},
            {"data": "description"},
            {"data": "students"},
            {"data": "salary"}
        ]
    });
});