package oe2;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import java.io.EOFException;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class w extends v {

    /* renamed from: k, reason: collision with root package name */
    public static final wo2.m f94385k;

    /* renamed from: l, reason: collision with root package name */
    public static final wo2.m f94386l;

    /* renamed from: m, reason: collision with root package name */
    public static final wo2.m f94387m;

    /* renamed from: e, reason: collision with root package name */
    public final wo2.l f94388e;

    /* renamed from: f, reason: collision with root package name */
    public final wo2.j f94389f;

    /* renamed from: g, reason: collision with root package name */
    public int f94390g;

    /* renamed from: h, reason: collision with root package name */
    public long f94391h;

    /* renamed from: i, reason: collision with root package name */
    public int f94392i;

    /* renamed from: j, reason: collision with root package name */
    public String f94393j;

    static {
        wo2.m mVar = wo2.m.f130712d;
        f94385k = m60.f0.h0("'\\");
        f94386l = m60.f0.h0("\"\\");
        f94387m = m60.f0.h0("{}[]:, \n\t\r\f/\\;#=");
        m60.f0.h0("\n\r");
        m60.f0.h0("*/");
    }

    public w(wo2.l lVar) {
        this.f94382b = new int[32];
        this.f94383c = new String[32];
        this.f94384d = new int[32];
        this.f94390g = 0;
        this.f94388e = lVar;
        this.f94389f = lVar.l();
        h(6);
    }

    public final int A(String str, mc2.k kVar) {
        int length = ((String[]) kVar.f86944a).length;
        for (int i13 = 0; i13 < length; i13++) {
            if (str.equals(((String[]) kVar.f86944a)[i13])) {
                this.f94390g = 0;
                int[] iArr = this.f94384d;
                int i14 = this.f94381a - 1;
                iArr[i14] = iArr[i14] + 1;
                return i13;
            }
        }
        return -1;
    }

    @Override // oe2.v
    public final void B1() {
        int i13 = this.f94390g;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 == 7) {
            this.f94390g = 0;
            int[] iArr = this.f94384d;
            int i14 = this.f94381a - 1;
            iArr[i14] = iArr[i14] + 1;
            return;
        }
        throw new JsonDataException("Expected null but was " + g() + " at path " + f());
    }

    @Override // oe2.v
    public final void E() {
        int i13 = 0;
        do {
            int i14 = this.f94390g;
            if (i14 == 0) {
                i14 = w();
            }
            if (i14 == 3) {
                h(1);
            } else if (i14 == 1) {
                h(3);
            } else {
                if (i14 == 4) {
                    i13--;
                    if (i13 < 0) {
                        throw new JsonDataException("Expected a value but was " + g() + " at path " + f());
                    }
                    this.f94381a--;
                } else if (i14 == 2) {
                    i13--;
                    if (i13 < 0) {
                        throw new JsonDataException("Expected a value but was " + g() + " at path " + f());
                    }
                    this.f94381a--;
                } else {
                    wo2.j jVar = this.f94389f;
                    if (i14 == 14 || i14 == 10) {
                        long L0 = this.f94388e.L0(f94387m);
                        if (L0 == -1) {
                            L0 = jVar.f130711b;
                        }
                        jVar.skip(L0);
                    } else if (i14 == 9 || i14 == 13) {
                        P(f94386l);
                    } else if (i14 == 8 || i14 == 12) {
                        P(f94385k);
                    } else if (i14 == 17) {
                        jVar.skip(this.f94392i);
                    } else if (i14 == 18) {
                        throw new JsonDataException("Expected a value but was " + g() + " at path " + f());
                    }
                }
                this.f94390g = 0;
            }
            i13++;
            this.f94390g = 0;
        } while (i13 != 0);
        int[] iArr = this.f94384d;
        int i15 = this.f94381a - 1;
        iArr[i15] = iArr[i15] + 1;
        this.f94383c[i15] = "null";
    }

    public final boolean J(int i13) {
        if (i13 == 9 || i13 == 10 || i13 == 12 || i13 == 13 || i13 == 32) {
            return false;
        }
        if (i13 != 35) {
            if (i13 == 44) {
                return false;
            }
            if (i13 != 47 && i13 != 61) {
                if (i13 == 123 || i13 == 125 || i13 == 58) {
                    return false;
                }
                if (i13 != 59) {
                    switch (i13) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        q();
        throw null;
    }

    public final int K(boolean z13) {
        int i13 = 0;
        while (true) {
            int i14 = i13 + 1;
            wo2.l lVar = this.f94388e;
            if (!lVar.request(i14)) {
                if (z13) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j13 = i13;
            wo2.j jVar = this.f94389f;
            byte k13 = jVar.k(j13);
            if (k13 != 10 && k13 != 32 && k13 != 13 && k13 != 9) {
                jVar.skip(j13);
                if (k13 == 47) {
                    if (!lVar.request(2L)) {
                        return k13;
                    }
                    q();
                    throw null;
                }
                if (k13 != 35) {
                    return k13;
                }
                q();
                throw null;
            }
            i13 = i14;
        }
    }

    public final String L(wo2.m mVar) {
        StringBuilder sb3 = null;
        while (true) {
            long L0 = this.f94388e.L0(mVar);
            if (L0 == -1) {
                o("Unterminated string");
                throw null;
            }
            wo2.j jVar = this.f94389f;
            if (jVar.k(L0) != 92) {
                if (sb3 == null) {
                    String L = jVar.L(L0, Charsets.UTF_8);
                    jVar.readByte();
                    return L;
                }
                sb3.append(jVar.L(L0, Charsets.UTF_8));
                jVar.readByte();
                return sb3.toString();
            }
            if (sb3 == null) {
                sb3 = new StringBuilder();
            }
            sb3.append(jVar.L(L0, Charsets.UTF_8));
            jVar.readByte();
            sb3.append(O());
        }
    }

    public final String M() {
        long L0 = this.f94388e.L0(f94387m);
        wo2.j jVar = this.f94389f;
        if (L0 == -1) {
            return jVar.M();
        }
        jVar.getClass();
        return jVar.L(L0, Charsets.UTF_8);
    }

    public final char O() {
        int i13;
        wo2.l lVar = this.f94388e;
        if (!lVar.request(1L)) {
            o("Unterminated escape sequence");
            throw null;
        }
        wo2.j jVar = this.f94389f;
        byte readByte = jVar.readByte();
        if (readByte == 10 || readByte == 34 || readByte == 39 || readByte == 47 || readByte == 92) {
            return (char) readByte;
        }
        if (readByte == 98) {
            return '\b';
        }
        if (readByte == 102) {
            return '\f';
        }
        if (readByte == 110) {
            return '\n';
        }
        if (readByte == 114) {
            return '\r';
        }
        if (readByte == 116) {
            return '\t';
        }
        if (readByte != 117) {
            o("Invalid escape sequence: \\" + ((char) readByte));
            throw null;
        }
        if (!lVar.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + f());
        }
        char c13 = 0;
        for (int i14 = 0; i14 < 4; i14++) {
            byte k13 = jVar.k(i14);
            char c14 = (char) (c13 << 4);
            if (k13 >= 48 && k13 <= 57) {
                i13 = k13 - 48;
            } else if (k13 >= 97 && k13 <= 102) {
                i13 = k13 - 87;
            } else {
                if (k13 < 65 || k13 > 70) {
                    o("\\u".concat(jVar.L(4L, Charsets.UTF_8)));
                    throw null;
                }
                i13 = k13 - 55;
            }
            c13 = (char) (i13 + c14);
        }
        jVar.skip(4L);
        return c13;
    }

    public final void P(wo2.m mVar) {
        while (true) {
            long L0 = this.f94388e.L0(mVar);
            if (L0 == -1) {
                o("Unterminated string");
                throw null;
            }
            wo2.j jVar = this.f94389f;
            if (jVar.k(L0) != 92) {
                jVar.skip(L0 + 1);
                return;
            } else {
                jVar.skip(L0 + 1);
                O();
            }
        }
    }

    @Override // oe2.v
    public final String Y0() {
        String L;
        int i13 = this.f94390g;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 == 10) {
            L = M();
        } else if (i13 == 9) {
            L = L(f94386l);
        } else if (i13 == 8) {
            L = L(f94385k);
        } else if (i13 == 11) {
            L = this.f94393j;
            this.f94393j = null;
        } else if (i13 == 16) {
            L = Long.toString(this.f94391h);
        } else {
            if (i13 != 17) {
                throw new JsonDataException("Expected a string but was " + g() + " at path " + f());
            }
            long j13 = this.f94392i;
            wo2.j jVar = this.f94389f;
            jVar.getClass();
            L = jVar.L(j13, Charsets.UTF_8);
        }
        this.f94390g = 0;
        int[] iArr = this.f94384d;
        int i14 = this.f94381a - 1;
        iArr[i14] = iArr[i14] + 1;
        return L;
    }

    @Override // oe2.v
    public final void a() {
        int i13 = this.f94390g;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 == 3) {
            h(1);
            this.f94384d[this.f94381a - 1] = 0;
            this.f94390g = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + g() + " at path " + f());
        }
    }

    @Override // oe2.v
    public final void c() {
        int i13 = this.f94390g;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 == 1) {
            h(3);
            this.f94390g = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + g() + " at path " + f());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f94390g = 0;
        this.f94382b[0] = 8;
        this.f94381a = 1;
        this.f94389f.a();
        this.f94388e.close();
    }

    @Override // oe2.v
    public final void d() {
        int i13 = this.f94390g;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + g() + " at path " + f());
        }
        int i14 = this.f94381a;
        this.f94381a = i14 - 1;
        int[] iArr = this.f94384d;
        int i15 = i14 - 2;
        iArr[i15] = iArr[i15] + 1;
        this.f94390g = 0;
    }

    @Override // oe2.v
    public final void e() {
        int i13 = this.f94390g;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + g() + " at path " + f());
        }
        int i14 = this.f94381a;
        int i15 = i14 - 1;
        this.f94381a = i15;
        this.f94383c[i15] = null;
        int[] iArr = this.f94384d;
        int i16 = i14 - 2;
        iArr[i16] = iArr[i16] + 1;
        this.f94390g = 0;
    }

    @Override // oe2.v
    public final u g() {
        int i13 = this.f94390g;
        if (i13 == 0) {
            i13 = w();
        }
        switch (i13) {
            case 1:
                return u.BEGIN_OBJECT;
            case 2:
                return u.END_OBJECT;
            case 3:
                return u.BEGIN_ARRAY;
            case 4:
                return u.END_ARRAY;
            case 5:
            case 6:
                return u.BOOLEAN;
            case 7:
                return u.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return u.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return u.NAME;
            case 16:
            case 17:
                return u.NUMBER;
            case 18:
                return u.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // oe2.v
    public final boolean hasNext() {
        int i13 = this.f94390g;
        if (i13 == 0) {
            i13 = w();
        }
        return (i13 == 2 || i13 == 4 || i13 == 18) ? false : true;
    }

    @Override // oe2.v
    public final int k(mc2.k kVar) {
        int i13 = this.f94390g;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 < 12 || i13 > 15) {
            return -1;
        }
        if (i13 == 15) {
            return z(this.f94393j, kVar);
        }
        int j03 = this.f94388e.j0((wo2.v) kVar.f86945b);
        if (j03 != -1) {
            this.f94390g = 0;
            this.f94383c[this.f94381a - 1] = ((String[]) kVar.f86944a)[j03];
            return j03;
        }
        String str = this.f94383c[this.f94381a - 1];
        String k03 = k0();
        int z13 = z(k03, kVar);
        if (z13 == -1) {
            this.f94390g = 15;
            this.f94393j = k03;
            this.f94383c[this.f94381a - 1] = str;
        }
        return z13;
    }

    public final String k0() {
        String str;
        int i13 = this.f94390g;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 == 14) {
            str = M();
        } else if (i13 == 13) {
            str = L(f94386l);
        } else if (i13 == 12) {
            str = L(f94385k);
        } else {
            if (i13 != 15) {
                throw new JsonDataException("Expected a name but was " + g() + " at path " + f());
            }
            str = this.f94393j;
            this.f94393j = null;
        }
        this.f94390g = 0;
        this.f94383c[this.f94381a - 1] = str;
        return str;
    }

    @Override // oe2.v
    public final void m() {
        int i13 = this.f94390g;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 == 14) {
            long L0 = this.f94388e.L0(f94387m);
            wo2.j jVar = this.f94389f;
            if (L0 == -1) {
                L0 = jVar.f130711b;
            }
            jVar.skip(L0);
        } else if (i13 == 13) {
            P(f94386l);
        } else if (i13 == 12) {
            P(f94385k);
        } else if (i13 != 15) {
            throw new JsonDataException("Expected a name but was " + g() + " at path " + f());
        }
        this.f94390g = 0;
        this.f94383c[this.f94381a - 1] = "null";
    }

    @Override // oe2.v
    public final int o0() {
        int i13 = this.f94390g;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 == 16) {
            long j13 = this.f94391h;
            int i14 = (int) j13;
            if (j13 == i14) {
                this.f94390g = 0;
                int[] iArr = this.f94384d;
                int i15 = this.f94381a - 1;
                iArr[i15] = iArr[i15] + 1;
                return i14;
            }
            throw new JsonDataException("Expected an int but was " + this.f94391h + " at path " + f());
        }
        if (i13 == 17) {
            long j14 = this.f94392i;
            wo2.j jVar = this.f94389f;
            jVar.getClass();
            this.f94393j = jVar.L(j14, Charsets.UTF_8);
        } else if (i13 == 9 || i13 == 8) {
            String L = i13 == 9 ? L(f94386l) : L(f94385k);
            this.f94393j = L;
            try {
                int parseInt = Integer.parseInt(L);
                this.f94390g = 0;
                int[] iArr2 = this.f94384d;
                int i16 = this.f94381a - 1;
                iArr2[i16] = iArr2[i16] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i13 != 11) {
            throw new JsonDataException("Expected an int but was " + g() + " at path " + f());
        }
        this.f94390g = 11;
        try {
            double parseDouble = Double.parseDouble(this.f94393j);
            int i17 = (int) parseDouble;
            if (i17 != parseDouble) {
                throw new JsonDataException("Expected an int but was " + this.f94393j + " at path " + f());
            }
            this.f94393j = null;
            this.f94390g = 0;
            int[] iArr3 = this.f94384d;
            int i18 = this.f94381a - 1;
            iArr3[i18] = iArr3[i18] + 1;
            return i17;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f94393j + " at path " + f());
        }
    }

    public final void q() {
        o("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // oe2.v
    public final double s1() {
        int i13 = this.f94390g;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 == 16) {
            this.f94390g = 0;
            int[] iArr = this.f94384d;
            int i14 = this.f94381a - 1;
            iArr[i14] = iArr[i14] + 1;
            return this.f94391h;
        }
        if (i13 == 17) {
            long j13 = this.f94392i;
            wo2.j jVar = this.f94389f;
            jVar.getClass();
            this.f94393j = jVar.L(j13, Charsets.UTF_8);
        } else if (i13 == 9) {
            this.f94393j = L(f94386l);
        } else if (i13 == 8) {
            this.f94393j = L(f94385k);
        } else if (i13 == 10) {
            this.f94393j = M();
        } else if (i13 != 11) {
            throw new JsonDataException("Expected a double but was " + g() + " at path " + f());
        }
        this.f94390g = 11;
        try {
            double parseDouble = Double.parseDouble(this.f94393j);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + f());
            }
            this.f94393j = null;
            this.f94390g = 0;
            int[] iArr2 = this.f94384d;
            int i15 = this.f94381a - 1;
            iArr2[i15] = iArr2[i15] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f94393j + " at path " + f());
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f94388e + ")";
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c0, code lost:
    
        if (r4 == 2) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c3, code lost:
    
        if (r4 == 4) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c6, code lost:
    
        if (r4 != 7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c8, code lost:
    
        r21.f94392i = r8;
        r9 = 17;
        r21.f94390g = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019b, code lost:
    
        if (J(r1) != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019d, code lost:
    
        if (r4 != 2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019f, code lost:
    
        if (r9 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a5, code lost:
    
        if (r10 != Long.MIN_VALUE) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a7, code lost:
    
        if (r13 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ad, code lost:
    
        if (r10 != 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01af, code lost:
    
        if (r13 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b1, code lost:
    
        if (r13 == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b4, code lost:
    
        r10 = -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b5, code lost:
    
        r21.f94391h = r10;
        r7.skip(r8);
        r9 = 16;
        r21.f94390g = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int w() {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oe2.w.w():int");
    }

    public final int z(String str, mc2.k kVar) {
        int length = ((String[]) kVar.f86944a).length;
        for (int i13 = 0; i13 < length; i13++) {
            if (str.equals(((String[]) kVar.f86944a)[i13])) {
                this.f94390g = 0;
                this.f94383c[this.f94381a - 1] = str;
                return i13;
            }
        }
        return -1;
    }
}
