package q7;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import d7.n0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.y;
import net.quikkly.android.utils.BitmapUtils;
import ok.e0;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes.dex */
public final class e extends DefaultHandler implements y {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f102626b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f102627c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f102628d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f102629e = {2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f102630f = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f102631a;

    public e() {
        try {
            this.f102631a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e13) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0cf9 A[LOOP:3: B:112:0x02a4->B:120:0x0cf9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0c23 A[EDGE_INSN: B:121:0x0c23->B:122:0x0c23 BREAK  A[LOOP:3: B:112:0x02a4->B:120:0x0cf9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0aa1 A[LOOP:5: B:213:0x05bd->B:221:0x0aa1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x084c A[EDGE_INSN: B:222:0x084c->B:223:0x084c BREAK  A[LOOP:5: B:213:0x05bd->B:221:0x0aa1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x08e2 A[EDGE_INSN: B:248:0x08e2->B:249:0x08e2 BREAK  A[LOOP:6: B:240:0x08be->B:246:0x08dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x09ce  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x09dc  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0a53  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0a56  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0a44  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x09a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0ec7 A[LOOP:1: B:35:0x00cc->B:43:0x0ec7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0e93 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static q7.c A(org.xmlpull.v1.XmlPullParser r152, android.net.Uri r153) {
        /*
            Method dump skipped, instructions count: 3800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.e.A(org.xmlpull.v1.XmlPullParser, android.net.Uri):q7.c");
    }

    public static int B(XmlPullParser xmlPullParser) {
        int x13 = x(xmlPullParser, "value", -1);
        if (x13 < 0) {
            return -1;
        }
        int[] iArr = f102630f;
        if (x13 < iArr.length) {
            return iArr[x13];
        }
        return -1;
    }

    public static i C(XmlPullParser xmlPullParser) {
        String str = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "moreInformationURL");
        String str2 = attributeValue == null ? null : attributeValue;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "lang");
        String str3 = attributeValue2 == null ? null : attributeValue2;
        String str4 = null;
        String str5 = null;
        while (true) {
            xmlPullParser.next();
            if (d7.b.h0(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (d7.b.h0(xmlPullParser, "Source")) {
                str4 = xmlPullParser.nextText();
            } else if (d7.b.h0(xmlPullParser, "Copyright")) {
                str5 = xmlPullParser.nextText();
            } else {
                e(xmlPullParser);
            }
            String str6 = str5;
            if (d7.b.e0(xmlPullParser, "ProgramInformation")) {
                return new i(str, str4, str6, str2, str3);
            }
            str5 = str6;
        }
    }

    public static j D(XmlPullParser xmlPullParser, String str, String str2) {
        long j13;
        long j14;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j13 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j14 = (Long.parseLong(split[1]) - j13) + 1;
                return new j(attributeValue, j13, j14);
            }
        } else {
            j13 = 0;
        }
        j14 = -1;
        return new j(attributeValue, j13, j14);
    }

    public static int E(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public static int F(ArrayList arrayList) {
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            if (com.bumptech.glide.c.z("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i14)).f102632a)) {
                i13 = 16384;
            }
        }
        return i13;
    }

    public static r G(XmlPullParser xmlPullParser, r rVar) {
        long j13;
        long j14;
        long z13 = z(xmlPullParser, "timescale", rVar != null ? rVar.f102678a : 1L);
        long z14 = z(xmlPullParser, "presentationTimeOffset", rVar != null ? rVar.f102679b : 0L);
        long j15 = rVar != null ? rVar.f102676d : 0L;
        long j16 = rVar != null ? rVar.f102677e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j13 = (Long.parseLong(split[1]) - parseLong) + 1;
            j14 = parseLong;
        } else {
            j13 = j16;
            j14 = j15;
        }
        j jVar = rVar != null ? (j) rVar.f102680c : null;
        do {
            xmlPullParser.next();
            if (d7.b.h0(xmlPullParser, "Initialization")) {
                jVar = D(xmlPullParser, "sourceURL", "range");
            } else {
                e(xmlPullParser);
            }
        } while (!d7.b.e0(xmlPullParser, "SegmentBase"));
        return new r(jVar, z13, z14, j14, j13);
    }

    public static o H(XmlPullParser xmlPullParser, o oVar, long j13, long j14, long j15, long j16, long j17) {
        long z13 = z(xmlPullParser, "timescale", oVar != null ? oVar.f102678a : 1L);
        long z14 = z(xmlPullParser, "presentationTimeOffset", oVar != null ? oVar.f102679b : 0L);
        long z15 = z(xmlPullParser, "duration", oVar != null ? oVar.f102665e : -9223372036854775807L);
        long z16 = z(xmlPullParser, "startNumber", oVar != null ? oVar.f102664d : 1L);
        long j18 = j16 == -9223372036854775807L ? j15 : j16;
        long j19 = j18 == Long.MAX_VALUE ? -9223372036854775807L : j18;
        List list = null;
        j jVar = null;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (d7.b.h0(xmlPullParser, "Initialization")) {
                jVar = D(xmlPullParser, "sourceURL", "range");
            } else if (d7.b.h0(xmlPullParser, "SegmentTimeline")) {
                list2 = J(xmlPullParser, z13, j14);
            } else if (d7.b.h0(xmlPullParser, "SegmentURL")) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(D(xmlPullParser, "media", "mediaRange"));
            } else {
                e(xmlPullParser);
            }
        } while (!d7.b.e0(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVar == null) {
                jVar = (j) oVar.f102680c;
            }
            if (list2 == null) {
                list2 = oVar.f102666f;
            }
            if (list == null) {
                list = oVar.f102670j;
            }
        }
        return new o(jVar, z13, z14, z16, z15, list2, j19, list, n0.X(j17), n0.X(j13));
    }

    public static p I(XmlPullParser xmlPullParser, p pVar, List list, long j13, long j14, long j15, long j16, long j17) {
        long j18;
        long z13 = z(xmlPullParser, "timescale", pVar != null ? pVar.f102678a : 1L);
        long z14 = z(xmlPullParser, "presentationTimeOffset", pVar != null ? pVar.f102679b : 0L);
        long z15 = z(xmlPullParser, "duration", pVar != null ? pVar.f102665e : -9223372036854775807L);
        long z16 = z(xmlPullParser, "startNumber", pVar != null ? pVar.f102664d : 1L);
        int i13 = 0;
        while (true) {
            if (i13 >= list.size()) {
                j18 = -1;
                break;
            }
            f fVar = (f) list.get(i13);
            if (com.bumptech.glide.c.z("http://dashif.org/guidelines/last-segment-number", fVar.f102632a)) {
                j18 = Long.parseLong(fVar.f102633b);
                break;
            }
            i13++;
        }
        long j19 = j18;
        long j23 = j16 == -9223372036854775807L ? j15 : j16;
        long j24 = j23 == Long.MAX_VALUE ? -9223372036854775807L : j23;
        j jVar = null;
        v vVar = pVar != null ? pVar.f102672k : null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "media");
        if (attributeValue != null) {
            vVar = v.b(attributeValue);
        }
        v vVar2 = vVar;
        v vVar3 = pVar != null ? pVar.f102671j : null;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "initialization");
        if (attributeValue2 != null) {
            vVar3 = v.b(attributeValue2);
        }
        v vVar4 = vVar3;
        List list2 = null;
        do {
            xmlPullParser.next();
            if (d7.b.h0(xmlPullParser, "Initialization")) {
                jVar = D(xmlPullParser, "sourceURL", "range");
            } else if (d7.b.h0(xmlPullParser, "SegmentTimeline")) {
                list2 = J(xmlPullParser, z13, j14);
            } else {
                e(xmlPullParser);
            }
        } while (!d7.b.e0(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVar == null) {
                jVar = (j) pVar.f102680c;
            }
            if (list2 == null) {
                list2 = pVar.f102666f;
            }
        }
        return new p(jVar, z13, z14, z16, j19, z15, list2, j24, vVar4, vVar2, n0.X(j17), n0.X(j13));
    }

    public static ArrayList J(XmlPullParser xmlPullParser, long j13, long j14) {
        ArrayList arrayList = new ArrayList();
        long j15 = 0;
        long j16 = -9223372036854775807L;
        boolean z13 = false;
        int i13 = 0;
        do {
            xmlPullParser.next();
            if (d7.b.h0(xmlPullParser, "S")) {
                long z14 = z(xmlPullParser, "t", -9223372036854775807L);
                if (z13) {
                    j15 = a(arrayList, j15, j16, i13, z14);
                }
                if (z14 == -9223372036854775807L) {
                    z14 = j15;
                }
                long z15 = z(xmlPullParser, "d", -9223372036854775807L);
                i13 = x(xmlPullParser, "r", 0);
                z13 = true;
                j16 = z15;
                j15 = z14;
            } else {
                e(xmlPullParser);
            }
        } while (!d7.b.e0(xmlPullParser, "SegmentTimeline"));
        if (z13) {
            int i14 = n0.f53866a;
            a(arrayList, j15, j16, i13, n0.g0(j14, j13, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    public static int K(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x006d A[LOOP:0: B:2:0x000f->B:8:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0066 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static q7.t L(org.xmlpull.v1.XmlPullParser r21) {
        /*
            r0 = r21
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r4 = r1
            r6 = r4
            r8 = r6
            r10 = r3
            r11 = r10
        Lf:
            r21.next()
            java.lang.String r12 = "Latency"
            boolean r12 = d7.b.h0(r0, r12)
            java.lang.String r13 = "max"
            java.lang.String r14 = "min"
            if (r12 == 0) goto L35
            java.lang.String r4 = "target"
            long r4 = z(r0, r4, r1)
            long r6 = z(r0, r14, r1)
            long r8 = z(r0, r13, r1)
        L2c:
            r13 = r4
            r15 = r6
            r17 = r8
            r19 = r10
            r20 = r11
            goto L5e
        L35:
            java.lang.String r12 = "PlaybackRate"
            boolean r12 = d7.b.h0(r0, r12)
            if (r12 == 0) goto L2c
            r10 = 0
            java.lang.String r11 = r0.getAttributeValue(r10, r14)
            if (r11 != 0) goto L46
            r11 = r3
            goto L4a
        L46:
            float r11 = java.lang.Float.parseFloat(r11)
        L4a:
            java.lang.String r10 = r0.getAttributeValue(r10, r13)
            if (r10 != 0) goto L52
            r10 = r3
            goto L56
        L52:
            float r10 = java.lang.Float.parseFloat(r10)
        L56:
            r13 = r4
            r15 = r6
            r17 = r8
            r20 = r10
            r19 = r11
        L5e:
            java.lang.String r4 = "ServiceDescription"
            boolean r4 = d7.b.e0(r0, r4)
            if (r4 == 0) goto L6d
            q7.t r0 = new q7.t
            r12 = r0
            r12.<init>(r13, r15, r17, r19, r20)
            return r0
        L6d:
            r4 = r13
            r6 = r15
            r8 = r17
            r10 = r19
            r11 = r20
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.e.L(org.xmlpull.v1.XmlPullParser):q7.t");
    }

    public static int M(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public static w N(XmlPullParser xmlPullParser) {
        return new w(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"), 0);
    }

    public static long a(ArrayList arrayList, long j13, long j14, int i13, long j15) {
        int i14;
        if (i13 >= 0) {
            i14 = i13 + 1;
        } else {
            int i15 = n0.f53866a;
            i14 = (int) ((((j15 - j13) + j14) - 1) / j14);
        }
        for (int i16 = 0; i16 < i14; i16++) {
            arrayList.add(new q(j13, j14));
            j13 += j14;
        }
        return j13;
    }

    public static String b(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        bf.b.t(str.equals(str2));
        return str;
    }

    public static void c(ArrayList arrayList) {
        String str;
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(i13);
            if (a7.i.f1068c.equals(schemeData.f18739b) && (str = schemeData.f18740c) != null) {
                arrayList.remove(i13);
                break;
            }
            i13++;
        }
        if (str == null) {
            return;
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) arrayList.get(i14);
            if (a7.i.f1067b.equals(schemeData2.f18739b) && schemeData2.f18740c == null) {
                arrayList.set(i14, new DrmInitData.SchemeData(a7.i.f1068c, str, schemeData2.f18741d, schemeData2.f18742e));
            }
        }
    }

    public static void d(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(size);
            if (!schemeData.b()) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    if (((DrmInitData.SchemeData) arrayList.get(i13)).a(schemeData)) {
                        arrayList.remove(size);
                        break;
                    }
                    i13++;
                }
            }
        }
    }

    public static void e(XmlPullParser xmlPullParser) {
        if (d7.b.g0(xmlPullParser)) {
            int i13 = 1;
            while (i13 != 0) {
                xmlPullParser.next();
                if (d7.b.g0(xmlPullParser)) {
                    i13++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i13--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int g(XmlPullParser xmlPullParser, String str) {
        char c13;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        String str2 = attributeValue != null ? attributeValue : null;
        str2.getClass();
        int i13 = -1;
        switch (str2.hashCode()) {
            case -2128649360:
                if (str2.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c13 = 0;
                    break;
                }
                c13 = 65535;
                break;
            case -2060825028:
                if (str2.equals("tag:dolby.com,2015:dash:audio_channel_configuration:2015")) {
                    c13 = 1;
                    break;
                }
                c13 = 65535;
                break;
            case -1352850286:
                if (str2.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c13 = 2;
                    break;
                }
                c13 = 65535;
                break;
            case -1138141449:
                if (str2.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c13 = 3;
                    break;
                }
                c13 = 65535;
                break;
            case -986633423:
                if (str2.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c13 = 4;
                    break;
                }
                c13 = 65535;
                break;
            case -79006963:
                if (str2.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c13 = 5;
                    break;
                }
                c13 = 65535;
                break;
            case 312179081:
                if (str2.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c13 = 6;
                    break;
                }
                c13 = 65535;
                break;
            case 2036691300:
                if (str2.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c13 = 7;
                    break;
                }
                c13 = 65535;
                break;
            default:
                c13 = 65535;
                break;
        }
        switch (c13) {
            case 0:
            case 5:
                i13 = r(xmlPullParser);
                break;
            case 1:
                i13 = p(xmlPullParser, str);
                break;
            case 2:
                i13 = x(xmlPullParser, "value", -1);
                break;
            case 3:
            case 7:
                i13 = q(xmlPullParser);
                break;
            case 4:
                i13 = B(xmlPullParser);
                break;
            case 6:
                i13 = s(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!d7.b.e0(xmlPullParser, "AudioChannelConfiguration"));
        return i13;
    }

    public static long h(XmlPullParser xmlPullParser, long j13) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j13;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList i(XmlPullParser xmlPullParser, List list, boolean z13) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z13 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                e(xmlPullParser);
            }
        } while (!d7.b.e0(xmlPullParser, "BaseURL"));
        if (str != null && b7.c.z(str)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return com.bumptech.glide.d.l0(new b(str, parseInt, parseInt2, attributeValue3));
        }
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            b bVar = (b) list.get(i13);
            String N = b7.c.N(bVar.f102600a, str);
            String str2 = attributeValue3 == null ? N : attributeValue3;
            if (z13) {
                parseInt = bVar.f102602c;
                parseInt2 = bVar.f102603d;
                str2 = bVar.f102601b;
            }
            arrayList.add(new b(N, parseInt, parseInt2, str2));
        }
        return arrayList;
    }

    public static int j(ArrayList arrayList) {
        String str;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            f fVar = (f) arrayList.get(i13);
            if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f102632a) && (str = fVar.f102633b) != null) {
                Matcher matcher = f102627c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                d7.u.g("MpdParser", "Unable to parse CEA-608 channel number from: ".concat(str));
            }
        }
        return -1;
    }

    public static int l(ArrayList arrayList) {
        String str;
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            f fVar = (f) arrayList.get(i13);
            if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f102632a) && (str = fVar.f102633b) != null) {
                Matcher matcher = f102628d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                d7.u.g("MpdParser", "Unable to parse CEA-708 service block number from: ".concat(str));
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0166  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair m(org.xmlpull.v1.XmlPullParser r13) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.e.m(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int n(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static f o(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!d7.b.e0(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static int p(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || attributeValue.length() != 6) {
            return -1;
        }
        int parseInt = Integer.parseInt(attributeValue, 16);
        int i13 = 0;
        if ((8388608 & parseInt) == 0) {
            int i14 = 0;
            while (true) {
                int[] iArr = f102629e;
                if (i13 >= iArr.length) {
                    break;
                }
                i14 += ((parseInt >> i13) & 1) * iArr[i13];
                i13++;
            }
            if (i14 == 0) {
                return -1;
            }
            return i14;
        }
        String[] l03 = n0.l0(str);
        if (l03.length == 0) {
            return -1;
        }
        List c13 = e0.a('.').c(com.bumptech.glide.c.q1(l03[0].trim()));
        if (c13.size() != 4 || !((String) c13.get(0)).equals("ac-4")) {
            return -1;
        }
        String str2 = (String) c13.get(3);
        str2.getClass();
        if (str2.equals("03")) {
            return 18;
        }
        return !str2.equals("04") ? -1 : 21;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int q(XmlPullParser xmlPullParser) {
        char c13;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String q13 = com.bumptech.glide.c.q1(attributeValue);
        q13.getClass();
        switch (q13.hashCode()) {
            case 1596796:
                if (q13.equals("4000")) {
                    c13 = 0;
                    break;
                }
                c13 = 65535;
                break;
            case 2937391:
                if (q13.equals("a000")) {
                    c13 = 1;
                    break;
                }
                c13 = 65535;
                break;
            case 3094034:
                if (q13.equals("f800")) {
                    c13 = 2;
                    break;
                }
                c13 = 65535;
                break;
            case 3094035:
                if (q13.equals("f801")) {
                    c13 = 3;
                    break;
                }
                c13 = 65535;
                break;
            case 3133436:
                if (q13.equals("fa01")) {
                    c13 = 4;
                    break;
                }
                c13 = 65535;
                break;
            default:
                c13 = 65535;
                break;
        }
        switch (c13) {
        }
        return -1;
    }

    public static int r(XmlPullParser xmlPullParser) {
        int x13 = x(xmlPullParser, "value", -1);
        if (x13 <= 0 || x13 >= 33) {
            return -1;
        }
        return x13;
    }

    public static int s(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    public static long t(XmlPullParser xmlPullParser, String str, long j13) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j13;
        }
        Matcher matcher = n0.f53871f.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return isEmpty ? -parseDouble6 : parseDouble6;
    }

    public static String u(ArrayList arrayList) {
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            f fVar = (f) arrayList.get(i13);
            String str = fVar.f102632a;
            boolean equals = "tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str);
            String str2 = fVar.f102633b;
            if (equals && "JOC".equals(str2)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(str2)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static g v(XmlPullParser xmlPullParser) {
        ArrayList arrayList;
        long j13;
        ByteArrayOutputStream byteArrayOutputStream;
        String str;
        String str2 = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        String str3 = attributeValue2 != null ? attributeValue2 : "";
        long z13 = z(xmlPullParser, "timescale", 1L);
        long j14 = 0;
        long z14 = z(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(BitmapUtils.BITMAP_TO_JPEG_SIZE);
        while (true) {
            xmlPullParser.next();
            if (d7.b.h0(xmlPullParser, "Event")) {
                long z15 = z(xmlPullParser, "id", j14);
                long z16 = z(xmlPullParser, "duration", -9223372036854775807L);
                long z17 = z(xmlPullParser, "presentationTime", j14);
                int i13 = n0.f53866a;
                RoundingMode roundingMode = RoundingMode.DOWN;
                ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream2;
                long g03 = n0.g0(z16, 1000L, z13, roundingMode);
                long g04 = n0.g0(z17 - z14, 1000000L, z13, roundingMode);
                String attributeValue3 = xmlPullParser.getAttributeValue(str2, "messageData");
                if (attributeValue3 == null) {
                    attributeValue3 = str2;
                }
                byteArrayOutputStream3.reset();
                XmlSerializer newSerializer = Xml.newSerializer();
                newSerializer.setOutput(byteArrayOutputStream3, StandardCharsets.UTF_8.name());
                xmlPullParser.nextToken();
                while (!d7.b.e0(xmlPullParser, "Event")) {
                    switch (xmlPullParser.getEventType()) {
                        case 0:
                            str = null;
                            newSerializer.startDocument(null, Boolean.FALSE);
                            break;
                        case 1:
                            newSerializer.endDocument();
                            str = null;
                            break;
                        case 2:
                            newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                            int i14 = 0;
                            while (i14 < xmlPullParser.getAttributeCount()) {
                                newSerializer.attribute(xmlPullParser.getAttributeNamespace(i14), xmlPullParser.getAttributeName(i14), xmlPullParser.getAttributeValue(i14));
                                i14++;
                                str2 = null;
                            }
                            str = str2;
                            break;
                        case 3:
                            newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                            str = str2;
                            break;
                        case 4:
                            newSerializer.text(xmlPullParser.getText());
                            str = str2;
                            break;
                        case 5:
                            newSerializer.cdsect(xmlPullParser.getText());
                            str = str2;
                            break;
                        case 6:
                            newSerializer.entityRef(xmlPullParser.getText());
                            str = str2;
                            break;
                        case 7:
                            newSerializer.ignorableWhitespace(xmlPullParser.getText());
                            str = str2;
                            break;
                        case 8:
                            newSerializer.processingInstruction(xmlPullParser.getText());
                            str = str2;
                            break;
                        case 9:
                            newSerializer.comment(xmlPullParser.getText());
                            str = str2;
                            break;
                        case 10:
                            newSerializer.docdecl(xmlPullParser.getText());
                            str = str2;
                            break;
                        default:
                            str = str2;
                            break;
                    }
                    xmlPullParser.nextToken();
                    str2 = str;
                }
                newSerializer.flush();
                byte[] byteArray = byteArrayOutputStream3.toByteArray();
                Long valueOf = Long.valueOf(g04);
                if (attributeValue3 != null) {
                    byteArray = attributeValue3.getBytes(StandardCharsets.UTF_8);
                }
                j13 = 0;
                byteArrayOutputStream = byteArrayOutputStream3;
                arrayList = arrayList2;
                arrayList.add(Pair.create(valueOf, new a9.a(attributeValue, str3, g03, z15, byteArray)));
            } else {
                arrayList = arrayList2;
                j13 = j14;
                byteArrayOutputStream = byteArrayOutputStream2;
                e(xmlPullParser);
            }
            if (d7.b.e0(xmlPullParser, "EventStream")) {
                long[] jArr = new long[arrayList.size()];
                a9.a[] aVarArr = new a9.a[arrayList.size()];
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    Pair pair = (Pair) arrayList.get(i15);
                    jArr[i15] = ((Long) pair.first).longValue();
                    aVarArr[i15] = (a9.a) pair.second;
                }
                return new g(attributeValue, str3, jArr, aVarArr);
            }
            arrayList2 = arrayList;
            j14 = j13;
            byteArrayOutputStream2 = byteArrayOutputStream;
            str2 = null;
        }
    }

    public static float w(XmlPullParser xmlPullParser, float f13) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f13;
        }
        Matcher matcher = f102626b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f13;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
    }

    public static int x(XmlPullParser xmlPullParser, String str, int i13) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i13 : Integer.parseInt(attributeValue);
    }

    public static a7.u y(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "lang");
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                e(xmlPullParser);
            }
        } while (!d7.b.e0(xmlPullParser, "Label"));
        return new a7.u(attributeValue, str);
    }

    public static long z(XmlPullParser xmlPullParser, String str, long j13) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j13 : Long.parseLong(attributeValue);
    }

    @Override // l8.y
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final c k(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f102631a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return A(newPullParser, uri);
            }
            throw ParserException.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e13) {
            throw ParserException.b(null, e13);
        }
    }
}
