package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;

/**
 * 这是我今天的代码
 * @ClassName HelloServlet
 * @Description TODO
 * @Author Administrator
 * @Date: 2020/12/3 10:35
 * @Version 1.0
 */
@WebServlet("/hello.do")
public class HelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String serverName = req.getServerName();
        int serverPort = req.getServerPort();
        String remoteHost = req.getRemoteHost();
        int remotePort = req.getRemotePort();
        String localName = req.getLocalName();
        int localPort = req.getLocalPort();
        req.setAttribute("ip", serverName);
        req.setAttribute("port",serverPort);
        req.setAttribute("remoteHost", remoteHost);
        req.setAttribute("remotePort", remotePort);
        req.setAttribute("localName", localName);
        req.setAttribute("localPort", localPort);
       
        req.getRequestDispatcher("/index.jsp").forward(req, resp);

    }

    public static void main(String[] args) {

    }
}
