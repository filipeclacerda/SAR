package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("  \n");
      out.write("<html lang=\"pt-BR\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <title>SAR - Cadastrar FuncionÃ¡rio</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <a href=\"PesquisaCardapioController\">Manter Curso</a>\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <h3>\n");
      out.write("                    Cadastrar FuncionÃ¡rio\n");
      out.write("                </h3><br>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <label for=\"nomeitem\">Nome do FuncionÃ¡rio:</label><br>\n");
      out.write("                        <input type=\"text\" id=\"nomeitem\" name=\"nomeitem\"><br><br>\n");
      out.write("                        <label for=\"Cargo\">Cargo:</label><br>\n");
      out.write("                        <select name=\"Cargo\" id=\"Cargo\">\n");
      out.write("                <option value=\"Balconista\">Balconista</option>\n");
      out.write("                <option value=\"caixa\">Caixa</option>\n");
      out.write("              </select><br><br>\n");
      out.write("\n");
      out.write("                        <label for=\"SalÃ¡rio\">SalÃ¡rio Inicial:</label><br>\n");
      out.write("                        <input size=\"10\" type=\"text\" name=\"salario\" id=\"salario\">\n");
      out.write("                        <br>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <label for=\"logradouro\">Logradouro:</label><br>\n");
      out.write("                        <input type=\"text\" id=\"logradouro\" name=\"logradouro\"><br>\n");
      out.write("                        <BR>\n");
      out.write("                        <label for=\"numero\">NÃºmero:</label>\n");
      out.write("                        <input size=\"5\" type=\"text\" name=\"numero\" id=\"numero\">\n");
      out.write("                        <br><br>\n");
      out.write("                        <label for=\"complemento\">Complemento:</label>\n");
      out.write("                        <input size=\"7\" type=\"text\" name=\"complemento\" id=\"complemento\">\n");
      out.write("                        <br><br>\n");
      out.write("                        <label for=\"estado\">Estado:</label><br>\n");
      out.write("                        <select name=\"estado\"> \n");
      out.write("    <option value=\"estado\">Selecione o Estado</option> \n");
      out.write("    <option value=\"ac\">Acre</option> \n");
      out.write("    <option value=\"al\">Alagoas</option> \n");
      out.write("    <option value=\"am\">Amazonas</option> \n");
      out.write("    <option value=\"ap\">AmapÃ¡</option> \n");
      out.write("    <option value=\"ba\">Bahia</option> \n");
      out.write("    <option value=\"ce\">CearÃ¡</option> \n");
      out.write("    <option value=\"df\">Distrito Federal</option> \n");
      out.write("    <option value=\"es\">EspÃ­rito Santo</option> \n");
      out.write("    <option value=\"go\">GoiÃ¡s</option> \n");
      out.write("    <option value=\"ma\">MaranhÃ£o</option> \n");
      out.write("    <option value=\"mt\">Mato Grosso</option> \n");
      out.write("    <option value=\"ms\">Mato Grosso do Sul</option> \n");
      out.write("    <option value=\"mg\">Minas Gerais</option> \n");
      out.write("    <option value=\"pa\">ParÃ¡</option> \n");
      out.write("    <option value=\"pb\">ParaÃ­ba</option> \n");
      out.write("    <option value=\"pr\">ParanÃ¡</option> \n");
      out.write("    <option value=\"pe\">Pernambuco</option> \n");
      out.write("    <option value=\"pi\">PiauÃ­</option> \n");
      out.write("    <option value=\"rj\">Rio de Janeiro</option> \n");
      out.write("    <option value=\"rn\">Rio Grande do Norte</option> \n");
      out.write("    <option value=\"ro\">RondÃ´nia</option> \n");
      out.write("    <option value=\"rs\">Rio Grande do Sul</option> \n");
      out.write("    <option value=\"rr\">Roraima</option> \n");
      out.write("    <option value=\"sc\">Santa Catarina</option> \n");
      out.write("    <option value=\"se\">Sergipe</option> \n");
      out.write("    <option value=\"sp\">SÃ£o Paulo</option> \n");
      out.write("    <option value=\"to\">Tocantins</option> \n");
      out.write("    </select>\n");
      out.write("                        <br><br>\n");
      out.write("                        <label for=\"numero\">Cidade:</label><br>\n");
      out.write("                        <input size=\"15\" type=\"text\" name=\"cidade\" id=\"cidade\">\n");
      out.write("\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\">Confirmar</button><br><br>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"js/scripts.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
