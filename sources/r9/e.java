package r9;

import android.text.Layout;
import androidx.media3.extractor.text.SubtitleDecoderException;
import c2.n2;
import d7.i;
import d7.n0;
import d7.u;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kh2.u2;
import l9.k;
import l9.l;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes3.dex */
public final class e implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f106815b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f106816c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f106817d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f106818e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f106819f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f106820g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f106821h = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: i, reason: collision with root package name */
    public static final d f106822i = new d(1, 30.0f, 1);

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f106823a;

    public e() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f106823a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e13) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e13);
        }
    }

    public static g a(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean b(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static Layout.Alignment c(String str) {
        String q13 = com.bumptech.glide.c.q1(str);
        q13.getClass();
        switch (q13) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static int e(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f106821h.matcher(attributeValue);
        if (!matcher.matches()) {
            u.g("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z13 = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z13 = false;
            }
            bf.b.h("Invalid cell resolution " + parseInt + " " + parseInt2, z13);
            return parseInt2;
        } catch (NumberFormatException unused) {
            u.g("TtmlParser", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    public static void f(String str, g gVar) {
        Matcher matcher;
        String group;
        int i13 = n0.f53866a;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f106817d;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new SubtitleDecoderException(a.a.n(new StringBuilder("Invalid number of entries for fontSize: "), split.length, "."));
            }
            matcher = pattern.matcher(split[1]);
            u.g("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException(a.a.k("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        group.hashCode();
        switch (group) {
            case "%":
                gVar.f106843j = 3;
                break;
            case "em":
                gVar.f106843j = 2;
                break;
            case "px":
                gVar.f106843j = 1;
                break;
            default:
                throw new SubtitleDecoderException(a.a.k("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        gVar.f106844k = Float.parseFloat(group2);
    }

    public static d g(XmlPullParser xmlPullParser) {
        float f13;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i13 = n0.f53866a;
            bf.b.h("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f13 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f13 = 1.0f;
        }
        d dVar = f106822i;
        int i14 = dVar.f106812a;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i14 = Integer.parseInt(attributeValue3);
        }
        int i15 = dVar.f106814c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i15 = Integer.parseInt(attributeValue4);
        }
        return new d(i14, parseInt * f13, i15);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void h(org.xmlpull.v1.XmlPullParser r18, java.util.HashMap r19, int r20, c2.n2 r21, java.util.HashMap r22, java.util.HashMap r23) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.e.h(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, c2.n2, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static c i(XmlPullParser xmlPullParser, c cVar, HashMap hashMap, d dVar) {
        long j13;
        long j14;
        char c13;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        g j15 = j(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j16 = -9223372036854775807L;
        long j17 = -9223372036854775807L;
        long j18 = -9223372036854775807L;
        for (int i13 = 0; i13 < attributeCount; i13++) {
            String attributeName = xmlPullParser.getAttributeName(i13);
            String attributeValue = xmlPullParser.getAttributeValue(i13);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c13 = 0;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c13 = 1;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c13 = 2;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c13 = 3;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c13 = 4;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c13 = 5;
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
                    if (hashMap.containsKey(attributeValue)) {
                        str2 = attributeValue;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    j18 = k(attributeValue, dVar);
                    break;
                case 2:
                    j17 = k(attributeValue, dVar);
                    break;
                case 3:
                    j16 = k(attributeValue, dVar);
                    break;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i14 = n0.f53866a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                    }
            }
        }
        if (cVar != null) {
            long j19 = cVar.f106802d;
            j13 = -9223372036854775807L;
            if (j19 != -9223372036854775807L) {
                if (j16 != -9223372036854775807L) {
                    j16 += j19;
                }
                if (j17 != -9223372036854775807L) {
                    j17 += j19;
                }
            }
        } else {
            j13 = -9223372036854775807L;
        }
        if (j17 == j13) {
            if (j18 != j13) {
                j14 = j16 + j18;
            } else if (cVar != null) {
                long j23 = cVar.f106803e;
                if (j23 != j13) {
                    j14 = j23;
                }
            }
            return new c(xmlPullParser.getName(), null, j16, j14, j15, strArr, str2, str, cVar);
        }
        j14 = j17;
        return new c(xmlPullParser.getName(), null, j16, j14, j15, strArr, str2, str, cVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x00ba, code lost:
    
        if (r6.equals("textDecoration") == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static r9.g j(org.xmlpull.v1.XmlPullParser r16, r9.g r17) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.e.j(org.xmlpull.v1.XmlPullParser, r9.g):r9.g");
    }

    public static long k(String str, d dVar) {
        double parseDouble;
        double d2;
        double d13;
        Matcher matcher = f106815b.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / dVar.f106813b : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / dVar.f106812a) / dVar.f106813b : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f106816c.matcher(str);
        if (!matcher2.matches()) {
            throw new SubtitleDecoderException(a.a.j("Malformed time expression: ", str));
        }
        String group3 = matcher2.group(1);
        group3.getClass();
        parseDouble = Double.parseDouble(group3);
        String group4 = matcher2.group(2);
        group4.getClass();
        group4.hashCode();
        switch (group4) {
            case "f":
                d2 = dVar.f106813b;
                parseDouble /= d2;
                break;
            case "h":
                d13 = 3600.0d;
                break;
            case "m":
                d13 = 60.0d;
                break;
            case "t":
                d2 = dVar.f106814c;
                parseDouble /= d2;
                break;
            case "ms":
                d2 = 1000.0d;
                parseDouble /= d2;
                break;
        }
        parseDouble *= d13;
        return (long) (parseDouble * 1000000.0d);
    }

    public static n2 l(XmlPullParser xmlPullParser) {
        String L = d7.b.L(xmlPullParser, "extent");
        if (L == null) {
            return null;
        }
        Matcher matcher = f106820g.matcher(L);
        if (!matcher.matches()) {
            u.g("TtmlParser", "Ignoring non-pixel tts extent: ".concat(L));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new n2(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            u.g("TtmlParser", "Ignoring malformed tts extent: ".concat(L));
            return null;
        }
    }

    @Override // l9.l
    public final int E() {
        return 1;
    }

    @Override // l9.l
    public final void w(byte[] bArr, int i13, int i14, k kVar, i iVar) {
        u2.Y0(x(bArr, i13, i14), kVar, iVar);
    }

    @Override // l9.l
    public final l9.d x(byte[] bArr, int i13, int i14) {
        d dVar;
        try {
            XmlPullParser newPullParser = this.f106823a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new f("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            n2 n2Var = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i13, i14), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            d dVar2 = f106822i;
            int i15 = 15;
            h hVar = null;
            int i16 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i16 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            dVar2 = g(newPullParser);
                            i15 = e(newPullParser);
                            n2Var = l(newPullParser);
                        }
                        n2 n2Var2 = n2Var;
                        d dVar3 = dVar2;
                        int i17 = i15;
                        if (b(name)) {
                            if ("head".equals(name)) {
                                dVar = dVar3;
                                h(newPullParser, hashMap, i17, n2Var2, hashMap2, hashMap3);
                            } else {
                                dVar = dVar3;
                                try {
                                    c i18 = i(newPullParser, cVar, hashMap2, dVar);
                                    arrayDeque.push(i18);
                                    if (cVar != null) {
                                        if (cVar.f106811m == null) {
                                            cVar.f106811m = new ArrayList();
                                        }
                                        cVar.f106811m.add(i18);
                                    }
                                } catch (SubtitleDecoderException e13) {
                                    u.h("TtmlParser", "Suppressing parser error", e13);
                                    i16++;
                                }
                            }
                            dVar2 = dVar;
                        } else {
                            u.f("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            i16++;
                            dVar2 = dVar3;
                        }
                        n2Var = n2Var2;
                        i15 = i17;
                    } else if (eventType == 4) {
                        cVar.getClass();
                        c a13 = c.a(newPullParser.getText());
                        if (cVar.f106811m == null) {
                            cVar.f106811m = new ArrayList();
                        }
                        cVar.f106811m.add(a13);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            c cVar2 = (c) arrayDeque.peek();
                            cVar2.getClass();
                            hVar = new h(cVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i16++;
                } else if (eventType == 3) {
                    i16--;
                }
                newPullParser.next();
            }
            hVar.getClass();
            return hVar;
        } catch (IOException e14) {
            throw new IllegalStateException("Unexpected error when reading input.", e14);
        } catch (XmlPullParserException e15) {
            throw new IllegalStateException("Unable to decode source", e15);
        }
    }
}
