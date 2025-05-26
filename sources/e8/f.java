package e8;

import a7.o0;
import a7.q;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser$MissingFieldException;
import java.util.ArrayList;
import java.util.Collections;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public final class f extends d {

    /* renamed from: e, reason: collision with root package name */
    public androidx.media3.common.b f57732e;

    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList m(java.lang.String r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L98
            byte[] r10 = d7.n0.v(r10)
            byte[] r1 = d7.f.f53817a
            int r1 = r10.length
            r2 = 4
            if (r1 > r2) goto L16
            goto L22
        L16:
            r1 = 0
            r3 = r1
        L18:
            if (r3 >= r2) goto L28
            r4 = r10[r3]
            byte[] r5 = d7.f.f53817a
            r5 = r5[r3]
            if (r4 == r5) goto L25
        L22:
            r1 = 0
            goto L8f
        L25:
            int r3 = r3 + 1
            goto L18
        L28:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = r1
        L2e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.add(r5)
            int r4 = r4 + r2
            int r5 = r10.length
            int r5 = r5 - r2
        L38:
            r6 = -1
            if (r4 > r5) goto L53
            int r7 = r10.length
            int r7 = r7 - r4
            if (r7 > r2) goto L40
            goto L4d
        L40:
            r7 = r1
        L41:
            if (r7 >= r2) goto L54
            int r8 = r4 + r7
            r8 = r10[r8]
            byte[] r9 = d7.f.f53817a
            r9 = r9[r7]
            if (r8 == r9) goto L50
        L4d:
            int r4 = r4 + 1
            goto L38
        L50:
            int r7 = r7 + 1
            goto L41
        L53:
            r4 = r6
        L54:
            if (r4 != r6) goto L2e
            int r2 = r3.size()
            byte[][] r2 = new byte[r2][]
            r4 = r1
        L5d:
            int r5 = r3.size()
            if (r4 >= r5) goto L8e
            java.lang.Object r5 = r3.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r6 = r3.size()
            int r6 = r6 + (-1)
            if (r4 >= r6) goto L82
            int r6 = r4 + 1
            java.lang.Object r6 = r3.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L83
        L82:
            int r6 = r10.length
        L83:
            int r6 = r6 - r5
            byte[] r7 = new byte[r6]
            java.lang.System.arraycopy(r10, r5, r7, r1, r6)
            r2[r4] = r7
            int r4 = r4 + 1
            goto L5d
        L8e:
            r1 = r2
        L8f:
            if (r1 != 0) goto L95
            r0.add(r10)
            goto L98
        L95:
            java.util.Collections.addAll(r0, r1)
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.f.m(java.lang.String):java.util.ArrayList");
    }

    @Override // e8.d
    public final Object b() {
        return this.f57732e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    @Override // e8.d
    public final void j(XmlPullParser xmlPullParser) {
        int i13;
        q qVar = new q();
        String attributeValue = xmlPullParser.getAttributeValue(null, "FourCC");
        if (attributeValue == null) {
            throw new SsManifestParser$MissingFieldException("FourCC");
        }
        String str = (attributeValue.equalsIgnoreCase("H264") || attributeValue.equalsIgnoreCase("X264") || attributeValue.equalsIgnoreCase("AVC1") || attributeValue.equalsIgnoreCase("DAVC")) ? "video/avc" : (attributeValue.equalsIgnoreCase("AAC") || attributeValue.equalsIgnoreCase("AACL") || attributeValue.equalsIgnoreCase("AACH") || attributeValue.equalsIgnoreCase("AACP")) ? "audio/mp4a-latm" : (attributeValue.equalsIgnoreCase("TTML") || attributeValue.equalsIgnoreCase("DFXP")) ? "application/ttml+xml" : (attributeValue.equalsIgnoreCase("ac-3") || attributeValue.equalsIgnoreCase("dac3")) ? "audio/ac3" : (attributeValue.equalsIgnoreCase("ec-3") || attributeValue.equalsIgnoreCase("dec3")) ? "audio/eac3" : attributeValue.equalsIgnoreCase("dtsc") ? "audio/vnd.dts" : (attributeValue.equalsIgnoreCase("dtsh") || attributeValue.equalsIgnoreCase("dtsl")) ? "audio/vnd.dts.hd" : attributeValue.equalsIgnoreCase("dtse") ? "audio/vnd.dts.hd;profile=lbr" : attributeValue.equalsIgnoreCase("opus") ? "audio/opus" : null;
        int intValue = ((Integer) c("Type")).intValue();
        if (intValue == 2) {
            ArrayList m13 = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            qVar.f1180m = o0.r("video/mp4");
            qVar.f1188u = d.i(xmlPullParser, "MaxWidth");
            qVar.f1189v = d.i(xmlPullParser, "MaxHeight");
            qVar.f1184q = m13;
        } else if (intValue == 1) {
            if (str == null) {
                str = "audio/mp4a-latm";
            }
            int i14 = d.i(xmlPullParser, "Channels");
            int i15 = d.i(xmlPullParser, "SamplingRate");
            ArrayList m14 = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            boolean isEmpty = m14.isEmpty();
            ArrayList arrayList = m14;
            if (isEmpty) {
                arrayList = m14;
                if ("audio/mp4a-latm".equals(str)) {
                    arrayList = Collections.singletonList(q8.b.a(i15, i14));
                }
            }
            qVar.f1180m = o0.r("audio/mp4");
            qVar.D = i14;
            qVar.E = i15;
            qVar.f1184q = arrayList;
        } else if (intValue == 3) {
            String str2 = (String) c("Subtype");
            if (str2 != null) {
                if (str2.equals("CAPT")) {
                    i13 = 64;
                } else if (str2.equals("DESC")) {
                    i13 = 1024;
                }
                qVar.f1180m = o0.r("application/mp4");
                qVar.f1173f = i13;
            }
            i13 = 0;
            qVar.f1180m = o0.r("application/mp4");
            qVar.f1173f = i13;
        } else {
            qVar.f1180m = o0.r("application/mp4");
        }
        qVar.f1168a = xmlPullParser.getAttributeValue(null, "Index");
        qVar.f1169b = (String) c("Name");
        qVar.f1181n = o0.r(str);
        qVar.f1175h = d.i(xmlPullParser, "Bitrate");
        qVar.f1171d = (String) c("Language");
        this.f57732e = new androidx.media3.common.b(qVar);
    }
}
