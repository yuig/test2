package a8;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import androidx.media3.common.ParserException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import pk.h1;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1273a;

    /* renamed from: b, reason: collision with root package name */
    public int f1274b;

    /* renamed from: c, reason: collision with root package name */
    public int f1275c;

    /* renamed from: d, reason: collision with root package name */
    public int f1276d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1277e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1278f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1279g;

    /* renamed from: h, reason: collision with root package name */
    public Object f1280h;

    /* renamed from: i, reason: collision with root package name */
    public Object f1281i;

    public a(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb3 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i13 = 0; i13 < length; i13++) {
            char c13 = (char) (bytes[i13] & 255);
            if (c13 == '?' && str.charAt(i13) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb3.append(c13);
        }
        this.f1273a = sb3.toString();
        this.f1277e = zm.e.FORCE_NONE;
        this.f1280h = new StringBuilder(str.length());
        this.f1275c = -1;
    }

    public static String b(String str, int i13, int i14, int i15) {
        int i16 = d7.n0.f53866a;
        Locale locale = Locale.US;
        return i13 + " " + str + "/" + i14 + "/" + i15;
    }

    public static String e(int i13) {
        bf.b.i(i13 < 96);
        if (i13 == 0) {
            return b("PCMU", 0, 8000, 1);
        }
        if (i13 == 8) {
            return b("PCMA", 8, 8000, 1);
        }
        if (i13 == 10) {
            return b("L16", 10, 44100, 2);
        }
        if (i13 == 11) {
            return b("L16", 11, 44100, 1);
        }
        throw new IllegalStateException(a.a.d("Unsupported static paylod type ", i13));
    }

    public final c a() {
        b a13;
        try {
            if (((HashMap) this.f1281i).containsKey("rtpmap")) {
                String str = (String) ((HashMap) this.f1281i).get("rtpmap");
                int i13 = d7.n0.f53866a;
                a13 = b.a(str);
            } else {
                a13 = b.a(e(this.f1275c));
            }
            return new c(this, h1.c((HashMap) this.f1281i), a13);
        } catch (ParserException e13) {
            throw new IllegalStateException(e13);
        }
    }

    public final int c() {
        return ((StringBuilder) this.f1280h).length();
    }

    public final char d() {
        return this.f1273a.charAt(this.f1274b);
    }

    public final boolean f() {
        return this.f1274b < this.f1273a.length() - this.f1276d;
    }

    public final void g(int i13) {
        zm.d dVar = (zm.d) this.f1281i;
        if (dVar == null || i13 > dVar.f142167b) {
            zm.e eVar = (zm.e) this.f1277e;
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(this.f1278f);
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(this.f1279g);
            this.f1281i = zm.d.e(i13, eVar);
        }
    }

    public final void h(char c13) {
        ((StringBuilder) this.f1280h).append(c13);
    }

    public a(String str, int i13, String str2, int i14) {
        this.f1273a = str;
        this.f1274b = i13;
        this.f1277e = str2;
        this.f1275c = i14;
        this.f1281i = new HashMap();
        this.f1276d = -1;
    }
}
