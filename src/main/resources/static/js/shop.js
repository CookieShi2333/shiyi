 $(function(){
              $("#addCommit").click(function(){
                     $.ajax({
                         type: "POST",
                         url: "/goods/addGoods",
                         /*此步骤必须要有Goods带参数的构造方法*/
                         data: {goodsName:$("#goodsName").val(),
                                goodsDesc:$("#goodsDesc").val(),
                                goodsPrice:$("#goodsPrice").val(),
                                goodsStatus:$("#goodsStatus").val()
                                },
                         dataType: "json",
                         success: function(response){
                            if(response.success){
            　　　　            alert(response.message);
                                selectAll();
                            }else{
                                alert(response.message);
                            }
                         }
                     });
                });

               $("#deleteButton").click(function(){
                      $.ajax({
                          type: "POST",
                          url: "/goods/deleteGoods",
                          /*此步骤必须要有Goods带参数的构造方法*/
                          data: {goodsName:$("#deleteByName").val() },
                          dataType: "json",
                          success: function(response){
                             if(response.success){
             　　　　        alert(response.message);
                             selectAll();
                             }else{
                                 alert(response.message);
                             }
                          }
                      });
                 });

             $("#updateButton").click(function(){
                      $.ajax({
                          type: "POST",
                          url: "/goods/updateGoods",
                          /*此步骤必须要有Goods带参数的构造方法*/
                          data: {goodsName:$("#goodsUpdateName").val(),
                                goodsDesc:$("#goodsUpdateDesc").val(),
                                goodsPrice:$("#goodsUpdatePrice").val(),
                                goodsStatus:$("#goodsUpdateStatus").val()
                                },
                          dataType: "json",
                          success: function(response){
                             if(response.success){
             　　　　            alert(response.message);
                                 selectAll();
                             }else{
                                 alert(response.message);
                             }
                          }
                      });
                 });

                 $("#selectButton").click(function(){
                      $.ajax({
                          type: "POST",
                          url: "/goods/selectGoods",
                          /*此步骤必须要有Goods带参数的构造方法*/
                          data: {goodsName:$("#goodsSelectName").val()},
                          dataType: "json",
                          success: function(data){
                          /*data为一个Goods，则使用data.goodsName，
                          必须在Goods里创建getter，setter方法*/
                          console.log(data);
                          alert(data.goodsName);
                          }
                      });
                 });

                 function selectAll(){
                   $.ajax({
                          type: "POST",
                          url: "/goods/selectAllGoods",
                          dataType: "json",
                          success: function(data){
                            refreshTable(data.goodsList);
                          }
                      });
                 }

                 function refreshTable(sqlTables){
                      //清空表格
                      $("#sqlTables").html("");
                      //根据传入的数据进行循环制表
                      for(i in sqlTables){
                            $("#sqlTables").append("<tr><td>"+sqlTables[i].id+
                                    "</td><td>"+sqlTables[i].goodsName+
                                    "</td><td>"+sqlTables[i].goodsPrice+
                                    "</td><td>"+sqlTables[i].goodsProvider+
                                    "</td><td>"+sqlTables[i].goodsDesc+
                                    "</td><td>"+sqlTables[i].goodsStatus+
                                    "</td><td>"+sqlTables[i].createUserId+
                                    "</td><td>"+sqlTables[i].createTime+
                                    "</td><td>"+sqlTables[i].updateUserId+
                                    "</td><td>"+sqlTables[i].updateTime+
                                    "</td><td>"+sqlTables[i].deleteFlag+
                                     "</td><td>"+"<a href='#'>修改</a>/<a href='#'>删除</a>"+
                                    "</td><tr>");
                         }}

    });