package je;

import org.xml.sax.Attributes;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class e3 implements Attributes {

    /* renamed from: a, reason: collision with root package name */
    public XmlPullParser f75594a;

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final int getLength() {
        return this.f75594a.getAttributeCount();
    }

    @Override // org.xml.sax.Attributes
    public final String getLocalName(int i13) {
        return this.f75594a.getAttributeName(i13);
    }

    @Override // org.xml.sax.Attributes
    public final String getQName(int i13) {
        XmlPullParser xmlPullParser = this.f75594a;
        String attributeName = xmlPullParser.getAttributeName(i13);
        if (xmlPullParser.getAttributePrefix(i13) == null) {
            return attributeName;
        }
        return xmlPullParser.getAttributePrefix(i13) + ':' + attributeName;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(int i13) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getURI(int i13) {
        return this.f75594a.getAttributeNamespace(i13);
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final int getIndex(String str, String str2) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getType(String str, String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public final String getValue(int i13) {
        return this.f75594a.getAttributeValue(i13);
    }
}
