//	键盘事件监控
document.onkeydown = function(event) {
	var e = event || window.event || arguments.callee.caller.arguments[0];
	if (e && e.keyCode == 27) { // 按 Esc
		// 要做的事情
	}
	if (e && e.keyCode == 113) { // 按 F2
		// 要做的事情
	}
	if (e && e.keyCode == 13) { // enter 键
		if ($('#login_form_1 input[name=verifyCode]').val() != "" && $('#login_form_1 input[name=verifyCode]').val() != undefined) {
			studenLogin('#logErrorMsg'); // 个人用户登录
		}
		if ($('#register_form_1_verifyCode').val() != "" && $('#register_form_1_verifyCode').val() != undefined) {
			check_registerInfo(); // 个人用户注册
		}
		if ($('#nextPwdRecover_Info_form input[name=verifyCode]').val() != "" && $('#nextPwdRecover_Info_form input[name=verifyCode]').val() != undefined) {
			nextPwdRecover(); // 找回密码第一步
		}
		if ($("#searchNote").val() != undefined && $.trim($("#searchNote").val()) != "") {
			searchNote(); // 搜索笔记
		}
		// 如有使用enter 键触发的时间可以在此处添加!注：需添加条件判断
	}
};
$(function() {
	// 登录TAB
	$('.k_login').find('.tabt li').live('click', function() {
		$(this).addClass('active').siblings().removeClass('active');
		$(this).parents('.k_login').find('.tabc .k_hidden').hide().siblings().eq($(this).index()).show();
	});
	// 点击登录 弹层登录框
	$('#login').click(function() {
		$("body").append('<div class="lagebg posa"></div>');
		$('.lagebg').css({
			height : $(document).height() || $(window).height()
		});
		$('.k_login').show().css({
			left : ($(window).width() - $('.k_login').outerWidth()) / 2,
			top : ($(window).height() - $('.k_login').outerHeight()) / 2 + $(window).scrollTop()
		});
	});
	$('.k_login').find('.qx').live('click', function() {
		$(this).parents('.k_login').hide();
		$('.lagebg').remove();
	});
	// 导航
	$('.menu').find('li').hover(function() {
		$(this).addClass('active').siblings().removeClass('active');
		if ($(this).find('div').hasClass('two_nav')) {
			$(this).addClass('active');
			$('.navbg').show();
			// $('.menu').css({height: ($('.menu').outerHeight()+28)});
			$(this).find('.two_nav').show();
		}
	}, function() {
		$('.menu').find('li').removeClass('active')
		if ($('.menu').find('li').attr('id') == 'active') {
			$('.menu').find('li#active').addClass('active')
		}
		if ($(this).find('div').hasClass('two_nav')) {
			$(this).removeClass('active');
			$('.navbg').hide();
			// $('.menu').removeAttr("style");
			$(this).find('.two_nav').hide();
		}
	});
	// 课程列表展开
	$('.unwind').live('click', function() {
		$(this).parents('.k_kclists_in').find('.k_kch392').stop().animate({
			height : $(this).parents('.k_kclists_in').find('ul').outerHeight()
		});
		$(this).html('全部收起').addClass('packup').removeClass('unwind');
	});
	$('.packup').live('click', function() {
		$(this).parents('.k_kclists_in').find('.k_kch392').stop().animate({
			height : 392
		});
		$(this).html('全部展开').addClass('unwind').removeClass('packup');
	});
	// 课程列表tab
	$('.k_kcnrTabt').find('li').click(function() {
		$(this).addClass('active').siblings().removeClass('active');
		$(this).parents('.k_kcnrbox').find('.k_kcnrTabC .k_hidden').hide().siblings().eq($(this).index()).show();
	});
	// 课程学习
	$('.k_kcxxtab .tabt').find('li').click(function() {
		$(this).addClass('active').siblings().removeClass('active');
		$(this).parents('.k_kcxxtab').find('.tabc .k_hidden').hide().siblings().eq($(this).index()).show();
	});
	// 课程考试
	$('.qh_ks .qh_kstt,.qh_cy .qh_cytt,.qh_zy .qh_zytt').find('li').click(function() {
		$(this).addClass('active').siblings().removeClass('active');
		$(this).parents('.qh_ks,.qh_cy,.qh_zy').find('.qh_ksnr_box .qh_ksnr,.qh_cynr_box .qh_cynr,.qh_zynr_box .qh_zynr').hide().siblings().eq($(this).index()).show();
	});
	// 课程岗位
	/*
	 * $('.gangwbox .gw_tabc').find('li').click(function() {
	 * $(this).addClass('active').siblings().removeClass('active');
	 * $(this).parents('.k_gangwbox').find('.box
	 * .k_gangwcont').hide().siblings().eq($(this).index()).show(); });
	 */
	// 课程 回答
	$('.qh_hdtt').find('li').click(function() {
		$(this).addClass('active').siblings().removeClass('active');
		$(this).parents('.qh_hd').find('.qh_hdbox .qh_hdnr').hide().siblings().eq($(this).index()).show();
	});

	// 课程我的提问 解决 5.6
	// $(".qh_hdnr .k_asklist ul li .subbox").click(function() {
	// $(".k_asklist").hide();
	// $(this).parents('.qh_hdnr').find('.wdyjj').show();
	// })
	// $(".qh_hdnr .wdyjj .answerlist .oper .wyzw_sub").click(function(){
	// $(this).parents('.wdyjj').find('.k_hdwtarea').show();
	// $(this).parent(".oper").hide();
	// })
	$(".wdyjj .w_djj ul li .subbox").click(function() {
		$(".k_asklist").show();
		$(".wdyjj").hide();
	})
	// 课程我的提问 未解决
	// $(".qh_hdnr .k_asklist ul li .subbox1").click(function() {
	// $(".k_asklist").hide();
	// $(this).parents('.qh_hdnr').find('.wddjj').show();
	// })
	// $(".qh_hdnr .wddjj .answerlist .oper .wyzw_sub").click(function(){
	// $(this).parents('.wddjj').find('.k_hdwtarea').show();
	// $(this).parent(".oper").hide();
	// })
	$(".wddjj .w_djj ul li .subbox").click(function() {
		$(".k_asklist").show();
		$(".wddjj").hide();
	})

	// 课程全部问题 待解决
	// $(".qh_hdnr .k_asklist1 ul li .subbox").click(function() {
	// $(".k_asklist1").hide();
	// $(this).parents('.qh_hdnr').find('.wdyjj1').show();
	// })
	// $(".qh_hdnr .wdyjj1 .answerlist .oper .wyzw_sub").click(function(){
	// $(this).parents('.wdyjj1').find('.k_hdwtarea').show();
	// $(this).parent(".oper").hide();
	// })
	// $(".wdyjj1 .w_djj ul li .subbox").click(function() {
	// $(".k_asklist1").show();
	// $(".wdyjj1").hide();
	// })
	// 课程全部问题 待解决
	// $(".qh_hdnr .k_asklist1 ul li .subbox1").click(function() {
	// $(".k_asklist1").hide();
	// $(this).parents('.qh_hdnr').find('.wddjj1').show();
	// })
	// $(".qh_hdnr .wddjj1 .answerlist .oper .wyzw_sub").click(function(){
	// $(this).parents('.wddjj1').find('.k_hdwtarea').show();
	// $(this).parent(".oper").hide();
	// })
	// $(".wddjj1 .w_djj ul li .subbox").click(function() {
	// $(".k_asklist1").show();
	// $(".wddjj1").hide();
	// })
	// 5.6
	// 课程介绍 编辑
	$('.k_inform .operation .editor').click(function() {
		$(this).parent(".operation").hide();
		$(this).parents(".k_bjbj").children(".k_bjlb").show();

	})
	$(".k_bjlb .k_bjqx").click(function() {
		$(this).parents(".k_bjlb").hide();
		$(".operation").show();
	})

	// 课程学习 目录
	$('.k_dire').find('.tit').click(function() {
		$(this).parent().addClass('active').siblings().removeClass('active');
		$(this).parents('.k_dire').find('.list').hide();
		$(this).parent().find('.list').show();
	});
	// 注册页面Tab
	/*
	 * // 课程介绍 $('.kcjs_pj .kcjs_wlpj').live('click', function() { var pjkc =
	 * $('.pjkc'); if (pjkc.css('display') == 'none') { pjkc.show(); } else {
	 * pjkc.hide(); } }); $(".pjkc_gb").click(function() { $(".pjkc").hide(); })
	 * 
	 * $(".qbpj_gb").click(function() { $(".k_qbpc").hide(); })
	 */
	// 课程介绍
	$('.kcjs_pj .gdlj').live('click', function() {
		var k_qbpc = $('.k_qbpc');
		if (k_qbpc.css('display') == 'none') {
			k_qbpc.show();
		} else {
			k_qbpc.hide();
		}
	});
	$('.k_regbox .tabt').find('li').click(function() {
		$(this).addClass('active').siblings().removeClass('active');
		$(this).parents('.k_regbox').find('.tabc .k_hidden').hide().siblings().eq($(this).index()).show();
	});
	// 课程介绍已登录
	// $('.kc_qh ul.gzqh').find('li').click(function() {
	// $(this).addClass('active').siblings().removeClass('active');
	// $(this).parents('.kcjs_qh').find('.qhxg_box
	// .k_hidden').hide().siblings().eq($(this).index()).show();
	// });
	// // 我要提问层
	// $('#k_wytw').click(function() {
	// $("body").append('<div class="lagebg posa"></div>' + '<div
	// class="wyask_box posa">' + '<input type="text" name=""
	// value="问题标题（40字内）..." id="twtxt" class="title" />' + '<textarea rows="10"
	// cols="30" id="twarea" name="">输入你的答案</textarea>' + '<p><input
	// type="button" class="tjhd right" value="提交问答"> <a href="javascript:;"
	// class="right close">取消</a></p>' + '</div>');
	// $('.lagebg').css({
	// height : $(document).height() || $(window).height()
	// });
	// $('.wyask_box').show().css({
	// left : ($(window).width() - $('.wyask_box').outerWidth()) / 2,
	// top : ($(window).height() - $('.wyask_box').outerHeight()) / 2 +
	// $(window).scrollTop()
	// });
	// });
	// $('#twtxt').live('focus', function() {
	// if ($(this).val('问题标题（40字内）...')) {
	// $(this).val('');
	// }
	// });
	// $('#twtxt').live('blur', function() {
	// if ($(this).val('')) {
	// $(this).val('问题标题（40字内）...');
	// }
	// });
	// $('#twarea').live('focus', function() {
	// if ($(this).val('输入你的答案')) {
	// $(this).val('');
	// }
	// });
	// $('#twarea').live('blur', function() {
	// if ($(this).val('')) {
	// $(this).val('输入你的答案');
	// }
	// });
	$('.wyask_box').find('.close').die().live('click', function() {
		$(this).parents('.wyask_box').hide().remove();
		$('.lagebg').remove();
	});
	// $('.kc_qh ul.gzqh').find('li').click(function() {
	// $(this).addClass('active').siblings().removeClass('active');
	// $(this).parents('.kcjs_qh').find('.qhxg_box
	// .k_hidden').hide().siblings().eq($(this).index()).show();
	// });
	// 我要提问层
	// $('#k_wytw').click(function() {
	// $("body").append('<div class="lagebg posa"></div>' + '<div
	// class="wyask_box posa">' + '<input type="text" name=""
	// value="问题标题（40字内）..." id="twtxt" class="title" />' + '<textarea rows="10"
	// cols="30" id="twarea" name="">输入你的答案</textarea>' + '<p><input
	// type="button" class="tjhd right" value="提交问答"> <a href="javascript:;"
	// class="right close">取消</a></p>' + '</div>');
	// $('.lagebg').css({
	// height : $(document).height() || $(window).height()
	// });
	// $('.wyask_box').show().css({
	// left : ($(window).width() - $('.wyask_box').outerWidth()) / 2,
	// top : ($(window).height() - $('.wyask_box').outerHeight()) / 2 +
	// $(window).scrollTop()
	// });
	// });
	// $('#twtxt').live('focus', function() {
	// if ($(this).val('问题标题（40字内）...')) {
	// $(this).val('');
	// }
	// });
	// $('#twtxt').live('blur', function() {
	// if ($(this).val('')) {
	// $(this).val('问题标题（40字内）...');
	// }
	// });
	// $('#twarea').live('focus', function() {
	// if ($(this).val('输入你的答案')) {
	// $(this).val('');
	// }
	// });
	// $('#twarea').live('blur', function() {
	// if ($(this).val('')) {
	// $(this).val('输入你的答案');
	// }
	// });
	// $('.wyask_box').find('.close').live('click', function() {
	// $(this).parents('.wyask_box').hide().remove();
	// $('.lagebg').remove();
	// });
	// 课程列表
	$('.k_kclists').each(function() {
		$(this).find('.zhank').live('click', function() {
			$(this).parents('.k_kclists').find('.k_h188').animate({
				height : $(this).parents('.k_kclists').find('ul').outerHeight()
			});
			$(this).addClass('shouq').removeClass('zhank');
		});
		$(this).find('.shouq').live('click', function() {
			$(this).parents('.k_kclists').find('.k_h188').animate({
				height : 188
			});
			$(this).addClass('zhank').removeClass('shouq');
		});
	});
	// textarea效果
	$('.k_textarea').each(function() {
		var oldtxt = $(this).find('textarea').val();
		$(this).find('textarea').live('focus', function() {
			if ($(this).val() == oldtxt) {
				$(this).val("");
			}
		});
		$(this).find('textarea').live('blur', function() {
			if ($(this).val() == "") {
				$(this).val(oldtxt);
			}
		});
	});
	// text效果
	$('input[type=text]').each(function() {
		var oldtxt = $(this).val();
		$(this).live('focus', function() {
			if ($(this).val() == oldtxt) {
				$(this).val('');
			}
		});
		$(this).live('blur', function() {
			if ($(this).val() == "") {
				$(this).val(oldtxt);
			}
		});
	});
	// 我的问答
	$('.tab_asktit,.k_jdtabtit').find('li').click(function() {
		$(this).addClass('active').siblings().removeClass('active');
		$(this).parents('.k_aboutme').find('.tab_askcont .k_hidden').hide().siblings().eq($(this).index()).show();
		$(this).parents('.k_dateset').find('.tab_askcont1 .k_hidden').hide().siblings().eq($(this).index()).show();
		$(this).parents('.k_czjdbox').find('.tab_askcont .k_hidden').hide().siblings().eq($(this).index()).show();
	});
	// 我的问答
	$('.k_jdtabtit').find('li').click(function() {
		$(this).addClass('active').siblings().removeClass('active');
		$(this).parents('.k_aboutme').find('.tab_askcont_t .k_hidden').hide().siblings().eq($(this).index()).show();
		$(this).parents('.k_dateset').find('.tab_askcont_t .k_hidden').hide().siblings().eq($(this).index()).show();
		$(this).parents('.k_czjdbox').find('.tab_askcont_t .k_hidden').hide().siblings().eq($(this).index()).show();
	});
	// 页脚微信
	$('.k_gzwm').find('a').eq(0).hover(function() {
		$('.sina_c').fadeIn();
	}, function() {
		$('.sina_c').fadeOut();
	});
	$('.k_gzwm').find('a').eq(1).hover(function() {
		$('.weixin_c').fadeIn();
	}, function() {
		$('.weixin_c').fadeOut();
	});

	/*
	 * // 评分 $('.info_score').each(function() { var re_pf =
	 * $(this).find('.pf_xin') var aLi = $(this).find('.pf_xin li') var oSpan =
	 * $(this).find('span') var i = iScore = iStar = 0; var save = [];
	 * aLi.each(function(i) { // 鼠标移过显示分数 this.onmouseover = function() {
	 * fnPoint($(this).index() + 1); oSpan.html('<strong>' + ($(this).index() +
	 * 1) + '分</strong>'); }; this.onmouseout = function() {// 鼠标离开后恢复上次评分
	 * fnPoint(); oSpan.html("<strong>" + iStar + "分</strong>"); };
	 * this.onclick = function() {// 点击后进行评分处理 iStar = $(this).index() + 1;
	 * oSpan.html("<strong>" + iStar + "分</strong>"); } }); function
	 * fnPoint(iArg) { // 评分处理 iScore = iArg || iStar;// 分数赋值 for (i = 0; i <
	 * aLi.length; i++) aLi[i].className = i < iScore ? "on" : ""; } });
	 */
	// 我的笔记
	var slideStop = false;
	$('.slidebox').find('.t').click(function() {
		if (slideStop) {
			$(this).parent().find('.slidelist').hide();
			slideStop = false;
		} else {
			$(this).parent().find('.slidelist').show();
			slideStop = true;
		}
	});
	$('.slidebox .slidelist').find('a').click(function() {
		$(this).addClass('active').siblings().removeClass('active');
		$(this).parent().hide();
		$(this).parents('.slidebox').find('.t').html($(this).html());
		slideStop = false;
	});
	// 课程岗位
	$('.gwtabtit').find('ul').css({
		width : ($('.gwtabtit li').eq(0).outerWidth() + 10) * $('.gwtabtit li').length
	});
	if ($('.gwtabtit li').length > 3) {
		var gwi = 0;
		$('.gwtabtit').find('.next').click(function() {
			if (gwi >= $('.gwtabtit li').length - 3) {
				gwi = $('.gwtabtit li').length - 3;
			} else {
				gwi++;
				$('.gwtabtit').find('.prev').show();
				$('.gwtabtit').find('ul').animate({
					left : -($('.gwtabtit li').eq(0).outerWidth() + 10) * gwi
				});
			}
		});
		$('.gwtabtit').find('.prev').click(function() {
			if (gwi <= 0) {
				gwi = 0;
			} else {
				gwi--;
				$('.gwtabtit').find('ul').animate({
					left : -($('.gwtabtit li').eq(0).outerWidth() + 10) * gwi
				});
			}
		});
	}
	// 成长阶段 工程实践
	$('.min_vadio').find('ul').css({
		width : ($('.min_vadio li').eq(0).outerWidth() + 34) * $('.min_vadio li').length
	});
	if ($('.min_vadio li').length > 3) {
		var gci = 0;
		$('.min_vadio').find('.next').click(function() {
			if (gci >= $('.min_vadio li').length - 3) {
				gci = $('.min_vadio li').length - 3;
			} else {
				gci++;
				$('.min_vadio').find('ul').animate({
					left : -($('.min_vadio li').eq(0).outerWidth() + 34) * gci
				});
			}
		});
		$('.min_vadio').find('.prev').click(function() {
			if (gci <= 0) {
				gci = 0;
			} else {
				gci--;
				$('.min_vadio').find('ul').animate({
					left : -($('.min_vadio li').eq(0).outerWidth() + 34) * gci
				});
			}
		});
	}
	// 求职面试
	$('.k_qzmstab').find('li').click(function() {
		$(this).addClass('active').siblings().removeClass('active');
		$(this).parents('.k_mincont').find('.k_qzmstabcont .k_hidden_a').hide().siblings().eq($(this).index()).show();
	});

	// 名师观点
	$('.k_msbox').find('ul').css({
		width : $('.k_msbox li').eq(0).outerWidth() * $('.k_msbox li').length
	});
	$('.k_msbox').each(function() {
		if ($(this).find('li').length > 2) {
			var i = 0;
			$(this).find('.next').click(function() {
				if (i >= $(this).parent().find('li').length - 1) {
					i = $(this).parent().find('li').length - 1;
				} else {
					i++;
					$(this).parent().find('ul').animate({
						left : -$(this).parent().find('li').eq(0).outerWidth() * i
					});
				}
			});
			$(this).find('.prev').click(function() {
				if (i <= 0) {
					i = 0;
				} else {
					i--;
					$(this).parent().find('ul').animate({
						left : -$(this).parent().find('li').eq(0).outerWidth() * i
					});
				}
			});
		}
	});
	// IT行业的那些人和事
	$('.k_qzmstabcont .minbox .minbox_c').find('ul').css({
		width : $('.k_qzmstabcont .minbox .minbox_c li').eq(0).outerWidth() * $('.k_qzmstabcont .minbox .minbox_c li').length
	});
	$('.minbox').each(function() {
		if ($(this).find('li').length > 2) {
			var i = 0;
			$(this).find('.next').click(function() {
				if (i >= $(this).parent().find('li').length - 1) {
					i = $(this).parent().find('li').length - 1;
				} else {
					i++;
					$(this).parent().find('ul').animate({
						left : -$(this).parent().find('li').eq(0).outerWidth() * i
					});
				}
			});
			$(this).find('.prev').click(function() {
				if (i <= 0) {
					i = 0;
				} else {
					i--;
					$(this).parent().find('ul').animate({
						left : -$(this).parent().find('li').eq(0).outerWidth() * i
					});
				}
			});
		}
	});

	// 消息
	$('.k_masgbox .num').live('click', function() {
		var cont = $(this).parent().find('.cont');
		if (cont.css('display') == 'none') {
			cont.show();
		} else {
			cont.hide();
		}
	});
	$('.k_masgbox a').live('click', function() {
		$(this).parents('.cont').hide();
	});
});

// 个人登录
$('.load_in .name').live('click', function() {
	var grzx = $(this).parent().find('.grzx');
	if (grzx.css('display') == 'none') {
		grzx.show();
	} else {
		grzx.hide();
	}
});
$('.load_in .tuichu').live('click', function() {
	$(this).parents('.grzx').hide();
});

var get = {
	byId : function(id) {
		return typeof id === "string" ? document.getElementById(id) : id
	},
	byClass : function(sClass, oParent) {
		var aClass = [];
		var reClass = new RegExp("(^| )" + sClass + "( |$)");
		var aElem = this.byTagName("*", oParent);
		for ( var i = 0; i < aElem.length; i++) {
			reClass.test(aElem[i].className) && aClass.push(aElem[i]);
		}
		return aClass;
	},
	byTagName : function(elem, obj) {
		return (obj || document).getElementsByTagName(elem);
	},
	myBind : function(obj, sEvent, fn) {
		if (obj.attachEvent) {
			obj.attachEvent('on' + sEvent, function() {
				fn.call(obj);
			});
		} else {
			obj.addEventListener(sEvent, fn, false);
		}
	},
	getStyle : function(obj, attr) {
		var oSave = '';
		if (obj.currentStyle) {
			oSave = obj.currentStyle[attr];
		} else {
			oSave = getComputedStyle(obj, false)[attr];
		}
		if (attr == 'opacity') {
			return Math.round(parseFloat(oSave) * 100);
		} else {
			return parseInt(oSave);
		}
	},
	stMove : function(obj, json, fn) {
		clearInterval(obj.iTime);
		obj.iTime = setInterval(function() {
			var bBtn = true;
			for ( var attr in json) {
				var iTarget = json[attr];
				var iCur = get.getStyle(obj, attr);
				var iSpeed = (iTarget - iCur) / 7;
				iSpeed = iSpeed > 0 ? Math.ceil(iSpeed) : Math.floor(iSpeed);
				if (iCur != iTarget) {
					bBtn = false;
				}
				if (attr == 'opacity') {
					obj.style.filter = 'alpha(opacity:' + (iCur + iSpeed) + ')';
					obj.style.opacity = (iCur + iSpeed) / 100;
				} else {
					obj.style[attr] = iCur + iSpeed + 'px';
				}
			}
			if (bBtn) {
				clearInterval(obj.iTime);
				if (fn) {
					fn.call(obj);
				}
				;
			}
		}, 30);
	}
}
function Slides(id) {
	var sParent = get.byId(id);
	var sBig = get.byClass('bigimg', sParent)[0];
	var sBigLi = sBig.getElementsByTagName('li');
	var sMin = get.byClass('minimg', sParent)[0]
	var sMinLi = sMin.getElementsByTagName('li');
	var cTime = null, iNum = 0;
	var Marg = 12;

	for ( var i = 0; i < sMinLi.length; i++) {
		sMinLi[i].index = i;
		sMinLi[i].onmouseover = function() {
			iNum = this.index;
			phototab();
		}
	}
	cTime = setInterval(next, 3500);
	sParent.onmouseover = function() {
		clearInterval(cTime);
	};
	sParent.onmouseout = function() {
		cTime = setInterval(next, 3500);
	};
	function next() {
		iNum++;
		if (iNum == sMinLi.length) {
			iNum = 0;
		}
		phototab();
	}
	function phototab() {
		for ( var i = 0; i < sMinLi.length; i++) {
			sMinLi[i].className = sBigLi[i].className = '';
			get.stMove(sBigLi[i], {
				opacity : 0
			});
		}
		sMinLi[iNum].className = sBigLi[iNum].className = 'active';
		get.stMove(sBigLi[iNum], {
			opacity : 100
		});
	}
}

// 技术方向
$('.kcsx_qhbox ul.sxqh').find('li').click(function() {
	$(this).addClass('active').siblings().removeClass('active');
	$(this).parents('.kcsx_qhbox').find('.kcsx_nrbox .kcsx_in').hide().siblings().eq($(this).index()).show();
});
// 消息中心
$('.xxzx_qhbox ul.x_xxqh').find('li').click(function() {
	$(this).addClass('active').siblings().removeClass('active');
	$(this).parents('.xxzx_qhbox').find('.x_xxbox .k_hidden_x').hide().siblings().eq($(this).index()).show();
});

$('.x_xxqb ul li').hover(function() {
	$(this).children(".x_lbyd").show().siblings().children(".x_lbyd").hide();
}, function() {
	$(".x_xxqb ul li .x_lbyd").hide();
});
// 关于我们
$('.g_fenye').find('a').click(function() {
	$(this).addClass('active').siblings().removeClass('active');
});
$('.lxwm_box ul.g_ggdz').find('li').click(function() {
	$(this).addClass('active').siblings().removeClass('active');
	$(this).parents('.lxwm_box').find('.g_xxdz_box .g_gddz').hide().siblings().eq($(this).index()).show();
});
$('.gywm_l ul.g_gywm').find('li').click(function() {
	$(this).addClass('active').siblings().removeClass('active');
	$(this).parents('.gywm_box').find('.gywm_r .g_wmqh_box').hide().siblings().eq($(this).index()).show();
});
// 课程列表tab
$('.k_kcpm_box').find('li').click(function() {
	$(this).addClass('active').siblings().removeClass('active');
	$(this).parents('.k_kclbbox').find('.k_kcnr .kcpm_m').hide().siblings().eq($(this).index()).show();
});

/*
 * // 课程 $('.k_kcjs_w .kc_list ul li').hover(function() {
 * $(this).children(".k_jtsj").hide();
 * $(this).children(".k_gksp").show().siblings.children(".k_gksp").hide(); },
 * function() { $(this).children(".k_jtsj").show(); $(".k_kcjs_w .kc_list ul li
 * .k_gksp").hide(); });
 *  // 课程 $('.k_kcjs_ww .kc_list ul li').hover(function() {
 * $(this).children(".ml_ywc").hide();
 * $(this).children(".k_gksp").show().siblings.children(".k_gksp").hide(); },
 * function() { $(this).children(".ml_ywc").show(); $(".k_kcjs_ww .kc_list ul li
 * .k_gksp").hide(); });
 *  // 课程介绍 $('.k_ckzl .kc_list ul li').hover(function() {
 * $(this).children(".k_jtsj").hide();
 * $(this).children(".k_gksp").show().siblings.children(".k_gksp").hide(); },
 * function() { $(this).children(".k_jtsj").show(); $(".k_ckzl .kc_list ul li
 * .k_gksp").hide(); });
 * 
 * $('.grzx_box .grzx_l ul.g_grzxx').find('li').click(function(){
 * $(this).addClass('active').siblings().removeClass('active');
 * $(this).parents('.grzx_box').find('.grzx_r
 * .grzx_qhbox').hide().siblings().eq($(this).index()).show(); });
 */
// 个人中心
// $('.grzx_box .grzx_l ul.g_grzxx').find('li').live('click',function() {
// $(this).addClass('active').siblings().removeClass('active');
// $(this).parents('.grzx_box').find('.grzx_r
// .grzx_qhbox').hide().siblings().eq($(this).index()).show();
// });
$('.gg_smbox ul.g_gfsm').find('li').live('click', function() {
	$(this).addClass('active').siblings().removeClass('active');
	$(this).parents('.gg_smbox').find('.g_gg_box .g_jjqh').hide().siblings().eq($(this).index()).show();
});

$('.g_wdkc_box ul.g_kctt').find('li').live('click', function() {
	$(this).addClass('active').siblings().removeClass('active');
	$(this).parents('.g_wdkc_box').find('.g_cklb_nr').hide().siblings().eq($(this).index()).show();
});
// // // // // // // // // // // // // // // // // // // 新增加JS// // // // // //
// // // // // // // // // // // // // // // // // //
// 登录注册页字体换颜色
$(".label input,.loginbox input").focus(function() {
	$(this).css("color", "#333")
})
$(".label input,.loginbox input").blur(function() {
	$(this).css("color", "#d3d3d3")
})
// 课程介绍回复
// $(".k_huif").click(function(){
// $(this).parents(".wddjj").children(".k_hdwtarea_k").show();
// })
// $(".k_hdwtarea p .close_qx").click(function(){
// $(this).parents(".k_hdwtarea").hide()
// .parent(".wddjj").children(".answerlist").find("ul li .oper").show();
// })
// $(".k_hdwtarea_k p .close_hf").click(function(){
// $(this).parents(".k_hdwtarea_k").hide();
// })
// $(".k_hdwtarea p .close_yjj").click(function(){
// $(this).parents(".k_hdwtarea").hide()
// .parent(".wdyjj").find(".answerlist ul li .oper").show();
// })
// $(".qh_hdnr .wdyjj .answerlist .oper .wyzw_sub_b").click(function(){
// $(this).parents('.wdyjj').find('.k_hdwtarea_a').show();
// $(this).parent(".oper").hide();
// })
// $(".k_hdwtarea_a p .close1_yjj").click(function(){
// $(this).parents(".k_hdwtarea_a").hide()
// .parent(".wdyjj").find(".answerlist ul li .oper").show();
// })
// 课程介绍问答 我的回答
// $(".qh_hdnr .k_asklist_t ul li .apotion").click(function(){
// $(this).parents(".qh_hdnr") .find(".k_my_ycn").show();
// $(this).parents(".k_asklist_t").hide();
// })
// $(".qh_hdnr .k_asklist_t ul li .apotion1").click(function(){
// $(this).parents(".qh_hdnr") .find(".k_my_djj").show();
// $(this).parents(".k_asklist_t").hide();
// })
// $(".wt_djj").click(function(){
// $(this).parents(".qh_hdnr").find(".k_asklist_t").show();
// $(this).parents(".k_my_ycn").hide();
// $(this).parents(".k_my_djj").hide();
// })
// $(".k_my_djj .answerlist .wyzw_sub_b").click(function(){
// $(this).parent(".oper").hide();
// $(this).parents(".answerlist").next().show();
// })
// $(".k_my_djj .k_hdwtarea_a .close1_yjj").click(function(){
// $(this).parents(".k_hdwtarea_a").hide();
// $(this).parents(".k_my_djj").find(".oper").show();
// })
// //课程介绍 全部回答--回复
// $(".k_huif").click(function(){
// $(this).parents(".wdyjj1").children(".k_hdwtarea_a").show();
// })
// $(".k_huiff").click(function(){
// $(this).parents(".wddjj1").children(".k_hdwtarea_k").show();
// })
// 课程介绍 收藏取消收藏
/*
 * $(".k_scqx").click(function(){ var k_qxwz=$(".k_scqx > a")
 * if(k_qxwz.text()=="收藏"){
 * $(this).children("a").attr("class","k_qx").text("取消收藏") } else{
 * $(this).children("a").attr("class","k_gz").text("收藏") } })
 */
/*
 * //参考资料 弹出框 $(".c_cklb .c_xiazai").click(function(){
 * $(this).parents("body").find(".c_xzxq").show(); }) $(".c_xzxq
 * .k_ljxz_g").click(function(){ $(this).parents(".c_xzxq").hide(); })
 */
/*
 * //课程介绍页面-未选课 弹出框 $(".k_zlbom .sub_ksxx1").click(function(){
 * $(this).parents(".k_pubjstop").find(".k_wszl").show(); }) $(".k_pubjstop
 * .k_wxkc_g").click(function(){ $(this).parents(".k_wszl").hide(); })
 * //课程学习页面-未选课 弹出框 $(".k_kcxxcont .sq_sx").click(function(){
 * $(this).parents(".k_kcxxcont").find(".k_dele_k").show(); }) $(".k_dele_t
 * .k_wxkc_g,.k_dele_k .k_date_qx").click(function(){
 * $(this).parents(".k_dele_k").hide(); })
 */
// 课程介绍页面 弹出框
$(".qh_bj .delete_t").click(function() {
	$(this).parents(".qh_bj").find(".k_dele_k1").show();
})
$(".k_dele_k1 .k_wxkc_g,.k_dele_k1 .k_date_qx").click(function() {
	$(this).parents(".k_dele_k1").hide();
})
$(".wddjj .cn_sub").click(function() {
	$(this).parents(".wddjj").find(".k_agree_k").show();
})
$(".k_agree_k .k_wxkc_g,.k_agree_k .k_date_qx").click(function() {
	$(this).parents(".k_agree_k").hide();
})
// 搜索列表
// $('.search_tit').find('li').click(function(){
// $(this).addClass('active').siblings().removeClass('active');
// $(this).parents('.search_box').find('.search_qhbox
// .search_nr').hide().siblings().eq($(this).index()).show();
// });
// 测验
$(".k_answer textarea ").focus(function() {
	$(this).attr("class", "k_tjbj");
});

// 新增 0603

// 在线答疑
//$(".fdpj_wjj").click(function() {
//	$(this).parents(".fdpj_cont").find(".z_reason").show();
//})
//$(".fdpj_yjj").click(function() {
//	$(this).parents(".fdpj_cont").find(".z_reason").hide();
//})

// 在线答疑 全部
//
//$(function() {
//	var jcWidth = $(".z_teacher_list").width(); // 获取焦点图的宽度（显示面积）
//	var lenjc = $(".z_teacher_list ul li").length; // 获取焦点图个数
//	var jc = 0;
//	// 上一页按钮
//	$(".z_teacher_list .prev").click(function() {
//		jc -= 1;
//		if (jc == -1) {
//			jc = lenjc - 1;
//		}
//		showPijc(jc);
//	});
//
//	// 下一页按钮
//	$(".z_teacher_list .next").click(function() {
//		jc += 1;
//		if (jc == lenjc) {
//			jc = 0;
//		}
//		showPijc(jc);
//	});
//
//	// 本例为左右滚动，即所有li元素都是在同一排向左浮动，所以这里需要计算出外围ul元素的宽度
//	$(".z_teacher_list ul").css("width", jcWidth * (lenjc));
//
//	// 显示图片函数，根据接收的index值显示相应的内容
//	function showPijc(jc) { // 普通切换
//		var nowjc = -jc * jcWidth; // 根据index值计算ul元素的left值
//		$("..z_teacher_list ul").animate({
//			"left" : nowjc
//		}, 300); // 通过animate()调整ul元素滚动到计算出的position
//	}
//
//	$(".z_teacher_list .prev,.z_teacher_list .next").css("opacity", 0.8)
//	$(".z_teacher_list .prev,.z_teacher_list .next").hover(function() {
//		$(this).css("opacity", 1);
//	}, function() {
//		$(this).css("opacity", 0.8)
//	})
//
//	// 在线答疑 按人气
//	var jjWidth = $(".z_teacher_list1").width(); // 获取焦点图的宽度（显示面积）
//	var lenjj = $(".z_teacher_list1 ul li").length; // 获取焦点图个数
//	var jj = 0;
//	// 上一页按钮
//	$(".z_teacher_list1 .prev").click(function() {
//		jj -= 1;
//		if (jj == -1) {
//			jj = lenjj - 1;
//		}
//		showPijj(jj);
//	});
//
//	// 下一页按钮
//	$(".z_teacher_list1 .next").click(function() {
//		jj += 1;
//		if (jj == lenjj) {
//			jj = 0;
//		}
//		showPijj(jj);
//	});
//
//	// 本例为左右滚动，即所有li元素都是在同一排向左浮动，所以这里需要计算出外围ul元素的宽度
//	$(".z_teacher_list1 ul").css("width", jjWidth * (lenjj));
//
//	// 显示图片函数，根据接收的index值显示相应的内容
//	function showPijj(jj) { // 普通切换
//		var nowjj = -jj * jjWidth; // 根据index值计算ul元素的left值
//		$(".z_teacher_list1 ul").animate({
//			"left" : nowjj
//		}, 300); // 通过animate()调整ul元素滚动到计算出的position
//	}
//
//	$(".z_teacher_list1 .prev,.z_teacher_list1 .next").css("opacity", 0.8)
//	$(".z_teacher_list1 .prev,.z_teacher_list1 .next").hover(function() {
//		$(this).css("opacity", 1);
//	}, function() {
//		$(this).css("opacity", 0.8)
//	})
//
//	// 在线答疑 按评价
//
//	var jpWidth = $(".z_teacher_list2").width(); // 获取焦点图的宽度（显示面积）
//	var lenjp = $(".z_teacher_list2 ul li").length; // 获取焦点图个数
//	var jp = 0;
//	// 上一页按钮
//	$(".z_teacher_list2 .prev").click(function() {
//		jp -= 1;
//		if (jp == -1) {
//			jp = lenjp - 1;
//		}
//		showPijp(jp);
//	});
//
//	// 下一页按钮
//	$(".z_teacher_list2 .next").click(function() {
//		jp += 1;
//		if (jp == lenjp) {
//			jp = 0;
//		}
//		showPijp(jp);
//	});
//
//	// 本例为左右滚动，即所有li元素都是在同一排向左浮动，所以这里需要计算出外围ul元素的宽度
//	$(".z_teacher_list2 ul").css("width", jpWidth * (lenjp));
//
//	// 显示图片函数，根据接收的index值显示相应的内容
//	function showPijp(jp) { // 普通切换
//		var nowjp = -jp * jpWidth; // 根据index值计算ul元素的left值
//		$(".z_teacher_list2 ul").animate({
//			"left" : nowjp
//		}, 300); // 通过animate()调整ul元素滚动到计算出的position
//	}
//
//	$(".z_teacher_list2 .prev,.z_teacher_list2 .next").css("opacity", 0.8)
//	$(".z_teacher_list2 .prev,.z_teacher_list2 .next").hover(function() {
//		$(this).css("opacity", 1);
//	}, function() {
//		$(this).css("opacity", 0.8)
//	});
//
//	$(".z_teacher_t_l ul li").click(function() {
//		$(this).addClass('active').siblings().removeClass('active');
//		$(this).parents(".teacher_box").find(".z_teacher_qh .z_teacher_st").hide().siblings().eq($(this).index()).show();
//	})
//
//	$(".teacher_cont ul li dl").hover(function() {
//		$(this).css("border", "2px solid #e1ac2c")
//	}, function() {
//		$(this).css("border", "2px solid #ebebeb")
//	})
//
//});
