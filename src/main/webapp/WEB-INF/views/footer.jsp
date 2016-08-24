<%@ page language="java" %>

	<footer class="main-footer">
	    <div class="pull-right hidden-xs">
	      <b>Version</b> 1.0.0
	    </div>
	    <strong>Copyright &copy; 2016</strong> UNIPE JET.
  </footer>
</div>
<script src="<c:url value='/static/plugins/jQuery/jQuery-2.1.4.min.js' /> "></script>
<script src="<c:url value='/static/bootstrap/js/bootstrap.min.js' />"></script>
<script src="<c:url value='/static/plugins/slimScroll/jquery.slimscroll.min.js' />"></script>
<script src="<c:url value='/static/plugins/fastclick/fastclick.min.js' />"></script>
<script src="<c:url value='/static/js/app.min.js' />"></script>
<script src="<c:url value='/static/js/demo.js' />"></script>
<script src="<c:url value='/static/plugins/datatables/jquery.dataTables.min.js' />"></script>
<script src="<c:url value='/static/plugins/datatables/dataTables.bootstrap.min.js' />"></script>
<script src="<c:url value='/static/plugins/datepicker/bootstrap-datepicker.js' />"></script>
<script src="<c:url value='/static/plugins/datepicker/locales/bootstrap-datepicker.pt-BR.js' />"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-maskmoney/3.0.2/jquery.maskMoney.min.js"></script>
<script>
$(function () {
    $('#table-list').DataTable({
        "paging": true,
        "lengthChange": false,
        "searching": true,
        "ordering": false,
        "info": false,
        "autoWidth": true
    });
});
</script>
<script type="text/javascript">
    $(document).ready(function () {

        $('#exitTime').datepicker({
            format: "dd/mm/yyyy",
            language: 'pt-BR',
            autoclose: true,
            todayHighlight: true
        });

        $('#value').maskMoney({prefix:'R$ ', allowNegative: true, thousands:'', decimal:'.', affixesStay: false});;
    });
</script>
</body>
</html>