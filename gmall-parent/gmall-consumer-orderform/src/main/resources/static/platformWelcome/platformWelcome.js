$(window).ready(function () { 
	

});


function print(obj){
    try{
        seen = [];
        json = JSON.stringify(obj, function(key, val) {
           if (typeof val == "object") {
                if (seen.indexOf(val) >= 0) return;
                seen.push(val)
            }
            return val;
        });
        return json;
    }catch(e){
        return e;
    }
};

//全屏
function fullScreen(){
    var el = document.documentElement;
    var rfs = el.requestFullScreen || el.webkitRequestFullScreen || el.mozRequestFullScreen || el.msRequestFullscreen;      
        if(typeof rfs != "undefined" && rfs) {
            rfs.call(el);
        };
       $("#fullScreen").hide();
      return;
}
//退出全屏
function exitScreen(){
    if (document.exitFullscreen) {  
        document.exitFullscreen();  
    }  
    else if (document.mozCancelFullScreen) {  
        document.mozCancelFullScreen();  
    }  
    else if (document.webkitCancelFullScreen) {  
        document.webkitCancelFullScreen();  
    }  
    else if (document.msExitFullscreen) {  
        document.msExitFullscreen();  
    } 
    if(typeof cfs != "undefined" && cfs) {
        cfs.call(el);
    }
}
//ie低版本的全屏，退出全屏都这个方法
function iefull(){
    var el = document.documentElement;
    var rfs =  el.msRequestFullScreen;
    if(typeof window.ActiveXObject != "undefined") {
        //这的方法 模拟f11键，使浏览器全屏
        var wscript = new ActiveXObject("WScript.Shell");
        if(wscript != null) {
            wscript.SendKeys("{F11}");
        }
    }
}