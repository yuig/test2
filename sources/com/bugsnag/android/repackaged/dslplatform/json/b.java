package com.bugsnag.android.repackaged.dslplatform.json;

import java.io.StringReader;
import java.net.InetAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* loaded from: classes3.dex */
public final class b implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29483a;

    @Override // com.bugsnag.android.repackaged.dslplatform.json.r
    public final Object a(t tVar) {
        byte[] a13;
        boolean[] copyOf;
        char[] cArr;
        int[] copyOf2;
        short[] copyOf3;
        long[] copyOf4;
        double[] copyOf5;
        float[] copyOf6;
        UUID fromString;
        UUID uuid;
        Document newDocument;
        int i13 = this.f29483a;
        switch (i13) {
            case 0:
                if (tVar.u()) {
                    return null;
                }
                if (tVar.f29577j != null) {
                    byte[] bArr = tVar.f29575h;
                    int i14 = tVar.f29569b;
                    char[] cArr2 = a.f29479a;
                    while (true) {
                        if (i14 < bArr.length) {
                            if (a.f29481c[bArr[i14] & 255] >= 0) {
                                i14++;
                            }
                        } else {
                            i14 = bArr.length;
                        }
                    }
                    if (i14 == tVar.f29575h.length) {
                        int k13 = tVar.k();
                        byte[] bArr2 = new byte[k13];
                        for (int i15 = 0; i15 < k13; i15++) {
                            bArr2[i15] = (byte) tVar.f29576i[i15];
                        }
                        a13 = a.a(bArr2, 0, k13);
                        return a13;
                    }
                }
                if (tVar.f29571d != 34) {
                    throw tVar.f("Expecting '\"' for base64 start");
                }
                int i16 = tVar.f29569b;
                byte[] bArr3 = tVar.f29575h;
                char[] cArr3 = a.f29479a;
                int i17 = i16;
                while (true) {
                    if (i17 < bArr3.length) {
                        if (a.f29481c[bArr3[i17] & 255] >= 0) {
                            i17++;
                        }
                    } else {
                        i17 = bArr3.length;
                    }
                }
                byte[] bArr4 = tVar.f29575h;
                tVar.f29569b = i17 + 1;
                byte b13 = bArr4[i17];
                tVar.f29571d = b13;
                if (b13 != 34) {
                    throw tVar.f("Expecting '\"' for base64 end");
                }
                a13 = a.a(bArr4, i16, i17);
                return a13;
            case 1:
                switch (i13) {
                    case 1:
                        return Boolean.valueOf(d.a(tVar));
                    default:
                        if (tVar.u()) {
                            return null;
                        }
                        return Boolean.valueOf(d.a(tVar));
                }
            case 2:
                switch (i13) {
                    case 1:
                        return Boolean.valueOf(d.a(tVar));
                    default:
                        if (tVar.u()) {
                            return null;
                        }
                        return Boolean.valueOf(d.a(tVar));
                }
            case 3:
                if (tVar.u()) {
                    return null;
                }
                if (tVar.f29571d != 91) {
                    throw tVar.f("Expecting '[' for boolean array start");
                }
                tVar.c();
                if (tVar.f29571d == 93) {
                    copyOf = d.f29487c;
                } else {
                    boolean[] zArr = new boolean[4];
                    zArr[0] = d.a(tVar);
                    int i18 = 1;
                    while (tVar.c() == 44) {
                        tVar.c();
                        if (i18 == zArr.length) {
                            zArr = Arrays.copyOf(zArr, zArr.length << 1);
                        }
                        zArr[i18] = d.a(tVar);
                        i18++;
                    }
                    tVar.b();
                    copyOf = Arrays.copyOf(zArr, i18);
                }
                return copyOf;
            case 4:
                if (tVar.u()) {
                    return null;
                }
                return URI.create(tVar.r());
            case 5:
                if (tVar.u()) {
                    return null;
                }
                if (tVar.f29571d != 34) {
                    throw tVar.f("Expecting '\"' for string start");
                }
                int i19 = tVar.f29569b;
                int i23 = 0;
                while (true) {
                    try {
                        cArr = tVar.f29573f;
                        if (i23 < cArr.length) {
                            int i24 = i19 + 1;
                            byte b14 = tVar.f29575h[i19];
                            if (b14 == 34) {
                                i19 = i24;
                            } else {
                                int i25 = i23 + 1;
                                cArr[i23] = (char) b14;
                                i23 = i25;
                                i19 = i24;
                            }
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw tVar.g(0, "JSON string was not closed with a double quote");
                    }
                }
                if (i19 > tVar.f29572e) {
                    throw tVar.g(0, "JSON string was not closed with a double quote");
                }
                tVar.f29569b = i19;
                return InetAddress.getByName(new String(cArr, 0, i23));
            case 6:
                switch (i13) {
                    case 6:
                        return Integer.valueOf(w.f(tVar));
                    default:
                        if (tVar.u()) {
                            return null;
                        }
                        return Integer.valueOf(w.f(tVar));
                }
            case 7:
                switch (i13) {
                    case 6:
                        return Integer.valueOf(w.f(tVar));
                    default:
                        if (tVar.u()) {
                            return null;
                        }
                        return Integer.valueOf(w.f(tVar));
                }
            case 8:
                if (tVar.u()) {
                    return null;
                }
                if (tVar.f29571d != 91) {
                    throw tVar.f("Expecting '[' for int array start");
                }
                tVar.c();
                short[] sArr = w.f29598a;
                if (tVar.f29571d == 93) {
                    copyOf2 = w.f29599b;
                } else {
                    int[] iArr = new int[4];
                    iArr[0] = w.f(tVar);
                    int i26 = 1;
                    while (tVar.c() == 44) {
                        tVar.c();
                        if (i26 == iArr.length) {
                            iArr = Arrays.copyOf(iArr, iArr.length << 1);
                        }
                        iArr[i26] = w.f(tVar);
                        i26++;
                    }
                    tVar.b();
                    copyOf2 = Arrays.copyOf(iArr, i26);
                }
                return copyOf2;
            case 9:
                switch (i13) {
                    case 9:
                        return Short.valueOf(w.i(tVar));
                    default:
                        if (tVar.u()) {
                            return null;
                        }
                        return Short.valueOf(w.i(tVar));
                }
            case 10:
                switch (i13) {
                    case 9:
                        return Short.valueOf(w.i(tVar));
                    default:
                        if (tVar.u()) {
                            return null;
                        }
                        return Short.valueOf(w.i(tVar));
                }
            case 11:
                if (tVar.u()) {
                    return null;
                }
                if (tVar.f29571d != 91) {
                    throw tVar.f("Expecting '[' for short array start");
                }
                tVar.c();
                short[] sArr2 = w.f29598a;
                if (tVar.f29571d == 93) {
                    copyOf3 = w.f29598a;
                } else {
                    short[] sArr3 = new short[4];
                    sArr3[0] = (short) w.f(tVar);
                    int i27 = 1;
                    while (tVar.c() == 44) {
                        tVar.c();
                        if (i27 == sArr3.length) {
                            sArr3 = Arrays.copyOf(sArr3, sArr3.length << 1);
                        }
                        sArr3[i27] = (short) w.f(tVar);
                        i27++;
                    }
                    tVar.b();
                    copyOf3 = Arrays.copyOf(sArr3, i27);
                }
                return copyOf3;
            case 12:
                switch (i13) {
                    case 12:
                        return Double.valueOf(w.d(tVar));
                    default:
                        if (tVar.u()) {
                            return null;
                        }
                        return Double.valueOf(w.d(tVar));
                }
            case 13:
                switch (i13) {
                    case 13:
                        return Long.valueOf(w.g(tVar));
                    default:
                        if (tVar.u()) {
                            return null;
                        }
                        return Long.valueOf(w.g(tVar));
                }
            case 14:
                switch (i13) {
                    case 13:
                        return Long.valueOf(w.g(tVar));
                    default:
                        if (tVar.u()) {
                            return null;
                        }
                        return Long.valueOf(w.g(tVar));
                }
            case 15:
                if (tVar.u()) {
                    return null;
                }
                if (tVar.f29571d != 91) {
                    throw tVar.f("Expecting '[' for long array start");
                }
                tVar.c();
                short[] sArr4 = w.f29598a;
                if (tVar.f29571d == 93) {
                    copyOf4 = w.f29600c;
                } else {
                    long[] jArr = new long[4];
                    jArr[0] = w.g(tVar);
                    int i28 = 1;
                    while (tVar.c() == 44) {
                        tVar.c();
                        if (i28 == jArr.length) {
                            jArr = Arrays.copyOf(jArr, jArr.length << 1);
                        }
                        jArr[i28] = w.g(tVar);
                        i28++;
                    }
                    tVar.b();
                    copyOf4 = Arrays.copyOf(jArr, i28);
                }
                return copyOf4;
            case 16:
                if (tVar.u()) {
                    return null;
                }
                return w.c(tVar);
            case 17:
                if (tVar.u()) {
                    return null;
                }
                return w.h(tVar);
            case 18:
                switch (i13) {
                    case 12:
                        return Double.valueOf(w.d(tVar));
                    default:
                        if (tVar.u()) {
                            return null;
                        }
                        return Double.valueOf(w.d(tVar));
                }
            case 19:
                if (tVar.u()) {
                    return null;
                }
                if (tVar.f29571d != 91) {
                    throw tVar.f("Expecting '[' for double array start");
                }
                tVar.c();
                short[] sArr5 = w.f29598a;
                if (tVar.f29571d == 93) {
                    copyOf5 = w.f29602e;
                } else {
                    double[] dArr = new double[4];
                    dArr[0] = w.d(tVar);
                    int i29 = 1;
                    while (tVar.c() == 44) {
                        tVar.c();
                        if (i29 == dArr.length) {
                            dArr = Arrays.copyOf(dArr, dArr.length << 1);
                        }
                        dArr[i29] = w.d(tVar);
                        i29++;
                    }
                    tVar.b();
                    copyOf5 = Arrays.copyOf(dArr, i29);
                }
                return copyOf5;
            case 20:
                switch (i13) {
                    case 20:
                        return Float.valueOf(w.e(tVar));
                    default:
                        if (tVar.u()) {
                            return null;
                        }
                        return Float.valueOf(w.e(tVar));
                }
            case 21:
                switch (i13) {
                    case 20:
                        return Float.valueOf(w.e(tVar));
                    default:
                        if (tVar.u()) {
                            return null;
                        }
                        return Float.valueOf(w.e(tVar));
                }
            case 22:
                if (tVar.u()) {
                    return null;
                }
                if (tVar.f29571d != 91) {
                    throw tVar.f("Expecting '[' for float array start");
                }
                tVar.c();
                short[] sArr6 = w.f29598a;
                if (tVar.f29571d == 93) {
                    copyOf6 = w.f29601d;
                } else {
                    float[] fArr = new float[4];
                    fArr[0] = w.e(tVar);
                    int i33 = 1;
                    while (tVar.c() == 44) {
                        tVar.c();
                        if (i33 == fArr.length) {
                            fArr = Arrays.copyOf(fArr, fArr.length << 1);
                        }
                        fArr[i33] = w.e(tVar);
                        i33++;
                    }
                    tVar.b();
                    copyOf6 = Arrays.copyOf(fArr, i33);
                }
                return copyOf6;
            case 23:
            default:
                if (tVar.u()) {
                    return null;
                }
                DocumentBuilder documentBuilder = z.f29628a;
                if (tVar.f29571d == 34) {
                    try {
                        return z.f29628a.parse(new InputSource(new StringReader(tVar.r()))).getDocumentElement();
                    } catch (SAXException e13) {
                        throw tVar.h("Invalid XML value", 0, e13);
                    }
                }
                LinkedHashMap b15 = d.b(tVar);
                Set keySet = b15.keySet();
                if (keySet.size() > 1) {
                    throw ParsingException.a("Invalid XML. Expecting root element", true);
                }
                String str = (String) keySet.iterator().next();
                synchronized (z.class) {
                    try {
                        newDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
                    } catch (ParserConfigurationException e14) {
                        throw new ConfigurationException(e14);
                    }
                }
                Element createElement = newDocument.createElement(str);
                newDocument.appendChild(createElement);
                z.a(newDocument, createElement, b15.get(str));
                return createElement;
            case 24:
                if (tVar.u()) {
                    return null;
                }
                return d.b(tVar);
            case 25:
                if (tVar.u()) {
                    return null;
                }
                return tVar.r();
            case 26:
                if (tVar.u()) {
                    return null;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(tVar.f29576i, 0, tVar.k());
                return sb3;
            case 27:
                if (tVar.u()) {
                    return null;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(tVar.f29576i, 0, tVar.k());
                return stringBuffer;
            case 28:
                if (tVar.u()) {
                    return null;
                }
                b bVar = y.f29624a;
                char[] q13 = tVar.q();
                int i34 = tVar.f29569b - tVar.f29568a;
                byte[] bArr5 = y.f29627d;
                if (i34 != 37 || q13[8] != '-' || q13[13] != '-' || q13[18] != '-' || q13[23] != '-') {
                    if (i34 == 33) {
                        long j13 = 0;
                        for (int i35 = 0; i35 < 16; i35++) {
                            try {
                                j13 = (j13 << 4) + bArr5[q13[i35] - '0'];
                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                fromString = UUID.fromString(new String(q13, 0, 32));
                            }
                        }
                        long j14 = 0;
                        for (int i36 = 16; i36 < 32; i36++) {
                            j14 = (j14 << 4) + bArr5[q13[i36] - '0'];
                        }
                        uuid = new UUID(j13, j14);
                    } else {
                        fromString = UUID.fromString(new String(q13, 0, i34 - 1));
                    }
                    return fromString;
                }
                long j15 = 0;
                for (int i37 = 0; i37 < 8; i37++) {
                    try {
                        j15 = (j15 << 4) + bArr5[q13[i37] - '0'];
                    } catch (ArrayIndexOutOfBoundsException unused3) {
                        fromString = UUID.fromString(new String(q13, 0, 36));
                    }
                }
                for (int i38 = 9; i38 < 13; i38++) {
                    j15 = (j15 << 4) + bArr5[q13[i38] - '0'];
                }
                for (int i39 = 14; i39 < 18; i39++) {
                    j15 = (j15 << 4) + bArr5[q13[i39] - '0'];
                }
                long j16 = 0;
                for (int i43 = 19; i43 < 23; i43++) {
                    j16 = (j16 << 4) + bArr5[q13[i43] - '0'];
                }
                for (int i44 = 24; i44 < 36; i44++) {
                    j16 = (j16 << 4) + bArr5[q13[i44] - '0'];
                }
                uuid = new UUID(j15, j16);
                return uuid;
        }
    }
}
