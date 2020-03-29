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
import java.io.BufferedReader;
import java.io.File;
import java.io.Reader;
import java.util.Date;
import java.util.List;

public class Main {
    private static final String URL = "https://urfu.ru/ru/students/study/schedule/#student/981887/20200326/";
    private static final String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36";
    private static final WebClient webClient = new WebClient(BrowserVersion.INTERNET_EXPLORER_10);
    private static HtmlPage page;
    private static BufferedReader bufferedReader;

    public static void main(String[] args) {
        Document document = null;
        Elements elements = null;


        try {
//            webClient.getOptions().setThrowExceptionOnScriptError(false);
//            webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
//            webClient.getOptions().setUseInsecureSSL(true); //ignore ssl certificate
//            webClient.getOptions().setThrowExceptionOnScriptError(false);
//            webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
//            page = webClient.getPage(URL);
//            System.out.println(page.asText());
            document = Jsoup.parse(new File("Расписание занятий.html"), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (document != null) {
//            elements = document.select("div#schedule-group");
//            elements = document.select(".section header");
            elements = document.select(".shedule-weekday-time");
            List<Node> list = document.childNodes();
        //    list.forEach(System.out::println);
        }
        for (Element element: elements) {
            System.out.println(element.text());
        }
    }
}
