/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.50
 * Generated at: 2021-08-26 11:30:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Users/nguye/Documents/GitHub/DoAnNganhCNTT/target/HospitalManager-1.0-SNAPSHOT/WEB-INF/lib/spring-webmvc-5.2.2.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1575337710000L));
    _jspx_dependants.put("jar:file:/C:/Users/nguye/Documents/GitHub/DoAnNganhCNTT/target/HospitalManager-1.0-SNAPSHOT/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1628043630998L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.2.2.RELEASE.jar", Long.valueOf(1628043627539L));
    _jspx_dependants.put("jar:file:/C:/Users/nguye/Documents/GitHub/DoAnNganhCNTT/target/HospitalManager-1.0-SNAPSHOT/WEB-INF/lib/spring-webmvc-5.2.2.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1575337710000L));
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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>HomePage</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"mb-5\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6 mb-5\">\n");
      out.write("              <h1 class=\"display-4\">The Future Of Medical Website</h1>\n");
      out.write("              <p class=\"lead text-secondary\">A free bootstrap template by <a href=\"https://uicookies.com/\" target=\"_blank\">uicookies.com</a></p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("  \n");
      out.write("    <section class=\"probootstrap-features-1\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-md probootstrap-feature-item\" style=\"background-image: url(images/img_1.jpg);\">\n");
      out.write("              <div class=\"probootstrap-feature-item-text\">\n");
      out.write("                <span class=\"icon\"><i class=\"fa fa-medkit\"></i></span>\n");
      out.write("                <h2>Pediatric <span>Therapy</span></h2>\n");
      out.write("              </div>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"col-md probootstrap-opening\">\n");
      out.write("              <h2 class=\"text-uppercase mb-3\">Opening Hour <span>Medical Center</span></h2>\n");
      out.write("              <ul class=\"list-unstyled probootstrap-schedule\">\n");
      out.write("                <li>Mon-Fri <span>5:00-17:00</span></li>\n");
      out.write("                <li>Sat <span>6:30-17:00</span></li>\n");
      out.write("                <li>Sun <span>6:30-17:00</span></li>\n");
      out.write("              </ul>\n");
      out.write("            </div> \n");
      out.write("            <div class=\"col-md probootstrap-feature-item\" style=\"background-image: url(images/img_2.jpg);\">\n");
      out.write("              <div class=\"probootstrap-feature-item-text\">\n");
      out.write("                <span class=\"icon\"><i class=\"fas fa-clipboard-list\"></i></span>\n");
      out.write("\n");
      out.write("                <h2>Psychiatric <span>Therapy</span></h2>\n");
      out.write("              </div>\n");
      out.write("            </div> \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section class=\"probootstrap-services\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row no-gutters\">\n");
      out.write("            <div class=\"col-md-3 probootstrap-aside-stretch-left\">\n");
      out.write("              <div class=\"mb-3\">\n");
      out.write("                <h2 class=\"h6\">Departments</h2>\n");
      out.write("                <ul class=\"list-unstyled probootstrap-light mb-4\">\n");
      out.write("                  <li><a href=\"#\">Urology</a></li>\n");
      out.write("                  <li><a href=\"#\">Pediatrics</a></li>\n");
      out.write("                  <li><a href=\"#\">Psychiatrics</a></li>\n");
      out.write("                  <li><a href=\"#\">Plastic Surgery</a></li>\n");
      out.write("                  <li><a href=\"#\">Neurosurgery</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <p><a href=\"#\" class=\"arrow-link text-white\">More departments  <i class=\"fa fa-chevron-right\"></i></a></p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-9 pl-md-5 pl-0\">\n");
      out.write("              <div class=\"row mb-5\">\n");
      out.write("\n");
      out.write("                  <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                    <div class=\"media d-block mb-4 text-left probootstrap-media\">\n");
      out.write("                      <div class=\"probootstrap-icon mb-3\"><span class=\"flaticon-price-tag display-4\"></span></div>\n");
      out.write("                      <div class=\"media-body\">\n");
      out.write("                        <h3 class=\"h5 mt-0 text-secondary\">Medical Pricing</h3>\n");
      out.write("                        <p>Far far away, behind the word mountains, far from the countries Vokalia.</p>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                    <div class=\"media d-block mb-4 text-left probootstrap-media\">\n");
      out.write("                      <div class=\"probootstrap-icon mb-3\"><span class=\"flaticon-shield-with-cross display-4\"></span></div>\n");
      out.write("                      <div class=\"media-body\">\n");
      out.write("                        <h3 class=\"h5 mt-0 text-secondary\">Quality &amp; Safety</h3>\n");
      out.write("                        <p>Far far away, behind the word mountains, far from the countries Vokalia.</p>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                    <div class=\"media d-block mb-4 text-left probootstrap-media\">\n");
      out.write("                      <div class=\"probootstrap-icon mb-3\"><span class=\"flaticon-first-aid-kit display-4\"></span></div>\n");
      out.write("                      <div class=\"media-body\">\n");
      out.write("                        <h3 class=\"h5 mt-0 text-secondary\">Immidiate Service</h3>\n");
      out.write("                        <p>Far far away, behind the word mountains, far from the countries Vokalia.</p>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                  <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                    <div class=\"media d-block mb-4 text-left probootstrap-media\">\n");
      out.write("                      <div class=\"probootstrap-icon mb-3\"><span class=\"flaticon-microscope display-4\"></span></div>\n");
      out.write("                      <div class=\"media-body\">\n");
      out.write("                        <h3 class=\"h5 mt-0 text-secondary\">Cutting-Edge Equipment</h3>\n");
      out.write("                        <p>Far far away, behind the word mountains, far from the countries Vokalia.</p>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                    <div class=\"media d-block mb-4 text-left probootstrap-media\">\n");
      out.write("                      <div class=\"probootstrap-icon mb-3\"><span class=\"flaticon-gym-control-of-exercises-with-a-list-on-a-clipboard-and-heart-beats display-4\"></span></div>\n");
      out.write("                      <div class=\"media-body\">\n");
      out.write("                        <h3 class=\"h5 mt-0 text-secondary\">Personalized Treatment</h3>\n");
      out.write("                        <p>Far far away, behind the word mountains, far from the countries Vokalia.</p>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                    <div class=\"media d-block mb-4 text-left probootstrap-media\">\n");
      out.write("                      <div class=\"probootstrap-icon mb-3\"><span class=\"flaticon-doctor display-4\"></span></div>\n");
      out.write("                      <div class=\"media-body\">\n");
      out.write("                        <h3 class=\"h5 mt-0 text-secondary\">Experience Physicians</h3>\n");
      out.write("                        <p>Far far away, behind the word mountains, far from the countries Vokalia.</p>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <section class=\"probootstrap-section overlay bg-image\" style=\"background-image: url(images/bg_1.jpg)\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 text-center\">\n");
      out.write("                    <h2 class=\"text-white display-4\">Specialists in Family  Healthcare</h2>\n");
      out.write("                    <p class=\"text-white mb-5 lead\">Far far away, behind the word mountains, far from the countries Vokalia.</p>\n");
      out.write("                    <div class=\"row justify-content-center mb-5\">\n");
      out.write("                        <div class=\"col-md-4\"><a href=\"#\" class=\"btn btn-secondary btn-block\">Appointment <span class=\"icon-arrow-right\"></span></a></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <section class=\"probootstrap-blog-appointment\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row no-gutters\">\n");
      out.write("            <div class=\"col-md-6 pr-md-5 pr-0 pt-md-5 pt-0 pb-md-5 pb-0\">\n");
      out.write("              <h2 class=\"h1 mb-4 text-white\">Recent Blog</h2>\n");
      out.write("              <ul class=\"probootstrap-blog-list list-unstyled\">\n");
      out.write("                <li>\n");
      out.write("                  <h2><span class=\"date\">November 15, 2017</span><a href=\"#\">The practice of medicine is a lot like parenting </a></h2>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <h2><span class=\"date\">November 15, 2017</span><a href=\"#\">Physicians: Want to overcome burnout? Start studying business. </a></h2>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                  <h2><span class=\"date\">November 15, 2017</span><a href=\"#\">Want a simple and easy-to-use EMR? Well, you can have it for free. </a></h2>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("              <p><a href=\"#\" class=\"arrow-link\">View All  <i class=\"fa fa-chevron-right\"></i></a></p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6 p-md-5 p-3 probootstrap-aside-stretch-right\">\n");
      out.write("              <h2 class=\"h1 text-white\">Make an Appointment</h2>\n");
      out.write("              <form action=\"#\" class=\"probootstrap-form-appointment\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input type=\"text\" class=\"form-control\" placeholder=\"Your Name\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input type=\"email\" class=\"form-control\" placeholder=\"Your Email\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <span class=\"icon\"><i class=\"icon-calendar\"></i></span>\n");
      out.write("                  <input type=\"text\" id=\"probootstrap-date\" class=\"form-control\" placeholder=\"Appointment Date\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <textarea name=\"\" class=\"form-control\" id=\"\" cols=\"30\" rows=\"10\" placeholder=\"Write your message\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <input type=\"submit\" value=\"Submit Form\" class=\"btn btn-secondary\">\n");
      out.write("                </div>\n");
      out.write("              </form>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section class=\"probootstrap-section\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-4 col-md-6\">\n");
      out.write("              <div class=\"media d-block mb-5 text-center probootstrap-media\">\n");
      out.write("                <div class=\"probootstrap-icon mb-3\"><span class=\"flaticon-price-tag display-4\"></span></div>\n");
      out.write("                <div class=\"media-body\">\n");
      out.write("                  <h3 class=\"h5 mt-0 text-secondary\">Medical Pricing</h3>\n");
      out.write("                  <p>Far far away, behind the word mountains, far from the countries Vokalia.</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-6\">\n");
      out.write("              <div class=\"media d-block mb-5 text-center probootstrap-media\">\n");
      out.write("                <div class=\"probootstrap-icon mb-3\"><span class=\"flaticon-shield-with-cross display-4\"></span></div>\n");
      out.write("                <div class=\"media-body\">\n");
      out.write("                  <h3 class=\"h5 mt-0 text-secondary\">Quality &amp; Safety</h3>\n");
      out.write("                  <p>Far far away, behind the word mountains, far from the countries Vokalia.</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-6\">\n");
      out.write("              <div class=\"media d-block mb-5 text-center probootstrap-media\">\n");
      out.write("                <div class=\"probootstrap-icon mb-3\"><span class=\"flaticon-microscope display-4\"></span></div>\n");
      out.write("                <div class=\"media-body\">\n");
      out.write("                  <h3 class=\"h5 mt-0 text-secondary\">Cutting-Edge Equipment</h3>\n");
      out.write("                  <p>Far far away, behind the word mountains, far from the countries Vokalia.</p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                <div class=\"media d-block mb-5 text-center probootstrap-media\">\n");
      out.write("                  <div class=\"probootstrap-icon mb-3\"><span class=\"flaticon-microscope display-4\"></span></div>\n");
      out.write("                  <div class=\"media-body\">\n");
      out.write("                    <h3 class=\"h5 mt-0 text-secondary\">Cutting-Edge Equipment</h3>\n");
      out.write("                    <p>Far far away, behind the word mountains, far from the countries Vokalia.</p>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                <div class=\"media d-block mb-5 text-center probootstrap-media\">\n");
      out.write("                  <div class=\"probootstrap-icon mb-3\"><span class=\"flaticon-gym-control-of-exercises-with-a-list-on-a-clipboard-and-heart-beats display-4\"></span></div>\n");
      out.write("                  <div class=\"media-body\">\n");
      out.write("                    <h3 class=\"h5 mt-0 text-secondary\">Personalized Treatment</h3>\n");
      out.write("                    <p>Far far away, behind the word mountains, far from the countries Vokalia.</p>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-lg-4 col-md-6\">\n");
      out.write("                <div class=\"media d-block mb-5 text-center probootstrap-media\">\n");
      out.write("                  <div class=\"probootstrap-icon mb-3\"><span class=\"flaticon-doctor display-4\"></span></div>\n");
      out.write("                  <div class=\"media-body\">\n");
      out.write("                    <h3 class=\"h5 mt-0 text-secondary\">Experience Physicians</h3>\n");
      out.write("                    <p>Far far away, behind the word mountains, far from the countries Vokalia.</p>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("         <!--  <div class=\"row\">\n");
      out.write("\n");
      out.write("          </div> -->\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("  <section class=\"probootstrap-section bg-light\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row mb-5\">\n");
      out.write("        <div class=\"col-md-12 text-center\">\n");
      out.write("          <h2 class=\"h1\">Our Doctors</h2>\n");
      out.write("          <p class=\"lead text-secondary\">Far far away, behind the word mountains, far from the countries Vokalia.</p>\n");
      out.write("          <div class=\"row justify-content-center mb-5\">\n");
      out.write("            <div class=\"col-md-3\"><a href=\"#\" class=\"btn btn-secondary btn-block\">Join Us</a></div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"row no-gutters\">\n");
      out.write("        <div class=\"col-lg-3 col-md-3 col-sm-6 col-6 prbootstrap-team\">\n");
      out.write("          <img src=\"images/person_1.jpg\" alt=\"Free Template by uicookies.com\" class=\"img-fluid\">\n");
      out.write("          <div class=\"probootstrap-person-text\">\n");
      out.write("            <span class=\"title\">Medical Doctor</span>\n");
      out.write("            <span class=\"name\">Dr. Abbey Smith</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-3 col-md-3 col-sm-6 col-6 prbootstrap-team\">\n");
      out.write("          <img src=\"images/person_2.jpg\" alt=\"Free Template by uicookies.com\" class=\"img-fluid\">\n");
      out.write("          <div class=\"probootstrap-person-text\">\n");
      out.write("            <span class=\"title\">Medical Doctor</span>\n");
      out.write("            <span class=\"name\">Dr. Ben Carpio</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-3 col-md-3 col-sm-6 col-6 prbootstrap-team\">\n");
      out.write("          <img src=\"images/person_3.jpg\" alt=\"Free Template by uicookies.com\" class=\"img-fluid\">\n");
      out.write("          <div class=\"probootstrap-person-text\">\n");
      out.write("            <span class=\"title\">Medical Doctor</span>\n");
      out.write("            <span class=\"name\">Dr. Louisa Westwood</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-3 col-md-3 col-sm-6 col-6 prbootstrap-team\">\n");
      out.write("          <img src=\"images/person_4.jpg\" alt=\"Free Template by uicookies.com\" class=\"img-fluid\">\n");
      out.write("          <div class=\"probootstrap-person-text\">\n");
      out.write("            <span class=\"title\">Cardiac Surgeon</span>\n");
      out.write("            <span class=\"name\">Dr. Mark Sebastian</span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <section class=\"probootstrap-section\" id=\"section-counter\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md probootstrap-animate\">\n");
      out.write("            <div class=\"probootstrap-counter text-center\">\n");
      out.write("              <span class=\"probootstrap-number\" data-number=\"22\">0</span>\n");
      out.write("              <span class=\"probootstrap-label\">Founders</span>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md probootstrap-animate\">\n");
      out.write("            <div class=\"probootstrap-counter text-center\">\n");
      out.write("              <span class=\"probootstrap-number\" data-number=\"182\">0</span>\n");
      out.write("              <span class=\"probootstrap-label\">Number of Staffs</span>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md probootstrap-animate\">\n");
      out.write("            <div class=\"probootstrap-counter text-center\">\n");
      out.write("              <span class=\"probootstrap-number\" data-number=\"8921\">0</span>\n");
      out.write("              <span class=\"probootstrap-label\">Happy Patients</span>\n");
      out.write("            </div>\n");
      out.write("          </div>    \n");
      out.write("          <div class=\"col-md probootstrap-animate\">\n");
      out.write("            <div class=\"probootstrap-counter text-center\">\n");
      out.write("              <span class=\"probootstrap-number\" data-number=\"252\">0</span>\n");
      out.write("              <span class=\"probootstrap-label\">Business Partner</span>\n");
      out.write("            </div>\n");
      out.write("          </div>    \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("  <section class=\"probootstrap-subscribe\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row mb-5\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("          <h2 class=\"h1 text-white\">Subscribe Newsletter</h2>\n");
      out.write("          <p class=\"lead text-white\">Far far away, behind the word mountains, far from the countries Vokalia.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <form action=\"#\" method=\"post\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Name\">    \n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4 mb-md-0 mb-3\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Email\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4\">\n");
      out.write("            <input type=\"submit\" value=\"Subscribe\" class=\"btn btn-primary btn-block\">\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("    </body>\n");
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
}
