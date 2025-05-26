package g;

import android.content.Intent;
import android.content.IntentSender;
import android.view.View;
import androidx.activity.result.IntentSenderRequest;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.d0;
import d7.k0;
import d7.n;
import d7.n0;
import java.util.Locale;
import je.g2;
import je.m0;
import je.s;
import je.t0;
import kotlin.jvm.internal.Intrinsics;
import q5.a2;
import q5.v;
import q8.k;
import q8.t;

/* loaded from: classes2.dex */
public class i implements k, t0, v {

    /* renamed from: a */
    public int f63178a;

    /* renamed from: b */
    public int f63179b;

    /* renamed from: c */
    public Object f63180c;

    /* renamed from: d */
    public Object f63181d;

    public i(IntentSender intentSender) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f63180c = intentSender;
    }

    public static boolean w(int i13) {
        return i13 == 32 || i13 == 10 || i13 == 13 || i13 == 9;
    }

    public final m0 A() {
        float z13 = z();
        if (Float.isNaN(z13)) {
            return null;
        }
        g2 E = E();
        return E == null ? new m0(z13, g2.px) : new m0(z13, E);
    }

    public final String B() {
        if (s()) {
            return null;
        }
        int i13 = this.f63178a;
        char charAt = ((String) this.f63180c).charAt(i13);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        int j13 = j();
        while (j13 != -1 && j13 != charAt) {
            j13 = j();
        }
        if (j13 == -1) {
            this.f63178a = i13;
            return null;
        }
        int i14 = this.f63178a;
        this.f63178a = i14 + 1;
        return ((String) this.f63180c).substring(i13 + 1, i14);
    }

    public final String C() {
        return D(' ', false);
    }

    public final String D(char c13, boolean z13) {
        if (s()) {
            return null;
        }
        char charAt = ((String) this.f63180c).charAt(this.f63178a);
        if ((!z13 && w(charAt)) || charAt == c13) {
            return null;
        }
        int i13 = this.f63178a;
        int j13 = j();
        while (j13 != -1 && j13 != c13 && (z13 || !w(j13))) {
            j13 = j();
        }
        return ((String) this.f63180c).substring(i13, this.f63178a);
    }

    public final g2 E() {
        if (s()) {
            return null;
        }
        if (((String) this.f63180c).charAt(this.f63178a) == '%') {
            this.f63178a++;
            return g2.percent;
        }
        int i13 = this.f63178a;
        if (i13 > this.f63179b - 2) {
            return null;
        }
        try {
            g2 valueOf = g2.valueOf(((String) this.f63180c).substring(i13, i13 + 2).toLowerCase(Locale.US));
            this.f63178a += 2;
            return valueOf;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final float F() {
        J();
        float a13 = ((s) this.f63181d).a(this.f63178a, this.f63179b, (String) this.f63180c);
        if (!Float.isNaN(a13)) {
            this.f63178a = ((s) this.f63181d).f75769a;
        }
        return a13;
    }

    public final void G(Intent intent) {
        this.f63181d = intent;
    }

    public final void H(Object obj) {
        ((Object[]) this.f63180c)[0] = obj;
    }

    public final void I(int i13, int i14) {
        this.f63179b = i13;
        this.f63178a = i14;
    }

    public final boolean J() {
        K();
        int i13 = this.f63178a;
        if (i13 == this.f63179b || ((String) this.f63180c).charAt(i13) != ',') {
            return false;
        }
        this.f63178a++;
        K();
        return true;
    }

    public final void K() {
        while (true) {
            int i13 = this.f63178a;
            if (i13 >= this.f63179b || !w(((String) this.f63180c).charAt(i13))) {
                return;
            } else {
                this.f63178a++;
            }
        }
    }

    public final void L(int i13, int i14, int i15) {
        int i16 = i13 - 2;
        int i17 = i14 - 2;
        x(i16, i17, i15, 1);
        int i18 = i14 - 1;
        x(i16, i18, i15, 2);
        int i19 = i13 - 1;
        x(i19, i17, i15, 3);
        x(i19, i18, i15, 4);
        x(i19, i14, i15, 5);
        x(i13, i17, i15, 6);
        x(i13, i18, i15, 7);
        x(i13, i14, i15, 8);
    }

    @Override // je.t0
    public final void a(float f13, float f14, float f15, float f16) {
        i((byte) 3);
        r(4);
        float[] fArr = (float[]) this.f63181d;
        int i13 = this.f63179b;
        fArr[i13] = f13;
        fArr[i13 + 1] = f14;
        fArr[i13 + 2] = f15;
        this.f63179b = i13 + 4;
        fArr[i13 + 3] = f16;
    }

    @Override // je.t0
    public final void b(float f13, float f14) {
        i((byte) 0);
        r(2);
        float[] fArr = (float[]) this.f63181d;
        int i13 = this.f63179b;
        fArr[i13] = f13;
        this.f63179b = i13 + 2;
        fArr[i13 + 1] = f14;
    }

    @Override // je.t0
    public final void c(float f13, float f14, float f15, float f16, float f17, float f18) {
        i((byte) 2);
        r(6);
        float[] fArr = (float[]) this.f63181d;
        int i13 = this.f63179b;
        fArr[i13] = f13;
        fArr[i13 + 1] = f14;
        fArr[i13 + 2] = f15;
        fArr[i13 + 3] = f16;
        fArr[i13 + 4] = f17;
        this.f63179b = i13 + 6;
        fArr[i13 + 5] = f18;
    }

    @Override // je.t0
    public final void close() {
        i((byte) 8);
    }

    @Override // je.t0
    public final void d(float f13, float f14, float f15, boolean z13, boolean z14, float f16, float f17) {
        i((byte) ((z13 ? 2 : 0) | 4 | (z14 ? 1 : 0)));
        r(5);
        float[] fArr = (float[]) this.f63181d;
        int i13 = this.f63179b;
        fArr[i13] = f13;
        fArr[i13 + 1] = f14;
        fArr[i13 + 2] = f15;
        fArr[i13 + 3] = f16;
        this.f63179b = i13 + 5;
        fArr[i13 + 4] = f17;
    }

    @Override // q8.k
    public final q8.j e(t tVar, long j13) {
        long h10 = tVar.h();
        int min = (int) Math.min(this.f63179b, tVar.getLength() - h10);
        ((d0) this.f63181d).H(min);
        tVar.s(((d0) this.f63181d).f53806a, 0, min);
        d0 d0Var = (d0) this.f63181d;
        int i13 = d0Var.f53808c;
        long j14 = -1;
        long j15 = -1;
        long j16 = -9223372036854775807L;
        while (d0Var.a() >= 188) {
            byte[] bArr = d0Var.f53806a;
            int i14 = d0Var.f53807b;
            while (i14 < i13 && bArr[i14] != 71) {
                i14++;
            }
            int i15 = i14 + RecyclerViewTypes.VIEW_TYPE_BUBBLE_MULTI_IMAGE_EDITORIAL_CARD;
            if (i15 > i13) {
                break;
            }
            long j03 = f0.h.j0(i14, this.f63178a, d0Var);
            if (j03 != -9223372036854775807L) {
                long b13 = ((k0) this.f63180c).b(j03);
                if (b13 > j13) {
                    return j16 == -9223372036854775807L ? new q8.j(-1, b13, h10) : new q8.j(0, -9223372036854775807L, h10 + j15);
                }
                if (100000 + b13 > j13) {
                    return new q8.j(0, -9223372036854775807L, h10 + i14);
                }
                j16 = b13;
                j15 = i14;
            }
            d0Var.K(i15);
            j14 = i15;
        }
        return j16 != -9223372036854775807L ? new q8.j(-2, j16, h10 + j14) : q8.j.f102938d;
    }

    @Override // je.t0
    public final void f(float f13, float f14) {
        i((byte) 1);
        r(2);
        Object obj = this.f63181d;
        int i13 = this.f63179b;
        ((float[]) obj)[i13] = f13;
        this.f63179b = i13 + 2;
        ((float[]) obj)[i13 + 1] = f14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(xp2.b r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f63180c
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r4.f63178a
        L6:
            r2 = 0
            if (r0 == 0) goto L20
        L9:
            if (r2 >= r1) goto L1b
            r3 = r0[r2]
            if (r3 != 0) goto L10
            goto L1b
        L10:
            boolean r3 = pk2.l.acceptFull(r3, r5)
            if (r3 == 0) goto L18
            r5 = 1
            return r5
        L18:
            int r2 = r2 + 1
            goto L9
        L1b:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L6
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.g(xp2.b):boolean");
    }

    public final void h(Object obj) {
        int i13 = this.f63178a;
        int i14 = this.f63179b;
        if (i14 == i13) {
            Object[] objArr = new Object[i13 + 1];
            ((Object[]) this.f63181d)[i13] = objArr;
            this.f63181d = objArr;
            i14 = 0;
        }
        ((Object[]) this.f63181d)[i14] = obj;
        this.f63179b = i14 + 1;
    }

    public final void i(byte b13) {
        int i13 = this.f63178a;
        Object obj = this.f63180c;
        if (i13 == ((byte[]) obj).length) {
            byte[] bArr = new byte[((byte[]) obj).length * 2];
            System.arraycopy((byte[]) obj, 0, bArr, 0, ((byte[]) obj).length);
            this.f63180c = bArr;
        }
        byte[] bArr2 = (byte[]) this.f63180c;
        int i14 = this.f63178a;
        this.f63178a = i14 + 1;
        bArr2[i14] = b13;
    }

    public final int j() {
        int i13 = this.f63178a;
        int i14 = this.f63179b;
        if (i13 == i14) {
            return -1;
        }
        int i15 = i13 + 1;
        this.f63178a = i15;
        if (i15 < i14) {
            return ((String) this.f63180c).charAt(i15);
        }
        return -1;
    }

    @Override // q5.v
    public final a2 k(View view, a2 a2Var) {
        int i13 = a2Var.f102400a.f(7).f61082b;
        if (this.f63178a >= 0) {
            ((View) this.f63180c).getLayoutParams().height = this.f63178a + i13;
            View view2 = (View) this.f63180c;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = (View) this.f63180c;
        view3.setPadding(view3.getPaddingLeft(), this.f63179b + i13, ((View) this.f63180c).getPaddingRight(), ((View) this.f63180c).getPaddingBottom());
        return a2Var;
    }

    @Override // q8.k
    public final void l() {
        d0 d0Var = (d0) this.f63181d;
        byte[] bArr = n0.f53868c;
        d0Var.getClass();
        d0Var.I(bArr.length, bArr);
    }

    public final IntentSenderRequest m() {
        return new IntentSenderRequest((IntentSender) this.f63180c, (Intent) this.f63181d, this.f63178a, this.f63179b);
    }

    public final Boolean n(Object obj) {
        if (obj == null) {
            return null;
        }
        J();
        int i13 = this.f63178a;
        if (i13 == this.f63179b) {
            return null;
        }
        char charAt = ((String) this.f63180c).charAt(i13);
        if (charAt != '0' && charAt != '1') {
            return null;
        }
        this.f63178a++;
        return Boolean.valueOf(charAt == '1');
    }

    public final float o(float f13) {
        if (Float.isNaN(f13)) {
            return Float.NaN;
        }
        J();
        return z();
    }

    public final boolean p(char c13) {
        int i13 = this.f63178a;
        boolean z13 = i13 < this.f63179b && ((String) this.f63180c).charAt(i13) == c13;
        if (z13) {
            this.f63178a++;
        }
        return z13;
    }

    public final boolean q(String str) {
        int length = str.length();
        int i13 = this.f63178a;
        boolean z13 = i13 <= this.f63179b - length && ((String) this.f63180c).substring(i13, i13 + length).equals(str);
        if (z13) {
            this.f63178a += length;
        }
        return z13;
    }

    public final void r(int i13) {
        float[] fArr = (float[]) this.f63181d;
        if (fArr.length < this.f63179b + i13) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.f63181d = fArr2;
        }
    }

    public final boolean s() {
        return this.f63178a == this.f63179b;
    }

    public final void t(t0 t0Var) {
        int i13 = 0;
        for (int i14 = 0; i14 < this.f63178a; i14++) {
            byte b13 = ((byte[]) this.f63180c)[i14];
            if (b13 == 0) {
                Object obj = this.f63181d;
                int i15 = i13 + 1;
                float f13 = ((float[]) obj)[i13];
                i13 += 2;
                t0Var.b(f13, ((float[]) obj)[i15]);
            } else if (b13 == 1) {
                Object obj2 = this.f63181d;
                int i16 = i13 + 1;
                float f14 = ((float[]) obj2)[i13];
                i13 += 2;
                t0Var.f(f14, ((float[]) obj2)[i16]);
            } else if (b13 == 2) {
                Object obj3 = this.f63181d;
                float f15 = ((float[]) obj3)[i13];
                float f16 = ((float[]) obj3)[i13 + 1];
                float f17 = ((float[]) obj3)[i13 + 2];
                float f18 = ((float[]) obj3)[i13 + 3];
                int i17 = i13 + 5;
                float f19 = ((float[]) obj3)[i13 + 4];
                i13 += 6;
                t0Var.c(f15, f16, f17, f18, f19, ((float[]) obj3)[i17]);
            } else if (b13 == 3) {
                Object obj4 = this.f63181d;
                float f23 = ((float[]) obj4)[i13];
                float f24 = ((float[]) obj4)[i13 + 1];
                int i18 = i13 + 3;
                float f25 = ((float[]) obj4)[i13 + 2];
                i13 += 4;
                t0Var.a(f23, f24, f25, ((float[]) obj4)[i18]);
            } else if (b13 != 8) {
                boolean z13 = (b13 & 2) != 0;
                boolean z14 = (b13 & 1) != 0;
                Object obj5 = this.f63181d;
                float f26 = ((float[]) obj5)[i13];
                float f27 = ((float[]) obj5)[i13 + 1];
                float f28 = ((float[]) obj5)[i13 + 2];
                int i19 = i13 + 4;
                float f29 = ((float[]) obj5)[i13 + 3];
                i13 += 5;
                t0Var.d(f26, f27, f28, z13, z14, f29, ((float[]) obj5)[i19]);
            } else {
                t0Var.close();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(pk2.a r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f63180c
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r4.f63178a
        L6:
            if (r0 == 0) goto L1f
            r2 = 0
        L9:
            if (r2 >= r1) goto L1a
            r3 = r0[r2]
            if (r3 != 0) goto L10
            goto L1a
        L10:
            boolean r3 = r5.test(r3)
            if (r3 == 0) goto L17
            return
        L17:
            int r2 = r2 + 1
            goto L9
        L1a:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L6
        L1f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.i.u(pk2.a):void");
    }

    public final boolean v(int i13, int i14) {
        return ((byte[]) this.f63181d)[(i14 * this.f63179b) + i13] >= 0;
    }

    public final void x(int i13, int i14, int i15, int i16) {
        if (i13 < 0) {
            int i17 = this.f63178a;
            i13 += i17;
            i14 += 4 - ((i17 + 4) % 8);
        }
        if (i14 < 0) {
            int i18 = this.f63179b;
            i14 += i18;
            i13 += 4 - ((i18 + 4) % 8);
        }
        ((byte[]) this.f63181d)[(i13 * this.f63179b) + i14] = (byte) ((((CharSequence) this.f63180c).charAt(i15) & (1 << (8 - i16))) == 0 ? 0 : 1);
    }

    public final Integer y() {
        int i13 = this.f63178a;
        if (i13 == this.f63179b) {
            return null;
        }
        String str = (String) this.f63180c;
        this.f63178a = i13 + 1;
        return Integer.valueOf(str.charAt(i13));
    }

    public final float z() {
        float a13 = ((s) this.f63181d).a(this.f63178a, this.f63179b, (String) this.f63180c);
        if (!Float.isNaN(a13)) {
            this.f63178a = ((s) this.f63181d).f75769a;
        }
        return a13;
    }

    public i() {
        this.f63178a = 4;
        Object[] objArr = new Object[5];
        this.f63180c = objArr;
        this.f63181d = objArr;
    }

    public i(int i13, int i14, float[] fArr, float[] fArr2) {
        this.f63178a = i13;
        bf.b.i(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f63180c = fArr;
        this.f63181d = fArr2;
        this.f63179b = i14;
    }

    public i(i iVar) {
        Object obj = iVar.f63180c;
        this.f63178a = ((float[]) obj).length / 3;
        this.f63180c = n.h((float[]) obj);
        this.f63181d = n.h((float[]) iVar.f63181d);
        int i13 = iVar.f63179b;
        if (i13 == 1) {
            this.f63179b = 5;
        } else if (i13 != 2) {
            this.f63179b = 4;
        } else {
            this.f63179b = 6;
        }
    }

    public i(String str) {
        this.f63178a = 0;
        this.f63179b = 0;
        this.f63181d = new s();
        String trim = str.trim();
        this.f63180c = trim;
        this.f63179b = trim.length();
    }
}
