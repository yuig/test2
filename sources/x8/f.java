package x8;

import org.xmlpull.v1.XmlPullParser;
import pk.c1;
import pk.v2;
import pk.x0;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f134156a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f134157b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f134158c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r7 == (-1)) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c0.x0 a(java.lang.String r19) {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r19
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = d7.b.h0(r0, r1)
            r3 = 0
            if (r2 == 0) goto Ld2
            pk.y0 r2 = pk.c1.f100372b
            pk.v2 r2 = pk.v2.f100502e
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = d7.b.h0(r0, r8)
            if (r8 == 0) goto L9e
            java.lang.String[] r2 = x8.f.f134156a
            r6 = 0
            r7 = r6
        L37:
            r8 = 4
            if (r7 >= r8) goto L9d
            r9 = r2[r7]
            java.lang.String r9 = d7.b.L(r0, r9)
            if (r9 == 0) goto L9a
            int r2 = java.lang.Integer.parseInt(r9)
            r7 = 1
            if (r2 != r7) goto L9d
            java.lang.String[] r2 = x8.f.f134157b
            r7 = r6
        L4c:
            if (r7 >= r8) goto L64
            r9 = r2[r7]
            java.lang.String r9 = d7.b.L(r0, r9)
            if (r9 == 0) goto L61
            long r7 = java.lang.Long.parseLong(r9)
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L65
            goto L64
        L61:
            int r7 = r7 + 1
            goto L4c
        L64:
            r7 = r4
        L65:
            java.lang.String[] r2 = x8.f.f134158c
        L67:
            r9 = 2
            if (r6 >= r9) goto L94
            r9 = r2[r6]
            java.lang.String r9 = d7.b.L(r0, r9)
            if (r9 == 0) goto L91
            long r11 = java.lang.Long.parseLong(r9)
            x8.b r2 = new x8.b
            r14 = 0
            r16 = 0
            java.lang.String r18 = "image/jpeg"
            r13 = r2
            r13.<init>(r14, r16, r18)
            x8.b r6 = new x8.b
            r13 = 0
            java.lang.String r15 = "video/mp4"
            r10 = r6
            r10.<init>(r11, r13, r15)
            pk.v2 r2 = pk.c1.w(r2, r6)
            goto L98
        L91:
            int r6 = r6 + 1
            goto L67
        L94:
            pk.y0 r2 = pk.c1.f100372b
            pk.v2 r2 = pk.v2.f100502e
        L98:
            r6 = r7
            goto Lbf
        L9a:
            int r7 = r7 + 1
            goto L37
        L9d:
            return r3
        L9e:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = d7.b.h0(r0, r8)
            if (r8 == 0) goto Laf
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            pk.v2 r2 = b(r0, r2, r8)
            goto Lbf
        Laf:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = d7.b.h0(r0, r8)
            if (r8 == 0) goto Lbf
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            pk.v2 r2 = b(r0, r2, r8)
        Lbf:
            boolean r8 = d7.b.e0(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lcc
            return r3
        Lcc:
            c0.x0 r0 = new c0.x0
            r0.<init>(r6, r2)
            return r0
        Ld2:
            java.lang.String r0 = "Couldn't find xmp metadata"
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r0, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.f.a(java.lang.String):c0.x0");
    }

    public static v2 b(XmlPullParser xmlPullParser, String str, String str2) {
        x0 n13 = c1.n();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (d7.b.h0(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String L = d7.b.L(xmlPullParser, concat3);
                String L2 = d7.b.L(xmlPullParser, concat4);
                String L3 = d7.b.L(xmlPullParser, concat5);
                String L4 = d7.b.L(xmlPullParser, concat6);
                if (L == null || L2 == null) {
                    return v2.f100502e;
                }
                n13.e(new b(L3 != null ? Long.parseLong(L3) : 0L, L4 != null ? Long.parseLong(L4) : 0L, L));
            }
        } while (!d7.b.e0(xmlPullParser, concat2));
        return n13.i();
    }
}
