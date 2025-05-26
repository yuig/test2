package com.amazonaws.services.s3.model.transform;

import java.util.Iterator;
import java.util.LinkedList;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes3.dex */
abstract class AbstractHandler extends DefaultHandler {

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f28930a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedList f28931b = new LinkedList();

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i13, int i14) {
        this.f28930a.append(cArr, i13, i14);
    }

    public abstract void e(String str);

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        this.f28931b.removeLast();
        e(str2);
    }

    public abstract void f(String str, Attributes attributes);

    public final boolean j(String... strArr) {
        int length = strArr.length;
        LinkedList linkedList = this.f28931b;
        if (length != linkedList.size()) {
            return false;
        }
        Iterator it = linkedList.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            String str2 = strArr[i13];
            if (!str2.equals("*") && !str2.equals(str)) {
                return false;
            }
            i13++;
        }
        return true;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        this.f28930a.setLength(0);
        f(str2, attributes);
        this.f28931b.add(str2);
    }
}
