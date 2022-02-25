var prefix = '/price/';

var RestGet = function(stock) {
        $.ajax({
        type: 'GET',
        url:  prefix + stock,
        dataType: 'json',
        async: true,
        success: function(result) {
            alert('At ' + result.time
                + ': ' + result.message);
        },
        error: function(jqXHR, textStatus, errorThrown) {
            alert(jqXHR.status + ' ' + jqXHR.responseText);
        }
   });
}
