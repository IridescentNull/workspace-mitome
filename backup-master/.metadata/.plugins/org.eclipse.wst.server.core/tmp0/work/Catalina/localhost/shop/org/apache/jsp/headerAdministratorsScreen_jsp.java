/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.32
 * Generated at: 2017-12-21 07:52:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class headerAdministratorsScreen_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/Users/internousdev/Desktop/workspace/workspace-mitome/backup-master/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/shop/WEB-INF/lib/struts2-jquery-plugin-3.7.0.jar!/META-INF/struts-jquery-tags.tld", Long.valueOf(1389609360000L));
    _jspx_dependants.put("/WEB-INF/lib/struts2-core-2.3.32.jar", Long.valueOf(1513236930000L));
    _jspx_dependants.put("/WEB-INF/lib/struts2-jquery-plugin-3.7.0.jar", Long.valueOf(1513236930000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsj_005fhead_0026_005fjquerytheme_005fnobody;

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
    _005fjspx_005ftagPool_005fsj_005fhead_0026_005fjquerytheme_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsj_005fhead_0026_005fjquerytheme_005fnobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("<title>Administorators Screen</title>\n");
      if (_jspx_meth_sj_005fhead_005f0(_jspx_page_context))
        return;
      out.write(" <!-- jquerytheme=\"redmond\" ããããã¨ãä¸çºã§ãã¶ã¤ã³ãããããã -->\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"http://netdna.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\"/>\n");
      out.write("  ");
      out.write("\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("\tdiv.container{\n");
      out.write("\t\tmax-width:800px;\n");
      out.write("\t\tposition: relative;\n");
      out.write("\t\theight: auto;\n");
      out.write("\t\theight:100%;\n");
      out.write("\t}\n");
      out.write("\tp.box{\n");
      out.write("\tborder-bottom: 1px solid lightgray;\n");
      out.write("\t}\n");
      out.write("\tp.err{\n");
      out.write("\t\tcolor:red;\n");
      out.write("\t}\n");
      out.write("\tdiv.result dd{\n");
      out.write("\t\tmargin-bottom:32px;\n");
      out.write("\t}\n");
      out.write("\tfooter.perchase-progress-bar{\n");
      out.write("\t\tmargin: 0 auto;\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\toverflow: hidden;\n");
      out.write("\t\theight: 110px;\n");
      out.write("\t\tbackground-color: #f5f5f5;\n");
      out.write("\t\twidth:100%;\n");
      out.write("\t\toverflow: hidden;\n");
      out.write("\t\ttop: 120px;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\tfooter.perchase-progress-bar.affix{\n");
      out.write("\t\ttop: 0px;\n");
      out.write("\t\tposition: fixed;\n");
      out.write("\t}\n");
      out.write("\tfooter{\n");
      out.write("\t\theight: 60px;\n");
      out.write("\t\t}\n");
      out.write("\tfooter.perchase{\n");
      out.write("\t\theight: 120px;\n");
      out.write("\t\tbackground-color: #f5f5f5;\n");
      out.write("\t\tposition: fixed;\n");
      out.write("\t\tbottom: 0;\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t\tborder-top:1px solid #cccccc;\n");
      out.write("\t\t}\n");
      out.write("\t#wrap{\n");
      out.write("\t\tmini-height:100%;\n");
      out.write("\t\theight: auto;\n");
      out.write("\t\tmargin: auto -0px;\n");
      out.write("\t\tpadding: 0 0 0px;\n");
      out.write("\t\ttext-shadow:\n");
      out.write("\t\t0 0 2px #FFFFFF, 0 0 2px #FFFFFF, 0 0 2px #FFFFFF, 0 0 2px #FFFFFF, 0 0 2px #FFFFFF, 0 0 2px #FFFFFF;/* å½±ãç¡çããæ¿ããã¦ãã */\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\t@media(min-width:768px){\n");
      out.write("\ttd.td_vertical_align_middle{\n");
      out.write("    display:flex;\n");
      out.write("    align-items:center;\n");
      out.write("    }\n");
      out.write("\t}/* bootstrap3ã®vertical-align:topãã©ãã«ããã¦æã¡æ¶ãããã®ãã®\n");
      out.write("\t\tflexãã¤ããªãè¡ãã¤ãããªãã¨ãé·ããç¶­æã§ããªããã*/\n");
      out.write("\n");
      out.write("\t@media(min-width:768px){\n");
      out.write("\t.history-button{\n");
      out.write("    position: absolute;\n");
      out.write("\tbottom: -180px  !important;\n");
      out.write("\tright: 20px  !important;\n");
      out.write("    }\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\t.overlay-btn{\n");
      out.write("\t\tdisplay: block;\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t\tcolor: #0000FF;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.overlay-btn2{\n");
      out.write("\t\tdisplay: block;\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t\tcolor: #0000FF;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.overlay-btn3{\n");
      out.write("\t\tdisplay: block;\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t\tcolor: #0000FF;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.overlay-btn4{\n");
      out.write("\t\tdisplay: block;\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t\tcolor: #0000FF;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.overlay-btn5{\n");
      out.write("\t\tdisplay: block;\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t\tcolor: #0000FF;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.overlay-btn:hover{\n");
      out.write("\ttext-decoration: underline;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.overlay-btn2:hover{\n");
      out.write("\ttext-decoration: underline;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.overlay-btn3:hover{\n");
      out.write("\ttext-decoration: underline;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.overlay-btn4:hover{\n");
      out.write("\ttext-decoration: underline;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.overlay-btn5:hover{\n");
      out.write("\ttext-decoration: underline;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\t.overlay{\n");
      out.write("\t\tdisplay: none;\n");
      out.write("\t\twidth:800px;\n");
      out.write("\t\theight: 65%;\n");
      out.write("\t\tposition: fixed;\n");
      out.write("\t\tleft: 2%;\n");
      out.write("\t\tright: 2%;\n");
      out.write("\t\ttop: 20%;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t\tz-index: 100;\n");
      out.write("\t\tbackground: #FFFFFF;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.overlay-storage{\n");
      out.write("\t\tdisplay: none;\n");
      out.write("\t\twidth:800px;\n");
      out.write("\t\theight: 1000px;\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\tleft: 2%;\n");
      out.write("\t\tright: 2%;\n");
      out.write("\t\ttop: 30%;\n");
      out.write("\t\tmargin: 0%;\n");
      out.write("\t\tz-index: 100;\n");
      out.write("\t\tbackground: #FFFFFF;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.overlay-mouse{\n");
      out.write("\t\tdisplay: none;\n");
      out.write("\t\twidth:800px;\n");
      out.write("\t\theight: 720px;\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\tleft: 2%;\n");
      out.write("\t\tright: 2%;\n");
      out.write("\t\ttop: 60%;\n");
      out.write("\t\tmargin: 0%;\n");
      out.write("\t\tz-index: 100;\n");
      out.write("\t\tbackground: #FFFFFF;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.overlay-fruit{\n");
      out.write("\t\tdisplay: none;\n");
      out.write("\t\twidth:800px;\n");
      out.write("\t\theight: 360px;\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\tleft: 2%;\n");
      out.write("\t\tright: 2%;\n");
      out.write("\t\ttop: 79%;\n");
      out.write("\t\tmargin: 0%;\n");
      out.write("\t\tz-index: 100;\n");
      out.write("\t\tbackground: #FFFFFF;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.overlay-flower{\n");
      out.write("\t\tdisplay: none;\n");
      out.write("\t\twidth:800px;\n");
      out.write("\t\theight: 400px;\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\tleft: 2%;\n");
      out.write("\t\tright: 2%;\n");
      out.write("\t\ttop: 83%;\n");
      out.write("\t\tmargin: 0%;\n");
      out.write("\t\tz-index: 100;\n");
      out.write("\t\tbackground: #FFFFFF;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.overlay-shadow{\n");
      out.write("\t\tdisplay: none;\n");
      out.write("\t\twidth:100%;\n");
      out.write("\t\theight: 100%;\n");
      out.write("\t\tposition: fixed;\n");
      out.write("\t\tleft: 0%;\n");
      out.write("\t\ttop: 0%;\n");
      out.write("\t\tz-index: 10;\n");
      out.write("\t\tbackground: rgba(0,0,0,0.7);\n");
      out.write("\t\toverflow:scroll\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.background-top-white{\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t\theight: 120px;\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\tleft: 0%;\n");
      out.write("\t\toverflow: hidden;\n");
      out.write("\t\ttop: 0%;\n");
      out.write("\t\tz-index: -5;\n");
      out.write("\t\tbackground: white;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.background-gray{\n");
      out.write("\t\twidth: 100%;\n");
      out.write("\t\theight: 100%;\n");
      out.write("\t\tposition: fixed;\n");
      out.write("\t\tleft: 0%;\n");
      out.write("\t\ttop: 0;\n");
      out.write("\t\tz-index: -10;\n");
      out.write("\t\tbackground: #f5f5f5;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.overlay-close{\n");
      out.write("\t\twidth: 70px;\n");
      out.write("\t\ttext-align: left;\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t\tfont-size: 18ex;\n");
      out.write("\t\tline-height: 0.5;\n");
      out.write("\t}\n");
      out.write("\t.overlay-close2{\n");
      out.write("\t\twidth: 70px;\n");
      out.write("\t\ttext-align: left;\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t\tfont-size: 18ex;\n");
      out.write("\t\tline-height: 0.5;\n");
      out.write("\t}\n");
      out.write("\t.overlay-close3{\n");
      out.write("\t\twidth: 70px;\n");
      out.write("\t\ttext-align: left;\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t\tfont-size: 18ex;\n");
      out.write("\t\tline-height: 0.5;\n");
      out.write("\t}\n");
      out.write("\t.overlay-close4{\n");
      out.write("\t\twidth: 70px;\n");
      out.write("\t\ttext-align: left;\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t\tfont-size: 18ex;\n");
      out.write("\t\tline-height: 0.5;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.overlay-close5{\n");
      out.write("\t\twidth: 70px;\n");
      out.write("\t\ttext-align: left;\n");
      out.write("\t\tcursor: pointer;\n");
      out.write("\t\tfont-size: 18ex;\n");
      out.write("\t\tline-height: 0.5;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t.overlay-text{\n");
      out.write("\t\tpadding: 5% 10%;\n");
      out.write("\t\tmargin: auto;\n");
      out.write("\t\tline-height: 1.5;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\tdiv.inliner{\n");
      out.write("\t\ttext-align: left;\n");
      out.write("\t\tfloat: left;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tdiv.inliner-right{\n");
      out.write("\t\ttext-align: right;\n");
      out.write("\t}\n");
      out.write("\tdiv.transparent{\n");
      out.write("\t\topacity: 0;\n");
      out.write("\t}\n");
      out.write("\tdiv.transparent-sought{\n");
      out.write("\t\topacity: 1;\n");
      out.write("\t\ttransition: 0.8s;\n");
      out.write("\t}\n");
      out.write("\tdiv.hidden{\n");
      out.write("\t\tstyle=\"display: none;\"\n");
      out.write("\t}\n");
      out.write("\tbutton.hidden{\n");
      out.write("\t\tstyle=\"display: none;\"\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\tul.perchase-bottom.perchase-bottom.perchase-bottom > li{\n");
      out.write("\t\ttext-align: left;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t#taxQuestion:hover >.mini-overlay{\n");
      out.write("\t\tdisplay: block;\n");
      out.write("\t}\n");
      out.write("\t#taxQuestion:hover img{\n");
      out.write("\t\tposition: relative;\n");
      out.write("\t\tz-index: 150;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t#taxQuestion >.mini-overlay{\n");
      out.write("\t\tdisplay: none;\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\ttop: -100px;\n");
      out.write("\t\tleft: -250px;\n");
      out.write("\t\twidth: 285px;\n");
      out.write("\t\theight: 165px;\n");
      out.write("\t\tz-index: 100;\n");
      out.write("\t\tpadding: 5px 20px;\n");
      out.write("\t\tbox-shadow: 1px 1px 5px #c0c0c0;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\t#securityCodeQuestion:hover >.mini-overlay{\n");
      out.write("\t\tdisplay: block;\n");
      out.write("\t}\n");
      out.write("\t#securityCodeQuestion:hover img{\n");
      out.write("\t\tposition: relative;\n");
      out.write("\t\tz-index: 150;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\t#securityCodeQuestion >.mini-overlay{\n");
      out.write("\t\tdisplay: none;\n");
      out.write("\t\tposition: absolute;\n");
      out.write("\t\ttop:200px;\n");
      out.write("\t\tleft: 180px;\n");
      out.write("\t\twidth: 200px;\n");
      out.write("\t\theight: 165px;\n");
      out.write("\t\tz-index: 100;\n");
      out.write("\t\tpadding: 5px 20px;\n");
      out.write("\t\tbox-shadow: 1px 1px 5px #c0c0c0;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\tth.recyle{\n");
      out.write("\t\tbackground-color: #f5f5f5;\n");
      out.write("\t\tborder: 1px solid gray;\n");
      out.write("\t\tpadding: 2px 2px 2px 2px;\n");
      out.write("\t}\n");
      out.write("\ttable.recyle{\n");
      out.write("\t\tborder: 1px solid gray;\n");
      out.write("\t\tfont-size: 12px;\n");
      out.write("\t\tline-height: 2.0;\n");
      out.write("\t\tpadding: 2px 2px 2px 2px;\n");
      out.write("\t}\n");
      out.write("\ttr.recyle{\n");
      out.write("\t\tborder: 1px solid gray;\n");
      out.write("\t\tpadding: 2px 2px 2px 2px;\n");
      out.write("\t}\n");
      out.write("\ttd.recyle{\n");
      out.write("\t\tborder: 1px solid gray;\n");
      out.write("\t\tpadding: 2px 2px 2px 2px;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<script  type=\"text/javascript\"  charset=\"utf-8\">\n");
      out.write("\t\tfunction Orange(){\n");
      out.write("\t\t\twindow.location.href = 'login.jsp';}\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div id=\"wrap\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"page-header\">\n");
      out.write("\t\t\t<a onClick=\"Orange()\" ><h1>ORange <small> ver 3.12.07</small></h1></a>\n");
      out.write("\t\t\t");
out.println("You are logged in as: <strong>"+(String)session.getAttribute("administratorIdShadow")+" </strong>."); 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
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

  private boolean _jspx_meth_sj_005fhead_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sj:head
    com.jgeppert.struts2.jquery.views.jsp.ui.HeadTag _jspx_th_sj_005fhead_005f0 = (com.jgeppert.struts2.jquery.views.jsp.ui.HeadTag) _005fjspx_005ftagPool_005fsj_005fhead_0026_005fjquerytheme_005fnobody.get(com.jgeppert.struts2.jquery.views.jsp.ui.HeadTag.class);
    _jspx_th_sj_005fhead_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sj_005fhead_005f0.setParent(null);
    // /headerAdministratorsScreen.jsp(9,0) name = jquerytheme type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sj_005fhead_005f0.setJquerytheme("redmond");
    int _jspx_eval_sj_005fhead_005f0 = _jspx_th_sj_005fhead_005f0.doStartTag();
    if (_jspx_th_sj_005fhead_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsj_005fhead_0026_005fjquerytheme_005fnobody.reuse(_jspx_th_sj_005fhead_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsj_005fhead_0026_005fjquerytheme_005fnobody.reuse(_jspx_th_sj_005fhead_005f0);
    return false;
  }
}
