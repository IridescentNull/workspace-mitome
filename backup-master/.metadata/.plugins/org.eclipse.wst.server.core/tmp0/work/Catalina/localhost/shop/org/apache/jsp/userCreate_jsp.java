/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2017-12-18 05:20:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class userCreate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.32.jar", Long.valueOf(1513236930000L));
    _jspx_dependants.put("jar:file:/C:/Users/internousdev/Desktop/workspace/mitome/backup-master/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/shop/WEB-INF/lib/struts2-core-2.3.32.jar!/META-INF/struts-tags.tld", Long.valueOf(1488769580000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fform_0026_005fcssClass_005faction;

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
    _005fjspx_005ftagPool_005fs_005fform_0026_005fcssClass_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fform_0026_005fcssClass_005faction.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t\t<h2 class=\"text-center\">Account Creation Form</h2>\n");
      out.write("\t");
      //  s:form
      org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_005fform_005f0 = (org.apache.struts2.views.jsp.ui.FormTag) _005fjspx_005ftagPool_005fs_005fform_0026_005fcssClass_005faction.get(org.apache.struts2.views.jsp.ui.FormTag.class);
      _jspx_th_s_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fform_005f0.setParent(null);
      // /userCreate.jsp(6,1) name = cssClass type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setCssClass("form-horizontal");
      // /userCreate.jsp(6,1) name = action type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fform_005f0.setAction("UserCreateConfirmAction");
      int _jspx_eval_s_005fform_005f0 = _jspx_th_s_005fform_005f0.doStartTag();
      if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005fform_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005fform_005f0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t\t<table class=\"table table-striped\">\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<label class=\"col-sm-3\"><h4>Login Id:</h4></label>\n");
          out.write("\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t<input id=\"idCheck\" name=\"loginUserId\" placeholder=\"Orange_Farmer007\" class=\"form-control\">\n");
          out.write("\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t");
List<String> allLoginUserIdlist =(List<String>)request.getAttribute("allLoginUserIdlist");
          out.write("\n");
          out.write("\t\t\t\t\t\t<script type=\"text/javascript\">\n");
          out.write("\t\t\t\t\t\t\twindow.onload=function(){\n");
          out.write("\t\t\t\t\t\t\t\tdocument.getElementById( \"idCheck\" ).onkeyup = function(){\n");
          out.write("\t\t\t\t\t\t\t\tidCheckgetValue();\n");
          out.write("\t\t\t\t\t\t\t\t};\n");
          out.write("\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t\tfunction idCheckgetValue(){\n");
          out.write("\t\t\t\t\t\t\t\tvar $idCheck = document.getElementById(\"idCheck\").value;\n");
          out.write("\t\t\t\t\t\t\t\t//var d=0;\n");
          out.write("\t\t\t\t\t\t\t\tvar array = [");
 for (int i=0; i<allLoginUserIdlist.size();i++){
									if(i != 0){
										out.print(",");
									}
										out.println("\""+ allLoginUserIdlist.get(i) +"\"");
									}
								
          out.write("]\n");
          out.write("\t\t\t\t\t\t\t\tfor(var i=0; i < array.length ; i++){\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\tif(array[i] ===  $idCheck){\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById(\"idAlertMessage\").innerHTML = \"<strong>Sorry, this user ID is already in use.</strong>\";\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById(\"switch\").innerHTML = \"<button value='LOGIN' Class='btn btn-primary btn-lg btn-block WA' disabled='disabled'>( ・ω・)</button>\";\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\ti = i+array.length;\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t}else{\n");
          out.write("\t\t\t\t\t\t\t\t\t\tdocument.getElementById(\"idAlertMessage\").innerHTML = \"\";\n");
          out.write("\t\t\t\t\t\t\t\t\t\tdocument.getElementById(\"switch\").innerHTML = \"<button value='LOGIN' Class='btn-primary btn-lg btn-block WA'>Welcome!</button>\"\n");
          out.write("\t\t\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t\t}\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t</script>\n");
          out.write("\t\t\t\t\t\t<span id=\"idAlertMessage\"></span>\n");
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<label class=\"col-sm-3\"><h4>Password:</h4></label>\n");
          out.write("\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t<input name=\"loginPassword\" type=\"password\" placeholder=\"*Chinotto147\" class=\"form-control\">\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<label class=\"col-sm-3\"><h4>Password<small>(reconfirm)</small>:</h4></label>\n");
          out.write("\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t<input name=\"loginPasswordShadow\" type=\"password\" placeholder=\"please input same password ; )\" class=\"form-control\">\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<label class=\"col-sm-3\"><h4>Full Name:</h4></label>\n");
          out.write("\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t<input name=\"userName\" placeholder=\"Pehr Osbeck\" class=\"form-control\">\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<label class=\"col-sm-3\"><h4>Address (Line1):</h4></label>\n");
          out.write("\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t<input name=\"userAddress1\" placeholder=\"1 eternal Loop\" class=\"form-control\">\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<label class=\"col-sm-3\"><h4>Address (Line2):</h4></label>\n");
          out.write("\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t<input name=\"userAddress2\" placeholder=\"If you need.(e.g. Apartment,Suite,Unit,Building,Floor,etc )\" class=\"form-control\">\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<label class=\"col-sm-3\"><h4>City:</h4></label>\n");
          out.write("\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t<input name=\"userCity\" placeholder=\"Navel\" class=\"form-control\">\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<label class=\"col-sm-3\"><h4>State:</h4></label>\n");
          out.write("\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t<input name=\"userState\" placeholder=\"WA\" class=\"form-control\">\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<label class=\"col-sm-3\"><h4>ZIP Code:</h4></label>\n");
          out.write("\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t<input name=\"userZIP\" placeholder=\"41059\" class=\"form-control\">\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<label class=\"col-sm-3\"><h4>Country:</h4></label>\n");
          out.write("\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t<input name=\"userCountry\" placeholder=\"USA\" class=\"form-control\">\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t\t<tr>\n");
          out.write("\t\t\t\t\t<td>\n");
          out.write("\t\t\t\t\t\t<label class=\"col-sm-3\"><h4>Phone Number:</h4></label>\n");
          out.write("\t\t\t\t\t\t<div class=\"col-sm-9\">\n");
          out.write("\t\t\t\t\t\t\t<input name=\"userPhone\" placeholder=\"123-456-789\" class=\"form-control\">\n");
          out.write("\t\t\t\t\t\t</div>\n");
          out.write("\t\t\t\t\t</td>\n");
          out.write("\t\t\t\t</tr>\n");
          out.write("\t\t\t</table>\n");
          out.write("\t\t\t<div class=\"form-group\">\n");
          out.write("\t\t\t\t<div class=\"col-sm-offset-3 col-sm-9\">\n");
          out.write("\t\t\t\t\t<div id=\"switch\"><button value=\"LOGIN\" Class=\"btn-primary btn-lg btn-block WA\">Welcome!</button></div>\n");
          out.write("\t\t\t\t</div>\n");
          out.write("\t\t\t</div>\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_s_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fform_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fs_005fform_0026_005fcssClass_005faction.reuse(_jspx_th_s_005fform_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fs_005fform_0026_005fcssClass_005faction.reuse(_jspx_th_s_005fform_005f0);
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<strong class=\"col-sm-offset-3 col-sm-9\"><font color=\"red\"><h3 class=\"text-center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h3></font></strong>\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
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