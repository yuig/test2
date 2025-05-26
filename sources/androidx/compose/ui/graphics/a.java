package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import b3.b1;
import b3.d;
import b3.e;
import b3.f0;
import b3.g0;
import b3.h;
import b3.i;
import b3.k;
import b3.n;
import b3.n0;
import b3.o;
import b3.s0;
import b3.w;
import b3.x0;
import c3.c;
import c3.f;
import c3.s;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import u2.q;
import xk2.d0;
import xk2.e0;

/* loaded from: classes.dex */
public abstract class a {
    public static final d a(h hVar) {
        Canvas canvas = e.f21312a;
        d dVar = new d();
        dVar.f21309a = new Canvas(l(hVar));
        return dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long b(float r21, float r22, float r23, float r24, c3.d r25) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.a.b(float, float, float, float, c3.d):long");
    }

    public static final long c(int i13) {
        long j13 = i13;
        d0 d0Var = e0.f135207b;
        long j14 = j13 << 32;
        int i14 = w.f21391o;
        return j14;
    }

    public static final long d(long j13) {
        long j14 = j13 << 32;
        d0 d0Var = e0.f135207b;
        int i13 = w.f21391o;
        return j14;
    }

    public static long e(int i13, int i14, int i15) {
        return c(((i13 & 255) << 16) | (-16777216) | ((i14 & 255) << 8) | (i15 & 255));
    }

    public static h f(int i13, int i14, int i15) {
        s sVar = f.f25494c;
        v(i15);
        return new h(o.b(i13, i14, i15, true, sVar));
    }

    public static final i g() {
        return new i(new Paint(7));
    }

    public static final k h() {
        return new k(new Path());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long i(float r17, float r18, float r19, float r20, c3.d r21) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.a.i(float, float, float, float, c3.d):long");
    }

    public static final float j(int i13, int i14, float[] fArr, float[] fArr2) {
        int i15 = i13 * 4;
        return (fArr[i15 + 3] * fArr2[12 + i14]) + (fArr[i15 + 2] * fArr2[8 + i14]) + (fArr[i15 + 1] * fArr2[4 + i14]) + (fArr[i15] * fArr2[i14]);
    }

    public static final Path.Direction k(n0 n0Var) {
        int i13 = n.f21343a[n0Var.ordinal()];
        if (i13 == 1) {
            return Path.Direction.CCW;
        }
        if (i13 == 2) {
            return Path.Direction.CW;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Bitmap l(f0 f0Var) {
        if (f0Var instanceof h) {
            return ((h) f0Var).f21320a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long m(long j13, long j14) {
        float f13;
        float f14;
        long a13 = w.a(j13, w.f(j14));
        float d2 = w.d(j14);
        float d13 = w.d(a13);
        float f15 = 1.0f - d13;
        float f16 = (d2 * f15) + d13;
        float h10 = w.h(a13);
        float h13 = w.h(j14);
        float f17 = 0.0f;
        if (f16 == 0.0f) {
            f13 = 0.0f;
        } else {
            f13 = (((h13 * d2) * f15) + (h10 * d13)) / f16;
        }
        float g13 = w.g(a13);
        float g14 = w.g(j14);
        if (f16 == 0.0f) {
            f14 = 0.0f;
        } else {
            f14 = (((g14 * d2) * f15) + (g13 * d13)) / f16;
        }
        float e13 = w.e(a13);
        float e14 = w.e(j14);
        if (f16 != 0.0f) {
            f17 = (((e14 * d2) * f15) + (e13 * d13)) / f16;
        }
        return i(f13, f14, f17, f16, w.f(j14));
    }

    public static final q n(q qVar, Function1 function1) {
        return qVar.j(new BlockGraphicsLayerElement(function1));
    }

    public static q o(q qVar, float f13, float f14, float f15, float f16, x0 x0Var, boolean z13, int i13) {
        float f17 = (i13 & 1) != 0 ? 1.0f : f13;
        float f18 = (i13 & 2) != 0 ? 1.0f : f14;
        float f19 = (i13 & 4) != 0 ? 1.0f : f15;
        float f23 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? 0.0f : f16;
        long j13 = b1.f21304b;
        x0 x0Var2 = (i13 & 2048) != 0 ? s0.f21349a : x0Var;
        boolean z14 = (i13 & 4096) != 0 ? false : z13;
        long j14 = b3.e0.f21313a;
        return qVar.j(new GraphicsLayerElement(f17, f18, f19, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f23, 8.0f, j13, x0Var2, z14, j14, j14, 0));
    }

    public static final long p(long j13, long j14, float f13) {
        c3.n nVar = f.f25511t;
        long a13 = w.a(j13, nVar);
        long a14 = w.a(j14, nVar);
        float d2 = w.d(a13);
        float h10 = w.h(a13);
        float g13 = w.g(a13);
        float e13 = w.e(a13);
        float d13 = w.d(a14);
        float h13 = w.h(a14);
        float g14 = w.g(a14);
        float e14 = w.e(a14);
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        return w.a(i(tb.f.U(h10, h13, f13), tb.f.U(g13, g14, f13), tb.f.U(e13, e14, f13), tb.f.U(d2, d13, f13), nVar), w.f(j14));
    }

    public static final float q(long j13) {
        c3.d f13 = w.f(j13);
        if (!c.a(f13.f25489b, c.f25483a)) {
            throw new IllegalArgumentException("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) c.b(f13.f25489b)));
        }
        double h10 = w.h(j13);
        c3.o oVar = ((s) f13).f25551p;
        double i13 = oVar.i(h10);
        float i14 = (float) ((oVar.i(w.e(j13)) * 0.0722d) + (oVar.i(w.g(j13)) * 0.7152d) + (i13 * 0.2126d));
        if (i14 < 0.0f) {
            i14 = 0.0f;
        }
        if (i14 > 1.0f) {
            return 1.0f;
        }
        return i14;
    }

    public static final void r(Matrix matrix, float[] fArr) {
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        float f16 = fArr[3];
        float f17 = fArr[4];
        float f18 = fArr[5];
        float f19 = fArr[6];
        float f23 = fArr[7];
        float f24 = fArr[8];
        float f25 = fArr[12];
        float f26 = fArr[13];
        float f27 = fArr[15];
        fArr[0] = f13;
        fArr[1] = f17;
        fArr[2] = f25;
        fArr[3] = f14;
        fArr[4] = f18;
        fArr[5] = f26;
        fArr[6] = f16;
        fArr[7] = f23;
        fArr[8] = f27;
        matrix.setValues(fArr);
        fArr[0] = f13;
        fArr[1] = f14;
        fArr[2] = f15;
        fArr[3] = f16;
        fArr[4] = f17;
        fArr[5] = f18;
        fArr[6] = f19;
        fArr[7] = f23;
        fArr[8] = f24;
    }

    public static final void s(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        float f16 = fArr[3];
        float f17 = fArr[4];
        float f18 = fArr[5];
        float f19 = fArr[6];
        float f23 = fArr[7];
        float f24 = fArr[8];
        fArr[0] = f13;
        fArr[1] = f16;
        fArr[2] = 0.0f;
        fArr[3] = f19;
        fArr[4] = f14;
        fArr[5] = f17;
        fArr[6] = 0.0f;
        fArr[7] = f23;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f15;
        fArr[13] = f18;
        fArr[14] = 0.0f;
        fArr[15] = f24;
    }

    public static final BlendMode t(int i13) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (s0.a(i13, 0)) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (s0.a(i13, 1)) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (s0.a(i13, 2)) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (s0.a(i13, 3)) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (s0.a(i13, 4)) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (s0.a(i13, 5)) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (s0.a(i13, 6)) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (s0.a(i13, 7)) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (s0.a(i13, 8)) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (s0.a(i13, 9)) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (s0.a(i13, 10)) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (s0.a(i13, 11)) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (s0.a(i13, 12)) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (s0.a(i13, 13)) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (s0.a(i13, 14)) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (s0.a(i13, 15)) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (s0.a(i13, 16)) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (s0.a(i13, 17)) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (s0.a(i13, 18)) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (s0.a(i13, 19)) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (s0.a(i13, 20)) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (s0.a(i13, 21)) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (s0.a(i13, 22)) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (s0.a(i13, 23)) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (s0.a(i13, 24)) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (s0.a(i13, 25)) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (s0.a(i13, 26)) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (s0.a(i13, 27)) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (s0.a(i13, 28)) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final int u(long j13) {
        float[] fArr = f.f25492a;
        long a13 = w.a(j13, f.f25494c) >>> 32;
        d0 d0Var = e0.f135207b;
        return (int) a13;
    }

    public static final Bitmap.Config v(int i13) {
        return g0.a(i13, 0) ? Bitmap.Config.ARGB_8888 : g0.a(i13, 1) ? Bitmap.Config.ALPHA_8 : g0.a(i13, 2) ? Bitmap.Config.RGB_565 : g0.a(i13, 3) ? Bitmap.Config.RGBA_F16 : g0.a(i13, 4) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final PorterDuff.Mode w(int i13) {
        return s0.a(i13, 0) ? PorterDuff.Mode.CLEAR : s0.a(i13, 1) ? PorterDuff.Mode.SRC : s0.a(i13, 2) ? PorterDuff.Mode.DST : s0.a(i13, 3) ? PorterDuff.Mode.SRC_OVER : s0.a(i13, 4) ? PorterDuff.Mode.DST_OVER : s0.a(i13, 5) ? PorterDuff.Mode.SRC_IN : s0.a(i13, 6) ? PorterDuff.Mode.DST_IN : s0.a(i13, 7) ? PorterDuff.Mode.SRC_OUT : s0.a(i13, 8) ? PorterDuff.Mode.DST_OUT : s0.a(i13, 9) ? PorterDuff.Mode.SRC_ATOP : s0.a(i13, 10) ? PorterDuff.Mode.DST_ATOP : s0.a(i13, 11) ? PorterDuff.Mode.XOR : s0.a(i13, 12) ? PorterDuff.Mode.ADD : s0.a(i13, 14) ? PorterDuff.Mode.SCREEN : s0.a(i13, 15) ? PorterDuff.Mode.OVERLAY : s0.a(i13, 16) ? PorterDuff.Mode.DARKEN : s0.a(i13, 17) ? PorterDuff.Mode.LIGHTEN : s0.a(i13, 13) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        if (r3 <= 1.0000008f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r3 >= (-8.34465E-7f)) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
    
        r3 = Float.NaN;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int x(float r3, float[] r4, int r5) {
        /*
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r2 = 2143289344(0x7fc00000, float:NaN)
            if (r1 >= 0) goto L11
            r1 = -1251999744(0xffffffffb5600000, float:-8.34465E-7)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 < 0) goto Lf
        Ld:
            r3 = r0
            goto L1f
        Lf:
            r3 = r2
            goto L1f
        L11:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L1f
            r1 = 1065353223(0x3f800007, float:1.0000008)
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 > 0) goto Lf
            goto Ld
        L1f:
            r4[r5] = r3
            boolean r3 = java.lang.Float.isNaN(r3)
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.a.x(float, float[], int):int");
    }
}
