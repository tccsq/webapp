package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class left_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<title>CMS 后台管理工作平台</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-1.4.2.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-ui-1.8.custom.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.jstree.js\"></script>\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t//将menuContainer变成一棵树！\r\n");
      out.write("\t\t$(\"#menuContainer\").jstree({\r\n");
      out.write("\t\t\t\"themes\" : {\r\n");
      out.write("\t\t\t\t\"theme\" : \"apple\"\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\"plugins\" : [ \"themes\", \"html_data\" ]\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t//给所有的链接设置其target属性为rightFrame，即在右边打开链接地址\r\n");
      out.write("\t\t$(\"a\").attr(\"target\", \"rightFrame\");\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"menuContainer\" style=\"height: 100%;\">\r\n");
      out.write("\t\t<ul id=\"navigation\">\r\n");
      out.write("\t\t\t<li><a href=\"#\">个人办公</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">桌面</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">我的桌面</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">桌面配置</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">任务计划</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">创建计划</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">查询计划</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">计划分类</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">日程安排</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">创建日程</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">查询日程</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">日程分类</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">日志管理</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">创建日志</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">我的日志</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">共享日志</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">日志分类</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">工作报告</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">编写报告</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">查询报告</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">电子邮件</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">收件箱</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">发件箱</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">参数配置</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">消息管理</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">发送消息</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">已接收消息</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">已发送消息</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">已删除消息</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">手机短信</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">发送手机短信</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">已接收短信</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">已发送短信</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">短信网关配置</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">通信录</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">私人通信录</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">公共通信录</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">网络硬盘</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">公共空间</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">私人空间</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">个人设置</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">个人信息</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">修改密码</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">工作状态</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">在线状态</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">工作流</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">表单定义</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">创建新的表单</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">查询已有表单</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">流程定义</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">创建新的流程定义</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">查询已有流程定义</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">任务管理</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">新建任务</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">我的任务</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">待办任务</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">已办任务</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">行政办公</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">公告通知</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">发布公告</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">查阅历史公告</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">公告分类</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">会议管理</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">车辆管理</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">图书管理</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">设备管理</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">用品管理</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">系统管理</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a>组织机构管理</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"system/company!saveInput.action\">单位/公司信息设置</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"system/party.action\">部门/岗位设置</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"system/person.action\">人员管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">权限管理</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"user/index.do\">用户管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">角色管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">菜单管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">资源管理</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">用户授权</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">角色授权</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">部门授权</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">岗位授权</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">档案管理</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">卷库分类</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">创建分类</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">查询已有分类</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">案卷分类</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">创建新的分类</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">查询已有案卷</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">档案管理</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">档案查阅</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">申请档案查阅</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">审批档案查阅申请</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">查阅档案</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">内部论坛</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">板块交流</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">Java技术园地</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">灌水专区</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">论坛设置</a></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t<li><a href=\"#\">知识管理</a>\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">知识分类</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">创建新的分类</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"#\">知识维护</a>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">创建新的知识</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">查询已有知识</a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t</ul></li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
