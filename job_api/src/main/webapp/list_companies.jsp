<jsp:include page="/include/head.jsp"/>
<jsp:include page="/include/menu-topo.jsp"/>


<div class="main-content">


    <div class="main-content-inner">

        <div class="row">
            <div class="col-md-12">

                <!-- Form Elements -->
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3>List of Companies</h3>
                    </div>


                    <div class="panel-body">
                        <div class="form-group">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="cal-control pull-left">
                                        <button type="button" data-loading-text="Loading..."
                                                class="btn btn-success pull-right" name="sbCadastrarGrupo"
                                                id="addCompanyBtn">Add
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <table id="tableCompany" class="table table-striped table-bordered table-sm" cellspacing="0"
                               width="100%">
                            <thead>
                            <tr>
                                <th class="th-sm">Name</th>
                                <th class="th-sm">Business type</th>
                                <th class="th-sm">Description</th>
                                <th class="th-sm">Phone</th>
                            </tr>
                            </thead>

                        </table>

                        <div id="myModal" class="modal fade" role="dialog">
                            <div class="modal-dialog">
                                <!-- Modal content-->
                                <div class="modal-content" style="width:900px">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal">&times;</button>
                                        <h4 class="modal-title">Update Company</h4>
                                    </div>
                                    <div class="modal-body" style="width:100%">

                                        <form>
                                            <div class="row">
                                                <div class="col-md-12">

                                                    <div class="form-group">
                                                        <div class="row">
                                                            <div class="col-md-6">
                                                                <label>Name:</label>
                                                                <input class="form-control" name="name"
                                                                       id="name" type="text">
                                                            </div>
                                                            <div class="col-md-6">
                                                                <label>Business type:</label>
                                                                <input class="form-control" name="businessType"
                                                                       id="businessType" type="text">
                                                                <input class="form-control" name="id"
                                                                       id="id" type="hidden">
                                                            </div>

                                                        </div>
                                                    </div>


                                                    <div class="form-group">
                                                        <div class="row">
                                                            <div class="col-md-4">
                                                                <label>Description:</label>
                                                                <input class="form-control" name="description"
                                                                       id="description" type="text">
                                                            </div>

                                                            <div class="col-md-4">
                                                                <label>Phone:</label>
                                                                <input class="form-control" name="phone" id="phone"
                                                                       type="text">
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <button type="button" onclick="updateAction()" class="btn btn-primary" id="update">Update</button>
                                            <button type="button" onclick="deleteAction()" class="btn btn-danger" id="delete">Delete</button>
                                        </form>

                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-default" data-dismiss="modal">Close
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<jsp:include page="/include/footer.jsp"/>
<script src="../assets/ajax/company_list.js"></script>