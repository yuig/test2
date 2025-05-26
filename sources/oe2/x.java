package oe2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class x extends y {

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f94394i = new String[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];

    /* renamed from: g, reason: collision with root package name */
    public final wo2.k f94395g;

    /* renamed from: h, reason: collision with root package name */
    public String f94396h;

    static {
        for (int i13 = 0; i13 <= 31; i13++) {
            f94394i[i13] = String.format("\\u%04x", Integer.valueOf(i13));
        }
        String[] strArr = f94394i;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public x(wo2.k kVar) {
        int[] iArr = new int[32];
        this.f94398b = iArr;
        this.f94399c = new String[32];
        this.f94400d = new int[32];
        this.f94402f = -1;
        this.f94395g = kVar;
        this.f94397a = 1;
        iArr[0] = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void z(wo2.k r7, java.lang.String r8) {
        /*
            java.lang.String[] r0 = oe2.x.f94394i
            r1 = 34
            r7.p1(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.I1(r4, r3, r8)
        L2e:
            r7.l0(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.I1(r4, r2, r8)
        L3b:
            r7.p1(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oe2.x.z(wo2.k, java.lang.String):void");
    }

    public final void A() {
        if (this.f94396h != null) {
            int h10 = h();
            wo2.k kVar = this.f94395g;
            if (h10 == 5) {
                kVar.p1(44);
            } else if (h10 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f94398b[this.f94397a - 1] = 4;
            z(kVar, this.f94396h);
            this.f94396h = null;
        }
    }

    @Override // oe2.y
    public final x a() {
        if (this.f94401e) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + e());
        }
        A();
        w(1, 2, '[');
        return this;
    }

    @Override // oe2.y
    public final x c() {
        if (this.f94401e) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + e());
        }
        A();
        w(3, 5, '{');
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f94395g.close();
        int i13 = this.f94397a;
        if (i13 > 1 || (i13 == 1 && this.f94398b[i13 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f94397a = 0;
    }

    @Override // oe2.y
    public final x d() {
        this.f94401e = false;
        q(3, 5, '}');
        return this;
    }

    @Override // oe2.y
    public final x f(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f94397a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int h10 = h();
        if ((h10 != 3 && h10 != 5) || this.f94396h != null || this.f94401e) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f94396h = str;
        this.f94399c[this.f94397a - 1] = str;
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f94397a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f94395g.flush();
    }

    @Override // oe2.y
    public final x g() {
        if (this.f94401e) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + e());
        }
        if (this.f94396h != null) {
            this.f94396h = null;
            return this;
        }
        o();
        this.f94395g.l0("null");
        int[] iArr = this.f94400d;
        int i13 = this.f94397a - 1;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // oe2.y
    public final x k(long j13) {
        if (this.f94401e) {
            this.f94401e = false;
            f(Long.toString(j13));
            return this;
        }
        A();
        o();
        this.f94395g.l0(Long.toString(j13));
        int[] iArr = this.f94400d;
        int i13 = this.f94397a - 1;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // oe2.y
    public final x m(String str) {
        if (str == null) {
            g();
            return this;
        }
        if (this.f94401e) {
            this.f94401e = false;
            f(str);
            return this;
        }
        A();
        o();
        z(this.f94395g, str);
        int[] iArr = this.f94400d;
        int i13 = this.f94397a - 1;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    public final void o() {
        int h10 = h();
        int i13 = 2;
        if (h10 != 1) {
            wo2.k kVar = this.f94395g;
            if (h10 == 2) {
                kVar.p1(44);
            } else if (h10 == 4) {
                kVar.l0(":");
                i13 = 5;
            } else {
                if (h10 == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                if (h10 != 6) {
                    if (h10 != 7) {
                        throw new IllegalStateException("Nesting problem.");
                    }
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
                i13 = 7;
            }
        }
        this.f94398b[this.f94397a - 1] = i13;
    }

    public final void q(int i13, int i14, char c13) {
        int h10 = h();
        if (h10 != i14 && h10 != i13) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f94396h != null) {
            throw new IllegalStateException("Dangling name: " + this.f94396h);
        }
        int i15 = this.f94397a;
        int i16 = ~this.f94402f;
        if (i15 == i16) {
            this.f94402f = i16;
            return;
        }
        int i17 = i15 - 1;
        this.f94397a = i17;
        this.f94399c[i17] = null;
        int[] iArr = this.f94400d;
        int i18 = i15 - 2;
        iArr[i18] = iArr[i18] + 1;
        this.f94395g.p1(c13);
    }

    public final void w(int i13, int i14, char c13) {
        int i15;
        int i16 = this.f94397a;
        int i17 = this.f94402f;
        if (i16 == i17 && ((i15 = this.f94398b[i16 - 1]) == i13 || i15 == i14)) {
            this.f94402f = ~i17;
            return;
        }
        o();
        int i18 = this.f94397a;
        int[] iArr = this.f94398b;
        if (i18 == iArr.length) {
            if (i18 == 256) {
                throw new JsonDataException("Nesting too deep at " + e() + ": circular reference?");
            }
            this.f94398b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f94399c;
            this.f94399c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f94400d;
            this.f94400d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f94398b;
        int i19 = this.f94397a;
        this.f94397a = i19 + 1;
        iArr3[i19] = i13;
        this.f94400d[i19] = 0;
        this.f94395g.p1(c13);
    }
}
