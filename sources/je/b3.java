package je;

import org.xml.sax.Attributes;
import org.xml.sax.ext.DefaultHandler2;

/* loaded from: classes3.dex */
public final class b3 extends DefaultHandler2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f3 f75562a;

    public b3(f3 f3Var) {
        this.f75562a = f3Var;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i13, int i14) {
        this.f75562a.J(new String(cArr, i13, i14));
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
        this.f75562a.getClass();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        this.f75562a.c(str, str2, str3);
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void processingInstruction(String str, String str2) {
        g.i iVar = new g.i(str2);
        this.f75562a.getClass();
        f3.B(iVar);
        str.equals("xml-stylesheet");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
        this.f75562a.H();
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        this.f75562a.I(str, str2, str3, attributes);
    }
}
