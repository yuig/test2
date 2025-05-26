package com.amazonaws.regions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@Deprecated
/* loaded from: classes3.dex */
public class RegionMetadataParser {
    @Deprecated
    public RegionMetadataParser() {
    }

    public static String a(String str, Element element) {
        Node item = element.getElementsByTagName(str).item(0);
        if (item == null) {
            return null;
        }
        return item.getChildNodes().item(0).getNodeValue();
    }

    public static ArrayList b(FileInputStream fileInputStream) {
        try {
            try {
                NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fileInputStream).getElementsByTagName("Region");
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < elementsByTagName.getLength(); i13++) {
                    Node item = elementsByTagName.item(i13);
                    if (item.getNodeType() == 1) {
                        Element element = (Element) item;
                        Region region = new Region(a("Name", element), a("Domain", element));
                        NodeList elementsByTagName2 = element.getElementsByTagName("Endpoint");
                        for (int i14 = 0; i14 < elementsByTagName2.getLength(); i14++) {
                            Element element2 = (Element) elementsByTagName2.item(i14);
                            String a13 = a("ServiceName", element2);
                            String a14 = a("Hostname", element2);
                            String a15 = a("Http", element2);
                            String a16 = a("Https", element2);
                            region.f28757c.put(a13, a14);
                            region.f28758d.put(a13, Boolean.valueOf("true".equals(a15)));
                            region.f28759e.put(a13, Boolean.valueOf("true".equals(a16)));
                        }
                        arrayList.add(region);
                    }
                }
                return arrayList;
            } catch (IOException e13) {
                throw e13;
            } catch (Exception e14) {
                throw new IOException("Unable to parse region metadata file: " + e14.getMessage(), e14);
            }
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
