package com.bugsnag.android;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes3.dex */
public abstract class p1 implements Closeable, Flushable {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f29406g = new String[RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN];

    /* renamed from: a, reason: collision with root package name */
    public final Writer f29407a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f29408b = new int[32];

    /* renamed from: c, reason: collision with root package name */
    public int f29409c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final String f29410d;

    /* renamed from: e, reason: collision with root package name */
    public String f29411e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29412f;

    static {
        for (int i13 = 0; i13 <= 31; i13++) {
            f29406g[i13] = String.format("\\u%04x", Integer.valueOf(i13));
        }
        String[] strArr = f29406g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public p1(Writer writer) {
        m(6);
        this.f29410d = ":";
        this.f29412f = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f29407a = writer;
    }

    public final void A(boolean z13) {
        J();
        a();
        this.f29407a.write(z13 ? "true" : "false");
    }

    public final void J() {
        if (this.f29411e != null) {
            int k13 = k();
            if (k13 == 5) {
                this.f29407a.write(44);
            } else if (k13 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            this.f29408b[this.f29409c - 1] = 4;
            o(this.f29411e);
            this.f29411e = null;
        }
    }

    public final void a() {
        int k13 = k();
        if (k13 == 1) {
            this.f29408b[this.f29409c - 1] = 2;
            return;
        }
        Writer writer = this.f29407a;
        if (k13 == 2) {
            writer.write(44);
            return;
        }
        if (k13 == 4) {
            writer.write(this.f29410d);
            this.f29408b[this.f29409c - 1] = 5;
        } else if (k13 == 6) {
            this.f29408b[this.f29409c - 1] = 7;
        } else {
            if (k13 != 7) {
                throw new IllegalStateException("Nesting problem.");
            }
            throw new IllegalStateException("JSON must have only one top-level value.");
        }
    }

    public final void c() {
        J();
        a();
        m(1);
        this.f29407a.write("[");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f29407a.close();
        int i13 = this.f29409c;
        if (i13 > 1 || (i13 == 1 && this.f29408b[i13 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f29409c = 0;
    }

    public final void d() {
        J();
        a();
        m(3);
        this.f29407a.write("{");
    }

    public final void e(int i13, int i14, String str) {
        int k13 = k();
        if (k13 != i14 && k13 != i13) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f29411e == null) {
            this.f29409c--;
            this.f29407a.write(str);
        } else {
            throw new IllegalStateException("Dangling name: " + this.f29411e);
        }
    }

    public final void f() {
        e(1, 2, "]");
    }

    @Override // java.io.Flushable
    public final void flush() {
        if (this.f29409c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f29407a.flush();
    }

    public final void g() {
        e(3, 5, "}");
    }

    public final void h() {
        if (this.f29411e != null) {
            if (!this.f29412f) {
                this.f29411e = null;
                return;
            }
            J();
        }
        a();
        this.f29407a.write("null");
    }

    public final int k() {
        int i13 = this.f29409c;
        if (i13 != 0) {
            return this.f29408b[i13 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void m(int i13) {
        int i14 = this.f29409c;
        int[] iArr = this.f29408b;
        if (i14 == iArr.length) {
            int[] iArr2 = new int[i14 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i14);
            this.f29408b = iArr2;
        }
        int[] iArr3 = this.f29408b;
        int i15 = this.f29409c;
        this.f29409c = i15 + 1;
        iArr3[i15] = i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String[] r0 = com.bugsnag.android.p1.f29406g
            java.io.Writer r1 = r8.f29407a
            java.lang.String r2 = "\""
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        Lf:
            if (r4 >= r3) goto L3a
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L1e
            r6 = r0[r6]
            if (r6 != 0) goto L2b
            goto L37
        L1e:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L25
            java.lang.String r6 = "\\u2028"
            goto L2b
        L25:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L37
            java.lang.String r6 = "\\u2029"
        L2b:
            if (r5 >= r4) goto L32
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L32:
            r1.write(r6)
            int r5 = r4 + 1
        L37:
            int r4 = r4 + 1
            goto Lf
        L3a:
            if (r5 >= r3) goto L40
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L40:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.p1.o(java.lang.String):void");
    }

    public final void q(Boolean bool) {
        if (bool == null) {
            h();
            return;
        }
        J();
        a();
        this.f29407a.write(bool.booleanValue() ? "true" : "false");
    }

    public final void w(Number number) {
        if (number == null) {
            h();
            return;
        }
        String obj = number.toString();
        if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
            this.f29411e = null;
            return;
        }
        J();
        a();
        this.f29407a.write(obj);
    }

    public final void z(String str) {
        if (str == null) {
            h();
            return;
        }
        J();
        a();
        o(str);
    }
}
