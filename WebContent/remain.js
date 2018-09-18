var text_max = 50;
$('#count_message').html(text_max + ' remaining');

$('#text').keyup(function() {
  var text_length = $('#text').val().length;
  var text_remaining = text_max - text_length;
  
  $('#count_message').html(text_remaining + ' remaining');
});