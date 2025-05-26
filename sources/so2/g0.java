package so2;

import a.cb;
import kh2.j1;
import kh2.m2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class g0 {

    /* renamed from: a */
    public int f114789a;

    /* renamed from: b */
    public final bn0.a f114790b;

    /* renamed from: c */
    public String f114791c;

    /* renamed from: d */
    public final StringBuilder f114792d;

    /* renamed from: e */
    public final String f114793e;

    public g0(String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f114790b = new bn0.a(17);
        this.f114792d = new StringBuilder();
        this.f114793e = source;
    }

    public static /* synthetic */ void n(g0 g0Var, String str, int i13, String str2, int i14) {
        if ((i14 & 2) != 0) {
            i13 = g0Var.f114789a;
        }
        if ((i14 & 4) != 0) {
            str2 = "";
        }
        g0Var.m(i13, str, str2);
        throw null;
    }

    public final int a(int i13, String str) {
        int i14 = i13 + 4;
        if (i14 < str.length()) {
            this.f114792d.append((char) (p(i13 + 3, str) + (p(i13, str) << 12) + (p(i13 + 1, str) << 8) + (p(i13 + 2, str) << 4)));
            return i14;
        }
        this.f114789a = i13;
        if (i14 < str.length()) {
            return a(this.f114789a, str);
        }
        n(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public final boolean b() {
        int i13 = this.f114789a;
        if (i13 == -1) {
            return false;
        }
        while (true) {
            String str = this.f114793e;
            if (i13 >= str.length()) {
                this.f114789a = i13;
                return false;
            }
            char charAt = str.charAt(i13);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f114789a = i13;
                return !(charAt == '}' || charAt == ']' || charAt == ':' || charAt == ',');
            }
            i13++;
        }
    }

    public final void c(int i13, String str) {
        String str2 = this.f114793e;
        if (str2.length() - i13 < str.length()) {
            n(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i14 = 0; i14 < length; i14++) {
            if (str.charAt(i14) != (str2.charAt(i13 + i14) | ' ')) {
                n(this, "Expected valid boolean literal prefix, but had '" + j() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f114789a = str.length() + i13;
    }

    public final String d() {
        g('\"');
        int i13 = this.f114789a;
        String source = this.f114793e;
        int K = StringsKt.K(source, '\"', i13, false, 4);
        if (K == -1) {
            j();
            o((byte) 1, false);
            throw null;
        }
        int i14 = i13;
        while (i14 < K) {
            if (source.charAt(i14) == '\\') {
                int i15 = this.f114789a;
                Intrinsics.checkNotNullParameter(source, "source");
                char charAt = source.charAt(i14);
                boolean z13 = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        this.f114792d.append((CharSequence) source, i15, i14);
                        int t13 = t(i14 + 1);
                        if (t13 == -1) {
                            n(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int i16 = t13 + 1;
                        char charAt2 = source.charAt(t13);
                        if (charAt2 == 'u') {
                            i16 = a(i16, source);
                        } else {
                            char c13 = charAt2 < 'u' ? f.f114784a[charAt2] : (char) 0;
                            if (c13 == 0) {
                                n(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            this.f114792d.append(c13);
                        }
                        i15 = t(i16);
                        if (i15 == -1) {
                            n(this, "Unexpected EOF", i15, null, 4);
                            throw null;
                        }
                    } else {
                        i14++;
                        if (i14 >= source.length()) {
                            this.f114792d.append((CharSequence) source, i15, i14);
                            i15 = t(i14);
                            if (i15 == -1) {
                                n(this, "Unexpected EOF", i15, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = source.charAt(i14);
                        }
                    }
                    i14 = i15;
                    z13 = true;
                    charAt = source.charAt(i14);
                }
                String obj = !z13 ? source.subSequence(i15, i14).toString() : l(i15, i14);
                this.f114789a = i14 + 1;
                return obj;
            }
            i14++;
        }
        this.f114789a = K + 1;
        String substring = source.substring(i13, K);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final byte e() {
        byte p03;
        do {
            int i13 = this.f114789a;
            if (i13 == -1) {
                return (byte) 10;
            }
            String str = this.f114793e;
            if (i13 >= str.length()) {
                return (byte) 10;
            }
            int i14 = this.f114789a;
            this.f114789a = i14 + 1;
            p03 = m2.p0(str.charAt(i14));
        } while (p03 == 3);
        return p03;
    }

    public final byte f(byte b13) {
        byte e13 = e();
        if (e13 == b13) {
            return e13;
        }
        o(b13, true);
        throw null;
    }

    public final void g(char c13) {
        if (this.f114789a == -1) {
            y(c13);
            throw null;
        }
        while (true) {
            int i13 = this.f114789a;
            String str = this.f114793e;
            if (i13 >= str.length()) {
                this.f114789a = -1;
                y(c13);
                throw null;
            }
            int i14 = this.f114789a;
            this.f114789a = i14 + 1;
            char charAt = str.charAt(i14);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c13) {
                    return;
                }
                y(c13);
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f7, code lost:
    
        n(r19, "Unexpected symbol '" + r5 + "' in numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0110, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0117, code lost:
    
        if (r12 == r1) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0119, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011c, code lost:
    
        if (r1 == r12) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011e, code lost:
    
        if (r14 == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0122, code lost:
    
        if (r1 == (r12 - 1)) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x012a, code lost:
    
        if (r3 == false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012c, code lost:
    
        if (r2 == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0136, code lost:
    
        if (r18.charAt(r12) != '\"') goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0138, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013b, code lost:
    
        n(r19, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0143, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0144, code lost:
    
        n(r19, r17, 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014d, code lost:
    
        r19.f114789a = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014f, code lost:
    
        if (r13 == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0151, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0154, code lost:
    
        if (r16 != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0156, code lost:
    
        r3 = java.lang.Math.pow(10.0d, -r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0167, code lost:
    
        r1 = r1 * r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016c, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0172, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017a, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017c, code lost:
    
        r8 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017e, code lost:
    
        n(r19, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0197, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0198, code lost:
    
        n(r19, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0160, code lost:
    
        if (r16 != true) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0162, code lost:
    
        r3 = java.lang.Math.pow(10.0d, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a4, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a5, code lost:
    
        if (r14 == false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ac, code lost:
    
        if (r8 == Long.MIN_VALUE) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01af, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b0, code lost:
    
        n(r19, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b7, code lost:
    
        n(r19, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x011b, code lost:
    
        r2 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long h() {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.g0.h():long");
    }

    public final String i() {
        String str = this.f114791c;
        if (str == null) {
            return d();
        }
        Intrinsics.f(str);
        this.f114791c = null;
        return str;
    }

    public final String j() {
        String str = this.f114791c;
        if (str != null) {
            Intrinsics.f(str);
            this.f114791c = null;
            return str;
        }
        int u13 = u();
        String str2 = this.f114793e;
        if (u13 >= str2.length() || u13 == -1) {
            n(this, "EOF", u13, null, 4);
            throw null;
        }
        byte p03 = m2.p0(str2.charAt(u13));
        if (p03 == 1) {
            return i();
        }
        if (p03 != 0) {
            n(this, "Expected beginning of the string, but got " + str2.charAt(u13), 0, null, 6);
            throw null;
        }
        boolean z13 = false;
        while (m2.p0(str2.charAt(u13)) == 0) {
            u13++;
            if (u13 >= str2.length()) {
                this.f114792d.append((CharSequence) str2, this.f114789a, u13);
                int t13 = t(u13);
                if (t13 == -1) {
                    this.f114789a = u13;
                    return l(0, 0);
                }
                u13 = t13;
                z13 = true;
            }
        }
        String obj = !z13 ? str2.subSequence(this.f114789a, u13).toString() : l(this.f114789a, u13);
        this.f114789a = u13;
        return obj;
    }

    public final String k() {
        String j13 = j();
        if (Intrinsics.d(j13, "null")) {
            if (this.f114793e.charAt(this.f114789a - 1) != '\"') {
                n(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
                throw null;
            }
        }
        return j13;
    }

    public final String l(int i13, int i14) {
        this.f114792d.append((CharSequence) this.f114793e, i13, i14);
        String sb3 = this.f114792d.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        this.f114792d.setLength(0);
        return sb3;
    }

    public final void m(int i13, String message, String hint) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        String concat = hint.length() == 0 ? "" : "\n".concat(hint);
        StringBuilder D = ep.b.D(message, " at path: ");
        D.append(this.f114790b.c());
        D.append(concat);
        throw j1.i(i13, D.toString(), this.f114793e);
    }

    public final void o(byte b13, boolean z13) {
        String U1 = m2.U1(b13);
        int i13 = z13 ? this.f114789a - 1 : this.f114789a;
        int i14 = this.f114789a;
        String str = this.f114793e;
        n(this, a.a.m("Expected ", U1, ", but had '", (i14 == str.length() || i13 < 0) ? "EOF" : String.valueOf(str.charAt(i13)), "' instead"), i13, null, 4);
        throw null;
    }

    public final int p(int i13, String str) {
        char charAt = str.charAt(i13);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        n(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public final String q(String keyToMatch, boolean z13) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i13 = this.f114789a;
        try {
            if (e() != 6) {
                return null;
            }
            if (!Intrinsics.d(s(z13), keyToMatch)) {
                return null;
            }
            this.f114791c = null;
            if (e() != 5) {
                return null;
            }
            return s(z13);
        } finally {
            this.f114789a = i13;
            this.f114791c = null;
        }
    }

    public final byte r() {
        int i13 = this.f114789a;
        while (true) {
            int t13 = t(i13);
            if (t13 == -1) {
                this.f114789a = t13;
                return (byte) 10;
            }
            char charAt = this.f114793e.charAt(t13);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f114789a = t13;
                return m2.p0(charAt);
            }
            i13 = t13 + 1;
        }
    }

    public final String s(boolean z13) {
        String i13;
        byte r13 = r();
        String str = null;
        if (z13) {
            if (r13 == 1 || r13 == 0) {
                i13 = j();
                str = i13;
                this.f114791c = str;
            }
        } else if (r13 == 1) {
            i13 = i();
            str = i13;
            this.f114791c = str;
        }
        return str;
    }

    public final int t(int i13) {
        if (i13 < this.f114793e.length()) {
            return i13;
        }
        return -1;
    }

    public final int u() {
        char charAt;
        int i13 = this.f114789a;
        if (i13 == -1) {
            return i13;
        }
        while (true) {
            String str = this.f114793e;
            if (i13 >= str.length() || !((charAt = str.charAt(i13)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i13++;
        }
        this.f114789a = i13;
        return i13;
    }

    /* renamed from: v */
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("JsonReader(source='");
        sb3.append((Object) this.f114793e);
        sb3.append("', currentPosition=");
        return cb.l(sb3, this.f114789a, ')');
    }

    public final boolean w() {
        int u13 = u();
        String str = this.f114793e;
        if (u13 == str.length() || u13 == -1 || str.charAt(u13) != ',') {
            return false;
        }
        this.f114789a++;
        return true;
    }

    public final boolean x(boolean z13) {
        int t13 = t(u());
        String str = this.f114793e;
        int length = str.length() - t13;
        if (length < 4 || t13 == -1) {
            return false;
        }
        for (int i13 = 0; i13 < 4; i13++) {
            if ("null".charAt(i13) != str.charAt(t13 + i13)) {
                return false;
            }
        }
        if (length > 4 && m2.p0(str.charAt(t13 + 4)) == 0) {
            return false;
        }
        if (z13) {
            this.f114789a = t13 + 4;
        }
        return true;
    }

    public final void y(char c13) {
        int i13 = this.f114789a;
        if (i13 > 0 && c13 == '\"') {
            try {
                this.f114789a = i13 - 1;
                String j13 = j();
                this.f114789a = i13;
                if (Intrinsics.d(j13, "null")) {
                    m(this.f114789a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th3) {
                this.f114789a = i13;
                throw th3;
            }
        }
        o(m2.p0(c13), true);
        throw null;
    }
}
