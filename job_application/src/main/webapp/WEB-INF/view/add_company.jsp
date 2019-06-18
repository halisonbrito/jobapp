<jsp:include page="/include/head.jsp" />
<jsp:include page="/include/menu-topo.jsp" />


<div class="main-content">


    <div class="main-content-inner">

        <div class="row">
            <div class="col-md-12">


                <form role="form" id="formAlterarResponsavel" method="post" >

                    <!-- Form Elements -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3>Add Company</h3>
                        </div>
                        <div class="panel-body">


                            <div class="row">
                                <div class="col-md-12">

                                    <div class="form-group">
                                        <div class="row">
                                            <div class="col-md-4">
                                                <label>Company name:</label>
                                                <input  class="form-control" name="name" id="name" type="text">
                                                <input  class="form-control" name="id" id="id" type="hidden">
                                            </div>
                                            <div class="col-md-4">
                                                <label>Description:</label>
                                                <input  class="form-control" name="description" id="description" type="text">
                                            </div>
                                            <div class="col-md-4">
                                                <label>Business type:</label>
                                                <input  class="form-control" name="businessType" id="businessType" type="text">
                                            </div>
                                            <div class="col-md-4">
                                                <label>Phone:</label>
                                                <input  class="form-control" name="phone" id="phone" type="number">
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="row">
                                    <div class="col-md-12">
                                        <div class="cal-control pull-left">
                                            <button type="button" data-loading-text="Loading..." class="btn btn-success pull-right" name="sbCadastrarGrupo"  id="sbCadastrarGrupo">Save</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>

    </div>
</div>

<jsp:include page="/include/footer.jsp" />
<script src="../assets/ajax/add_company.js"></script>