/**
 * 
 */
function executeDemo(){
	$.get("https://check3.tiaa.org/fp/clear.png?h=0&org_id=ma2xw01y&session_id=686E59D3953C024355F143DA8AB95854&m=1" );
	$.get("https://check3.tiaa.org/fp/clear.png?h=0&org_id=ma2xw01y&session_id=686E59D3953C024355F143DA8AB95854&m=2" );
}

//Option2
function executeDemoWithParam(sessionid){
	$.get("https://check3.tiaa.org/fp/clear.png?h=0&org_id=ma2xw01y&m=1&session_id="+sessionid);
	$.get("https://check3.tiaa.org/fp/clear.png?h=0&org_id=ma2xw01y&m=2&session_id="+sessionid);

}

//Option
function executeDemoUsingCookie(){
	$.get("https://check3.tiaa.org/fp/clear.png?h=0&org_id=ma2xw01y&m=1&session_id="+readCookie('session_id'));
	$.get("https://check3.tiaa.org/fp/clear.png?h=0&org_id=ma2xw01y&m=2&session_id="+readCookie('session_id'));
}

function readCookie(name) {
    var nameEQ = name + "=";
    var ca = document.cookie.split(';');
    for(var i=0;i < ca.length;i++) {
        var c = ca[i];
        while (c.charAt(0)==' ') c = c.substring(1,c.length);
        if (c.indexOf(nameEQ) == 0) return c.substring(nameEQ.length,c.length);
    }
    return null;
}