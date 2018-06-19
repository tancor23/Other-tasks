package com.itrexgroup.wf;


import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;

public class Folders {
    public static Collection<String> folderNames(String xml, char startingLetter) throws Exception {

        Collection<String> collection = new ArrayList<>();

        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(xml.getBytes()));
        document.getDocumentElement().normalize();
        NodeList nodeList = document.getElementsByTagName("folder");

        for (int i = 0; i < nodeList.getLength(); i++) {

            String folderName = nodeList.item(i).getAttributes().item(0).getNodeValue();
            if (folderName.charAt(0) == startingLetter) {
                collection.add(folderName);
            }
        }
        return collection;
    }

    public static void main(String[] args) throws Exception {
        String xml =
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
                        "<folder name=\"c\">" +
                        "<folder name=\"program files\">" +
                        "<folder name=\"uninstall information\" />" +
                        "</folder>" +
                        "<folder name=\"users\" />" +
                        "</folder>";

        Collection<String> names = folderNames(xml, 'u');
        for (String name : names)
            System.out.println(name);
    }
}
