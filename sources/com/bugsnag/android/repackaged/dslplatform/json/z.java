package com.bugsnag.android.repackaged.dslplatform.json;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/* loaded from: classes3.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final DocumentBuilder f29628a;

    static {
        try {
            f29628a = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e13) {
            throw new RuntimeException(e13);
        }
    }

    public static void a(Document document, Element element, Object obj) {
        if (!(obj instanceof HashMap)) {
            if (!(obj instanceof List)) {
                if (obj != null) {
                    element.setTextContent(obj.toString());
                    return;
                }
                return;
            }
            List list = (List) obj;
            Node parentNode = element.getParentNode();
            a(document, element, list.get(0));
            for (Object obj2 : list.subList(1, list.size())) {
                Element createElement = document.createElement(element.getNodeName());
                parentNode.appendChild(createElement);
                a(document, createElement, obj2);
            }
            return;
        }
        for (Map.Entry entry : ((HashMap) obj).entrySet()) {
            String str = (String) entry.getKey();
            if (str.startsWith("@")) {
                element.setAttribute(str.substring(1), entry.getValue().toString());
            } else if (!str.startsWith("#")) {
                Element createElement2 = document.createElement(str);
                element.appendChild(createElement2);
                a(document, createElement2, entry.getValue());
            } else if (str.equals("#text")) {
                if (entry.getValue() instanceof List) {
                    List list2 = (List) entry.getValue();
                    StringBuilder sb3 = new StringBuilder();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        sb3.append((String) it.next());
                    }
                    element.appendChild(document.createTextNode(sb3.toString()));
                } else {
                    element.appendChild(document.createTextNode(entry.getValue().toString()));
                }
            } else if (str.equals("#cdata-section")) {
                if (entry.getValue() instanceof List) {
                    Iterator it2 = ((List) entry.getValue()).iterator();
                    while (it2.hasNext()) {
                        element.appendChild(document.createCDATASection((String) it2.next()));
                    }
                } else {
                    element.appendChild(document.createCDATASection(entry.getValue().toString()));
                }
            } else if (str.equals("#comment")) {
                if (entry.getValue() instanceof List) {
                    Iterator it3 = ((List) entry.getValue()).iterator();
                    while (it3.hasNext()) {
                        element.appendChild(document.createComment((String) it3.next()));
                    }
                } else {
                    element.appendChild(document.createComment(entry.getValue().toString()));
                }
            }
        }
    }
}
