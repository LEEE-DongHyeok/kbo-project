// 여기에다가 헤더 메뉴에서 커서 올라가면 하위 메뉴 뜨도록 hover 이벤트 처리해야함

$(document).ready(function(){

    $('.top-menu').hover(function(){
        $('.sub-menu').slideToggle();
    })
})









