$( document ).ready(function() {
	window.setInterval(function() {

        // ************************************************************************************************************
        // ************************************************************************************************************
        // ********************************* SG Servers ***************************************************************
        // ************************************************************************************************************
        // ************************************************************************************************************

		var tr_sg = $("#sg_servers");

		$.ajax({
			url: 'http://localhost:8080/monitor/SunGuard/am1http',
			type: 'GET',
			success: function(data, status){ 
				if(data.alive==='RUNNING') {
					(tr_sg.find("td[id='sg_am1_http_status']").text("Running").css("background-color", "#8ec252"));
				} else {
					(tr_sg.find("td[id='sg_am1_http_status']").text("Down").css("background-color", "red"));
				}

				// if (data.oAuthTokenAvailable=='RUNNING') {
				// 	(tr.find("td[id='dev1_oauth_status']").text("Running").css("background-color", "#8ec252"));
				// } else {
				// 	(tr.find("td[id='dev1_oauth_status']").text("Down").css("background-color", "red"));
				// }
			},
			error: function(data, status) {
				(tr_sg.find("td[id='sg_am1_http_status']").text("N/A").css("background-color", "yellow"));
				(tr_sg.find("td[id='sg_am1_http_status']").text("N/A").css("background-color", "yellow"));
			}
		});

        $.ajax({
            url: 'http://localhost:8080/monitor/SunGuard/am1https',
            type: 'GET',
            success: function(data, status){
                if(data.alive==='RUNNING') {
                    (tr_sg.find("td[id='sg_am1_https_status']").text("Running").css("background-color", "#8ec252"));
                } else {
                    (tr_sg.find("td[id='sg_am1_https_status']").text("Down").css("background-color", "red"));
                }

                // if (data.oAuthTokenAvailable=='RUNNING') {
                //     (tr.find("td[id='dev1_oauth_status']").text("Running").css("background-color", "#8ec252"));
                // } else {
                //     (tr.find("td[id='dev1_oauth_status']").text("Down").css("background-color", "red"));
                // }
            },
            error: function(data, status) {
                (tr_sg.find("td[id='sg_am1_https_status']").text("N/A").css("background-color", "yellow"));
                (tr_sg.find("td[id='sg_am1_https_status']").text("N/A").css("background-color", "yellow"));
            }
        });

		$.ajax({
			url: 'http://localhost:8080/monitor/SunGuard/am2http',
			type: 'GET',
			success: function(data, status){
				if(data.alive==='RUNNING') {
					(tr_sg.find("td[id='sg_am2_http_status']").text("Running").css("background-color", "#8ec252"));
				} else {
					(tr_sg.find("td[id='sg_am2_http_status']").text("Down").css("background-color", "red"));
				}

				// if (data.oAuthTokenAvailable=='RUNNING') {
				// 	(tr.find("td[id='dev2_oauth_status']").text("Running").css("background-color", "#8ec252"));
				// } else {
				// 	(tr.find("td[id='dev2_oauth_status']").text("Down").css("background-color", "red"));
				// }
			},
			error: function(data, status) {
				(tr_sg.find("td[id='sg_am2_http_status']").text("N/A").css("background-color", "yellow"));
				(tr_sg.find("td[id='sg_am2_http_status']").text("N/A").css("background-color", "yellow"));

			}
		});

        $.ajax({
            url: 'http://localhost:8080/monitor/SunGuard/am2https',
            type: 'GET',
            success: function(data, status){
                if(data.alive==='RUNNING') {
                    (tr_sg.find("td[id='sg_am2_https_status']").text("Running").css("background-color", "#8ec252"));
                } else {
                    (tr_sg.find("td[id='sg_am2_https_status']").text("Down").css("background-color", "red"));
                }

                // if (data.oAuthTokenAvailable=='RUNNING') {
                // 	(tr.find("td[id='dev2_oauth_status']").text("Running").css("background-color", "#8ec252"));
                // } else {
                // 	(tr.find("td[id='dev2_oauth_status']").text("Down").css("background-color", "red"));
                // }
            },
            error: function(data, status) {
                (tr_sg.find("td[id='sg_am2_https_status']").text("N/A").css("background-color", "yellow"));
                (tr_sg.find("td[id='sg_am2_https_status']").text("N/A").css("background-color", "yellow"));

            }
        });

		$.ajax({
			url: 'http://localhost:8080/monitor/SunGuard/amLoadBalancer',
			type: 'GET',
			success: function(data, status){ 
				if(data.alive==='RUNNING') {
					(tr_sg.find("td[id='sg_lb_status']").text("Running").css("background-color", "#8ec252"));
				} else {
					(tr_sg.find("td[id='sg_lb_status']").text("Down").css("background-color", "red"));
				}
			},
			error: function(data, status) {
				(tr_sg.find("td[id='sg_lb_status']").text("N/A").css("background-color", "yellow"));
			}
		});


		$.ajax({
			url: 'http://localhost:8080/monitor/SunGuard/idm1',
			type: 'GET',
			success: function(data, status){ 
				if(data.alive==='RUNNING') {
					(tr_sg.find("td[id='dev1_idm_status']").text("Running").css("background-color", "#8ec252"));
				} else {
					(tr_sg.find("td[id='dev1_idm_status']").text("Down").css("background-color", "red"));
				}
			},
			error: function(data, status) {
				(tr_sg.find("td[id='dev1_idm_status']").text("N/A").css("background-color", "yellow"));
			}
		});

		$.ajax({
			url: 'http://localhost:8080/monitor/SunGuard/idm2',
			type: 'GET',
			success: function(data, status){ 
				if(data.alive==='RUNNING') {
					(tr_sg.find("td[id='dev2_idm_status']").text("Running").css("background-color", "#8ec252"));
				} else {
					(tr_sg.find("td[id='dev2_idm_status']").text("Down").css("background-color", "red"));
				}
			},
			error: function(data, status) {
				(tr_sg.find("td[id='dev2_idm_status']").text("N/A").css("background-color", "yellow"));
			}
		});

		// ************************************************************************************************************
        // ************************************************************************************************************
        // *******************************Non-Prod Servers*************************************************************
        // ************************************************************************************************************
        // ************************************************************************************************************
        var tr_non_prod = $("#non_prod_servers");

        $.ajax({
            url: 'http://localhost:8080/monitor/NonProd/am1http',
            type: 'GET',
            success: function(data, status){
                if(data.alive==='RUNNING') {
                    (tr_non_prod.find("td[id='non_prod_am1_http_status']").text("Running").css("background-color", "#8ec252"));
                } else {
                    (tr_non_prod.find("td[id='non_prod_am1_http_status']").text("Down").css("background-color", "red"));
                }
            },
            error: function(data, status) {
                (tr_non_prod.find("td[id='non_prod_am1_http_status']").text("N/A").css("background-color", "yellow"));
                (tr_non_prod.find("td[id='non_prod_am1_http_status']").text("N/A").css("background-color", "yellow"));
            }
        });

        $.ajax({
            url: 'http://localhost:8080/monitor/NonProd/am1https',
            type: 'GET',
            success: function(data, status){
                if(data.alive==='RUNNING') {
                    (tr_non_prod.find("td[id='non_prod_am1_https_status']").text("Running").css("background-color", "#8ec252"));
                } else {
                    (tr_non_prod.find("td[id='non_prod_am1_https_status']").text("Down").css("background-color", "red"));
                }
            },
            error: function(data, status) {
                (tr_non_prod.find("td[id='non_prod_am1_https_status']").text("N/A").css("background-color", "yellow"));
                (tr_non_prod.find("td[id='non_prod_am1_https_status']").text("N/A").css("background-color", "yellow"));
            }
        });

        $.ajax({
            url: 'http://localhost:8080/monitor/NonProd/am2http',
            type: 'GET',
            success: function(data, status){
                if(data.alive==='RUNNING') {
                    (tr_non_prod.find("td[id='non_prod_am2_http_status']").text("Running").css("background-color", "#8ec252"));
                } else {
                    (tr_non_prod.find("td[id='non_prod_am2_http_status']").text("Down").css("background-color", "red"));
                }
            },
            error: function(data, status) {
                (tr_non_prod.find("td[id='non_prod_am2_http_status']").text("N/A").css("background-color", "yellow"));
                (tr_non_prod.find("td[id='non_prod_am2_http_status']").text("N/A").css("background-color", "yellow"));
            }
        });

        $.ajax({
            url: 'http://localhost:8080/monitor/NonProd/am2https',
            type: 'GET',
            success: function(data, status){
                if(data.alive==='RUNNING') {
                    (tr_non_prod.find("td[id='non_prod_am2_https_status']").text("Running").css("background-color", "#8ec252"));
                } else {
                    (tr_non_prod.find("td[id='non_prod_am2_https_status']").text("Down").css("background-color", "red"));
                }
            },
            error: function(data, status) {
                (tr_non_prod.find("td[id='non_prod_am2_https_status']").text("N/A").css("background-color", "yellow"));
                (tr_non_prod.find("td[id='non_prod_am2_https_status']").text("N/A").css("background-color", "yellow"));
            }
        });

        $.ajax({
            url: 'http://localhost:8080/monitor/NonProd/amLoadBalancer',
            type: 'GET',
            success: function(data, status){
                if(data.alive==='RUNNING') {
                    (tr_non_prod.find("td[id='non_prod_lb_status']").text("Running").css("background-color", "#8ec252"));
                } else {
                    (tr_non_prod.find("td[id='non_prod_lb_status']").text("Down").css("background-color", "red"));
                }
            },
            error: function(data, status) {
                (tr_non_prod.find("td[id='non_prod_lb_status']").text("N/A").css("background-color", "yellow"));
            }
        });

        // ************************************************************************************************************
        // ************************************************************************************************************
        // ******************************* Prod Servers ***************************************************************
        // ************************************************************************************************************
        // ************************************************************************************************************
        var tr_prod = $("#prod_servers");

        $.ajax({
            url: 'http://localhost:8080/monitor/Prod/am1http',
            type: 'GET',
            success: function(data, status){
                if(data.alive==='RUNNING') {
                    (tr_prod.find("td[id='prod_am1_http_status']").text("Running").css("background-color", "#8ec252"));
                } else {
                    (tr_prod.find("td[id='prod_am1_http_status']").text("Down").css("background-color", "red"));
                }
            },
            error: function(data, status) {
                (tr_prod.find("td[id='prod_am1_http_status']").text("N/A").css("background-color", "yellow"));
                (tr_prod.find("td[id='prod_am1_http_status']").text("N/A").css("background-color", "yellow"));
            }
        });

        $.ajax({
            url: 'http://localhost:8080/monitor/Prod/am1https',
            type: 'GET',
            success: function(data, status){
                if(data.alive==='RUNNING') {
                    (tr_prod.find("td[id='prod_am1_https_status']").text("Running").css("background-color", "#8ec252"));
                } else {
                    (tr_prod.find("td[id='prod_am1_https_status']").text("Down").css("background-color", "red"));
                }
            },
            error: function(data, status) {
                (tr_prod.find("td[id='prod_am1_https_status']").text("N/A").css("background-color", "yellow"));
                (tr_prod.find("td[id='prod_am1_https_status']").text("N/A").css("background-color", "yellow"));
            }
        });

        $.ajax({
            url: 'http://localhost:8080/monitor/Prod/am2http',
            type: 'GET',
            success: function(data, status){
                if(data.alive==='RUNNING') {
                    (tr_prod.find("td[id='prod_am2_http_status']").text("Running").css("background-color", "#8ec252"));
                } else {
                    (tr_prod.find("td[id='prod_am2_http_status']").text("Down").css("background-color", "red"));
                }
            },
            error: function(data, status) {
                (tr_prod.find("td[id='prod_am2_http_status']").text("N/A").css("background-color", "yellow"));
                (tr_prod.find("td[id='prod_am2_http_status']").text("N/A").css("background-color", "yellow"));
            }
        });

        $.ajax({
            url: 'http://localhost:8080/monitor/Prod/am2https',
            type: 'GET',
            success: function(data, status){
                if(data.alive==='RUNNING') {
                    (tr_prod.find("td[id='prod_am2_https_status']").text("Running").css("background-color", "#8ec252"));
                } else {
                    (tr_prod.find("td[id='prod_am2_https_status']").text("Down").css("background-color", "red"));
                }
            },
            error: function(data, status) {
                (tr_prod.find("td[id='prod_am2_https_status']").text("N/A").css("background-color", "yellow"));
                (tr_prod.find("td[id='prod_am2_https_status']").text("N/A").css("background-color", "yellow"));
            }
        });

        $.ajax({
            url: 'http://localhost:8080/monitor/Prod/am3http',
            type: 'GET',
            success: function(data, status){
                if(data.alive==='RUNNING') {
                    (tr_prod.find("td[id='prod_am3_http_status']").text("Running").css("background-color", "#8ec252"));
                } else {
                    (tr_prod.find("td[id='prod_am3_http_status']").text("Down").css("background-color", "red"));
                }
            },
            error: function(data, status) {
                (tr_prod.find("td[id='prod_am3_http_status']").text("N/A").css("background-color", "yellow"));
                (tr_prod.find("td[id='prod_am3_http_status']").text("N/A").css("background-color", "yellow"));
            }
        });

        $.ajax({
            url: 'http://localhost:8080/monitor/Prod/am3https',
            type: 'GET',
            success: function(data, status){
                if(data.alive==='RUNNING') {
                    (tr_prod.find("td[id='prod_am3_https_status']").text("Running").css("background-color", "#8ec252"));
                } else {
                    (tr_prod.find("td[id='prod_am3_https_status']").text("Down").css("background-color", "red"));
                }
            },
            error: function(data, status) {
                (tr_prod.find("td[id='prod_am3_https_status']").text("N/A").css("background-color", "yellow"));
                (tr_prod.find("td[id='prod_am3_https_status']").text("N/A").css("background-color", "yellow"));
            }
        });

        $.ajax({
            url: 'http://localhost:8080/monitor/Prod/am4http',
            type: 'GET',
            success: function(data, status){
                if(data.alive==='RUNNING') {
                    (tr_prod.find("td[id='prod_am4_http_status']").text("Running").css("background-color", "#8ec252"));
                } else {
                    (tr_prod.find("td[id='prod_am4_http_status']").text("Down").css("background-color", "red"));
                }
            },
            error: function(data, status) {
                (tr_prod.find("td[id='prod_am4_http_status']").text("N/A").css("background-color", "yellow"));
                (tr_prod.find("td[id='prod_am4_http_status']").text("N/A").css("background-color", "yellow"));
            }
        });

        $.ajax({
            url: 'http://localhost:8080/monitor/Prod/am4https',
            type: 'GET',
            success: function(data, status){
                if(data.alive==='RUNNING') {
                    (tr_prod.find("td[id='prod_am4_https_status']").text("Running").css("background-color", "#8ec252"));
                } else {
                    (tr_prod.find("td[id='prod_am4_https_status']").text("Down").css("background-color", "red"));
                }
            },
            error: function(data, status) {
                (tr_prod.find("td[id='prod_am4_https_status']").text("N/A").css("background-color", "yellow"));
                (tr_prod.find("td[id='prod_am4_https_status']").text("N/A").css("background-color", "yellow"));
            }
        });

        $.ajax({
            url: 'http://localhost:8080/monitor/Prod/amLoadBalancer',
            type: 'GET',
            success: function(data, status){
                if(data.alive==='RUNNING') {
                    (tr_prod.find("td[id='prod_lb_status']").text("Running").css("background-color", "#8ec252"));
                } else {
                    (tr_prod.find("td[id='prod_lb_status']").text("Down").css("background-color", "red"));
                }
            },
            error: function(data, status) {
                (tr_prod.find("td[id='prod_lb_status']").text("N/A").css("background-color", "yellow"));
            }
        });
	}, 3000);
});

