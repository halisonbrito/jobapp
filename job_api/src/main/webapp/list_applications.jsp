<jsp:include page="/include/head.jsp"/>
<jsp:include page="/include/menu-topo.jsp"/>


<div class="main-content">


    <div class="main-content-inner">

        <div class="row">
            <div class="col-md-12">

                <!-- Form Elements -->
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3>List of Job applications</h3>
                    </div>
                    <div class="panel-body">

                        <div class="panel-body">
                            <div class="form-group">
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="cal-control pull-left">
                                            <button type="button" data-loading-text="Loading..."
                                                    class="btn btn-success pull-right" name="sbCadastrarGrupo"
                                                    id="addAppBtn">Add
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <table id="tableApplications" class="table table-striped table-bordered table-sm"
                                   cellspacing="0" width="100%">
                                <thead>
                                <tr>
                                    <th class="th-sm">Begin date</th>
                                    <th class="th-sm">Description</th>
                                    <th class="th-sm">Position</th>
                                    <th class="th-sm">Salary</th>
                                    <th class="th-sm">Approved</th>
                                    <th class="th-sm">Student</th>
                                    <th class="th-sm">Company</th>
                                </tr>
                                </thead>
                            </table>

                            <div id="myModal" class="modal fade" role="dialog">
                                <div class="modal-dialog">
                                    <!-- Modal content-->
                                    <div class="modal-content" style="width:900px">
                                        <div class="modal-header">
                                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                                            <h4 class="modal-title">Update Application</h4>
                                        </div>
                                        <div class="modal-body" style="width:100%">

                                            <form>
                                                <div class="row">
                                                    <div class="col-md-12">

                                                        <div class="form-group">
                                                            <div class="row">
                                                                <div class="col-md-6">
                                                                    <label>Begin date:</label>
                                                                    <input class="form-control"
                                                                           name="processBeginningDate"
                                                                           id="processBeginningDate" type="date">
                                                                </div>
                                                                <div class="col-md-6">
                                                                    <label>Description:</label>
                                                                    <input class="form-control" name="description"
                                                                           id="description" type="text">
                                                                    <input class="form-control" name="id"
                                                                           id="id" type="hidden">
                                                                </div>

                                                            </div>
                                                        </div>


                                                        <div class="form-group">
                                                            <div class="row">
                                                                <div class="col-md-4">
                                                                    <label>Position:</label>
                                                                    <input class="form-control" name="position"
                                                                           id="position" type="text">
                                                                </div>

                                                                <div class="col-md-4">
                                                                    <label>Salary:</label>
                                                                    <input class="form-control" name="salary"
                                                                           id="salary" type="number">
                                                                </div>

                                                                <div class="col-md-4">
                                                                    <input class="form-control" name="approved"
                                                                           id="approved" type="hidden">
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <div class="form-group">
                                                            <div class="row">

                                                                <div class="col-md-4">
                                                                    <label>Student:</label>
                                                                    <input class="form-control" name="studentId"
                                                                           id="studentId"
                                                                           type="text" readonly>
                                                                </div>
                                                                <div class="col-md-4">
                                                                    <label>Company:</label>
                                                                    <input class="form-control" name="companyId"
                                                                           id="companyId" type="text" readonly>
                                                                </div>
                                                            </div>
                                                        </div>

                                                    </div>
                                                </div>
                                                <button type="button" onclick="updateAction()"
                                                        class="btn btn-primary"
                                                        id="update">Update
                                                </button>
                                                <button type="button" onclick="deleteAction()"
                                                        class="btn btn-danger"
                                                        id="delete">Delete
                                                </button>
                                                <button type="button" id="apprButton" onclick="approvedAction()"
                                                        class="btn btn-success"
                                                        id="approve">Approve
                                                </button>
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

    <script src="../assets/ajax/application_list.js"></script>
