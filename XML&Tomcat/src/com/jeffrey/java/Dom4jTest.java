package com.jeffrey.java;

import com.jeffrey.pojo.Book;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

/**
 * @author jeffrey
 * @ClassName: Dom4jTest
 * @Description:
 * @date: 2021/7/2 6:49 下午
 * @version:
 * @since JDK 1.8
 */


public class Dom4jTest {
    /**
     * @Description: 使用 dom4j 读取 XML 文件并获取 Document 对象
     */
    @Test
    public void testCreateDocument() {
        // 创建一个 SAXReader 输入流读取 xml 配置文件并生成 Document 对象
        SAXReader saxReader = new SAXReader();
        try {
            Document read = saxReader.read("src/xml/book.xml");
            System.out.println(read);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParseXml() {
        SAXReader saxReader = new SAXReader();
        try {
            // 在 Junit 单元测试中，相对路径是从模块下开始
            Document read = saxReader.read("src/xml/book.xml");
            // 通过文档对象获取根元素
            Element eleRoot = read.getRootElement();
            // 通过根元素获取每个标签对象
            List<Element> books = eleRoot.elements("book");
            // 遍历每个标签对象中的值
            for (Element book : books) {
                String sn = book.attributeValue("sn");
                String name = book.elementText("name");
                String id = book.elementText("id");
                String author = book.elementText("author");
                String price = book.elementText("price");
                System.out.println(new Book(sn, name, Integer.parseInt(id), author, Double.parseDouble(price)));
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }


}
