/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.89
 * Generated at: 2023-07-17 16:11:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class More_005fAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1689532827853L));
    _jspx_dependants.put("jar:file:/D:/Java/FinalProjectPRJ301/build/web/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425953470000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/css/responsive.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\" />\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("        integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/css/style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"./assets/css/account.css\">\n");
      out.write("    <title>Document</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <section id=\"header\">\n");
      out.write("        <a href=\"#\"><img src=\"./img/140-1401926_r-anime-logo-high-resolution-anime-girl-logo.png\" class=\"logo\"\n");
      out.write("                alt=\"\"></a>\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <ul id=\"navbar\">\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"shop.jsp\">Shop</a></li>\n");
      out.write("                 <li>\n");
      out.write("                    <div class=\"navbar__user\">\n");
      out.write("                        <img src=\"./img/user/userimg.png\" alt=\"\" class=\"navbar__user-img\">\n");
      out.write("                        <span class=\"navbar__user-name\">Username</span>\n");
      out.write("                        <div class=\"navbar__user-menu\">\n");
      out.write("                            <ul class=\"navbar__user-menu-list\">\n");
      out.write("                                <li class=\"navbar__user-menu-item\">\n");
      out.write("                                    <a href=\"#\" class=\"navbar__user-menu-link\">Account</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"navbar__user-menu-item\">\n");
      out.write("                                    <a href=\"#\" class=\"navbar__user-menu-link\">Order</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"navbar__user-menu-item\">\n");
      out.write("                                    <a href=\"\" class=\"navbar__user-menu-link\">Logout</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li> \n");
      out.write("                \n");
      out.write("                <!--Login button-->\n");
      out.write("<!--                <li>\n");
      out.write("                    <div style=\"padding: 0;\" class=\"navbar__user\">\n");
      out.write("                        <a style=\"width: 100%; padding: 7px;\" href=\"auth.jsp\" class=\"navbar__user-name\">Login</a>\n");
      out.write("                    </div>\n");
      out.write("                </li>-->\n");
      out.write("                \n");
      out.write("                <!--Cart no need-->\n");
      out.write("                <!-- <li id=\"lg-bag\">\n");
      out.write("                    <div class=\"navbar__cart\">\n");
      out.write("                        <a style=\"text-decoration: none;\" class=\"navbar__cart-link\" href=\"#\">\n");
      out.write("                            <i class=\"navbar__cart-icon fa-solid fa-cart-shopping\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <span class=\"navbar__cart-notice\">2</span> -->\n");
      out.write("                <!-- navbar__cart-list--no-cart add when no product  -->\n");
      out.write("                <!-- <div class=\"navbar__cart-list\">\n");
      out.write("                            <img src=\"./img/cart/no-product-found.png\" alt=\"\" class=\"navbar__cart-list--no-cart-img\">\n");
      out.write("                            <h4 class=\"navbar__cart-heading\">Products In Cart</h4>\n");
      out.write("                            <ul class=\"navbar__cart-list-item\">\n");
      out.write("                                <li class=\"navbar__cart-item\">\n");
      out.write("                                    <img src=\"../img/products/f1.jpg\" alt=\"\" class=\"navbar__cart-item-img\">\n");
      out.write("                                    <div class=\"navbar__cart-item-info\">\n");
      out.write("                                        <div class=\"navbar__cart-item-head\">\n");
      out.write("                                            <h5 class=\"navbar__cart-item-name\">Jujutsu Kaisen</h5>\n");
      out.write("                                            <div class=\"navbar__cart-item-price-wrap\">\n");
      out.write("                                                <span class=\"navbar__cart-item-price\">$45</span>\n");
      out.write("                                                <span class=\"navbar__cart-item-multiply\">x</span>\n");
      out.write("                                                <span class=\"navbar__cart-item-qnt\">2</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"navbar__cart-item-body\">\n");
      out.write("                                            <div class=\"header__cart-item-description\">\n");
      out.write("                                                Category: Manga\n");
      out.write("                                            </div>\n");
      out.write("                                            <span class=\"header__cart-item-remove\">Remove</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"navbar__cart-item\">\n");
      out.write("                                    <img src=\"../img/products/f2.jpg\" alt=\"\" class=\"navbar__cart-item-img\">\n");
      out.write("                                    <div class=\"navbar__cart-item-info\">\n");
      out.write("                                        <div class=\"navbar__cart-item-head\">\n");
      out.write("                                            <h5 class=\"navbar__cart-item-name\">Jujutsu Kaisen</h5>\n");
      out.write("                                            <div class=\"navbar__cart-item-price-wrap\">\n");
      out.write("                                                <span class=\"navbar__cart-item-price\">$50</span>\n");
      out.write("                                                <span class=\"navbar__cart-item-multiply\">x</span>\n");
      out.write("                                                <span class=\"navbar__cart-item-qnt\">1</span>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"navbar__cart-item-body\">\n");
      out.write("                                            <div class=\"header__cart-item-description\">\n");
      out.write("                                                Category: Manga\n");
      out.write("                                            </div>\n");
      out.write("                                            <span class=\"header__cart-item-remove\">Remove</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <a href=\"cart.html\" class=\"navbar__cart-btn normal\">View All</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </li> -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                 <li id=\"lg-bag\"><a href=\"cart.jsp\"><i class=\"fa-solid fa-bag-shopping\"></i></a></li> \n");
      out.write("\n");
      out.write("\n");
      out.write("                <a href=\"#\" id=\"close\"><i class=\"fa fa-times\"></i></a>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"mobile\">\n");
      out.write("            <a href=\"cart.html\"><i class=\"fa-solid fa-bag-shopping\"></i></a>\n");
      out.write("            <i id=\"bar\" class=\"fas fa-outdent\"></i>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"container-xl px-4 mt-4\">\n");
      out.write("        <!-- Account page navigation-->\n");
      out.write("        <nav class=\"nav nav-borders\">\n");
      out.write("            <a class=\"nav-link active ms-0\" href=\"#\">Update</a>\n");
      out.write("            <a class=\"nav-link\" href=\"adminservlet\">Admin</a>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("            <div class=\"col-xl-12\">\n");
      out.write("                <!-- Account details card-->\n");
      out.write("                <div class=\"card mb-4\">\n");
      out.write("                    <div class=\"card-header\">Account Details</div>\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        ");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <form action=\"apdateadmin\" method=\"Get\">\n");
      out.write("                            <!-- Form Group (username)-->\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label class=\"small mb-1\" for=\"inputFullname\">Fullname</label>\n");
      out.write("                                <input readonly=\"\" class=\"form-control\" id=\"inputFullname\" type=\"text\"\n");
      out.write("                                    placeholder=\"Enter your fullname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.fullname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"fullname\">\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Form Row-->\n");
      out.write("                            <div class=\"row gx-3 mb-3\">\n");
      out.write("                                <!-- Form Group (first name)-->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label class=\"small mb-1\" for=\"inputUsername\">Username</label>\n");
      out.write("                                    <input readonly=\"\" class=\"form-control\" id=\"inputUsername\" type=\"text\"\n");
      out.write("                                        placeholder=\"Enter your username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"username\">\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Form Group (last name)-->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label class=\"small mb-1\" for=\"inputGender\">Gender</label>\n");
      out.write("                                    <!-- <input class=\"form-control\" id=\"inputLastName\" type=\"text\"\n");
      out.write("                                        placeholder=\"Enter your last name\" value=\"Luna\"> -->\n");
      out.write("                                    <select disabled=\"\" class=\"form-control\" id=\"inputGender\" name=\"gender\">\n");
      out.write("                                        <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.gender == 0 ? 'selected': ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Male</option>\n");
      out.write("                                        <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.gender == 1 ? 'selected': ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Female</option>\n");
      out.write("                                        <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.gender == 2 ? 'selected': ''}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">Wibuu</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Form Row        -->\n");
      out.write("                            <div class=\" row gx-3 mb-3\">\n");
      out.write("                                <!-- Form Group (organization name)-->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label class=\"small mb-1\" for=\"inputLocation\">Location</label>\n");
      out.write("                                    <input readonly=\"\" class=\"form-control\" id=\"inputLocation\" type=\"text\"\n");
      out.write("                                        placeholder=\"Enter your location\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.location_user}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"location\">\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Form Group (location)-->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label class=\"small mb-1\" for=\"inputDelivery\">Delivery address</label>\n");
      out.write("                                    <input readonly=\"\" class=\"form-control\" id=\"inputDelivery\" type=\"text\"\n");
      out.write("                                        placeholder=\"Enter your delivery address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.delivery}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                                        name=\"deliveryAddress\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Form Group (email address)-->\n");
      out.write("                            <div class=\"mb-3\">\n");
      out.write("                                <label class=\"small mb-1\" for=\"inputEmailAddress\">Email address</label>\n");
      out.write("                                <input readonly=\"\" class=\"form-control\" id=\"inputEmailAddress\" type=\"email\"\n");
      out.write("                                    placeholder=\"Enter your email address\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"email\">\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Form Row-->\n");
      out.write("                            <div class=\"row gx-3 mb-3\">\n");
      out.write("                                <!-- Form Group (phone number)-->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label class=\"small mb-1\" for=\"inputPhone\">Phone number</label>\n");
      out.write("                                    <input readonly=\"\" class=\"form-control\" id=\"inputPhone\" type=\"tel\"\n");
      out.write("                                        placeholder=\"Enter your phone number\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.phone_number}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Form Group (birthday)-->\n");
      out.write("                                <div class=\"col-md-6\">\n");
      out.write("                                    <label class=\"small mb-1\" for=\"inputBirthday\">Birthday</label>\n");
      out.write("                                    <input readonly=\"\" class=\"form-control\" id=\"inputBirthday\" type=\"date\" name=\"birthday\"\n");
      out.write("                                        placeholder=\"Enter your birthday\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.date}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- Save changes button-->\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("        integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /More_Admin.jsp(142,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("c");
      // /More_Admin.jsp(142,24) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/More_Admin.jsp(142,24) '${requestScope.data}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${requestScope.data}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }
}
