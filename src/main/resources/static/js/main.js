function getLocation(lat, lng){
    map.setView([lat,lng], 7);
}

map.on('click', function(e) {
    //alert("Lat, Lon : " + e.latlng.lat + ", " + e.latlng.lng)
});


function locate() {
      map.locate({setView: true, maxZoom: 16});
}


$(".dropdown-menu a").click(function(){
  $(this).parents(".dropdown").find('.btn').html($(this).text() + ' <span class="caret"></span>');
  $(this).parents(".dropdown").find('.btn').val($(this).data('value'));
});

function showTheState(name){

    console.log(name);
   switch(name) {
    case 1:
        getLocation(41.071194, -78.128235);
    break;
  case 2:
        getLocation(37.325374, -78.632593);
    break;
       case 3:
        getLocation(44.730831, -90.077184);

        break;
  default:

   }

}