package ic;

import java.io.EOFException;
import kotlin.text.Charsets;
import m60.f0;
import wo2.j;
import wo2.l;
import wo2.m;
import wo2.v;
import wo2.y;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: l, reason: collision with root package name */
    public static final m f72053l;

    /* renamed from: m, reason: collision with root package name */
    public static final m f72054m;

    /* renamed from: n, reason: collision with root package name */
    public static final m f72055n;

    /* renamed from: f, reason: collision with root package name */
    public final l f72056f;

    /* renamed from: g, reason: collision with root package name */
    public final j f72057g;

    /* renamed from: h, reason: collision with root package name */
    public int f72058h;

    /* renamed from: i, reason: collision with root package name */
    public long f72059i;

    /* renamed from: j, reason: collision with root package name */
    public int f72060j;

    /* renamed from: k, reason: collision with root package name */
    public String f72061k;

    static {
        m mVar = m.f130712d;
        f72053l = f0.h0("'\\");
        f72054m = f0.h0("\"\\");
        f72055n = f0.h0("{}[]:, \n\t\r\f/\\;#=");
        f0.h0("\n\r");
        f0.h0("*/");
    }

    public e(y yVar) {
        this.f72050b = new int[32];
        this.f72051c = new String[32];
        this.f72052d = new int[32];
        this.f72058h = 0;
        this.f72056f = yVar;
        this.f72057g = yVar.f130750b;
        h(6);
    }

    public final boolean A(int i13) {
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

    @Override // ic.d
    public final void E() {
        int i13 = 0;
        do {
            int i14 = this.f72058h;
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
                        throw new a("Expected a value but was " + g() + " at path " + f());
                    }
                    this.f72049a--;
                } else if (i14 == 2) {
                    i13--;
                    if (i13 < 0) {
                        throw new a("Expected a value but was " + g() + " at path " + f());
                    }
                    this.f72049a--;
                } else if (i14 == 14 || i14 == 10) {
                    P();
                } else if (i14 == 9 || i14 == 13) {
                    O(f72054m);
                } else if (i14 == 8 || i14 == 12) {
                    O(f72053l);
                } else if (i14 == 17) {
                    this.f72057g.skip(this.f72060j);
                } else if (i14 == 18) {
                    throw new a("Expected a value but was " + g() + " at path " + f());
                }
                this.f72058h = 0;
            }
            i13++;
            this.f72058h = 0;
        } while (i13 != 0);
        int[] iArr = this.f72052d;
        int i15 = this.f72049a;
        int i16 = i15 - 1;
        iArr[i16] = iArr[i16] + 1;
        this.f72051c[i15 - 1] = "null";
    }

    public final int J(boolean z13) {
        int i13 = 0;
        while (true) {
            int i14 = i13 + 1;
            l lVar = this.f72056f;
            if (!lVar.request(i14)) {
                if (z13) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j13 = i13;
            j jVar = this.f72057g;
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

    public final String K(m mVar) {
        StringBuilder sb3 = null;
        while (true) {
            long L0 = this.f72056f.L0(mVar);
            if (L0 == -1) {
                o("Unterminated string");
                throw null;
            }
            j jVar = this.f72057g;
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
            sb3.append(M());
        }
    }

    public final String L() {
        long L0 = this.f72056f.L0(f72055n);
        j jVar = this.f72057g;
        if (L0 == -1) {
            return jVar.M();
        }
        jVar.getClass();
        return jVar.L(L0, Charsets.UTF_8);
    }

    public final char M() {
        int i13;
        l lVar = this.f72056f;
        if (!lVar.request(1L)) {
            o("Unterminated escape sequence");
            throw null;
        }
        j jVar = this.f72057g;
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

    public final void O(m mVar) {
        while (true) {
            long L0 = this.f72056f.L0(mVar);
            if (L0 == -1) {
                o("Unterminated string");
                throw null;
            }
            j jVar = this.f72057g;
            if (jVar.k(L0) != 92) {
                jVar.skip(L0 + 1);
                return;
            } else {
                jVar.skip(L0 + 1);
                M();
            }
        }
    }

    public final void P() {
        long L0 = this.f72056f.L0(f72055n);
        j jVar = this.f72057g;
        if (L0 == -1) {
            L0 = jVar.f130711b;
        }
        jVar.skip(L0);
    }

    @Override // ic.d
    public final boolean R0() {
        int i13 = this.f72058h;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 == 5) {
            this.f72058h = 0;
            int[] iArr = this.f72052d;
            int i14 = this.f72049a - 1;
            iArr[i14] = iArr[i14] + 1;
            return true;
        }
        if (i13 == 6) {
            this.f72058h = 0;
            int[] iArr2 = this.f72052d;
            int i15 = this.f72049a - 1;
            iArr2[i15] = iArr2[i15] + 1;
            return false;
        }
        throw new a("Expected a boolean but was " + g() + " at path " + f());
    }

    @Override // ic.d
    public final String Y0() {
        String L;
        int i13 = this.f72058h;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 == 10) {
            L = L();
        } else if (i13 == 9) {
            L = K(f72054m);
        } else if (i13 == 8) {
            L = K(f72053l);
        } else if (i13 == 11) {
            L = this.f72061k;
            this.f72061k = null;
        } else if (i13 == 16) {
            L = Long.toString(this.f72059i);
        } else {
            if (i13 != 17) {
                throw new a("Expected a string but was " + g() + " at path " + f());
            }
            long j13 = this.f72060j;
            j jVar = this.f72057g;
            jVar.getClass();
            L = jVar.L(j13, Charsets.UTF_8);
        }
        this.f72058h = 0;
        int[] iArr = this.f72052d;
        int i14 = this.f72049a - 1;
        iArr[i14] = iArr[i14] + 1;
        return L;
    }

    @Override // ic.d
    public final void a() {
        int i13 = this.f72058h;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 == 3) {
            h(1);
            this.f72052d[this.f72049a - 1] = 0;
            this.f72058h = 0;
        } else {
            throw new a("Expected BEGIN_ARRAY but was " + g() + " at path " + f());
        }
    }

    @Override // ic.d
    public final void c() {
        int i13 = this.f72058h;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 == 1) {
            h(3);
            this.f72058h = 0;
        } else {
            throw new a("Expected BEGIN_OBJECT but was " + g() + " at path " + f());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f72058h = 0;
        this.f72050b[0] = 8;
        this.f72049a = 1;
        this.f72057g.a();
        this.f72056f.close();
    }

    @Override // ic.d
    public final void d() {
        int i13 = this.f72058h;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 != 4) {
            throw new a("Expected END_ARRAY but was " + g() + " at path " + f());
        }
        int i14 = this.f72049a;
        this.f72049a = i14 - 1;
        int[] iArr = this.f72052d;
        int i15 = i14 - 2;
        iArr[i15] = iArr[i15] + 1;
        this.f72058h = 0;
    }

    @Override // ic.d
    public final void e() {
        int i13 = this.f72058h;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 != 2) {
            throw new a("Expected END_OBJECT but was " + g() + " at path " + f());
        }
        int i14 = this.f72049a;
        int i15 = i14 - 1;
        this.f72049a = i15;
        this.f72051c[i15] = null;
        int[] iArr = this.f72052d;
        int i16 = i14 - 2;
        iArr[i16] = iArr[i16] + 1;
        this.f72058h = 0;
    }

    @Override // ic.d
    public final c g() {
        int i13 = this.f72058h;
        if (i13 == 0) {
            i13 = w();
        }
        switch (i13) {
            case 1:
                return c.BEGIN_OBJECT;
            case 2:
                return c.END_OBJECT;
            case 3:
                return c.BEGIN_ARRAY;
            case 4:
                return c.END_ARRAY;
            case 5:
            case 6:
                return c.BOOLEAN;
            case 7:
                return c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return c.NAME;
            case 16:
            case 17:
                return c.NUMBER;
            case 18:
                return c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // ic.d
    public final boolean hasNext() {
        int i13 = this.f72058h;
        if (i13 == 0) {
            i13 = w();
        }
        return (i13 == 2 || i13 == 4 || i13 == 18) ? false : true;
    }

    @Override // ic.d
    public final int k(tb.c cVar) {
        int i13 = this.f72058h;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 < 12 || i13 > 15) {
            return -1;
        }
        if (i13 == 15) {
            return z(cVar, this.f72061k);
        }
        int j03 = this.f72056f.j0((v) cVar.f116960b);
        if (j03 != -1) {
            this.f72058h = 0;
            this.f72051c[this.f72049a - 1] = ((String[]) cVar.f116959a)[j03];
            return j03;
        }
        String str = this.f72051c[this.f72049a - 1];
        String k03 = k0();
        int z13 = z(cVar, k03);
        if (z13 == -1) {
            this.f72058h = 15;
            this.f72061k = k03;
            this.f72051c[this.f72049a - 1] = str;
        }
        return z13;
    }

    public final String k0() {
        String str;
        int i13 = this.f72058h;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 == 14) {
            str = L();
        } else if (i13 == 13) {
            str = K(f72054m);
        } else if (i13 == 12) {
            str = K(f72053l);
        } else {
            if (i13 != 15) {
                throw new a("Expected a name but was " + g() + " at path " + f());
            }
            str = this.f72061k;
        }
        this.f72058h = 0;
        this.f72051c[this.f72049a - 1] = str;
        return str;
    }

    @Override // ic.d
    public final void m() {
        int i13 = this.f72058h;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 == 14) {
            P();
        } else if (i13 == 13) {
            O(f72054m);
        } else if (i13 == 12) {
            O(f72053l);
        } else if (i13 != 15) {
            throw new a("Expected a name but was " + g() + " at path " + f());
        }
        this.f72058h = 0;
        this.f72051c[this.f72049a - 1] = "null";
    }

    @Override // ic.d
    public final int o0() {
        int i13 = this.f72058h;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 == 16) {
            long j13 = this.f72059i;
            int i14 = (int) j13;
            if (j13 == i14) {
                this.f72058h = 0;
                int[] iArr = this.f72052d;
                int i15 = this.f72049a - 1;
                iArr[i15] = iArr[i15] + 1;
                return i14;
            }
            throw new a("Expected an int but was " + this.f72059i + " at path " + f());
        }
        if (i13 == 17) {
            long j14 = this.f72060j;
            j jVar = this.f72057g;
            jVar.getClass();
            this.f72061k = jVar.L(j14, Charsets.UTF_8);
        } else if (i13 == 9 || i13 == 8) {
            String K = i13 == 9 ? K(f72054m) : K(f72053l);
            this.f72061k = K;
            try {
                int parseInt = Integer.parseInt(K);
                this.f72058h = 0;
                int[] iArr2 = this.f72052d;
                int i16 = this.f72049a - 1;
                iArr2[i16] = iArr2[i16] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i13 != 11) {
            throw new a("Expected an int but was " + g() + " at path " + f());
        }
        this.f72058h = 11;
        try {
            double parseDouble = Double.parseDouble(this.f72061k);
            int i17 = (int) parseDouble;
            if (i17 != parseDouble) {
                throw new a("Expected an int but was " + this.f72061k + " at path " + f());
            }
            this.f72061k = null;
            this.f72058h = 0;
            int[] iArr3 = this.f72052d;
            int i18 = this.f72049a - 1;
            iArr3[i18] = iArr3[i18] + 1;
            return i17;
        } catch (NumberFormatException unused2) {
            throw new a("Expected an int but was " + this.f72061k + " at path " + f());
        }
    }

    public final void q() {
        o("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    @Override // ic.d
    public final double s1() {
        int i13 = this.f72058h;
        if (i13 == 0) {
            i13 = w();
        }
        if (i13 == 16) {
            this.f72058h = 0;
            int[] iArr = this.f72052d;
            int i14 = this.f72049a - 1;
            iArr[i14] = iArr[i14] + 1;
            return this.f72059i;
        }
        if (i13 == 17) {
            long j13 = this.f72060j;
            j jVar = this.f72057g;
            jVar.getClass();
            this.f72061k = jVar.L(j13, Charsets.UTF_8);
        } else if (i13 == 9) {
            this.f72061k = K(f72054m);
        } else if (i13 == 8) {
            this.f72061k = K(f72053l);
        } else if (i13 == 10) {
            this.f72061k = L();
        } else if (i13 != 11) {
            throw new a("Expected a double but was " + g() + " at path " + f());
        }
        this.f72058h = 11;
        try {
            double parseDouble = Double.parseDouble(this.f72061k);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new b("JSON forbids NaN and infinities: " + parseDouble + " at path " + f());
            }
            this.f72061k = null;
            this.f72058h = 0;
            int[] iArr2 = this.f72052d;
            int i15 = this.f72049a - 1;
            iArr2[i15] = iArr2[i15] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new a("Expected a double but was " + this.f72061k + " at path " + f());
        }
    }

    public final String toString() {
        return "JsonReader(" + this.f72056f + ")";
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b2, code lost:
    
        r21.f72059i = r10;
        r9.skip(r5);
        r1 = 16;
        r21.f72058h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bc, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01bf, code lost:
    
        if (r4 == 2) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c2, code lost:
    
        if (r4 == 4) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c5, code lost:
    
        if (r4 != 7) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c7, code lost:
    
        r21.f72060j = r5;
        r1 = 17;
        r21.f72058h = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0198, code lost:
    
        if (A(r1) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019a, code lost:
    
        if (r4 != 2) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x019c, code lost:
    
        if (r8 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a2, code lost:
    
        if (r10 != Long.MIN_VALUE) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a4, code lost:
    
        if (r13 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01aa, code lost:
    
        if (r10 != 0) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ac, code lost:
    
        if (r13 != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ae, code lost:
    
        if (r13 == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b1, code lost:
    
        r10 = -r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int w() {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ic.e.w():int");
    }

    public final int z(tb.c cVar, String str) {
        int length = ((String[]) cVar.f116959a).length;
        for (int i13 = 0; i13 < length; i13++) {
            if (str.equals(((String[]) cVar.f116959a)[i13])) {
                this.f72058h = 0;
                this.f72051c[this.f72049a - 1] = str;
                return i13;
            }
        }
        return -1;
    }
}
