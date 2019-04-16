function iniselecthtml(key, dic, pre) {
    $.ajax({
        type: 'GET',
        url: "/Company/API/dictionary.ashx?action=dic&key=" + key + "&dic=" + dic + "&rand=" + Math.random(),
        success: function (rs) {
            var select = $("#" + pre + dic);
            select.html(rs)
        }
    });
};


function inicityhtml(year, option, obj) {
    $.ajax({
        type: 'GET',
        url: "/Company/API/dictionary.ashx?action=city&year=" + year + "&option=" + option + "&rand=" + Math.random(),
        success: function (rs) {
            var select = $("#" + obj);
            select.html(rs)
        }
    });
};

function optionhtmlselected(key, dic, option, pre) {
    $.ajax({
        type: 'GET',
        url: "/Company/API/dictionary.ashx?action=dic&key=" + key + "&dic=" + dic + "&option=" + option + "&rand=" + Math.random(),
        success: function (rs) {
            var select = $("#" + pre + dic);
            select.html(rs)
        }
    });
};

function optionhtmlselected_obj(key, dic, option, obj) { 
    $.ajax({
        type: 'GET',
        url: "/Company/API/dictionary.ashx?action=dic&key=" + key + "&dic=" + dic + "&option=" + option + "&rand=" + Math.random(),
        success: function (rs) {
            var select = $("#" + obj);
            select.html(rs)
        }
    });
};

function optionhtmlselected_addDefault(key, dic, option, pre, title) {
    $.ajax({
        type: 'GET',
        url: "/Company/API/dictionary.ashx?action=dic&key=" + key + "&dic=" + dic + "&option=" + option + "&rand=" + Math.random(),
        success: function (rs) {
            var select = $("#" + pre + dic);
            var optlist = "<option value='0'>全部</option>";

            optlist = optlist + "<option value='99' selected='selected'>【" + title + "】</option>";
            optlist = optlist + rs
            select.html(optlist)
        }
    });
};

function optionhtmlselected_Where(key, dic, option, pre, field, value) {
    $.ajax({
        type: 'GET',
        url: "/Company/API/dictionary.ashx?action=where&key=" + key + "&dic=" + dic + "&field=" + field + "&value=" + value + "&option=" + option + "&rand=" + Math.random(),
        success: function (rs) {
            var select = $("#" + pre + dic);
            select.html(rs)
        }
    });
};

function OptionWhereAllHtml(key, table, id, txt, whereid, wherevalue, obj, option) {
    var frmdata = {
        key: key,
        table: table,
        id: id,
        txt: txt,
        whereid: whereid,
        wherevalue: wherevalue,
        obj: obj,
        option: option
    }
    $.ajax({
        type: 'POST',
        data: frmdata,
        url: "/Company/API/dictionary.ashx?action=whereall&rand=" + Math.random(),
        success: function (rs) {
            var select = $("#" + obj);
            select.html(rs)
        }
    });
};

function OptionWhereLikeHtml(key, table, id, txt, whereid, wherevalue, obj, option) {
    var frmdata = {
        key: key,
        table: table,
        id: id,
        txt: txt,
        whereid: whereid,
        wherevalue: wherevalue,
        obj: obj,
        option: option
    }
    $.ajax({
        type: 'POST',
        data: frmdata,
        url: "/Company/API/dictionary.ashx?action=wherelike&rand=" + Math.random(),
        success: function (rs) {
            var select = $("#" + obj);
            select.html(rs)
        }
    });
};

function optionhtmlselected_YesorNo(key, dic, option, pre) {
    var options = "";
    if (key == "1") options += "<option  value=''>请选择</option>";
    else options += "<option value='0' selected>不限</option>";

    if (option.toString() == "True") {
        options += "<option value='True' selected='selected'>是</option>";
        options += "<option value='False'>否</option>";
    }
    else {
        options += "<option value='True'>是</option>";
        options += "<option value='False' selected='selected'>否</option>";
    }

    var select = $("#" + pre + dic);
    select.html(options)
};
