package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class top_jsp extends org.apache.jasper.runtime.HttpJspBase
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
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<title>CMS 后台管理工作平台</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("body {\r\n");
      out.write("\tmargin-left: 0px;\r\n");
      out.write("\tmargin-top: 0px;\r\n");
      out.write("\tmargin-right: 0px;\r\n");
      out.write("\tmargin-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write(".STYLE1 {\r\n");
      out.write("\tfont-size: 12px;\r\n");
      out.write("\tcolor: #000000;\r\n");
      out.write("}\r\n");
      out.write(".STYLE5 {font-size: 12}\r\n");
      out.write(".STYLE7 {font-size: 12px; color: #FFFFFF; }\r\n");
      out.write(".STYLE7 a{font-size: 12px; color: #FFFFFF; }\r\n");
      out.write("a img {\r\n");
      out.write("\tborder:none;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var open = true;\r\n");
      out.write("function openClose(){\r\n");
      out.write("\tif(open){\r\n");
      out.write("\t\twindow.parent.mainFrame.document.getElementById(\"leftMenu\").width = 1;\r\n");
      out.write("\t\topen = false;\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\twindow.parent.mainFrame.document.getElementById(\"leftMenu\").width = 147;\r\n");
      out.write("\t\topen = true;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"57\" background=\"images/main_03.gif\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"378\" height=\"57\" background=\"images/main_01.gif\">&nbsp;</td>\r\n");
      out.write("        <td>&nbsp;</td>\r\n");
      out.write("        <td width=\"281\" valign=\"bottom\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"33\" height=\"27\"><img src=\"images/main_05.gif\" width=\"33\" height=\"27\" /></td>\r\n");
      out.write("            <td width=\"248\" background=\"images/main_06.gif\"><table width=\"225\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("              <tr>\r\n");
      out.write("                <td height=\"17\"><div align=\"right\"><a href=\"#\" target=\"rightFrame\"><img src=\"images/pass.gif\" width=\"69\" height=\"17\" /></a></div></td>\r\n");
      out.write("                <td><div align=\"right\"><a href=\"#\" target=\"rightFrame\"><img src=\"images/user.gif\" width=\"69\" height=\"17\" /></a></div></td>\r\n");
      out.write("                <td><div align=\"right\"><a href=\"LoginServlet?method=quit\" target=\"_parent\"><img src=\"images/quit.gif\" alt=\" \" width=\"69\" height=\"17\" /></a></div></td>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </table></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"40\" background=\"images/main_10.gif\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"194\" height=\"40\" background=\"images/main_07.gif\">&nbsp;</td>\r\n");
      out.write("        <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"21\"><img src=\"images/main_13.gif\" width=\"19\" height=\"14\" /></td>\r\n");
      out.write("            <td width=\"35\" class=\"STYLE7\"><div align=\"center\"><a href=\"javascript:window.parent.location.href='main.jsp'\">首页</a></div></td>\r\n");
      out.write("            <td width=\"21\" class=\"STYLE7\"><img src=\"images/main_15.gif\" width=\"19\" height=\"14\" /></td>\r\n");
      out.write("            <td width=\"35\" class=\"STYLE7\"><div align=\"center\"><a href=\"javascript:history.go(-1);\">后退</a></div></td>\r\n");
      out.write("            <td width=\"21\" class=\"STYLE7\"><img src=\"images/main_17.gif\" width=\"19\" height=\"14\" /></td>\r\n");
      out.write("            <td width=\"35\" class=\"STYLE7\"><div align=\"center\"><a href=\"javascript:history.go(1);\">前进</a></div></td>\r\n");
      out.write("            <td width=\"21\" class=\"STYLE7\"><img src=\"images/main_19.gif\" width=\"19\" height=\"14\" /></td>\r\n");
      out.write("            <td width=\"35\" class=\"STYLE7\"><div align=\"center\"><a href=\"javascript:window.parent.location.reload();\">刷新</a></div></td>\r\n");
      out.write("            <td>&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"248\" background=\"images/main_11.gif\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"16%\"><span class=\"STYLE5\"></span></td>\r\n");
      out.write("            <td width=\"75%\"><div align=\"center\">\r\n");
      out.write("            <span class=\"STYLE7\">\r\n");
      out.write("            北京xxxxx科技有限公司\r\n");
      out.write("            </span></div></td>\r\n");
      out.write("            <td width=\"9%\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td height=\"30\" background=\"images/main_31.gif\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td width=\"8\" height=\"30\"><img src=\"images/main_28.gif\" width=\"8\" height=\"30\" /></td>\r\n");
      out.write("        <td width=\"147\" background=\"images/main_29.gif\" onclick=\"openClose()\" style=\"cursor:pointer;\" title=\"点击可以打开/隐藏管理菜单\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td width=\"24%\">&nbsp;</td>\r\n");
      out.write("            <td width=\"43%\" height=\"20\" valign=\"bottom\" class=\"STYLE1\">管理菜单</td>\r\n");
      out.write("            <td width=\"33%\">&nbsp;</td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"39\"><img src=\"images/main_30.gif\" width=\"39\" height=\"30\" /></td>\r\n");
      out.write("        <td><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("          <tr>\r\n");
      out.write("            <td height=\"20\" valign=\"bottom\"><span class=\"STYLE1\">当前登录用户：admin &nbsp;</span></td>\r\n");
      out.write("            <td valign=\"bottom\" class=\"STYLE1\"><div align=\"right\"></div></td>\r\n");
      out.write("          </tr>\r\n");
      out.write("        </table></td>\r\n");
      out.write("        <td width=\"17\"><img src=\"images/main_32.gif\" width=\"17\" height=\"30\" /></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
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
