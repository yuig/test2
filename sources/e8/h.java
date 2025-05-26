package e8;

import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser$MissingFieldException;
import d7.n0;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class h extends d {

    /* renamed from: e, reason: collision with root package name */
    public final String f57742e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList f57743f;

    /* renamed from: g, reason: collision with root package name */
    public int f57744g;

    /* renamed from: h, reason: collision with root package name */
    public String f57745h;

    /* renamed from: i, reason: collision with root package name */
    public long f57746i;

    /* renamed from: j, reason: collision with root package name */
    public String f57747j;

    /* renamed from: k, reason: collision with root package name */
    public String f57748k;

    /* renamed from: l, reason: collision with root package name */
    public int f57749l;

    /* renamed from: m, reason: collision with root package name */
    public int f57750m;

    /* renamed from: n, reason: collision with root package name */
    public int f57751n;

    /* renamed from: o, reason: collision with root package name */
    public int f57752o;

    /* renamed from: p, reason: collision with root package name */
    public String f57753p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f57754q;

    /* renamed from: r, reason: collision with root package name */
    public long f57755r;

    public h(d dVar, String str) {
        super(dVar, str, "StreamIndex");
        this.f57742e = str;
        this.f57743f = new LinkedList();
    }

    @Override // e8.d
    public final void a(Object obj) {
        if (obj instanceof androidx.media3.common.b) {
            this.f57743f.add((androidx.media3.common.b) obj);
        }
    }

    @Override // e8.d
    public final Object b() {
        int i13;
        int i14;
        int i15;
        ArrayList arrayList;
        ArrayList arrayList2;
        RoundingMode roundingMode;
        int i16;
        long[] jArr;
        int i17;
        ArrayList arrayList3;
        long[] jArr2;
        LinkedList linkedList = this.f57743f;
        androidx.media3.common.b[] bVarArr = new androidx.media3.common.b[linkedList.size()];
        linkedList.toArray(bVarArr);
        String str = this.f57748k;
        int i18 = this.f57744g;
        String str2 = this.f57745h;
        long j13 = this.f57746i;
        String str3 = this.f57747j;
        int i19 = this.f57749l;
        int i23 = this.f57750m;
        int i24 = this.f57751n;
        int i25 = this.f57752o;
        String str4 = this.f57753p;
        ArrayList arrayList4 = this.f57754q;
        long j14 = this.f57755r;
        int i26 = n0.f53866a;
        RoundingMode roundingMode2 = RoundingMode.DOWN;
        int size = arrayList4.size();
        long[] jArr3 = new long[size];
        if (j13 < 1000000 || j13 % 1000000 != 0) {
            i13 = i23;
            i14 = i24;
            i15 = i19;
            if (j13 >= 1000000 || 1000000 % j13 != 0) {
                int i27 = 0;
                while (i27 < size) {
                    long longValue = ((Long) arrayList4.get(i27)).longValue();
                    if (longValue == 0) {
                        arrayList2 = arrayList4;
                        roundingMode = roundingMode2;
                        i16 = size;
                        jArr = jArr3;
                        i17 = i27;
                    } else {
                        if (j13 < longValue || j13 % longValue != 0) {
                            arrayList = arrayList4;
                            if (j13 >= longValue || longValue % j13 != 0) {
                                arrayList2 = arrayList;
                                roundingMode = roundingMode2;
                                i16 = size;
                                jArr = jArr3;
                                i17 = i27;
                                jArr[i17] = n0.h0(longValue, 1000000L, j13, roundingMode);
                            } else {
                                jArr3[i27] = ue.c.E(1000000L, ue.c.q(longValue, j13, RoundingMode.UNNECESSARY));
                            }
                        } else {
                            arrayList = arrayList4;
                            jArr3[i27] = ue.c.q(1000000L, ue.c.q(j13, longValue, RoundingMode.UNNECESSARY), roundingMode2);
                        }
                        i16 = size;
                        jArr = jArr3;
                        i17 = i27;
                        arrayList2 = arrayList;
                        roundingMode = roundingMode2;
                    }
                    i27 = i17 + 1;
                    arrayList4 = arrayList2;
                    roundingMode2 = roundingMode;
                    size = i16;
                    jArr3 = jArr;
                }
            } else {
                long q13 = ue.c.q(1000000L, j13, RoundingMode.UNNECESSARY);
                for (int i28 = 0; i28 < size; i28++) {
                    jArr3[i28] = ue.c.E(((Long) arrayList4.get(i28)).longValue(), q13);
                }
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
        } else {
            i13 = i23;
            long q14 = ue.c.q(j13, 1000000L, RoundingMode.UNNECESSARY);
            int i29 = 0;
            while (i29 < size) {
                jArr3[i29] = ue.c.q(((Long) arrayList4.get(i29)).longValue(), q14, roundingMode2);
                i29++;
                i19 = i19;
                i24 = i24;
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
            i14 = i24;
            i15 = i19;
        }
        return new b(this.f57742e, str, i18, str2, j13, str3, i15, i13, i14, i25, str4, bVarArr, arrayList3, jArr2, n0.g0(j14, 1000000L, j13, RoundingMode.DOWN));
    }

    @Override // e8.d
    public final boolean d(String str) {
        return "c".equals(str);
    }

    @Override // e8.d
    public final void j(XmlPullParser xmlPullParser) {
        int i13 = 1;
        if (!"c".equals(xmlPullParser.getName())) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new SsManifestParser$MissingFieldException("Type");
            }
            if (!"audio".equalsIgnoreCase(attributeValue)) {
                if ("video".equalsIgnoreCase(attributeValue)) {
                    i13 = 2;
                } else {
                    if (!"text".equalsIgnoreCase(attributeValue)) {
                        throw ParserException.b("Invalid key value[" + attributeValue + "]", null);
                    }
                    i13 = 3;
                }
            }
            this.f57744g = i13;
            l(Integer.valueOf(i13), "Type");
            if (this.f57744g == 3) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                if (attributeValue2 == null) {
                    throw new SsManifestParser$MissingFieldException("Subtype");
                }
                this.f57745h = attributeValue2;
            } else {
                this.f57745h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            l(this.f57745h, "Subtype");
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
            this.f57747j = attributeValue3;
            l(attributeValue3, "Name");
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
            if (attributeValue4 == null) {
                throw new SsManifestParser$MissingFieldException("Url");
            }
            this.f57748k = attributeValue4;
            this.f57749l = d.g(xmlPullParser, "MaxWidth");
            this.f57750m = d.g(xmlPullParser, "MaxHeight");
            this.f57751n = d.g(xmlPullParser, "DisplayWidth");
            this.f57752o = d.g(xmlPullParser, "DisplayHeight");
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
            this.f57753p = attributeValue5;
            l(attributeValue5, "Language");
            long g13 = d.g(xmlPullParser, "TimeScale");
            this.f57746i = g13;
            if (g13 == -1) {
                this.f57746i = ((Long) c("TimeScale")).longValue();
            }
            this.f57754q = new ArrayList();
            return;
        }
        int size = this.f57754q.size();
        long h10 = d.h(xmlPullParser, "t", -9223372036854775807L);
        if (h10 == -9223372036854775807L) {
            if (size == 0) {
                h10 = 0;
            } else {
                if (this.f57755r == -1) {
                    throw ParserException.b("Unable to infer start time", null);
                }
                h10 = this.f57755r + ((Long) this.f57754q.get(size - 1)).longValue();
            }
        }
        this.f57754q.add(Long.valueOf(h10));
        this.f57755r = d.h(xmlPullParser, "d", -9223372036854775807L);
        long h13 = d.h(xmlPullParser, "r", 1L);
        if (h13 > 1 && this.f57755r == -9223372036854775807L) {
            throw ParserException.b("Repeated chunk with unspecified duration", null);
        }
        while (true) {
            long j13 = i13;
            if (j13 >= h13) {
                return;
            }
            this.f57754q.add(Long.valueOf((this.f57755r * j13) + h10));
            i13++;
        }
    }
}
