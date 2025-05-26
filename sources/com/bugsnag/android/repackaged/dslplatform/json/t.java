package com.bugsnag.android.repackaged.dslplatform.json;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Formatter;
import org.chromium.net.NetError;

/* loaded from: classes3.dex */
public final class t {
    public static final p A;

    /* renamed from: y, reason: collision with root package name */
    public static final boolean[] f29566y;

    /* renamed from: z, reason: collision with root package name */
    public static final Charset f29567z;

    /* renamed from: a, reason: collision with root package name */
    public int f29568a;

    /* renamed from: b, reason: collision with root package name */
    public int f29569b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f29570c = 0;

    /* renamed from: d, reason: collision with root package name */
    public byte f29571d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f29572e;

    /* renamed from: f, reason: collision with root package name */
    public final char[] f29573f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f29574g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f29575h;

    /* renamed from: i, reason: collision with root package name */
    public char[] f29576i;

    /* renamed from: j, reason: collision with root package name */
    public InputStream f29577j;

    /* renamed from: k, reason: collision with root package name */
    public int f29578k;

    /* renamed from: l, reason: collision with root package name */
    public int f29579l;

    /* renamed from: m, reason: collision with root package name */
    public final l0.k f29580m;

    /* renamed from: n, reason: collision with root package name */
    public final l0.k f29581n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f29582o;

    /* renamed from: p, reason: collision with root package name */
    public final int f29583p;

    /* renamed from: q, reason: collision with root package name */
    public final q f29584q;

    /* renamed from: r, reason: collision with root package name */
    public final o f29585r;

    /* renamed from: s, reason: collision with root package name */
    public final int f29586s;

    /* renamed from: t, reason: collision with root package name */
    public final s f29587t;

    /* renamed from: u, reason: collision with root package name */
    public final int f29588u;

    /* renamed from: v, reason: collision with root package name */
    public final int f29589v;

    /* renamed from: w, reason: collision with root package name */
    public final StringBuilder f29590w;

    /* renamed from: x, reason: collision with root package name */
    public final Formatter f29591x;

    static {
        boolean[] zArr = new boolean[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        f29566y = zArr;
        f29567z = Charset.forName("UTF-8");
        zArr[137] = true;
        zArr[138] = true;
        zArr[139] = true;
        zArr[140] = true;
        zArr[141] = true;
        zArr[160] = true;
        zArr[32] = true;
        zArr[97] = true;
        zArr[98] = true;
        zArr[99] = true;
        A = new p();
    }

    public t(byte[] bArr, char[] cArr, l0.k kVar, q qVar, o oVar, s sVar, int i13, int i14) {
        StringBuilder sb3 = new StringBuilder(0);
        this.f29590w = sb3;
        this.f29591x = new Formatter(sb3);
        this.f29573f = cArr;
        this.f29575h = bArr;
        this.f29572e = 4096;
        int length = bArr.length - 38;
        this.f29579l = length;
        this.f29576i = cArr;
        this.f29580m = kVar;
        this.f29581n = null;
        this.f29584q = qVar;
        this.f29585r = oVar;
        this.f29587t = sVar;
        this.f29588u = i13;
        this.f29589v = i14;
        this.f29586s = oVar.level + 15;
        this.f29582o = bArr;
        this.f29583p = length;
        if (4096 > bArr.length) {
            throw new IllegalArgumentException("length can't be longer than buffer.length");
        }
        if (4096 < bArr.length) {
            bArr[4096] = 0;
        }
    }

    public final boolean a(int i13, int i14) {
        byte[] bArr = this.f29575h;
        while (i13 < i14) {
            if (!f29566y[bArr[i13] + 128]) {
                return false;
            }
            i13++;
        }
        return true;
    }

    public final void b() {
        if (this.f29571d != 93) {
            if (this.f29569b < this.f29572e) {
                throw f("Expecting ']' as array end");
            }
            throw h("Unexpected end of JSON in collection", 0, A);
        }
    }

    public final byte c() {
        o();
        if (f29566y[this.f29571d + 128]) {
            while (true) {
                byte b13 = this.f29571d;
                if (b13 != -96 && b13 != 32) {
                    switch (b13) {
                        case NetError.ERR_H2_OR_QUIC_REQUIRED /* -31 */:
                            int i13 = this.f29569b;
                            int i14 = i13 + 1;
                            if (i14 >= this.f29572e) {
                                break;
                            } else {
                                byte[] bArr = this.f29575h;
                                if (bArr[i13] == -102 && bArr[i14] == Byte.MIN_VALUE) {
                                    this.f29569b = i13 + 2;
                                    this.f29571d = (byte) 32;
                                    break;
                                }
                            }
                            break;
                        case NetError.ERR_BLOCKED_BY_CSP /* -30 */:
                            int i15 = this.f29569b;
                            int i16 = i15 + 1;
                            if (i16 >= this.f29572e) {
                                break;
                            } else {
                                byte[] bArr2 = this.f29575h;
                                byte b14 = bArr2[i15];
                                byte b15 = bArr2[i16];
                                if (b14 != -127 || b15 != -97) {
                                    if (b14 != Byte.MIN_VALUE) {
                                        break;
                                    } else {
                                        if (b15 != -88 && b15 != -87 && b15 != -81) {
                                            switch (b15) {
                                            }
                                        }
                                        this.f29569b = i15 + 2;
                                        this.f29571d = (byte) 32;
                                        break;
                                    }
                                } else {
                                    this.f29569b = i15 + 2;
                                    this.f29571d = (byte) 32;
                                    break;
                                }
                            }
                            break;
                        case NetError.ERR_CLEARTEXT_NOT_PERMITTED /* -29 */:
                            int i17 = this.f29569b;
                            int i18 = i17 + 1;
                            if (i18 >= this.f29572e) {
                                break;
                            } else {
                                byte[] bArr3 = this.f29575h;
                                if (bArr3[i17] == Byte.MIN_VALUE && bArr3[i18] == Byte.MIN_VALUE) {
                                    this.f29569b = i17 + 2;
                                    this.f29571d = (byte) 32;
                                    break;
                                }
                            }
                            break;
                        default:
                            switch (b13) {
                            }
                    }
                }
                o();
            }
        }
        return this.f29571d;
    }

    public final int d(byte b13) {
        if (b13 >= 48 && b13 <= 57) {
            return b13 - 48;
        }
        if (b13 >= 65 && b13 <= 70) {
            return b13 - 55;
        }
        if (b13 < 97 || b13 > 102) {
            throw i(Byte.valueOf(b13), "Could not parse unicode escape, expected a hexadecimal digit");
        }
        return b13 - 87;
    }

    public final boolean e() {
        return this.f29577j == null ? this.f29572e == this.f29569b : this.f29572e == this.f29569b && n() == 0;
    }

    public final ParsingException f(String str) {
        q qVar = q.MINIMAL;
        q qVar2 = this.f29584q;
        if (qVar2 == qVar) {
            return ParsingException.a(str, false);
        }
        StringBuilder sb3 = this.f29590w;
        sb3.setLength(0);
        sb3.append(str);
        sb3.append(". Found ");
        sb3.append((char) this.f29571d);
        if (qVar2 == q.DESCRIPTION_ONLY) {
            return ParsingException.a(sb3.toString(), false);
        }
        sb3.append(" ");
        l(0, sb3);
        return ParsingException.a(sb3.toString(), w());
    }

    public final ParsingException g(int i13, String str) {
        q qVar = q.MINIMAL;
        q qVar2 = this.f29584q;
        if (qVar2 == qVar || qVar2 == q.DESCRIPTION_ONLY) {
            return ParsingException.a(str, false);
        }
        StringBuilder sb3 = this.f29590w;
        sb3.setLength(0);
        sb3.append(str);
        sb3.append(" ");
        l(i13, sb3);
        return ParsingException.a(sb3.toString(), w());
    }

    public final ParsingException h(String str, int i13, Exception exc) {
        if (exc == null) {
            throw new IllegalArgumentException("cause can't be null");
        }
        q qVar = q.MINIMAL;
        q qVar2 = this.f29584q;
        if (qVar2 == qVar) {
            int i14 = ParsingException.f29478a;
            return new x(str, exc);
        }
        StringBuilder sb3 = this.f29590w;
        sb3.setLength(0);
        String message = exc.getMessage();
        if (message != null && message.length() > 0) {
            sb3.append(message);
            if (!message.endsWith(".")) {
                sb3.append(".");
            }
            sb3.append(" ");
        }
        sb3.append(str);
        if (qVar2 == q.DESCRIPTION_ONLY) {
            String sb4 = sb3.toString();
            int i15 = ParsingException.f29478a;
            return new x(sb4, exc);
        }
        sb3.append(" ");
        l(i13, sb3);
        return ParsingException.a(sb3.toString(), w());
    }

    public final ParsingException i(Number number, String str) {
        return j(str, 0, str, number, "");
    }

    public final ParsingException j(String str, int i13, String str2, Object obj, String str3) {
        q qVar = q.MINIMAL;
        q qVar2 = this.f29584q;
        if (qVar2 == qVar) {
            return ParsingException.a(str, false);
        }
        StringBuilder sb3 = this.f29590w;
        sb3.setLength(0);
        sb3.append("");
        sb3.append(str2);
        if (obj != null) {
            sb3.append(": '");
            sb3.append(obj.toString());
            sb3.append("'");
        }
        sb3.append(str3);
        if (qVar2 == q.DESCRIPTION_ONLY) {
            return ParsingException.a(sb3.toString(), false);
        }
        sb3.append(" ");
        l(i13, sb3);
        return ParsingException.a(sb3.toString(), w());
    }

    public final int k() {
        int i13 = this.f29569b;
        byte b13 = 34;
        if (this.f29571d != 34) {
            throw f("Expecting '\"' for string start");
        }
        int i14 = this.f29572e;
        if (i13 == i14) {
            throw g(0, "Premature end of JSON string");
        }
        char[] cArr = this.f29576i;
        int i15 = i14 - i13;
        if (cArr.length < i15) {
            i15 = cArr.length;
        }
        int i16 = i13;
        int i17 = 0;
        while (true) {
            if (i17 >= i15) {
                break;
            }
            int i18 = i16 + 1;
            byte b14 = this.f29575h[i16];
            if (b14 == 34) {
                this.f29569b = i18;
                return i17;
            }
            if ((b14 ^ 92) < 1) {
                i16 = i18;
                break;
            }
            cArr[i17] = (char) b14;
            i17++;
            i16 = i18;
        }
        int length = cArr.length;
        int i19 = this.f29589v;
        if (i17 == length) {
            char[] cArr2 = this.f29576i;
            int length2 = cArr2.length * 2;
            if (length2 > i19) {
                throw i(Integer.valueOf(i19), "Maximum string buffer limit exceeded");
            }
            cArr = Arrays.copyOf(cArr2, length2);
            this.f29576i = cArr;
        }
        int length3 = cArr.length;
        int i23 = i16 - 1;
        this.f29569b = i23;
        int i24 = i23 - i13;
        while (!e()) {
            int o13 = o();
            if (o13 == b13) {
                return i24;
            }
            if (o13 == 92) {
                if (i24 >= length3 - 6) {
                    char[] cArr3 = this.f29576i;
                    int length4 = cArr3.length * 2;
                    if (length4 > i19) {
                        throw i(Integer.valueOf(i19), "Maximum string buffer limit exceeded");
                    }
                    cArr = Arrays.copyOf(cArr3, length4);
                    this.f29576i = cArr;
                    length3 = cArr.length;
                }
                byte[] bArr = this.f29575h;
                int i25 = this.f29569b;
                int i26 = i25 + 1;
                this.f29569b = i26;
                byte b15 = bArr[i25];
                if (b15 == b13 || b15 == 47 || b15 == 92) {
                    o13 = b15;
                } else if (b15 == 98) {
                    o13 = 8;
                } else if (b15 == 102) {
                    o13 = 12;
                } else if (b15 == 110) {
                    o13 = 10;
                } else if (b15 == 114) {
                    o13 = 13;
                } else if (b15 == 116) {
                    o13 = 9;
                } else {
                    if (b15 != 117) {
                        throw i(Integer.valueOf(b15), "Invalid escape combination detected");
                    }
                    this.f29569b = i25 + 2;
                    int d2 = d(bArr[i26]) << 12;
                    byte[] bArr2 = this.f29575h;
                    int i27 = this.f29569b;
                    this.f29569b = i27 + 1;
                    int d13 = d2 + (d(bArr2[i27]) << 8);
                    byte[] bArr3 = this.f29575h;
                    int i28 = this.f29569b;
                    this.f29569b = i28 + 1;
                    int d14 = d13 + (d(bArr3[i28]) << 4);
                    byte[] bArr4 = this.f29575h;
                    int i29 = this.f29569b;
                    this.f29569b = i29 + 1;
                    o13 = d14 + d(bArr4[i29]);
                }
            } else if ((o13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
                if (i24 >= length3 - 4) {
                    char[] cArr4 = this.f29576i;
                    int length5 = cArr4.length * 2;
                    if (length5 > i19) {
                        throw i(Integer.valueOf(i19), "Maximum string buffer limit exceeded");
                    }
                    char[] copyOf = Arrays.copyOf(cArr4, length5);
                    this.f29576i = copyOf;
                    cArr = copyOf;
                    length3 = copyOf.length;
                }
                byte[] bArr5 = this.f29575h;
                int i33 = this.f29569b;
                int i34 = i33 + 1;
                this.f29569b = i34;
                byte b16 = bArr5[i33];
                if ((o13 & RecyclerViewTypes.VIEW_TYPE_FIXED_HEIGHT_PIN_GRID_CELL) == 192) {
                    o13 = ((o13 & 31) << 6) + (b16 & 63);
                } else {
                    int i35 = i33 + 2;
                    this.f29569b = i35;
                    byte b17 = bArr5[i34];
                    if ((o13 & RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM) == 224) {
                        o13 = ((o13 & 15) << 12) + ((b16 & 63) << 6) + (b17 & 63);
                    } else {
                        this.f29569b = i33 + 3;
                        byte b18 = bArr5[i35];
                        if ((o13 & RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER) != 240) {
                            throw g(0, "Invalid unicode character detected");
                        }
                        o13 = ((o13 & 7) << 18) + ((b16 & 63) << 12) + ((b17 & 63) << 6) + (b18 & 63);
                        if (o13 >= 65536) {
                            if (o13 >= 1114112) {
                                throw g(0, "Invalid unicode character detected");
                            }
                            int i36 = o13 - 65536;
                            int i37 = i24 + 1;
                            cArr[i24] = (char) ((i36 >>> 10) + 55296);
                            i24 += 2;
                            cArr[i37] = (char) ((i36 & 1023) + 56320);
                            b13 = 34;
                        }
                    }
                }
            } else if (i24 >= length3) {
                char[] cArr5 = this.f29576i;
                int length6 = cArr5.length * 2;
                if (length6 > i19) {
                    throw i(Integer.valueOf(i19), "Maximum string buffer limit exceeded");
                }
                char[] copyOf2 = Arrays.copyOf(cArr5, length6);
                this.f29576i = copyOf2;
                cArr = copyOf2;
                length3 = copyOf2.length;
            }
            cArr[i24] = (char) o13;
            i24++;
            b13 = 34;
        }
        throw g(0, "JSON string was not closed with a double quote");
    }

    public final void l(int i13, StringBuilder sb3) {
        sb3.append("at position: ");
        sb3.append((this.f29570c + this.f29569b) - i13);
        int i14 = this.f29569b;
        Charset charset = f29567z;
        if (i14 > i13) {
            try {
                int min = Math.min(i14 - i13, 20);
                String str = new String(this.f29575h, (this.f29569b - i13) - min, min, charset);
                sb3.append(", following: `");
                sb3.append(str);
                sb3.append('`');
            } catch (Exception unused) {
            }
        }
        int i15 = this.f29569b;
        int i16 = i15 - i13;
        int i17 = this.f29578k;
        if (i16 < i17) {
            try {
                String str2 = new String(this.f29575h, this.f29569b - i13, Math.min((i17 - i15) + i13, 20), charset);
                sb3.append(", before: `");
                sb3.append(str2);
                sb3.append('`');
            } catch (Exception unused2) {
            }
        }
    }

    public final char[] m(int i13, int i14) {
        char[] cArr;
        if (i14 > this.f29588u) {
            throw j("Too many digits detected in number", i14, "Too many digits detected in number", Integer.valueOf(i14), "");
        }
        while (true) {
            cArr = this.f29576i;
            if (cArr.length >= i14) {
                break;
            }
            this.f29576i = Arrays.copyOf(cArr, cArr.length * 2);
        }
        byte[] bArr = this.f29575h;
        for (int i15 = 0; i15 < i14; i15++) {
            cArr[i15] = (char) bArr[i13 + i15];
        }
        return cArr;
    }

    public final int n() {
        int read;
        int i13 = this.f29572e;
        int i14 = this.f29569b;
        int i15 = i13 - i14;
        byte[] bArr = this.f29575h;
        System.arraycopy(bArr, i14, bArr, 0, i15);
        byte[] bArr2 = this.f29575h;
        InputStream inputStream = this.f29577j;
        int i16 = i15;
        while (i16 < bArr2.length && (read = inputStream.read(bArr2, i16, bArr2.length - i16)) != -1) {
            i16 += read;
        }
        long j13 = this.f29570c;
        int i17 = this.f29569b;
        this.f29570c = j13 + i17;
        if (i16 == i15) {
            int i18 = this.f29572e - i17;
            this.f29578k = i18;
            this.f29572e = i18;
            this.f29569b = 0;
        } else {
            int i19 = this.f29579l;
            if (i16 < i19) {
                i19 = i16;
            }
            this.f29578k = i19;
            this.f29572e = i16;
            this.f29569b = 0;
        }
        return i16;
    }

    public final byte o() {
        if (this.f29577j != null && this.f29569b > this.f29578k) {
            n();
        }
        int i13 = this.f29569b;
        if (i13 < this.f29572e) {
            byte[] bArr = this.f29575h;
            this.f29569b = i13 + 1;
            byte b13 = bArr[i13];
            this.f29571d = b13;
            return b13;
        }
        boolean w13 = w();
        p pVar = A;
        if (w13) {
            throw new ParsingException("Unexpected end of JSON input", pVar);
        }
        int i14 = ParsingException.f29478a;
        throw new x("Unexpected end of JSON input", pVar);
    }

    public final String p() {
        int k13 = k();
        l0.k kVar = this.f29580m;
        String n13 = kVar != null ? kVar.n(this.f29576i, k13) : new String(this.f29576i, 0, k13);
        if (c() != 58) {
            throw f("Expecting ':' after attribute name");
        }
        c();
        return n13;
    }

    public final char[] q() {
        char[] cArr;
        if (this.f29571d != 34) {
            throw f("Expecting '\"' for string start");
        }
        int i13 = this.f29569b;
        this.f29568a = i13;
        int i14 = 0;
        while (true) {
            try {
                cArr = this.f29573f;
                if (i14 >= cArr.length) {
                    break;
                }
                int i15 = i13 + 1;
                byte b13 = this.f29575h[i13];
                if (b13 == 34) {
                    i13 = i15;
                    break;
                }
                cArr[i14] = (char) b13;
                i14++;
                i13 = i15;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw g(0, "JSON string was not closed with a double quote");
            }
        }
        if (i13 > this.f29572e) {
            throw g(0, "JSON string was not closed with a double quote");
        }
        this.f29569b = i13;
        return cArr;
    }

    public final String r() {
        int k13 = k();
        l0.k kVar = this.f29581n;
        return kVar == null ? new String(this.f29576i, 0, k13) : kVar.n(this.f29576i, k13);
    }

    public final int s() {
        int i13 = this.f29569b;
        this.f29568a = i13 - 1;
        byte b13 = this.f29571d;
        int i14 = 1;
        while (i13 < this.f29572e) {
            int i15 = i13 + 1;
            b13 = this.f29575h[i13];
            if (b13 == 44 || b13 == 125 || b13 == 93) {
                break;
            }
            i14++;
            i13 = i15;
        }
        this.f29569b = (i14 - 1) + this.f29569b;
        this.f29571d = b13;
        return this.f29568a;
    }

    public final boolean t() {
        if (this.f29571d != 102) {
            return false;
        }
        int i13 = this.f29569b;
        if (i13 + 3 < this.f29572e) {
            byte[] bArr = this.f29575h;
            if (bArr[i13] == 97 && bArr[i13 + 1] == 108 && bArr[i13 + 2] == 115 && bArr[i13 + 3] == 101) {
                this.f29569b = i13 + 4;
                this.f29571d = (byte) 101;
                return true;
            }
        }
        throw g(0, "Invalid false constant found");
    }

    public final String toString() {
        return new String(this.f29575h, 0, this.f29572e, f29567z);
    }

    public final boolean u() {
        if (this.f29571d != 110) {
            return false;
        }
        int i13 = this.f29569b;
        if (i13 + 2 < this.f29572e) {
            byte[] bArr = this.f29575h;
            if (bArr[i13] == 117 && bArr[i13 + 1] == 108 && bArr[i13 + 2] == 108) {
                this.f29569b = i13 + 3;
                this.f29571d = (byte) 108;
                return true;
            }
        }
        throw g(0, "Invalid null constant found");
    }

    public final boolean v() {
        if (this.f29571d != 116) {
            return false;
        }
        int i13 = this.f29569b;
        if (i13 + 2 < this.f29572e) {
            byte[] bArr = this.f29575h;
            if (bArr[i13] == 114 && bArr[i13 + 1] == 117 && bArr[i13 + 2] == 101) {
                this.f29569b = i13 + 3;
                this.f29571d = (byte) 101;
                return true;
            }
        }
        throw g(0, "Invalid true constant found");
    }

    public final boolean w() {
        return this.f29584q == q.WITH_STACK_TRACE;
    }
}
