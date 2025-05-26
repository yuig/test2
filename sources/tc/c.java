package tc;

import com.apollographql.apollo3.exception.JsonDataException;
import com.apollographql.apollo3.exception.JsonEncodingException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import e0.t;
import java.io.EOFException;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import m60.f0;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: m, reason: collision with root package name */
    public static final wo2.m f117177m;

    /* renamed from: n, reason: collision with root package name */
    public static final wo2.m f117178n;

    /* renamed from: o, reason: collision with root package name */
    public static final wo2.m f117179o;

    /* renamed from: a, reason: collision with root package name */
    public final wo2.l f117180a;

    /* renamed from: b, reason: collision with root package name */
    public final wo2.j f117181b;

    /* renamed from: c, reason: collision with root package name */
    public int f117182c;

    /* renamed from: d, reason: collision with root package name */
    public long f117183d;

    /* renamed from: e, reason: collision with root package name */
    public int f117184e;

    /* renamed from: f, reason: collision with root package name */
    public String f117185f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f117186g;

    /* renamed from: h, reason: collision with root package name */
    public int f117187h;

    /* renamed from: i, reason: collision with root package name */
    public final String[] f117188i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f117189j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f117190k;

    /* renamed from: l, reason: collision with root package name */
    public int f117191l;

    static {
        wo2.m mVar = wo2.m.f130712d;
        f117177m = f0.h0("'\\");
        f117178n = f0.h0("\"\\");
        f117179o = f0.h0("{}[]:, \n\t\r/\\;#=");
    }

    public c(wo2.l source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f117180a = source;
        this.f117181b = source.l();
        int[] iArr = new int[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        iArr[0] = 6;
        this.f117186g = iArr;
        this.f117187h = 1;
        this.f117188i = new String[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        this.f117189j = new int[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        int[] iArr2 = new int[RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER];
        iArr2[0] = 0;
        this.f117190k = iArr2;
        this.f117191l = 1;
    }

    @Override // tc.f
    public final void B1() {
        int i13 = this.f117182c;
        Integer valueOf = Integer.valueOf(i13);
        if (i13 == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) == 7) {
            this.f117182c = 0;
            int i14 = this.f117187h - 1;
            int[] iArr = this.f117189j;
            iArr[i14] = iArr[i14] + 1;
            return;
        }
        throw new JsonDataException("Expected null but was " + peek() + " at path " + c());
    }

    @Override // tc.f
    public final void E() {
        int i13 = 0;
        do {
            Integer valueOf = Integer.valueOf(this.f117182c);
            if (valueOf.intValue() == 0) {
                valueOf = null;
            }
            switch (valueOf != null ? valueOf.intValue() : a()) {
                case 1:
                    h(3);
                    i13++;
                    break;
                case 2:
                    this.f117187h--;
                    i13--;
                    break;
                case 3:
                    h(1);
                    i13++;
                    break;
                case 4:
                    this.f117187h--;
                    i13--;
                    break;
                case 8:
                case 12:
                    m(f117177m);
                    break;
                case 9:
                case 13:
                    m(f117178n);
                    break;
                case 10:
                case 14:
                    o();
                    break;
                case 16:
                    this.f117181b.skip(this.f117184e);
                    break;
            }
            this.f117182c = 0;
        } while (i13 != 0);
        int i14 = this.f117187h;
        int i15 = i14 - 1;
        int[] iArr = this.f117189j;
        iArr[i15] = iArr[i15] + 1;
        this.f117188i[i14 - 1] = "null";
    }

    @Override // tc.f
    public final boolean R0() {
        Integer valueOf = Integer.valueOf(this.f117182c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        int[] iArr = this.f117189j;
        if (intValue == 5) {
            this.f117182c = 0;
            int i13 = this.f117187h - 1;
            iArr[i13] = iArr[i13] + 1;
            return true;
        }
        if (intValue == 6) {
            this.f117182c = 0;
            int i14 = this.f117187h - 1;
            iArr[i14] = iArr[i14] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + peek() + " at path " + c());
    }

    @Override // tc.f
    public final d U1() {
        String Y0 = Y0();
        Intrinsics.f(Y0);
        return new d(Y0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        E();
     */
    @Override // tc.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int V1(java.util.List r8) {
        /*
            r7 = this;
            java.lang.String r0 = "names"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r8.isEmpty()
            r1 = -1
            if (r0 == 0) goto Ld
            return r1
        Ld:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L76
            java.lang.String r0 = r7.k0()
            int r2 = r7.f117191l
            int r2 = r2 + (-1)
            int[] r3 = r7.f117190k
            r2 = r3[r2]
            java.lang.Object r4 = r8.get(r2)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r0)
            r5 = 0
            if (r4 == 0) goto L43
            int r0 = r7.f117191l
            int r1 = r0 + (-1)
            int r4 = r2 + 1
            r3[r1] = r4
            int r0 = r0 + (-1)
            r0 = r3[r0]
            int r8 = r8.size()
            if (r0 != r8) goto L42
            int r8 = r7.f117191l
            int r8 = r8 + (-1)
            r3[r8] = r5
        L42:
            return r2
        L43:
            r4 = r2
        L44:
            int r4 = r4 + 1
            int r6 = r8.size()
            if (r4 != r6) goto L4d
            r4 = r5
        L4d:
            if (r4 != r2) goto L53
            r7.E()
            goto Ld
        L53:
            java.lang.Object r6 = r8.get(r4)
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r0)
            if (r6 == 0) goto L44
            int r0 = r7.f117191l
            int r1 = r0 + (-1)
            int r2 = r4 + 1
            r3[r1] = r2
            int r0 = r0 + (-1)
            r0 = r3[r0]
            int r8 = r8.size()
            if (r0 != r8) goto L75
            int r8 = r7.f117191l
            int r8 = r8 + (-1)
            r3[r8] = r5
        L75:
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.c.V1(java.util.List):int");
    }

    @Override // tc.f
    public final long W1() {
        Integer valueOf = Integer.valueOf(this.f117182c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        int[] iArr = this.f117189j;
        if (intValue == 15) {
            this.f117182c = 0;
            int i13 = this.f117187h - 1;
            iArr[i13] = iArr[i13] + 1;
            return this.f117183d;
        }
        if (intValue == 16) {
            long j13 = this.f117184e;
            wo2.j jVar = this.f117181b;
            jVar.getClass();
            this.f117185f = jVar.L(j13, Charsets.UTF_8);
        } else if (intValue == 9 || intValue == 8) {
            String f13 = f(intValue == 9 ? f117178n : f117177m);
            this.f117185f = f13;
            try {
                Intrinsics.f(f13);
                long parseLong = Long.parseLong(f13);
                this.f117182c = 0;
                int i14 = this.f117187h - 1;
                iArr[i14] = iArr[i14] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else if (intValue != 11) {
            throw new JsonDataException("Expected a long but was " + peek() + " at path " + c());
        }
        this.f117182c = 11;
        try {
            String str = this.f117185f;
            Intrinsics.f(str);
            double parseDouble = Double.parseDouble(str);
            long j14 = (long) parseDouble;
            if (j14 == parseDouble) {
                this.f117185f = null;
                this.f117182c = 0;
                int i15 = this.f117187h - 1;
                iArr[i15] = iArr[i15] + 1;
                return j14;
            }
            throw new JsonDataException("Expected a long but was " + this.f117185f + " at path " + c());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected a long but was " + this.f117185f + " at path " + c());
        }
    }

    @Override // tc.f
    public final String Y0() {
        Integer valueOf = Integer.valueOf(this.f117182c);
        String str = null;
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        if (intValue == 15) {
            str = String.valueOf(this.f117183d);
        } else if (intValue != 16) {
            switch (intValue) {
                case 8:
                    str = f(f117177m);
                    break;
                case 9:
                    str = f(f117178n);
                    break;
                case 10:
                    str = g();
                    break;
                case 11:
                    String str2 = this.f117185f;
                    if (str2 != null) {
                        this.f117185f = null;
                        str = str2;
                        break;
                    }
                    break;
                default:
                    throw new JsonDataException("Expected a string but was " + peek() + " at path " + c());
            }
        } else {
            long j13 = this.f117184e;
            wo2.j jVar = this.f117181b;
            jVar.getClass();
            str = jVar.L(j13, Charsets.UTF_8);
        }
        this.f117182c = 0;
        int i13 = this.f117187h - 1;
        int[] iArr = this.f117189j;
        iArr[i13] = iArr[i13] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0231, code lost:
    
        if (d(r5) != false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0233, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0234, code lost:
    
        if (r3 != 2) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0236, code lost:
    
        if (r10 == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x023c, code lost:
    
        if (r21 != Long.MIN_VALUE) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x023e, code lost:
    
        if (r8 == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0243, code lost:
    
        r5 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0245, code lost:
    
        if (r8 == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0248, code lost:
    
        r5 = -r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0249, code lost:
    
        r23.f117183d = r5;
        r15.skip(r11);
        r11 = 15;
        r23.f117182c = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0241, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0253, code lost:
    
        if (r3 == r2) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0255, code lost:
    
        if (r3 == 4) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0258, code lost:
    
        if (r3 != 7) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x025a, code lost:
    
        r23.f117184e = r1;
        r11 = 16;
        r23.f117182c = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0262 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a() {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.c.a():int");
    }

    public final String c() {
        return CollectionsKt.Z(r(), ".", null, null, 0, null, null, 62);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f117182c = 0;
        this.f117186g[0] = 8;
        this.f117187h = 1;
        this.f117181b.a();
        this.f117180a.close();
    }

    public final boolean d(char c13) {
        if (c13 != '/' && c13 != '\\' && c13 != ';' && c13 != '#' && c13 != '=') {
            return !(c13 == '{' || c13 == '}' || c13 == '[' || c13 == ']' || c13 == ':' || c13 == ',' || c13 == ' ' || c13 == '\t' || c13 == '\r' || c13 == '\n');
        }
        q("Unexpected character: " + c13);
        throw null;
    }

    public final int e(boolean z13) {
        int i13 = 0;
        while (true) {
            long j13 = i13;
            wo2.l lVar = this.f117180a;
            if (!lVar.request(j13 + 1)) {
                if (z13) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            i13++;
            wo2.j jVar = this.f117181b;
            byte k13 = jVar.k(j13);
            if (k13 != 10 && k13 != 32 && k13 != 13 && k13 != 9) {
                jVar.skip(i13 - 1);
                if (k13 == 47) {
                    if (!lVar.request(2L)) {
                        return k13;
                    }
                    q("Malformed JSON");
                    throw null;
                }
                if (k13 != 35) {
                    return k13;
                }
                q("Malformed JSON");
                throw null;
            }
        }
    }

    public final String f(wo2.m mVar) {
        StringBuilder sb3 = null;
        while (true) {
            long L0 = this.f117180a.L0(mVar);
            if (L0 == -1) {
                q("Unterminated string");
                throw null;
            }
            wo2.j jVar = this.f117181b;
            if (jVar.k(L0) != ((byte) 92)) {
                if (sb3 == null) {
                    String L = jVar.L(L0, Charsets.UTF_8);
                    jVar.readByte();
                    return L;
                }
                sb3.append(jVar.L(L0, Charsets.UTF_8));
                jVar.readByte();
                String sb4 = sb3.toString();
                Intrinsics.checkNotNullExpressionValue(sb4, "{\n        builder.append…uilder.toString()\n      }");
                return sb4;
            }
            if (sb3 == null) {
                sb3 = new StringBuilder();
            }
            sb3.append(jVar.L(L0, Charsets.UTF_8));
            jVar.readByte();
            sb3.append(k());
        }
    }

    public final String g() {
        long L0 = this.f117180a.L0(f117179o);
        wo2.j jVar = this.f117181b;
        if (L0 == -1) {
            return jVar.M();
        }
        jVar.getClass();
        return jVar.L(L0, Charsets.UTF_8);
    }

    public final void h(int i13) {
        int i14 = this.f117187h;
        int[] iArr = this.f117186g;
        if (i14 != iArr.length) {
            this.f117187h = i14 + 1;
            iArr[i14] = i13;
        } else {
            throw new JsonDataException("Nesting too deep at " + r());
        }
    }

    @Override // tc.f
    public final boolean hasNext() {
        Integer valueOf = Integer.valueOf(this.f117182c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        return (intValue == 2 || intValue == 4) ? false : true;
    }

    public final char k() {
        int i13;
        wo2.l lVar = this.f117180a;
        if (!lVar.request(1L)) {
            q("Unterminated escape sequence");
            throw null;
        }
        wo2.j jVar = this.f117181b;
        char readByte = (char) jVar.readByte();
        if (readByte != 'u') {
            if (readByte == 't') {
                return '\t';
            }
            if (readByte == 'b') {
                return '\b';
            }
            if (readByte == 'n') {
                return '\n';
            }
            if (readByte == 'r') {
                return '\r';
            }
            if (readByte == 'f') {
                return '\f';
            }
            if (readByte == '\n' || readByte == '\'' || readByte == '\"' || readByte == '\\' || readByte == '/') {
                return readByte;
            }
            q("Invalid escape sequence: \\" + readByte);
            throw null;
        }
        if (!lVar.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + r());
        }
        char c13 = (char) 0;
        for (int i14 = 0; i14 < 4; i14++) {
            byte k13 = jVar.k(i14);
            char c14 = (char) (c13 << 4);
            byte b13 = (byte) 48;
            if (k13 < b13 || k13 > ((byte) 57)) {
                byte b14 = (byte) 97;
                if ((k13 < b14 || k13 > ((byte) RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE)) && (k13 < (b14 = (byte) 65) || k13 > ((byte) 70))) {
                    q("\\u".concat(jVar.L(4L, Charsets.UTF_8)));
                    throw null;
                }
                i13 = (k13 - b14) + 10;
            } else {
                i13 = k13 - b13;
            }
            c13 = (char) (c14 + i13);
        }
        jVar.skip(4L);
        return c13;
    }

    @Override // tc.f
    public final String k0() {
        String f13;
        Integer valueOf = Integer.valueOf(this.f117182c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : a()) {
            case 12:
                f13 = f(f117177m);
                break;
            case 13:
                f13 = f(f117178n);
                break;
            case 14:
                f13 = g();
                break;
            default:
                throw new JsonDataException("Expected a name but was " + peek() + " at path " + c());
        }
        this.f117182c = 0;
        this.f117188i[this.f117187h - 1] = f13;
        return f13;
    }

    public final void m(wo2.m mVar) {
        while (true) {
            long L0 = this.f117180a.L0(mVar);
            if (L0 == -1) {
                q("Unterminated string");
                throw null;
            }
            wo2.j jVar = this.f117181b;
            if (jVar.k(L0) != ((byte) 92)) {
                jVar.skip(L0 + 1);
                return;
            } else {
                jVar.skip(L0 + 1);
                k();
            }
        }
    }

    public final void o() {
        long L0 = this.f117180a.L0(f117179o);
        wo2.j jVar = this.f117181b;
        if (L0 == -1) {
            L0 = jVar.f130711b;
        }
        jVar.skip(L0);
    }

    @Override // tc.f
    public final int o0() {
        int i13 = this.f117182c;
        Integer valueOf = Integer.valueOf(i13);
        if (i13 == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        int[] iArr = this.f117189j;
        if (intValue == 15) {
            long j13 = this.f117183d;
            int i14 = (int) j13;
            if (j13 == i14) {
                this.f117182c = 0;
                int i15 = this.f117187h - 1;
                iArr[i15] = iArr[i15] + 1;
                return i14;
            }
            throw new JsonDataException("Expected an int but was " + this.f117183d + " at path " + r());
        }
        if (intValue == 16) {
            long j14 = this.f117184e;
            wo2.j jVar = this.f117181b;
            jVar.getClass();
            this.f117185f = jVar.L(j14, Charsets.UTF_8);
        } else if (intValue == 9 || intValue == 8) {
            String f13 = f(intValue == 9 ? f117178n : f117177m);
            this.f117185f = f13;
            try {
                Intrinsics.f(f13);
                int parseInt = Integer.parseInt(f13);
                this.f117182c = 0;
                int i16 = this.f117187h - 1;
                iArr[i16] = iArr[i16] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (intValue != 11) {
            throw new JsonDataException("Expected an int but was " + peek() + " at path " + c());
        }
        this.f117182c = 11;
        try {
            String str = this.f117185f;
            Intrinsics.f(str);
            double parseDouble = Double.parseDouble(str);
            int i17 = (int) parseDouble;
            if (i17 == parseDouble) {
                this.f117185f = null;
                this.f117182c = 0;
                int i18 = this.f117187h - 1;
                iArr[i18] = iArr[i18] + 1;
                return i17;
            }
            throw new JsonDataException("Expected an int but was " + this.f117185f + " at path " + c());
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.f117185f + " at path " + c());
        }
    }

    @Override // tc.f
    public final e peek() {
        Integer valueOf = Integer.valueOf(this.f117182c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        switch (valueOf != null ? valueOf.intValue() : a()) {
            case 1:
                return e.BEGIN_OBJECT;
            case 2:
                return e.END_OBJECT;
            case 3:
                return e.BEGIN_ARRAY;
            case 4:
                return e.END_ARRAY;
            case 5:
            case 6:
                return e.BOOLEAN;
            case 7:
                return e.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return e.STRING;
            case 12:
            case 13:
            case 14:
                return e.NAME;
            case 15:
                return e.LONG;
            case 16:
                return e.NUMBER;
            case 17:
                return e.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void q(String str) {
        StringBuilder D = ep.b.D(str, " at path ");
        D.append(r());
        throw new JsonEncodingException(D.toString());
    }

    @Override // tc.f
    public final ArrayList r() {
        return t.t(this.f117187h, this.f117186g, this.f117188i, this.f117189j);
    }

    @Override // tc.f
    public final f s() {
        Integer valueOf = Integer.valueOf(this.f117182c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) != 1) {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + peek() + " at path " + c());
        }
        h(3);
        this.f117182c = 0;
        int i13 = this.f117191l;
        this.f117191l = i13 + 1;
        this.f117190k[i13] = 0;
        return this;
    }

    @Override // tc.f
    public final double s1() {
        Integer valueOf = Integer.valueOf(this.f117182c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : a();
        int[] iArr = this.f117189j;
        if (intValue == 15) {
            this.f117182c = 0;
            int i13 = this.f117187h - 1;
            iArr[i13] = iArr[i13] + 1;
            return this.f117183d;
        }
        if (intValue == 16) {
            long j13 = this.f117184e;
            wo2.j jVar = this.f117181b;
            jVar.getClass();
            this.f117185f = jVar.L(j13, Charsets.UTF_8);
        } else if (intValue == 9) {
            this.f117185f = f(f117178n);
        } else if (intValue == 8) {
            this.f117185f = f(f117177m);
        } else if (intValue == 10) {
            this.f117185f = g();
        } else if (intValue != 11) {
            throw new JsonDataException("Expected a double but was " + peek() + " at path " + c());
        }
        this.f117182c = 11;
        try {
            String str = this.f117185f;
            Intrinsics.f(str);
            double parseDouble = Double.parseDouble(str);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + c());
            }
            this.f117185f = null;
            this.f117182c = 0;
            int i14 = this.f117187h - 1;
            iArr[i14] = iArr[i14] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.f117185f + " at path " + c());
        }
    }

    @Override // tc.f
    public final f t() {
        Integer valueOf = Integer.valueOf(this.f117182c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) != 4) {
            throw new JsonDataException("Expected END_ARRAY but was " + peek() + " at path " + c());
        }
        int i13 = this.f117187h;
        this.f117187h = i13 - 1;
        int i14 = i13 - 2;
        int[] iArr = this.f117189j;
        iArr[i14] = iArr[i14] + 1;
        this.f117182c = 0;
        return this;
    }

    @Override // tc.f
    public final f u() {
        Integer valueOf = Integer.valueOf(this.f117182c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) == 3) {
            h(1);
            this.f117189j[this.f117187h - 1] = 0;
            this.f117182c = 0;
            return this;
        }
        throw new JsonDataException("Expected BEGIN_ARRAY but was " + peek() + " at path " + c());
    }

    @Override // tc.f
    public final f v() {
        Integer valueOf = Integer.valueOf(this.f117182c);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        if ((valueOf != null ? valueOf.intValue() : a()) != 2) {
            throw new JsonDataException("Expected END_OBJECT but was " + peek() + " at path " + c());
        }
        int i13 = this.f117187h;
        int i14 = i13 - 1;
        this.f117187h = i14;
        this.f117188i[i14] = null;
        int i15 = i13 - 2;
        int[] iArr = this.f117189j;
        iArr[i15] = iArr[i15] + 1;
        this.f117182c = 0;
        this.f117191l--;
        return this;
    }
}
