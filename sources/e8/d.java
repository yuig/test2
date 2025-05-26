package e8;

import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser$MissingFieldException;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f57725a;

    /* renamed from: b, reason: collision with root package name */
    public final String f57726b;

    /* renamed from: c, reason: collision with root package name */
    public final d f57727c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedList f57728d = new LinkedList();

    public d(d dVar, String str, String str2) {
        this.f57727c = dVar;
        this.f57725a = str;
        this.f57726b = str2;
    }

    public static int g(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e13) {
            throw ParserException.b(null, e13);
        }
    }

    public static long h(XmlPullParser xmlPullParser, String str, long j13) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j13;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException e13) {
            throw ParserException.b(null, e13);
        }
    }

    public static int i(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new SsManifestParser$MissingFieldException(str);
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e13) {
            throw ParserException.b(null, e13);
        }
    }

    public void a(Object obj) {
    }

    public abstract Object b();

    public final Object c(String str) {
        int i13 = 0;
        while (true) {
            LinkedList linkedList = this.f57728d;
            if (i13 >= linkedList.size()) {
                d dVar = this.f57727c;
                if (dVar == null) {
                    return null;
                }
                return dVar.c(str);
            }
            Pair pair = (Pair) linkedList.get(i13);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
            i13++;
        }
    }

    public boolean d(String str) {
        return false;
    }

    public final Object e(XmlPullParser xmlPullParser) {
        boolean z13 = false;
        int i13 = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            d dVar = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (this.f57726b.equals(name)) {
                    j(xmlPullParser);
                    z13 = true;
                } else if (z13) {
                    if (i13 > 0) {
                        i13++;
                    } else if (d(name)) {
                        j(xmlPullParser);
                    } else {
                        boolean equals = "QualityLevel".equals(name);
                        String str = this.f57725a;
                        if (equals) {
                            dVar = new f(this, str, "QualityLevel");
                        } else if ("Protection".equals(name)) {
                            dVar = new e(this, str, "Protection");
                        } else if ("StreamIndex".equals(name)) {
                            dVar = new h(this, str);
                        }
                        if (dVar == null) {
                            i13 = 1;
                        } else {
                            a(dVar.e(xmlPullParser));
                        }
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z13 && i13 == 0) {
                    k(xmlPullParser);
                }
            } else if (!z13) {
                continue;
            } else if (i13 > 0) {
                i13--;
            } else {
                String name2 = xmlPullParser.getName();
                f(xmlPullParser);
                if (!d(name2)) {
                    return b();
                }
            }
            xmlPullParser.next();
        }
    }

    public void f(XmlPullParser xmlPullParser) {
    }

    public abstract void j(XmlPullParser xmlPullParser);

    public void k(XmlPullParser xmlPullParser) {
    }

    public final void l(Object obj, String str) {
        this.f57728d.add(Pair.create(str, obj));
    }
}
