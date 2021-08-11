$(document).ready(function(){
    if ($("#nextQuestion")) {

        $("#nextQuestion").click(function(){

                if ($(":checked").length == 1){
                    $("#questionForm").submit();
                } else {

                    $("#errors").css("visibility", "visible");

                }
        return false;
        });

    }

});