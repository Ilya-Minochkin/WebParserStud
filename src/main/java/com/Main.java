package com;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import javax.xml.bind.util.JAXBSource;
import java.util.List;

public class Main {
    private static final String URL = "https://urfu.ru/ru/students/study/schedule/#student/981887/20200326/";
    private static final String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36";
    private static final WebClient webClient = new WebClient(BrowserVersion.CHROME);
    private static HtmlPage page;

    public static void main(String[] args) {
        Document document = null;
        Elements elements = null;

        try {
//            webClient.getOptions().setThrowExceptionOnScriptError(false);
//            webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
            page = webClient.getPage(URL);
            document = Jsoup.connect(page.asXml())
                    .userAgent(userAgent)
                    .referrer("www.google.com")
                    .get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (document != null) {
//            elements = document.select("div#schedule-group");
//            elements = document.select(".section header");
            elements = document.select("#c38");
            List<Node> list = document.childNodes();
        //    list.forEach(System.out::println);
        }
        for (Element element: elements) {
            System.out.printf("%s\n", element.toString());
        }
    }
}
