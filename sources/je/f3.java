package je;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import com.caverock.androidsvg.SVGParseException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class f3 {

    /* renamed from: d, reason: collision with root package name */
    public int f75603d;

    /* renamed from: a, reason: collision with root package name */
    public j2 f75600a = null;

    /* renamed from: b, reason: collision with root package name */
    public n1 f75601b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f75602c = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f75604e = false;

    /* renamed from: f, reason: collision with root package name */
    public d3 f75605f = null;

    /* renamed from: g, reason: collision with root package name */
    public StringBuilder f75606g = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f75607h = false;

    /* renamed from: i, reason: collision with root package name */
    public StringBuilder f75608i = null;

    public static void A(t1 t1Var, String str) {
        u uVar;
        g.i iVar = new g.i(str);
        iVar.K();
        String C = iVar.C();
        if ("defer".equals(C)) {
            iVar.K();
            C = iVar.C();
        }
        t tVar = (t) x2.f75818a.get(C);
        iVar.K();
        if (iVar.s()) {
            uVar = null;
        } else {
            String C2 = iVar.C();
            C2.getClass();
            if (C2.equals("meet")) {
                uVar = u.meet;
            } else {
                if (!C2.equals("slice")) {
                    throw new SVGParseException("Invalid preserveAspectRatio definition: ".concat(str));
                }
                uVar = u.slice;
            }
        }
        t1Var.f75773n = new v(tVar, uVar);
    }

    public static HashMap B(g.i iVar) {
        HashMap hashMap = new HashMap();
        iVar.K();
        String D = iVar.D('=', false);
        while (D != null) {
            iVar.p('=');
            hashMap.put(D, iVar.B());
            iVar.K();
            D = iVar.D('=', false);
        }
        return hashMap;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Matrix C(String str) {
        Matrix matrix = new Matrix();
        g.i iVar = new g.i(str);
        iVar.K();
        while (!iVar.s()) {
            String str2 = null;
            if (!iVar.s()) {
                int i13 = iVar.f63178a;
                int charAt = ((String) iVar.f63180c).charAt(i13);
                while (true) {
                    if ((charAt >= 97 && charAt <= 122) || (charAt >= 65 && charAt <= 90)) {
                        charAt = iVar.j();
                    }
                }
                int i14 = iVar.f63178a;
                while (g.i.w(charAt)) {
                    charAt = iVar.j();
                }
                if (charAt == 40) {
                    iVar.f63178a++;
                    str2 = ((String) iVar.f63180c).substring(i13, i14);
                } else {
                    iVar.f63178a = i13;
                }
            }
            if (str2 == null) {
                throw new SVGParseException("Bad transform function encountered in transform list: ".concat(str));
            }
            char c13 = 65535;
            switch (str2.hashCode()) {
                case -1081239615:
                    if (str2.equals("matrix")) {
                        c13 = 0;
                        break;
                    }
                    break;
                case -925180581:
                    if (str2.equals("rotate")) {
                        c13 = 1;
                        break;
                    }
                    break;
                case 109250890:
                    if (str2.equals("scale")) {
                        c13 = 2;
                        break;
                    }
                    break;
                case 109493390:
                    if (str2.equals("skewX")) {
                        c13 = 3;
                        break;
                    }
                    break;
                case 109493391:
                    if (str2.equals("skewY")) {
                        c13 = 4;
                        break;
                    }
                    break;
                case 1052832078:
                    if (str2.equals("translate")) {
                        c13 = 5;
                        break;
                    }
                    break;
            }
            if (c13 == 0) {
                iVar.K();
                float z13 = iVar.z();
                iVar.J();
                float z14 = iVar.z();
                iVar.J();
                float z15 = iVar.z();
                iVar.J();
                float z16 = iVar.z();
                iVar.J();
                float z17 = iVar.z();
                iVar.J();
                float z18 = iVar.z();
                iVar.K();
                if (Float.isNaN(z18) || !iVar.p(')')) {
                    throw new SVGParseException("Invalid transform list: ".concat(str));
                }
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{z13, z15, z17, z14, z16, z18, 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
            } else if (c13 == 1) {
                iVar.K();
                float z19 = iVar.z();
                float F = iVar.F();
                float F2 = iVar.F();
                iVar.K();
                if (Float.isNaN(z19) || !iVar.p(')')) {
                    throw new SVGParseException("Invalid transform list: ".concat(str));
                }
                if (Float.isNaN(F)) {
                    matrix.preRotate(z19);
                } else {
                    if (Float.isNaN(F2)) {
                        throw new SVGParseException("Invalid transform list: ".concat(str));
                    }
                    matrix.preRotate(z19, F, F2);
                }
            } else if (c13 == 2) {
                iVar.K();
                float z23 = iVar.z();
                float F3 = iVar.F();
                iVar.K();
                if (Float.isNaN(z23) || !iVar.p(')')) {
                    throw new SVGParseException("Invalid transform list: ".concat(str));
                }
                if (Float.isNaN(F3)) {
                    matrix.preScale(z23, z23);
                } else {
                    matrix.preScale(z23, F3);
                }
            } else if (c13 == 3) {
                iVar.K();
                float z24 = iVar.z();
                iVar.K();
                if (Float.isNaN(z24) || !iVar.p(')')) {
                    throw new SVGParseException("Invalid transform list: ".concat(str));
                }
                matrix.preSkew((float) Math.tan(Math.toRadians(z24)), 0.0f);
            } else if (c13 == 4) {
                iVar.K();
                float z25 = iVar.z();
                iVar.K();
                if (Float.isNaN(z25) || !iVar.p(')')) {
                    throw new SVGParseException("Invalid transform list: ".concat(str));
                }
                matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(z25)));
            } else {
                if (c13 != 5) {
                    throw new SVGParseException(a.a.k("Invalid transform list fn: ", str2, ")"));
                }
                iVar.K();
                float z26 = iVar.z();
                float F4 = iVar.F();
                iVar.K();
                if (Float.isNaN(z26) || !iVar.p(')')) {
                    throw new SVGParseException("Invalid transform list: ".concat(str));
                }
                if (Float.isNaN(F4)) {
                    matrix.preTranslate(z26, 0.0f);
                } else {
                    matrix.preTranslate(z26, F4);
                }
            }
            if (iVar.s()) {
                return matrix;
            }
            iVar.J();
        }
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:311:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void G(je.j1 r16, java.lang.String r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 1796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: je.f3.G(je.j1, java.lang.String, java.lang.String):void");
    }

    public static int b(float f13) {
        if (f13 < 0.0f) {
            return 0;
        }
        if (f13 > 255.0f) {
            return 255;
        }
        return Math.round(f13);
    }

    public static int d(float f13, float f14, float f15) {
        float f16 = f13 % 360.0f;
        if (f13 < 0.0f) {
            f16 += 360.0f;
        }
        float f17 = f16 / 60.0f;
        float f18 = f14 / 100.0f;
        float f19 = f15 / 100.0f;
        if (f18 < 0.0f) {
            f18 = 0.0f;
        } else if (f18 > 1.0f) {
            f18 = 1.0f;
        }
        float f23 = f19 >= 0.0f ? f19 > 1.0f ? 1.0f : f19 : 0.0f;
        float f24 = f23 <= 0.5f ? (f18 + 1.0f) * f23 : (f23 + f18) - (f18 * f23);
        float f25 = (f23 * 2.0f) - f24;
        return b(e(f25, f24, f17 - 2.0f) * 256.0f) | (b(e(f25, f24, f17 + 2.0f) * 256.0f) << 16) | (b(e(f25, f24, f17) * 256.0f) << 8);
    }

    public static float e(float f13, float f14, float f15) {
        if (f15 < 0.0f) {
            f15 += 6.0f;
        }
        if (f15 >= 6.0f) {
            f15 -= 6.0f;
        }
        return f15 < 1.0f ? ep.b.a(f14, f13, f15, f13) : f15 < 3.0f ? f14 : f15 < 4.0f ? ep.b.a(4.0f, f15, f14 - f13, f13) : f13;
    }

    public static void g(l1 l1Var, Attributes attributes) {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String trim = attributes.getValue(i13).trim();
            switch (w2.f75806b[d7.g.d(attributes, i13)]) {
                case 21:
                    g.i iVar = new g.i(trim);
                    HashSet hashSet = new HashSet();
                    while (!iVar.s()) {
                        String C = iVar.C();
                        if (C.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                            hashSet.add(C.substring(35));
                        } else {
                            hashSet.add("UNSUPPORTED");
                        }
                        iVar.K();
                    }
                    l1Var.d(hashSet);
                    break;
                case 22:
                    l1Var.i(trim);
                    break;
                case 23:
                    g.i iVar2 = new g.i(trim);
                    HashSet hashSet2 = new HashSet();
                    while (!iVar2.s()) {
                        String C2 = iVar2.C();
                        int indexOf = C2.indexOf(45);
                        if (indexOf != -1) {
                            C2 = C2.substring(0, indexOf);
                        }
                        hashSet2.add(new Locale(C2, "", "").getLanguage());
                        iVar2.K();
                    }
                    l1Var.f(hashSet2);
                    break;
                case 24:
                    g.i iVar3 = new g.i(trim);
                    HashSet hashSet3 = new HashSet();
                    while (!iVar3.s()) {
                        hashSet3.add(iVar3.C());
                        iVar3.K();
                    }
                    l1Var.j(hashSet3);
                    break;
                case 25:
                    ArrayList s13 = s(trim);
                    l1Var.h(s13 != null ? new HashSet(s13) : new HashSet(0));
                    break;
            }
        }
    }

    public static void h(p1 p1Var, Attributes attributes) {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String qName = attributes.getQName(i13);
            if (qName.equals("id") || qName.equals("xml:id")) {
                p1Var.f75734c = attributes.getValue(i13).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i13).trim();
                if ("default".equals(trim)) {
                    p1Var.f75735d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(trim)) {
                        throw new SVGParseException(a.a.j("Invalid value for \"xml:space\" attribute: ", trim));
                    }
                    p1Var.f75735d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(je.g0 r4, org.xml.sax.Attributes r5) {
        /*
            r0 = 0
        L1:
            int r1 = r5.getLength()
            if (r0 >= r1) goto L79
            java.lang.String r1 = r5.getValue(r0)
            java.lang.String r1 = r1.trim()
            int[] r2 = je.w2.f75806b
            int r3 = d7.g.d(r5, r0)
            r2 = r2[r3]
            r3 = 6
            if (r2 == r3) goto L5c
            switch(r2) {
                case 32: goto L3a;
                case 33: goto L33;
                case 34: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L76
        L1e:
            je.h0 r2 = je.h0.valueOf(r1)     // Catch: java.lang.IllegalArgumentException -> L25
            r4.f75613k = r2     // Catch: java.lang.IllegalArgumentException -> L25
            goto L76
        L25:
            com.caverock.androidsvg.SVGParseException r4 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r5 = "Invalid spreadMethod attribute. \""
            java.lang.String r0 = "\" is not a valid value."
            java.lang.String r5 = a.a.k(r5, r1, r0)
            r4.<init>(r5)
            throw r4
        L33:
            android.graphics.Matrix r1 = C(r1)
            r4.f75612j = r1
            goto L76
        L3a:
            java.lang.String r2 = "objectBoundingBox"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L47
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4.f75611i = r1
            goto L76
        L47:
            java.lang.String r2 = "userSpaceOnUse"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L54
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r4.f75611i = r1
            goto L76
        L54:
            com.caverock.androidsvg.SVGParseException r4 = new com.caverock.androidsvg.SVGParseException
            java.lang.String r5 = "Invalid value for attribute gradientUnits"
            r4.<init>(r5)
            throw r4
        L5c:
            java.lang.String r2 = ""
            java.lang.String r3 = r5.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L74
            java.lang.String r2 = "http://www.w3.org/1999/xlink"
            java.lang.String r3 = r5.getURI(r0)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L76
        L74:
            r4.f75614l = r1
        L76:
            int r0 = r0 + 1
            goto L1
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je.f3.i(je.g0, org.xml.sax.Attributes):void");
    }

    public static void j(v0 v0Var, Attributes attributes, String str) {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            if (c3.fromString(attributes.getLocalName(i13)) == c3.points) {
                g.i iVar = new g.i(attributes.getValue(i13));
                ArrayList arrayList = new ArrayList();
                iVar.K();
                while (!iVar.s()) {
                    float z13 = iVar.z();
                    if (Float.isNaN(z13)) {
                        throw new SVGParseException(a.a.k("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    iVar.J();
                    float z14 = iVar.z();
                    if (Float.isNaN(z14)) {
                        throw new SVGParseException(a.a.k("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    iVar.J();
                    arrayList.add(Float.valueOf(z13));
                    arrayList.add(Float.valueOf(z14));
                }
                v0Var.f75801o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i14 = 0;
                while (it.hasNext()) {
                    v0Var.f75801o[i14] = ((Float) it.next()).floatValue();
                    i14++;
                }
            }
        }
    }

    public static void k(p1 p1Var, Attributes attributes) {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String trim = attributes.getValue(i13).trim();
            if (trim.length() != 0) {
                int i14 = w2.f75806b[d7.g.d(attributes, i13)];
                if (i14 == 45) {
                    g.i iVar = new g.i(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String D = iVar.D(':', false);
                        iVar.K();
                        if (!iVar.p(':')) {
                            break;
                        }
                        iVar.K();
                        String D2 = iVar.D(';', true);
                        if (D2 == null) {
                            break;
                        }
                        iVar.K();
                        if (iVar.s() || iVar.p(';')) {
                            if (p1Var.f75737f == null) {
                                p1Var.f75737f = new j1();
                            }
                            G(p1Var.f75737f, D, D2);
                            iVar.K();
                        }
                    }
                } else if (i14 != 46) {
                    if (p1Var.f75736e == null) {
                        p1Var.f75736e = new j1();
                    }
                    G(p1Var.f75736e, attributes.getLocalName(i13), attributes.getValue(i13).trim());
                } else {
                    e eVar = new e(trim);
                    ArrayList arrayList = null;
                    while (!eVar.s()) {
                        String C = eVar.C();
                        if (C != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(C);
                            eVar.K();
                        }
                    }
                    p1Var.f75738g = arrayList;
                }
            }
        }
    }

    public static void l(e2 e2Var, Attributes attributes) {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String trim = attributes.getValue(i13).trim();
            int i14 = w2.f75806b[d7.g.d(attributes, i13)];
            if (i14 == 1) {
                e2Var.f75590n = w(trim);
            } else if (i14 == 2) {
                e2Var.f75591o = w(trim);
            } else if (i14 == 19) {
                e2Var.f75592p = w(trim);
            } else if (i14 == 20) {
                e2Var.f75593q = w(trim);
            }
        }
    }

    public static void m(k0 k0Var, Attributes attributes) {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            if (c3.fromString(attributes.getLocalName(i13)) == c3.transform) {
                k0Var.k(C(attributes.getValue(i13)));
            }
        }
    }

    public static void n(v1 v1Var, Attributes attributes) {
        for (int i13 = 0; i13 < attributes.getLength(); i13++) {
            String trim = attributes.getValue(i13).trim();
            int i14 = w2.f75806b[d7.g.d(attributes, i13)];
            if (i14 == 7) {
                A(v1Var, trim);
            } else if (i14 != 87) {
                continue;
            } else {
                g.i iVar = new g.i(trim);
                iVar.K();
                float z13 = iVar.z();
                iVar.J();
                float z14 = iVar.z();
                iVar.J();
                float z15 = iVar.z();
                iVar.J();
                float z16 = iVar.z();
                if (Float.isNaN(z13) || Float.isNaN(z14) || Float.isNaN(z15) || Float.isNaN(z16)) {
                    throw new SVGParseException("Invalid viewBox definition - should have four numbers");
                }
                if (z15 < 0.0f) {
                    throw new SVGParseException("Invalid viewBox. width cannot be negative");
                }
                if (z16 < 0.0f) {
                    throw new SVGParseException("Invalid viewBox. height cannot be negative");
                }
                v1Var.f75802o = new z(z13, z14, z15, z16);
            }
        }
    }

    public static c0 o(String str) {
        long j13;
        int i13;
        if (str.charAt(0) == '#') {
            int length = str.length();
            l8.q qVar = null;
            if (1 < length) {
                long j14 = 0;
                int i14 = 1;
                while (i14 < length) {
                    char charAt = str.charAt(i14);
                    if (charAt < '0' || charAt > '9') {
                        if (charAt >= 'A' && charAt <= 'F') {
                            j13 = j14 * 16;
                            i13 = charAt - 'A';
                        } else {
                            if (charAt < 'a' || charAt > 'f') {
                                break;
                            }
                            j13 = j14 * 16;
                            i13 = charAt - 'a';
                        }
                        j14 = j13 + i13 + 10;
                    } else {
                        j14 = (j14 * 16) + (charAt - '0');
                    }
                    if (j14 > 4294967295L) {
                        break;
                    }
                    i14++;
                }
                if (i14 != 1) {
                    qVar = new l8.q(j14, i14);
                }
            }
            if (qVar == null) {
                throw new SVGParseException("Bad hex colour value: ".concat(str));
            }
            int i15 = qVar.f82080b;
            if (i15 == 4) {
                int i16 = (int) qVar.f82081c;
                int i17 = i16 & 3840;
                int i18 = i16 & RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM;
                int i19 = i16 & 15;
                return new c0(i19 | (i17 << 8) | (-16777216) | (i17 << 12) | (i18 << 8) | (i18 << 4) | (i19 << 4));
            }
            if (i15 != 5) {
                if (i15 == 7) {
                    return new c0(((int) qVar.f82081c) | (-16777216));
                }
                if (i15 != 9) {
                    throw new SVGParseException("Bad hex colour value: ".concat(str));
                }
                int i23 = (int) qVar.f82081c;
                return new c0((i23 >>> 8) | (i23 << 24));
            }
            int i24 = (int) qVar.f82081c;
            int i25 = 61440 & i24;
            int i26 = i24 & 3840;
            int i27 = i24 & RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM;
            int i28 = i24 & 15;
            return new c0((i28 << 24) | (i28 << 28) | (i25 << 8) | (i25 << 4) | (i26 << 4) | i26 | i27 | (i27 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        if (startsWith || lowerCase.startsWith("rgb(")) {
            g.i iVar = new g.i(str.substring(startsWith ? 5 : 4));
            iVar.K();
            float z13 = iVar.z();
            if (!Float.isNaN(z13) && iVar.p('%')) {
                z13 = (z13 * 256.0f) / 100.0f;
            }
            float o13 = iVar.o(z13);
            if (!Float.isNaN(o13) && iVar.p('%')) {
                o13 = (o13 * 256.0f) / 100.0f;
            }
            float o14 = iVar.o(o13);
            if (!Float.isNaN(o14) && iVar.p('%')) {
                o14 = (o14 * 256.0f) / 100.0f;
            }
            if (!startsWith) {
                iVar.K();
                if (Float.isNaN(o14) || !iVar.p(')')) {
                    throw new SVGParseException("Bad rgb() colour value: ".concat(str));
                }
                return new c0((b(z13) << 16) | (-16777216) | (b(o13) << 8) | b(o14));
            }
            float o15 = iVar.o(o14);
            iVar.K();
            if (Float.isNaN(o15) || !iVar.p(')')) {
                throw new SVGParseException("Bad rgba() colour value: ".concat(str));
            }
            return new c0((b(o15 * 256.0f) << 24) | (b(z13) << 16) | (b(o13) << 8) | b(o14));
        }
        boolean startsWith2 = lowerCase.startsWith("hsla(");
        if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) y2.f75822a.get(lowerCase);
            if (num != null) {
                return new c0(num.intValue());
            }
            throw new SVGParseException("Invalid colour keyword: ".concat(lowerCase));
        }
        g.i iVar2 = new g.i(str.substring(startsWith2 ? 5 : 4));
        iVar2.K();
        float z14 = iVar2.z();
        float o16 = iVar2.o(z14);
        if (!Float.isNaN(o16)) {
            iVar2.p('%');
        }
        float o17 = iVar2.o(o16);
        if (!Float.isNaN(o17)) {
            iVar2.p('%');
        }
        if (!startsWith2) {
            iVar2.K();
            if (Float.isNaN(o17) || !iVar2.p(')')) {
                throw new SVGParseException("Bad hsl() colour value: ".concat(str));
            }
            return new c0(d(z14, o16, o17) | (-16777216));
        }
        float o18 = iVar2.o(o17);
        iVar2.K();
        if (Float.isNaN(o18) || !iVar2.p(')')) {
            throw new SVGParseException("Bad hsla() colour value: ".concat(str));
        }
        return new c0((b(o18 * 256.0f) << 24) | d(z14, o16, o17));
    }

    public static s1 p(String str) {
        str.getClass();
        if (str.equals("none")) {
            return c0.f75567c;
        }
        if (str.equals("currentColor")) {
            return d0.f75584a;
        }
        try {
            return o(str);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static float q(int i13, String str) {
        float a13 = new s().a(0, i13, str);
        if (Float.isNaN(a13)) {
            throw new SVGParseException(a.a.j("Invalid float value: ", str));
        }
        return a13;
    }

    public static float r(String str) {
        int length = str.length();
        if (length != 0) {
            return q(length, str);
        }
        throw new SVGParseException("Invalid float value (empty string)");
    }

    public static ArrayList s(String str) {
        g.i iVar = new g.i(str);
        ArrayList arrayList = null;
        do {
            String B = iVar.B();
            if (B == null) {
                B = iVar.D(',', true);
            }
            if (B == null) {
                break;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(B);
            iVar.J();
        } while (!iVar.s());
        return arrayList;
    }

    public static b1 t(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return b1.Oblique;
            case "italic":
                return b1.Italic;
            case "normal":
                return b1.Normal;
            default:
                return null;
        }
    }

    public static String u(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static m0 v(String str) {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length value (empty string)");
        }
        int length = str.length();
        g2 g2Var = g2.px;
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            g2Var = g2.percent;
        } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                g2Var = g2.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new SVGParseException("Invalid length unit specifier: ".concat(str));
            }
        }
        try {
            return new m0(q(length, str), g2Var);
        } catch (NumberFormatException e13) {
            throw new SVGParseException("Invalid length value: ".concat(str), e13);
        }
    }

    public static ArrayList w(String str) {
        if (str.length() == 0) {
            throw new SVGParseException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        g.i iVar = new g.i(str);
        iVar.K();
        while (!iVar.s()) {
            float z13 = iVar.z();
            if (Float.isNaN(z13)) {
                StringBuilder sb3 = new StringBuilder("Invalid length list value: ");
                int i13 = iVar.f63178a;
                while (!iVar.s() && !g.i.w(((String) iVar.f63180c).charAt(iVar.f63178a))) {
                    iVar.f63178a++;
                }
                String substring = ((String) iVar.f63180c).substring(i13, iVar.f63178a);
                iVar.f63178a = i13;
                sb3.append(substring);
                throw new SVGParseException(sb3.toString());
            }
            g2 E = iVar.E();
            if (E == null) {
                E = g2.px;
            }
            arrayList.add(new m0(z13, E));
            iVar.J();
        }
        return arrayList;
    }

    public static m0 x(g.i iVar) {
        return iVar.q("auto") ? new m0(0.0f) : iVar.A();
    }

    public static Float y(String str) {
        try {
            float r13 = r(str);
            float f13 = 0.0f;
            if (r13 >= 0.0f) {
                f13 = 1.0f;
                if (r13 > 1.0f) {
                }
                return Float.valueOf(r13);
            }
            r13 = f13;
            return Float.valueOf(r13);
        } catch (SVGParseException unused) {
            return null;
        }
    }

    public static s1 z(String str) {
        if (!str.startsWith("url(")) {
            return p(str);
        }
        int indexOf = str.indexOf(")");
        if (indexOf == -1) {
            return new r0(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        return new r0(trim, trim2.length() > 0 ? p(trim2) : null);
    }

    public final void D(InputStream inputStream) {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            b3 b3Var = new b3(this);
            xMLReader.setContentHandler(b3Var);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", b3Var);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e13) {
            throw new SVGParseException("Stream error", e13);
        } catch (ParserConfigurationException e14) {
            throw new SVGParseException("XML parser problem", e14);
        } catch (SAXException e15) {
            throw new SVGParseException("SVG parse error", e15);
        }
    }

    public final void E(InputStream inputStream) {
        try {
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                e3 e3Var = new e3();
                e3Var.f75594a = newPullParser;
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                newPullParser.setInput(inputStream, null);
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                    if (eventType == 0) {
                        H();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + newPullParser.getText());
                        g.i iVar = new g.i(newPullParser.getText());
                        String C = iVar.C();
                        B(iVar);
                        C.equals("xml-stylesheet");
                    } else if (eventType != 10) {
                        if (eventType == 2) {
                            String name = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name = newPullParser.getPrefix() + ':' + name;
                            }
                            I(newPullParser.getNamespace(), newPullParser.getName(), name, e3Var);
                        } else if (eventType == 3) {
                            String name2 = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name2 = newPullParser.getPrefix() + ':' + name2;
                            }
                            c(newPullParser.getNamespace(), newPullParser.getName(), name2);
                        } else if (eventType == 4) {
                            int[] iArr = new int[2];
                            K(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                        } else if (eventType == 5) {
                            J(newPullParser.getText());
                        }
                    } else if (this.f75600a.f75668a == null && newPullParser.getText().contains("<!ENTITY ")) {
                        try {
                            Log.d("SVGParser", "Switching to SAX parser to process entities");
                            inputStream.reset();
                            D(inputStream);
                            return;
                        } catch (IOException unused) {
                            Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                            return;
                        }
                    }
                }
            } catch (IOException e13) {
                throw new SVGParseException("Stream error", e13);
            }
        } catch (XmlPullParserException e14) {
            throw new SVGParseException("XML parser problem", e14);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x02ec, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x034c, code lost:
    
        android.util.Log.e("SVGParser", "Bad path coords for " + ((char) r8) + " path segment");
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x035f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(org.xml.sax.Attributes r23) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: je.f3.F(org.xml.sax.Attributes):void");
    }

    public final void H() {
        j2 j2Var = new j2();
        j2Var.f75668a = null;
        j2Var.f75669b = new za.c(1);
        j2Var.f75670c = new HashMap();
        this.f75600a = j2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x0343, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0546, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(java.lang.String r17, java.lang.String r18, java.lang.String r19, org.xml.sax.Attributes r20) {
        /*
            Method dump skipped, instructions count: 3120
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: je.f3.I(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    public final void J(String str) {
        if (this.f75602c) {
            return;
        }
        if (this.f75604e) {
            if (this.f75606g == null) {
                this.f75606g = new StringBuilder(str.length());
            }
            this.f75606g.append(str);
        } else if (this.f75607h) {
            if (this.f75608i == null) {
                this.f75608i = new StringBuilder(str.length());
            }
            this.f75608i.append(str);
        } else if (this.f75601b instanceof c2) {
            a(str);
        }
    }

    public final void K(char[] cArr, int i13, int i14) {
        if (this.f75602c) {
            return;
        }
        if (this.f75604e) {
            if (this.f75606g == null) {
                this.f75606g = new StringBuilder(i14);
            }
            this.f75606g.append(cArr, i13, i14);
        } else if (this.f75607h) {
            if (this.f75608i == null) {
                this.f75608i = new StringBuilder(i14);
            }
            this.f75608i.append(cArr, i13, i14);
        } else if (this.f75601b instanceof c2) {
            a(new String(cArr, i13, i14));
        }
    }

    public final void a(String str) {
        m1 m1Var = (m1) this.f75601b;
        int size = m1Var.f75696i.size();
        r1 r1Var = size == 0 ? null : (r1) m1Var.f75696i.get(size - 1);
        if (r1Var instanceof f2) {
            f2 f2Var = (f2) r1Var;
            f2Var.f75599c = a.a.p(new StringBuilder(), f2Var.f75599c, str);
        } else {
            n1 n1Var = this.f75601b;
            f2 f2Var2 = new f2();
            f2Var2.f75599c = str;
            n1Var.g(f2Var2);
        }
    }

    public final void c(String str, String str2, String str3) {
        if (this.f75602c) {
            int i13 = this.f75603d - 1;
            this.f75603d = i13;
            if (i13 == 0) {
                this.f75602c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i14 = w2.f75805a[d3.fromString(str2).ordinal()];
            if (i14 != 1 && i14 != 2 && i14 != 4 && i14 != 5 && i14 != 13 && i14 != 14) {
                switch (i14) {
                    case 22:
                    case 23:
                        this.f75604e = false;
                        if (this.f75606g != null) {
                            d3 d3Var = this.f75605f;
                            if (d3Var == d3.title) {
                                this.f75600a.getClass();
                            } else if (d3Var == d3.desc) {
                                this.f75600a.getClass();
                            }
                            this.f75606g.setLength(0);
                            break;
                        }
                        break;
                    case 30:
                        StringBuilder sb3 = this.f75608i;
                        if (sb3 != null) {
                            this.f75607h = false;
                            String sb4 = sb3.toString();
                            v.z1 z1Var = new v.z1(g.screen, r.Document);
                            j2 j2Var = this.f75600a;
                            e eVar = new e(sb4);
                            eVar.K();
                            j2Var.f75669b.c(z1Var.q(eVar));
                            this.f75608i.setLength(0);
                            break;
                        }
                        break;
                }
                return;
            }
            this.f75601b = ((r1) this.f75601b).f75758b;
        }
    }

    public final j2 f(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            E(inputStream);
            return this.f75600a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }
}
