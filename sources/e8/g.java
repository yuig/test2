package e8;

import a7.q;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser$MissingFieldException;
import d7.n0;
import java.math.RoundingMode;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class g extends d {

    /* renamed from: e, reason: collision with root package name */
    public final LinkedList f57733e;

    /* renamed from: f, reason: collision with root package name */
    public int f57734f;

    /* renamed from: g, reason: collision with root package name */
    public int f57735g;

    /* renamed from: h, reason: collision with root package name */
    public long f57736h;

    /* renamed from: i, reason: collision with root package name */
    public long f57737i;

    /* renamed from: j, reason: collision with root package name */
    public long f57738j;

    /* renamed from: k, reason: collision with root package name */
    public int f57739k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f57740l;

    /* renamed from: m, reason: collision with root package name */
    public a f57741m;

    public g(String str) {
        super(null, str, "SmoothStreamingMedia");
        this.f57739k = -1;
        this.f57741m = null;
        this.f57733e = new LinkedList();
    }

    @Override // e8.d
    public final void a(Object obj) {
        if (obj instanceof b) {
            this.f57733e.add((b) obj);
        } else if (obj instanceof a) {
            bf.b.t(this.f57741m == null);
            this.f57741m = (a) obj;
        }
    }

    @Override // e8.d
    public final Object b() {
        boolean z13;
        a aVar;
        int i13;
        long g03;
        long g04;
        LinkedList linkedList = this.f57733e;
        int size = linkedList.size();
        b[] bVarArr = new b[size];
        linkedList.toArray(bVarArr);
        a aVar2 = this.f57741m;
        if (aVar2 != null) {
            DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(aVar2.f57698a, null, "video/mp4", aVar2.f57699b));
            for (int i14 = 0; i14 < size; i14++) {
                b bVar = bVarArr[i14];
                int i15 = bVar.f57701a;
                if (i15 == 2 || i15 == 1) {
                    int i16 = 0;
                    while (true) {
                        androidx.media3.common.b[] bVarArr2 = bVar.f57710j;
                        if (i16 < bVarArr2.length) {
                            q a13 = bVarArr2[i16].a();
                            a13.f1185r = drmInitData;
                            bVarArr2[i16] = new androidx.media3.common.b(a13);
                            i16++;
                        }
                    }
                }
            }
        }
        int i17 = this.f57734f;
        int i18 = this.f57735g;
        long j13 = this.f57736h;
        long j14 = this.f57737i;
        long j15 = this.f57738j;
        int i19 = this.f57739k;
        boolean z14 = this.f57740l;
        a aVar3 = this.f57741m;
        if (j14 == 0) {
            z13 = z14;
            aVar = aVar3;
            i13 = i19;
            g03 = -9223372036854775807L;
        } else {
            int i23 = n0.f53866a;
            z13 = z14;
            aVar = aVar3;
            i13 = i19;
            g03 = n0.g0(j14, 1000000L, j13, RoundingMode.DOWN);
        }
        if (j15 == 0) {
            g04 = -9223372036854775807L;
        } else {
            int i24 = n0.f53866a;
            g04 = n0.g0(j15, 1000000L, j13, RoundingMode.DOWN);
        }
        return new c(i17, i18, g03, g04, i13, z13, aVar, bVarArr);
    }

    @Override // e8.d
    public final void j(XmlPullParser xmlPullParser) {
        this.f57734f = d.i(xmlPullParser, "MajorVersion");
        this.f57735g = d.i(xmlPullParser, "MinorVersion");
        this.f57736h = d.h(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue == null) {
            throw new SsManifestParser$MissingFieldException("Duration");
        }
        try {
            this.f57737i = Long.parseLong(attributeValue);
            this.f57738j = d.h(xmlPullParser, "DVRWindowLength", 0L);
            this.f57739k = d.g(xmlPullParser, "LookaheadCount");
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
            this.f57740l = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
            l(Long.valueOf(this.f57736h), "TimeScale");
        } catch (NumberFormatException e13) {
            throw ParserException.b(null, e13);
        }
    }
}
