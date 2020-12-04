package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;

/**
 *
 * 一.上传项目方式一
 * 1.先在github上创建仓库
 * 2.使用push把本地仓库git项目，推送到远程仓库
 *  上传项目方式二：
 * 1. 使用share project on github即可，把本地git项目推送到远程仓库，
 *   且项目名就是远程仓库名！(测试不行)
 *二.下载项目
 *   1.使用checkout方式从远程下载项目（本身就是clone操作）
 *   2.要指定远程仓库的地址！
 *
 * 三.代码上传git仓库
 *   add(添加到索引仓库)---->commit(提交到本地仓库)---->push(推送到远程仓库)
 *
 * 四.共同文件修改
 *
 *
 *
 *
 *
 *
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
        System.out.println("张三修改了代码1");
        System.out.println("张三修改了代码2");
    }
}
