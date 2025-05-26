package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/* loaded from: classes3.dex */
public abstract class XpathUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final DocumentBuilderFactory f29054a;

    static {
        LogFactory.a(XpathUtils.class);
        f29054a = DocumentBuilderFactory.newInstance();
    }

    public static String a(String str, Document document) {
        if (document == null) {
            return null;
        }
        if (".".equals(str) || ((Node) XPathFactory.newInstance().newXPath().evaluate(str, document, XPathConstants.NODE)) != null) {
            return XPathFactory.newInstance().newXPath().evaluate(str, document).trim();
        }
        return null;
    }

    public static Document b(String str) {
        NamespaceRemovingInputStream namespaceRemovingInputStream = new NamespaceRemovingInputStream(new ByteArrayInputStream(str.getBytes(StringUtils.f29048a)));
        Document parse = f29054a.newDocumentBuilder().parse(namespaceRemovingInputStream);
        namespaceRemovingInputStream.close();
        return parse;
    }
}
