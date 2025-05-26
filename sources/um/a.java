package um;

import a.cb;
import com.facebook.login.z;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import kh2.k3;
import n60.o;
import nm.b0;

/* loaded from: classes.dex */
public class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Reader f122651a;

    /* renamed from: i, reason: collision with root package name */
    public long f122659i;

    /* renamed from: j, reason: collision with root package name */
    public int f122660j;

    /* renamed from: k, reason: collision with root package name */
    public String f122661k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f122662l;

    /* renamed from: n, reason: collision with root package name */
    public String[] f122664n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f122665o;

    /* renamed from: b, reason: collision with root package name */
    public b0 f122652b = b0.LEGACY_STRICT;

    /* renamed from: c, reason: collision with root package name */
    public final char[] f122653c = new char[1024];

    /* renamed from: d, reason: collision with root package name */
    public int f122654d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f122655e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f122656f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f122657g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f122658h = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f122663m = 1;

    static {
        z.f30091b = new z();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f122662l = iArr;
        iArr[0] = 6;
        this.f122664n = new String[32];
        this.f122665o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f122651a = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        r11.f122654d = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.f122654d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A(char r12) {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.f122654d
            int r3 = r11.f122655e
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 1
            r6 = 16
            char[] r7 = r11.f122653c
            if (r2 >= r4) goto L6c
            int r8 = r2 + 1
            char r2 = r7[r2]
            nm.b0 r9 = r11.f122652b
            nm.b0 r10 = nm.b0.STRICT
            if (r9 != r10) goto L24
            r9 = 32
            if (r2 < r9) goto L1e
            goto L24
        L1e:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.W(r12)
            throw r0
        L24:
            if (r2 != r12) goto L3a
            r11.f122654d = r8
            int r8 = r8 - r3
            int r8 = r8 - r5
            if (r1 != 0) goto L32
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7, r3, r8)
            return r12
        L32:
            r1.append(r7, r3, r8)
            java.lang.String r12 = r1.toString()
            return r12
        L3a:
            r9 = 92
            if (r2 != r9) goto L5f
            r11.f122654d = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L50
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r6)
            r1.<init>(r4)
        L50:
            r1.append(r7, r3, r2)
            char r2 = r11.M()
            r1.append(r2)
            int r2 = r11.f122654d
            int r3 = r11.f122655e
            goto L6
        L5f:
            r6 = 10
            if (r2 != r6) goto L6a
            int r2 = r11.f122656f
            int r2 = r2 + r5
            r11.f122656f = r2
            r11.f122657g = r8
        L6a:
            r2 = r8
            goto L8
        L6c:
            if (r1 != 0) goto L7c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r6)
            r4.<init>(r1)
            r1 = r4
        L7c:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.f122654d = r2
            boolean r2 = r11.h(r5)
            if (r2 == 0) goto L8b
            goto L2
        L8b:
            java.lang.String r12 = "Unterminated string"
            r11.W(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: um.a.A(char):java.lang.String");
    }

    public void B1() {
        int i13 = this.f122658h;
        if (i13 == 0) {
            i13 = e();
        }
        if (i13 != 7) {
            throw a0("null");
        }
        this.f122658h = 0;
        int[] iArr = this.f122665o;
        int i14 = this.f122663m - 1;
        iArr[i14] = iArr[i14] + 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void E() {
        int i13 = 0;
        do {
            int i14 = this.f122658h;
            if (i14 == 0) {
                i14 = e();
            }
            switch (i14) {
                case 1:
                    L(3);
                    i13++;
                    this.f122658h = 0;
                    break;
                case 2:
                    if (i13 == 0) {
                        this.f122664n[this.f122663m - 1] = null;
                    }
                    this.f122663m--;
                    i13--;
                    this.f122658h = 0;
                    break;
                case 3:
                    L(1);
                    i13++;
                    this.f122658h = 0;
                    break;
                case 4:
                    this.f122663m--;
                    i13--;
                    this.f122658h = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f122658h = 0;
                    break;
                case 8:
                    P('\'');
                    this.f122658h = 0;
                    break;
                case 9:
                    P('\"');
                    this.f122658h = 0;
                    break;
                case 10:
                    U();
                    this.f122658h = 0;
                    break;
                case 12:
                    P('\'');
                    if (i13 == 0) {
                        this.f122664n[this.f122663m - 1] = "<skipped>";
                    }
                    this.f122658h = 0;
                    break;
                case 13:
                    P('\"');
                    if (i13 == 0) {
                        this.f122664n[this.f122663m - 1] = "<skipped>";
                    }
                    this.f122658h = 0;
                    break;
                case 14:
                    U();
                    if (i13 == 0) {
                        this.f122664n[this.f122663m - 1] = "<skipped>";
                    }
                    this.f122658h = 0;
                    break;
                case 16:
                    this.f122654d += this.f122660j;
                    this.f122658h = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i13 > 0);
        int[] iArr = this.f122665o;
        int i15 = this.f122663m - 1;
        iArr[i15] = iArr[i15] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        d();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String J() {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f122654d
            int r4 = r3 + r2
            int r5 = r7.f122655e
            char[] r6 = r7.f122653c
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.d()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.h(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f122654d
            r0.append(r6, r3, r2)
            int r3 = r7.f122654d
            int r3 = r3 + r2
            r7.f122654d = r3
            r2 = 1
            boolean r2 = r7.h(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f122654d
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f122654d
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f122654d
            int r2 = r2 + r1
            r7.f122654d = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: um.a.J():java.lang.String");
    }

    public b K() {
        int i13 = this.f122658h;
        if (i13 == 0) {
            i13 = e();
        }
        switch (i13) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void L(int i13) {
        int i14 = this.f122663m;
        int[] iArr = this.f122662l;
        if (i14 == iArr.length) {
            int i15 = i14 * 2;
            this.f122662l = Arrays.copyOf(iArr, i15);
            this.f122665o = Arrays.copyOf(this.f122665o, i15);
            this.f122664n = (String[]) Arrays.copyOf(this.f122664n, i15);
        }
        int[] iArr2 = this.f122662l;
        int i16 = this.f122663m;
        this.f122663m = i16 + 1;
        iArr2[i16] = i13;
    }

    public final char M() {
        int i13;
        if (this.f122654d == this.f122655e && !h(1)) {
            W("Unterminated escape sequence");
            throw null;
        }
        int i14 = this.f122654d;
        int i15 = i14 + 1;
        this.f122654d = i15;
        char[] cArr = this.f122653c;
        char c13 = cArr[i14];
        if (c13 != '\n') {
            if (c13 != '\"') {
                if (c13 != '\'') {
                    if (c13 != '/' && c13 != '\\') {
                        if (c13 == 'b') {
                            return '\b';
                        }
                        if (c13 == 'f') {
                            return '\f';
                        }
                        if (c13 == 'n') {
                            return '\n';
                        }
                        if (c13 == 'r') {
                            return '\r';
                        }
                        if (c13 == 't') {
                            return '\t';
                        }
                        if (c13 != 'u') {
                            W("Invalid escape sequence");
                            throw null;
                        }
                        if (i14 + 5 > this.f122655e && !h(4)) {
                            W("Unterminated escape sequence");
                            throw null;
                        }
                        int i16 = this.f122654d;
                        int i17 = i16 + 4;
                        int i18 = 0;
                        while (i16 < i17) {
                            char c14 = cArr[i16];
                            int i19 = i18 << 4;
                            if (c14 >= '0' && c14 <= '9') {
                                i13 = c14 - '0';
                            } else if (c14 >= 'a' && c14 <= 'f') {
                                i13 = c14 - 'W';
                            } else {
                                if (c14 < 'A' || c14 > 'F') {
                                    W("Malformed Unicode escape \\u".concat(new String(cArr, this.f122654d, 4)));
                                    throw null;
                                }
                                i13 = c14 - '7';
                            }
                            i18 = i13 + i19;
                            i16++;
                        }
                        this.f122654d += 4;
                        return (char) i18;
                    }
                }
            }
            return c13;
        }
        if (this.f122652b == b0.STRICT) {
            W("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f122656f++;
        this.f122657g = i15;
        if (this.f122652b == b0.STRICT) {
            W("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c13;
    }

    public final void O(b0 b0Var) {
        Objects.requireNonNull(b0Var);
        this.f122652b = b0Var;
    }

    public final void P(char c13) {
        do {
            int i13 = this.f122654d;
            int i14 = this.f122655e;
            while (i13 < i14) {
                int i15 = i13 + 1;
                char c14 = this.f122653c[i13];
                if (c14 == c13) {
                    this.f122654d = i15;
                    return;
                }
                if (c14 == '\\') {
                    this.f122654d = i15;
                    M();
                    i13 = this.f122654d;
                    i14 = this.f122655e;
                } else {
                    if (c14 == '\n') {
                        this.f122656f++;
                        this.f122657g = i15;
                    }
                    i13 = i15;
                }
            }
            this.f122654d = i13;
        } while (h(1));
        W("Unterminated string");
        throw null;
    }

    public final boolean Q() {
        while (true) {
            if (this.f122654d + 2 > this.f122655e && !h(2)) {
                return false;
            }
            int i13 = this.f122654d;
            char[] cArr = this.f122653c;
            if (cArr[i13] != '\n') {
                for (int i14 = 0; i14 < 2; i14++) {
                    if (cArr[this.f122654d + i14] != "*/".charAt(i14)) {
                        break;
                    }
                }
                return true;
            }
            this.f122656f++;
            this.f122657g = i13 + 1;
            this.f122654d++;
        }
    }

    public boolean R0() {
        int i13 = this.f122658h;
        if (i13 == 0) {
            i13 = e();
        }
        if (i13 == 5) {
            this.f122658h = 0;
            int[] iArr = this.f122665o;
            int i14 = this.f122663m - 1;
            iArr[i14] = iArr[i14] + 1;
            return true;
        }
        if (i13 != 6) {
            throw a0("a boolean");
        }
        this.f122658h = 0;
        int[] iArr2 = this.f122665o;
        int i15 = this.f122663m - 1;
        iArr2[i15] = iArr2[i15] + 1;
        return false;
    }

    public final void S() {
        char c13;
        do {
            if (this.f122654d >= this.f122655e && !h(1)) {
                return;
            }
            int i13 = this.f122654d;
            int i14 = i13 + 1;
            this.f122654d = i14;
            c13 = this.f122653c[i13];
            if (c13 == '\n') {
                this.f122656f++;
                this.f122657g = i14;
                return;
            }
        } while (c13 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        d();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f122654d
            int r2 = r1 + r0
            int r3 = r4.f122655e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f122653c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.d()
        L4b:
            int r1 = r4.f122654d
            int r1 = r1 + r0
            r4.f122654d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f122654d = r1
            r0 = 1
            boolean r0 = r4.h(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: um.a.U():void");
    }

    public final void W(String str) {
        StringBuilder i13 = o.i(str);
        i13.append(w());
        i13.append("\nSee ");
        i13.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new MalformedJsonException(i13.toString());
    }

    public long W1() {
        int i13 = this.f122658h;
        if (i13 == 0) {
            i13 = e();
        }
        if (i13 == 15) {
            this.f122658h = 0;
            int[] iArr = this.f122665o;
            int i14 = this.f122663m - 1;
            iArr[i14] = iArr[i14] + 1;
            return this.f122659i;
        }
        if (i13 == 16) {
            this.f122661k = new String(this.f122653c, this.f122654d, this.f122660j);
            this.f122654d += this.f122660j;
        } else {
            if (i13 != 8 && i13 != 9 && i13 != 10) {
                throw a0("a long");
            }
            if (i13 == 10) {
                this.f122661k = J();
            } else {
                this.f122661k = A(i13 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f122661k);
                this.f122658h = 0;
                int[] iArr2 = this.f122665o;
                int i15 = this.f122663m - 1;
                iArr2[i15] = iArr2[i15] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f122658h = 11;
        double parseDouble = Double.parseDouble(this.f122661k);
        long j13 = (long) parseDouble;
        if (j13 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f122661k + w());
        }
        this.f122661k = null;
        this.f122658h = 0;
        int[] iArr3 = this.f122665o;
        int i16 = this.f122663m - 1;
        iArr3[i16] = iArr3[i16] + 1;
        return j13;
    }

    public String Y0() {
        String str;
        int i13 = this.f122658h;
        if (i13 == 0) {
            i13 = e();
        }
        if (i13 == 10) {
            str = J();
        } else if (i13 == 8) {
            str = A('\'');
        } else if (i13 == 9) {
            str = A('\"');
        } else if (i13 == 11) {
            str = this.f122661k;
            this.f122661k = null;
        } else if (i13 == 15) {
            str = Long.toString(this.f122659i);
        } else {
            if (i13 != 16) {
                throw a0("a string");
            }
            str = new String(this.f122653c, this.f122654d, this.f122660j);
            this.f122654d += this.f122660j;
        }
        this.f122658h = 0;
        int[] iArr = this.f122665o;
        int i14 = this.f122663m - 1;
        iArr[i14] = iArr[i14] + 1;
        return str;
    }

    public void a() {
        int i13 = this.f122658h;
        if (i13 == 0) {
            i13 = e();
        }
        if (i13 != 3) {
            throw a0("BEGIN_ARRAY");
        }
        L(1);
        this.f122665o[this.f122663m - 1] = 0;
        this.f122658h = 0;
    }

    public final IllegalStateException a0(String str) {
        String str2 = K() == b.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder o13 = cb.o("Expected ", str, " but was ");
        o13.append(K());
        o13.append(w());
        o13.append("\nSee ");
        o13.append(k3.L(str2));
        return new IllegalStateException(o13.toString());
    }

    public void c() {
        int i13 = this.f122658h;
        if (i13 == 0) {
            i13 = e();
        }
        if (i13 != 1) {
            throw a0("BEGIN_OBJECT");
        }
        L(3);
        this.f122658h = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f122658h = 0;
        this.f122662l[0] = 8;
        this.f122663m = 1;
        this.f122651a.close();
    }

    public final void d() {
        if (this.f122652b == b0.LENIENT) {
            return;
        }
        W("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0222, code lost:
    
        if (q(r1) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a7, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0225, code lost:
    
        if (r5 != 2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0227, code lost:
    
        if (r14 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x022d, code lost:
    
        if (r9 != Long.MIN_VALUE) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x022f, code lost:
    
        if (r16 == 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0236, code lost:
    
        if (r9 != 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0238, code lost:
    
        if (r16 != 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x023a, code lost:
    
        if (r16 == 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x023d, code lost:
    
        r9 = -r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x023e, code lost:
    
        r20.f122659i = r9;
        r20.f122654d += r8;
        r9 = 15;
        r20.f122658h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0232, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x024a, code lost:
    
        if (r5 == r1) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x024d, code lost:
    
        if (r5 == 4) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0250, code lost:
    
        if (r5 != 7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0252, code lost:
    
        r20.f122660j = r8;
        r9 = 16;
        r20.f122658h = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e() {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: um.a.e():int");
    }

    public void f() {
        int i13 = this.f122658h;
        if (i13 == 0) {
            i13 = e();
        }
        if (i13 != 4) {
            throw a0("END_ARRAY");
        }
        int i14 = this.f122663m;
        this.f122663m = i14 - 1;
        int[] iArr = this.f122665o;
        int i15 = i14 - 2;
        iArr[i15] = iArr[i15] + 1;
        this.f122658h = 0;
    }

    public void g() {
        int i13 = this.f122658h;
        if (i13 == 0) {
            i13 = e();
        }
        if (i13 != 2) {
            throw a0("END_OBJECT");
        }
        int i14 = this.f122663m;
        int i15 = i14 - 1;
        this.f122663m = i15;
        this.f122664n[i15] = null;
        int[] iArr = this.f122665o;
        int i16 = i14 - 2;
        iArr[i16] = iArr[i16] + 1;
        this.f122658h = 0;
    }

    public final boolean h(int i13) {
        int i14;
        int i15;
        int i16 = this.f122657g;
        int i17 = this.f122654d;
        this.f122657g = i16 - i17;
        int i18 = this.f122655e;
        char[] cArr = this.f122653c;
        if (i18 != i17) {
            int i19 = i18 - i17;
            this.f122655e = i19;
            System.arraycopy(cArr, i17, cArr, 0, i19);
        } else {
            this.f122655e = 0;
        }
        this.f122654d = 0;
        do {
            int i23 = this.f122655e;
            int read = this.f122651a.read(cArr, i23, cArr.length - i23);
            if (read == -1) {
                return false;
            }
            i14 = this.f122655e + read;
            this.f122655e = i14;
            if (this.f122656f == 0 && (i15 = this.f122657g) == 0 && i14 > 0 && cArr[0] == 65279) {
                this.f122654d++;
                this.f122657g = i15 + 1;
                i13++;
            }
        } while (i14 < i13);
        return true;
    }

    public boolean hasNext() {
        int i13 = this.f122658h;
        if (i13 == 0) {
            i13 = e();
        }
        return (i13 == 2 || i13 == 4 || i13 == 17) ? false : true;
    }

    public String k() {
        return m(false);
    }

    public String k0() {
        String A;
        int i13 = this.f122658h;
        if (i13 == 0) {
            i13 = e();
        }
        if (i13 == 14) {
            A = J();
        } else if (i13 == 12) {
            A = A('\'');
        } else {
            if (i13 != 13) {
                throw a0("a name");
            }
            A = A('\"');
        }
        this.f122658h = 0;
        this.f122664n[this.f122663m - 1] = A;
        return A;
    }

    public final String m(boolean z13) {
        StringBuilder sb3 = new StringBuilder("$");
        int i13 = 0;
        while (true) {
            int i14 = this.f122663m;
            if (i13 >= i14) {
                return sb3.toString();
            }
            int i15 = this.f122662l[i13];
            switch (i15) {
                case 1:
                case 2:
                    int i16 = this.f122665o[i13];
                    if (z13 && i16 > 0 && i13 == i14 - 1) {
                        i16--;
                    }
                    sb3.append('[');
                    sb3.append(i16);
                    sb3.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb3.append('.');
                    String str = this.f122664n[i13];
                    if (str == null) {
                        break;
                    } else {
                        sb3.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(a.a.d("Unknown scope value: ", i15));
            }
            i13++;
        }
    }

    public String o() {
        return m(true);
    }

    public int o0() {
        int i13 = this.f122658h;
        if (i13 == 0) {
            i13 = e();
        }
        if (i13 == 15) {
            long j13 = this.f122659i;
            int i14 = (int) j13;
            if (j13 != i14) {
                throw new NumberFormatException("Expected an int but was " + this.f122659i + w());
            }
            this.f122658h = 0;
            int[] iArr = this.f122665o;
            int i15 = this.f122663m - 1;
            iArr[i15] = iArr[i15] + 1;
            return i14;
        }
        if (i13 == 16) {
            this.f122661k = new String(this.f122653c, this.f122654d, this.f122660j);
            this.f122654d += this.f122660j;
        } else {
            if (i13 != 8 && i13 != 9 && i13 != 10) {
                throw a0("an int");
            }
            if (i13 == 10) {
                this.f122661k = J();
            } else {
                this.f122661k = A(i13 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f122661k);
                this.f122658h = 0;
                int[] iArr2 = this.f122665o;
                int i16 = this.f122663m - 1;
                iArr2[i16] = iArr2[i16] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f122658h = 11;
        double parseDouble = Double.parseDouble(this.f122661k);
        int i17 = (int) parseDouble;
        if (i17 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f122661k + w());
        }
        this.f122661k = null;
        this.f122658h = 0;
        int[] iArr3 = this.f122665o;
        int i18 = this.f122663m - 1;
        iArr3[i18] = iArr3[i18] + 1;
        return i17;
    }

    public final boolean q(char c13) {
        if (c13 == '\t' || c13 == '\n' || c13 == '\f' || c13 == '\r' || c13 == ' ') {
            return false;
        }
        if (c13 != '#') {
            if (c13 == ',') {
                return false;
            }
            if (c13 != '/' && c13 != '=') {
                if (c13 == '{' || c13 == '}' || c13 == ':') {
                    return false;
                }
                if (c13 != ';') {
                    switch (c13) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        d();
        return false;
    }

    public double s1() {
        int i13 = this.f122658h;
        if (i13 == 0) {
            i13 = e();
        }
        if (i13 == 15) {
            this.f122658h = 0;
            int[] iArr = this.f122665o;
            int i14 = this.f122663m - 1;
            iArr[i14] = iArr[i14] + 1;
            return this.f122659i;
        }
        if (i13 == 16) {
            this.f122661k = new String(this.f122653c, this.f122654d, this.f122660j);
            this.f122654d += this.f122660j;
        } else if (i13 == 8 || i13 == 9) {
            this.f122661k = A(i13 == 8 ? '\'' : '\"');
        } else if (i13 == 10) {
            this.f122661k = J();
        } else if (i13 != 11) {
            throw a0("a double");
        }
        this.f122658h = 11;
        double parseDouble = Double.parseDouble(this.f122661k);
        if (this.f122652b != b0.LENIENT && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            W("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.f122661k = null;
        this.f122658h = 0;
        int[] iArr2 = this.f122665o;
        int i15 = this.f122663m - 1;
        iArr2[i15] = iArr2[i15] + 1;
        return parseDouble;
    }

    public String toString() {
        return getClass().getSimpleName() + w();
    }

    final String w() {
        StringBuilder t13 = a.a.t(" at line ", this.f122656f + 1, " column ", (this.f122654d - this.f122657g) + 1, " path ");
        t13.append(k());
        return t13.toString();
    }

    public final int z(boolean z13) {
        int i13 = this.f122654d;
        int i14 = this.f122655e;
        while (true) {
            if (i13 == i14) {
                this.f122654d = i13;
                if (!h(1)) {
                    if (!z13) {
                        return -1;
                    }
                    throw new EOFException("End of input" + w());
                }
                i13 = this.f122654d;
                i14 = this.f122655e;
            }
            int i15 = i13 + 1;
            char[] cArr = this.f122653c;
            char c13 = cArr[i13];
            if (c13 == '\n') {
                this.f122656f++;
                this.f122657g = i15;
            } else if (c13 != ' ' && c13 != '\r' && c13 != '\t') {
                if (c13 == '/') {
                    this.f122654d = i15;
                    if (i15 == i14) {
                        this.f122654d = i13;
                        boolean h10 = h(2);
                        this.f122654d++;
                        if (!h10) {
                            return c13;
                        }
                    }
                    d();
                    int i16 = this.f122654d;
                    char c14 = cArr[i16];
                    if (c14 == '*') {
                        this.f122654d = i16 + 1;
                        if (!Q()) {
                            W("Unterminated comment");
                            throw null;
                        }
                        i13 = this.f122654d + 2;
                        i14 = this.f122655e;
                    } else {
                        if (c14 != '/') {
                            return c13;
                        }
                        this.f122654d = i16 + 1;
                        S();
                        i13 = this.f122654d;
                        i14 = this.f122655e;
                    }
                } else {
                    if (c13 != '#') {
                        this.f122654d = i15;
                        return c13;
                    }
                    this.f122654d = i15;
                    d();
                    S();
                    i13 = this.f122654d;
                    i14 = this.f122655e;
                }
            }
            i13 = i15;
        }
    }
}
