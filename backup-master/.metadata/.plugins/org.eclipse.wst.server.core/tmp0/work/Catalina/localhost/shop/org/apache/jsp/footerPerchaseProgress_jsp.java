/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2017-12-18 08:24:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footerPerchaseProgress_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.32.jar", Long.valueOf(1513236930000L));
    _jspx_dependants.put("jar:file:/C:/Users/internousdev/Desktop/workspace/workspace-mitome/backup-master/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/shop/WEB-INF/lib/struts2-core-2.3.32.jar!/META-INF/struts-tags.tld", Long.valueOf(1488769580000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fclass_005faction;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fclass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fclass_005faction.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<footer class=\"text-center\" style=\"height: 180px;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<p>Copyright &#x00A9; 2017 Orange Inc. All rights reserved.</p>\n");
      out.write("\n");
      out.write("\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<footer   data-spy=\"affix\" data-offset-top=\"120\" class=\"text-center perchase-progress-bar\">\n");
      out.write("\t<ul class=\"list-inline\">\n");
      out.write("\t<li><img src=\"desktop.png\"  height = \"100\"></li>\n");
      out.write("\t<li><h4><strong><br>Desktop PC<br></strong>$");
      out.print(session.getAttribute("totalPrice1") );
      out.write("</h4></li>\n");
      out.write("\t<li>\n");
      out.write("\n");
      out.write("\t");
      //  s:form
      org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fclass_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
      _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fform_005f0.setParent(null);
      // /footerPerchaseProgress.jsp(24,1) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setAction("PerchaseProgressAction");
      // /footerPerchaseProgress.jsp(24,1) name = class type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setCssClass("text-center");
      int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005fform_005f0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t<input type=\"hidden\" name=\"careCheck\" id=\"careCheck\" value=\"0\">\n");
          out.write("\t\t<input type=\"hidden\" name=\"connector1Check\" id=\"connector1Check\" value=\"0\">\n");
          out.write("\t\t<input type=\"hidden\" name=\"connector2Check\" id=\"connector2Check\" value=\"0\">\n");
          out.write("\t\t<input type=\"hidden\" name=\"driveCheck\" id=\"driveCheck\" value=\"0\">\n");
          out.write("\t\t<input type=\"hidden\" name=\"storageCheck\" id=\"storageCheck\" value=\"0\">\n");
          out.write("\t\t<input type=\"hidden\" name=\"airportCheck\" id=\"airportCheck\" value=\"0\">\n");
          out.write("\t\t<input type=\"hidden\" name=\"timeCapsuleCheck\" id=\"timeCapsuleCheck\" value=\"0\">\n");
          out.write("\t\t<input type=\"hidden\" name=\"officeCheck\" id=\"officeCheck\" value=\"0\">\n");
          out.write("\t\t<input type=\"hidden\" name=\"pcType\" id=\"pcType\" value=1>\n");
          out.write("\t\t<input type=\"hidden\" name=\"memoryForm\" id=\"memoryForm\" value=\"");
          out.print(session.getAttribute("memoryForm") );
          out.write("\">\n");
          out.write("\t\t<input type=\"hidden\" name=\"storageForm\" id=\"storageForm\" value=\"");
          out.print(session.getAttribute("storageForm") );
          out.write("\">\n");
          out.write("\t\t<input type=\"hidden\" name=\"mouseForm\" id=\"mouseForm\" value=\"");
          out.print(session.getAttribute("mouseForm") );
          out.write("\">\n");
          out.write("\t\t<input type=\"hidden\" name=\"fruitForm\" id=\"fruitForm\" value=\"");
          out.print(session.getAttribute("fruitForm") );
          out.write("\">\n");
          out.write("\t\t<input type=\"hidden\" name=\"flowerForm\" id=\"flowerForm\" value=\"");
          out.print(session.getAttribute("flowerForm") );
          out.write("\">\n");
          out.write("\t\t<input type=\"hidden\" name=\"totalPrice1\" id=\"totalPrice1\" value=\"");
          out.print(session.getAttribute("totalPrice1") );
          out.write("\">\n");
          out.write("\t\t<input type=\"hidden\" name=\"tax\" id=\"tax\" value=1>\n");
          out.write("\t\t<button  value=\"perchase\" class=\"btn-lg btn-primary \">Review Bag</button>\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fs_005fform_0026_005fclass_005faction.reuse(_jspx_th_s_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fs_005fform_0026_005fclass_005faction.reuse(_jspx_th_s_005fform_005f0);
      out.write("\n");
      out.write("\t</li>\n");
      out.write("\t</ul>\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div id=\"test\"></div>\n");
      out.write("</body>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}