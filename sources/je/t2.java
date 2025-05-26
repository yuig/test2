package je;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* loaded from: classes3.dex */
public final class t2 {

    /* renamed from: g, reason: collision with root package name */
    public static HashSet f75774g;

    /* renamed from: a, reason: collision with root package name */
    public final Canvas f75775a;

    /* renamed from: b, reason: collision with root package name */
    public j2 f75776b;

    /* renamed from: c, reason: collision with root package name */
    public r2 f75777c;

    /* renamed from: d, reason: collision with root package name */
    public Stack f75778d;

    /* renamed from: e, reason: collision with root package name */
    public Stack f75779e;

    /* renamed from: f, reason: collision with root package name */
    public Stack f75780f;

    public t2(Canvas canvas) {
        this.f75775a = canvas;
    }

    public static Path A(v0 v0Var) {
        Path path = new Path();
        float[] fArr = v0Var.f75801o;
        path.moveTo(fArr[0], fArr[1]);
        int i13 = 2;
        while (true) {
            float[] fArr2 = v0Var.f75801o;
            if (i13 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i13], fArr2[i13 + 1]);
            i13 += 2;
        }
        if (v0Var instanceof w0) {
            path.close();
        }
        if (v0Var.f75725h == null) {
            v0Var.f75725h = c(path);
        }
        return path;
    }

    public static void O(r2 r2Var, boolean z13, s1 s1Var) {
        int i13;
        j1 j1Var = r2Var.f75759a;
        float floatValue = (z13 ? j1Var.f75645d : j1Var.f75647f).floatValue();
        if (s1Var instanceof c0) {
            i13 = ((c0) s1Var).f75568a;
        } else if (!(s1Var instanceof d0)) {
            return;
        } else {
            i13 = r2Var.f75759a.f75655n.f75568a;
        }
        int i14 = i(i13, floatValue);
        if (z13) {
            r2Var.f75762d.setColor(i14);
        } else {
            r2Var.f75763e.setColor(i14);
        }
    }

    public static void a(float f13, float f14, float f15, float f16, float f17, boolean z13, boolean z14, float f18, float f19, t0 t0Var) {
        if (f13 == f18 && f14 == f19) {
            return;
        }
        if (f15 == 0.0f || f16 == 0.0f) {
            t0Var.f(f18, f19);
            return;
        }
        float abs = Math.abs(f15);
        float abs2 = Math.abs(f16);
        double radians = Math.toRadians(f17 % 360.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d2 = (f13 - f18) / 2.0d;
        double d13 = (f14 - f19) / 2.0d;
        double d14 = (sin * d13) + (cos * d2);
        double d15 = (d13 * cos) + ((-sin) * d2);
        double d16 = abs * abs;
        double d17 = abs2 * abs2;
        double d18 = d14 * d14;
        double d19 = d15 * d15;
        double d23 = (d19 / d17) + (d18 / d16);
        if (d23 > 0.99999d) {
            double sqrt = Math.sqrt(d23) * 1.00001d;
            abs = (float) (abs * sqrt);
            abs2 = (float) (sqrt * abs2);
            d16 = abs * abs;
            d17 = abs2 * abs2;
        }
        double d24 = z13 == z14 ? -1.0d : 1.0d;
        double d25 = d16 * d17;
        double d26 = d16 * d19;
        double d27 = d17 * d18;
        double d28 = ((d25 - d26) - d27) / (d26 + d27);
        if (d28 < 0.0d) {
            d28 = 0.0d;
        }
        double sqrt2 = Math.sqrt(d28) * d24;
        double d29 = abs;
        double d33 = abs2;
        double d34 = ((d29 * d15) / d33) * sqrt2;
        float f23 = abs;
        float f24 = abs2;
        double d35 = sqrt2 * (-((d33 * d14) / d29));
        double d36 = ((cos * d34) - (sin * d35)) + ((f13 + f18) / 2.0d);
        double d37 = (cos * d35) + (sin * d34) + ((f14 + f19) / 2.0d);
        double d38 = (d14 - d34) / d29;
        double d39 = (d15 - d35) / d33;
        double d43 = ((-d14) - d34) / d29;
        double d44 = ((-d15) - d35) / d33;
        double d45 = (d39 * d39) + (d38 * d38);
        double acos = Math.acos(d38 / Math.sqrt(d45)) * (d39 < 0.0d ? -1.0d : 1.0d);
        double sqrt3 = ((d39 * d44) + (d38 * d43)) / Math.sqrt(((d44 * d44) + (d43 * d43)) * d45);
        double acos2 = ((d38 * d44) - (d39 * d43) < 0.0d ? -1.0d : 1.0d) * (sqrt3 < -1.0d ? 3.141592653589793d : sqrt3 > 1.0d ? 0.0d : Math.acos(sqrt3));
        if (!z14 && acos2 > 0.0d) {
            acos2 -= 6.283185307179586d;
        } else if (z14 && acos2 < 0.0d) {
            acos2 += 6.283185307179586d;
        }
        double d46 = acos2 % 6.283185307179586d;
        double d47 = acos % 6.283185307179586d;
        int ceil = (int) Math.ceil((Math.abs(d46) * 2.0d) / 3.141592653589793d);
        double d48 = d46 / ceil;
        double d49 = d48 / 2.0d;
        double sin2 = (Math.sin(d49) * 1.3333333333333333d) / (Math.cos(d49) + 1.0d);
        int i13 = ceil * 6;
        float[] fArr = new float[i13];
        int i14 = 0;
        int i15 = 0;
        while (i14 < ceil) {
            double d53 = (i14 * d48) + d47;
            double cos2 = Math.cos(d53);
            double sin3 = Math.sin(d53);
            fArr[i15] = (float) (cos2 - (sin2 * sin3));
            int i16 = ceil;
            fArr[i15 + 1] = (float) ((cos2 * sin2) + sin3);
            double d54 = d53 + d48;
            double cos3 = Math.cos(d54);
            double sin4 = Math.sin(d54);
            fArr[i15 + 2] = (float) ((sin2 * sin4) + cos3);
            fArr[i15 + 3] = (float) (sin4 - (sin2 * cos3));
            int i17 = i15 + 5;
            fArr[i15 + 4] = (float) cos3;
            i15 += 6;
            fArr[i17] = (float) sin4;
            i14++;
            d37 = d37;
            i13 = i13;
            d47 = d47;
            ceil = i16;
            d48 = d48;
        }
        int i18 = i13;
        Matrix matrix = new Matrix();
        matrix.postScale(f23, f24);
        matrix.postRotate(f17);
        matrix.postTranslate((float) d36, (float) d37);
        matrix.mapPoints(fArr);
        fArr[i18 - 2] = f18;
        fArr[i18 - 1] = f19;
        for (int i19 = 0; i19 < i18; i19 += 6) {
            t0Var.c(fArr[i19], fArr[i19 + 1], fArr[i19 + 2], fArr[i19 + 3], fArr[i19 + 4], fArr[i19 + 5]);
        }
    }

    public static z c(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new z(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r1 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Matrix e(je.z r9, je.z r10, je.v r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L91
            je.t r1 = r11.f75799a
            if (r1 != 0) goto Ld
            goto L91
        Ld:
            float r2 = r9.f75825c
            float r3 = r10.f75825c
            float r2 = r2 / r3
            float r3 = r9.f75826d
            float r4 = r10.f75826d
            float r3 = r3 / r4
            float r4 = r10.f75823a
            float r4 = -r4
            float r5 = r10.f75824b
            float r5 = -r5
            je.v r6 = je.v.f75797c
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L33
            float r10 = r9.f75823a
            float r9 = r9.f75824b
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        L33:
            je.u r6 = je.u.slice
            je.u r11 = r11.f75800b
            if (r11 != r6) goto L3e
            float r11 = java.lang.Math.max(r2, r3)
            goto L42
        L3e:
            float r11 = java.lang.Math.min(r2, r3)
        L42:
            float r2 = r9.f75825c
            float r2 = r2 / r11
            float r3 = r9.f75826d
            float r3 = r3 / r11
            int[] r6 = je.k2.f75675a
            int r7 = r1.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L5b;
                case 2: goto L5b;
                case 3: goto L5b;
                case 4: goto L56;
                case 5: goto L56;
                case 6: goto L56;
                default: goto L55;
            }
        L55:
            goto L60
        L56:
            float r7 = r10.f75825c
            float r7 = r7 - r2
        L59:
            float r4 = r4 - r7
            goto L60
        L5b:
            float r7 = r10.f75825c
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L59
        L60:
            int r1 = r1.ordinal()
            r1 = r6[r1]
            r2 = 2
            if (r1 == r2) goto L7f
            r2 = 3
            if (r1 == r2) goto L7a
            r2 = 5
            if (r1 == r2) goto L7f
            r2 = 6
            if (r1 == r2) goto L7a
            r2 = 7
            if (r1 == r2) goto L7f
            r2 = 8
            if (r1 == r2) goto L7a
            goto L84
        L7a:
            float r10 = r10.f75826d
            float r10 = r10 - r3
        L7d:
            float r5 = r5 - r10
            goto L84
        L7f:
            float r10 = r10.f75826d
            float r10 = r10 - r3
            float r10 = r10 / r8
            goto L7d
        L84:
            float r10 = r9.f75823a
            float r9 = r9.f75824b
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: je.t2.e(je.z, je.z, je.v):android.graphics.Matrix");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r5.equals("sans-serif") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface h(java.lang.String r5, java.lang.Integer r6, je.b1 r7) {
        /*
            je.b1 r0 = je.b1.Italic
            r1 = 0
            r2 = 1
            if (r7 != r0) goto L8
            r7 = r2
            goto L9
        L8:
            r7 = r1
        L9:
            int r6 = r6.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            r3 = 3
            r4 = 2
            if (r6 <= r0) goto L19
            if (r7 == 0) goto L17
            r6 = r3
            goto L1e
        L17:
            r6 = r2
            goto L1e
        L19:
            if (r7 == 0) goto L1d
            r6 = r4
            goto L1e
        L1d:
            r6 = r1
        L1e:
            r5.getClass()
            int r7 = r5.hashCode()
            r0 = -1
            switch(r7) {
                case -1536685117: goto L57;
                case -1431958525: goto L4c;
                case -1081737434: goto L41;
                case 109326717: goto L36;
                case 1126973893: goto L2b;
                default: goto L29;
            }
        L29:
            r1 = r0
            goto L60
        L2b:
            java.lang.String r7 = "cursive"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L34
            goto L29
        L34:
            r1 = 4
            goto L60
        L36:
            java.lang.String r7 = "serif"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L3f
            goto L29
        L3f:
            r1 = r3
            goto L60
        L41:
            java.lang.String r7 = "fantasy"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L4a
            goto L29
        L4a:
            r1 = r4
            goto L60
        L4c:
            java.lang.String r7 = "monospace"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L55
            goto L29
        L55:
            r1 = r2
            goto L60
        L57:
            java.lang.String r7 = "sans-serif"
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L60
            goto L29
        L60:
            switch(r1) {
                case 0: goto L81;
                case 1: goto L7a;
                case 2: goto L73;
                case 3: goto L6c;
                case 4: goto L65;
                default: goto L63;
            }
        L63:
            r5 = 0
            goto L87
        L65:
            android.graphics.Typeface r5 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            goto L87
        L6c:
            android.graphics.Typeface r5 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            goto L87
        L73:
            android.graphics.Typeface r5 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            goto L87
        L7a:
            android.graphics.Typeface r5 = android.graphics.Typeface.MONOSPACE
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            goto L87
        L81:
            android.graphics.Typeface r5 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
        L87:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: je.t2.h(java.lang.String, java.lang.Integer, je.b1):android.graphics.Typeface");
    }

    public static int i(int i13, float f13) {
        int i14 = 255;
        int round = Math.round(((i13 >> 24) & 255) * f13);
        if (round < 0) {
            i14 = 0;
        } else if (round <= 255) {
            i14 = round;
        }
        return (i13 & 16777215) | (i14 << 24);
    }

    public static void o(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void q(g0 g0Var, String str) {
        p1 g13 = g0Var.f75757a.g(str);
        if (g13 == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(g13 instanceof g0)) {
            o("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (g13 == g0Var) {
            o("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        g0 g0Var2 = (g0) g13;
        if (g0Var.f75611i == null) {
            g0Var.f75611i = g0Var2.f75611i;
        }
        if (g0Var.f75612j == null) {
            g0Var.f75612j = g0Var2.f75612j;
        }
        if (g0Var.f75613k == null) {
            g0Var.f75613k = g0Var2.f75613k;
        }
        if (g0Var.f75610h.isEmpty()) {
            g0Var.f75610h = g0Var2.f75610h;
        }
        try {
            if (g0Var instanceof q1) {
                q1 q1Var = (q1) g0Var;
                q1 q1Var2 = (q1) g13;
                if (q1Var.f75746m == null) {
                    q1Var.f75746m = q1Var2.f75746m;
                }
                if (q1Var.f75747n == null) {
                    q1Var.f75747n = q1Var2.f75747n;
                }
                if (q1Var.f75748o == null) {
                    q1Var.f75748o = q1Var2.f75748o;
                }
                if (q1Var.f75749p == null) {
                    q1Var.f75749p = q1Var2.f75749p;
                }
            } else {
                r((u1) g0Var, (u1) g13);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = g0Var2.f75614l;
        if (str2 != null) {
            q(g0Var, str2);
        }
    }

    public static void r(u1 u1Var, u1 u1Var2) {
        if (u1Var.f75789m == null) {
            u1Var.f75789m = u1Var2.f75789m;
        }
        if (u1Var.f75790n == null) {
            u1Var.f75790n = u1Var2.f75790n;
        }
        if (u1Var.f75791o == null) {
            u1Var.f75791o = u1Var2.f75791o;
        }
        if (u1Var.f75792p == null) {
            u1Var.f75792p = u1Var2.f75792p;
        }
        if (u1Var.f75793q == null) {
            u1Var.f75793q = u1Var2.f75793q;
        }
    }

    public static void s(u0 u0Var, String str) {
        p1 g13 = u0Var.f75757a.g(str);
        if (g13 == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(g13 instanceof u0)) {
            o("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (g13 == u0Var) {
            o("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        u0 u0Var2 = (u0) g13;
        if (u0Var.f75781p == null) {
            u0Var.f75781p = u0Var2.f75781p;
        }
        if (u0Var.f75782q == null) {
            u0Var.f75782q = u0Var2.f75782q;
        }
        if (u0Var.f75783r == null) {
            u0Var.f75783r = u0Var2.f75783r;
        }
        if (u0Var.f75784s == null) {
            u0Var.f75784s = u0Var2.f75784s;
        }
        if (u0Var.f75785t == null) {
            u0Var.f75785t = u0Var2.f75785t;
        }
        if (u0Var.f75786u == null) {
            u0Var.f75786u = u0Var2.f75786u;
        }
        if (u0Var.f75787v == null) {
            u0Var.f75787v = u0Var2.f75787v;
        }
        if (u0Var.f75696i.isEmpty()) {
            u0Var.f75696i = u0Var2.f75696i;
        }
        if (u0Var.f75802o == null) {
            u0Var.f75802o = u0Var2.f75802o;
        }
        if (u0Var.f75773n == null) {
            u0Var.f75773n = u0Var2.f75773n;
        }
        String str2 = u0Var2.f75788w;
        if (str2 != null) {
            s(u0Var, str2);
        }
    }

    public static boolean x(j1 j1Var, long j13) {
        return (j1Var.f75642a & j13) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Path B(je.x0 r24) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: je.t2.B(je.x0):android.graphics.Path");
    }

    public final z C(m0 m0Var, m0 m0Var2, m0 m0Var3, m0 m0Var4) {
        float g13 = m0Var != null ? m0Var.g(this) : 0.0f;
        float h10 = m0Var2 != null ? m0Var2.h(this) : 0.0f;
        r2 r2Var = this.f75777c;
        z zVar = r2Var.f75765g;
        if (zVar == null) {
            zVar = r2Var.f75764f;
        }
        return new z(g13, h10, m0Var3 != null ? m0Var3.g(this) : zVar.f75825c, m0Var4 != null ? m0Var4.h(this) : zVar.f75826d);
    }

    public final Path D(o1 o1Var, boolean z13) {
        Path path;
        Path b13;
        this.f75778d.push(this.f75777c);
        r2 r2Var = new r2(this.f75777c);
        this.f75777c = r2Var;
        U(r2Var, o1Var);
        if (!k() || !W()) {
            this.f75777c = (r2) this.f75778d.pop();
            return null;
        }
        if (o1Var instanceof h2) {
            if (!z13) {
                o("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            h2 h2Var = (h2) o1Var;
            p1 g13 = o1Var.f75757a.g(h2Var.f75623o);
            if (g13 == null) {
                o("Use reference '%s' not found", h2Var.f75623o);
                this.f75777c = (r2) this.f75778d.pop();
                return null;
            }
            if (!(g13 instanceof o1)) {
                this.f75777c = (r2) this.f75778d.pop();
                return null;
            }
            path = D((o1) g13, false);
            if (path == null) {
                return null;
            }
            if (h2Var.f75725h == null) {
                h2Var.f75725h = c(path);
            }
            Matrix matrix = h2Var.f75640n;
            if (matrix != null) {
                path.transform(matrix);
            }
        } else if (o1Var instanceof i0) {
            i0 i0Var = (i0) o1Var;
            if (o1Var instanceof s0) {
                path = (Path) new n2(this, ((s0) o1Var).f75770o).f75714c;
                if (o1Var.f75725h == null) {
                    o1Var.f75725h = c(path);
                }
            } else {
                path = o1Var instanceof x0 ? B((x0) o1Var) : o1Var instanceof a0 ? y((a0) o1Var) : o1Var instanceof f0 ? z((f0) o1Var) : o1Var instanceof v0 ? A((v0) o1Var) : null;
            }
            if (path == null) {
                return null;
            }
            if (i0Var.f75725h == null) {
                i0Var.f75725h = c(path);
            }
            Matrix matrix2 = i0Var.f75638n;
            if (matrix2 != null) {
                path.transform(matrix2);
            }
            path.setFillType(w());
        } else {
            if (!(o1Var instanceof a2)) {
                o("Invalid %s element found in clipPath definition", o1Var.n());
                return null;
            }
            a2 a2Var = (a2) o1Var;
            ArrayList arrayList = a2Var.f75590n;
            float f13 = 0.0f;
            float g14 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((m0) a2Var.f75590n.get(0)).g(this);
            ArrayList arrayList2 = a2Var.f75591o;
            float h10 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((m0) a2Var.f75591o.get(0)).h(this);
            ArrayList arrayList3 = a2Var.f75592p;
            float g15 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((m0) a2Var.f75592p.get(0)).g(this);
            ArrayList arrayList4 = a2Var.f75593q;
            if (arrayList4 != null && arrayList4.size() != 0) {
                f13 = ((m0) a2Var.f75593q.get(0)).h(this);
            }
            if (this.f75777c.f75759a.f75662u != f1.Start) {
                float d2 = d(a2Var);
                if (this.f75777c.f75759a.f75662u == f1.Middle) {
                    d2 /= 2.0f;
                }
                g14 -= d2;
            }
            if (a2Var.f75725h == null) {
                q2 q2Var = new q2(this, g14, h10);
                n(a2Var, q2Var);
                RectF rectF = (RectF) q2Var.f75754f;
                a2Var.f75725h = new z(rectF.left, rectF.top, rectF.width(), ((RectF) q2Var.f75754f).height());
            }
            Path path2 = new Path();
            n(a2Var, new q2(g14 + g15, h10 + f13, path2, this));
            Matrix matrix3 = a2Var.f75557r;
            if (matrix3 != null) {
                path2.transform(matrix3);
            }
            path2.setFillType(w());
            path = path2;
        }
        if (this.f75777c.f75759a.E != null && (b13 = b(o1Var, o1Var.f75725h)) != null) {
            path.op(b13, Path.Op.INTERSECT);
        }
        this.f75777c = (r2) this.f75778d.pop();
        return path;
    }

    public final void E(z zVar) {
        if (this.f75777c.f75759a.G != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            Canvas canvas = this.f75775a;
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            p0 p0Var = (p0) this.f75776b.g(this.f75777c.f75759a.G);
            M(p0Var, zVar);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            M(p0Var, zVar);
            canvas.restore();
            canvas.restore();
        }
        P();
    }

    public final boolean F() {
        p1 g13;
        int i13 = 0;
        if (this.f75777c.f75759a.f75654m.floatValue() >= 1.0f && this.f75777c.f75759a.G == null) {
            return false;
        }
        int floatValue = (int) (this.f75777c.f75759a.f75654m.floatValue() * 256.0f);
        if (floatValue >= 0) {
            i13 = 255;
            if (floatValue <= 255) {
                i13 = floatValue;
            }
        }
        this.f75775a.saveLayerAlpha(null, i13, 31);
        this.f75778d.push(this.f75777c);
        r2 r2Var = new r2(this.f75777c);
        this.f75777c = r2Var;
        String str = r2Var.f75759a.G;
        if (str != null && ((g13 = this.f75776b.g(str)) == null || !(g13 instanceof p0))) {
            o("Mask reference '%s' not found", this.f75777c.f75759a.G);
            this.f75777c.f75759a.G = null;
        }
        return true;
    }

    public final void G(k1 k1Var, z zVar, z zVar2, v vVar) {
        if (zVar.f75825c == 0.0f || zVar.f75826d == 0.0f) {
            return;
        }
        if (vVar == null && (vVar = k1Var.f75773n) == null) {
            vVar = v.f75798d;
        }
        U(this.f75777c, k1Var);
        if (k()) {
            r2 r2Var = this.f75777c;
            r2Var.f75764f = zVar;
            if (!r2Var.f75759a.f75663v.booleanValue()) {
                z zVar3 = this.f75777c.f75764f;
                N(zVar3.f75823a, zVar3.f75824b, zVar3.f75825c, zVar3.f75826d);
            }
            f(k1Var, this.f75777c.f75764f);
            Canvas canvas = this.f75775a;
            if (zVar2 != null) {
                canvas.concat(e(this.f75777c.f75764f, zVar2, vVar));
                this.f75777c.f75765g = k1Var.f75802o;
            } else {
                z zVar4 = this.f75777c.f75764f;
                canvas.translate(zVar4.f75823a, zVar4.f75824b);
            }
            boolean F = F();
            V();
            I(k1Var, true);
            if (F) {
                E(k1Var.f75725h);
            }
            S(k1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(r1 r1Var) {
        m0 m0Var;
        String str;
        int indexOf;
        Set a13;
        m0 m0Var2;
        Boolean bool;
        if (r1Var instanceof q0) {
            return;
        }
        Q();
        if ((r1Var instanceof p1) && (bool = ((p1) r1Var).f75735d) != null) {
            this.f75777c.f75766h = bool.booleanValue();
        }
        if (r1Var instanceof k1) {
            k1 k1Var = (k1) r1Var;
            G(k1Var, C(k1Var.f75671p, k1Var.f75672q, k1Var.f75673r, k1Var.f75674s), k1Var.f75802o, k1Var.f75773n);
        } else {
            Bitmap bitmap = null;
            if (r1Var instanceof h2) {
                h2 h2Var = (h2) r1Var;
                m0 m0Var3 = h2Var.f75626r;
                if ((m0Var3 == null || !m0Var3.j()) && ((m0Var2 = h2Var.f75627s) == null || !m0Var2.j())) {
                    U(this.f75777c, h2Var);
                    if (k()) {
                        r1 g13 = h2Var.f75757a.g(h2Var.f75623o);
                        if (g13 == null) {
                            o("Use reference '%s' not found", h2Var.f75623o);
                        } else {
                            Matrix matrix = h2Var.f75640n;
                            Canvas canvas = this.f75775a;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            m0 m0Var4 = h2Var.f75624p;
                            float g14 = m0Var4 != null ? m0Var4.g(this) : 0.0f;
                            m0 m0Var5 = h2Var.f75625q;
                            canvas.translate(g14, m0Var5 != null ? m0Var5.h(this) : 0.0f);
                            f(h2Var, h2Var.f75725h);
                            boolean F = F();
                            this.f75779e.push(h2Var);
                            this.f75780f.push(this.f75775a.getMatrix());
                            if (g13 instanceof k1) {
                                k1 k1Var2 = (k1) g13;
                                z C = C(null, null, h2Var.f75626r, h2Var.f75627s);
                                Q();
                                G(k1Var2, C, k1Var2.f75802o, k1Var2.f75773n);
                                P();
                            } else if (g13 instanceof x1) {
                                m0 m0Var6 = h2Var.f75626r;
                                if (m0Var6 == null) {
                                    m0Var6 = new m0(100.0f, g2.percent);
                                }
                                m0 m0Var7 = h2Var.f75627s;
                                if (m0Var7 == null) {
                                    m0Var7 = new m0(100.0f, g2.percent);
                                }
                                z C2 = C(null, null, m0Var6, m0Var7);
                                Q();
                                x1 x1Var = (x1) g13;
                                if (C2.f75825c != 0.0f && C2.f75826d != 0.0f) {
                                    v vVar = x1Var.f75773n;
                                    if (vVar == null) {
                                        vVar = v.f75798d;
                                    }
                                    U(this.f75777c, x1Var);
                                    r2 r2Var = this.f75777c;
                                    r2Var.f75764f = C2;
                                    if (!r2Var.f75759a.f75663v.booleanValue()) {
                                        z zVar = this.f75777c.f75764f;
                                        N(zVar.f75823a, zVar.f75824b, zVar.f75825c, zVar.f75826d);
                                    }
                                    z zVar2 = x1Var.f75802o;
                                    if (zVar2 != null) {
                                        canvas.concat(e(this.f75777c.f75764f, zVar2, vVar));
                                        this.f75777c.f75765g = x1Var.f75802o;
                                    } else {
                                        z zVar3 = this.f75777c.f75764f;
                                        canvas.translate(zVar3.f75823a, zVar3.f75824b);
                                    }
                                    boolean F2 = F();
                                    I(x1Var, true);
                                    if (F2) {
                                        E(x1Var.f75725h);
                                    }
                                    S(x1Var);
                                }
                                P();
                            } else {
                                H(g13);
                            }
                            this.f75779e.pop();
                            this.f75780f.pop();
                            if (F) {
                                E(h2Var.f75725h);
                            }
                            S(h2Var);
                        }
                    }
                }
            } else if (r1Var instanceof w1) {
                w1 w1Var = (w1) r1Var;
                U(this.f75777c, w1Var);
                if (k()) {
                    Matrix matrix2 = w1Var.f75640n;
                    if (matrix2 != null) {
                        this.f75775a.concat(matrix2);
                    }
                    f(w1Var, w1Var.f75725h);
                    boolean F3 = F();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = w1Var.f75696i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        r1 r1Var2 = (r1) it.next();
                        if (r1Var2 instanceof l1) {
                            l1 l1Var = (l1) r1Var2;
                            if (l1Var.b() == null && ((a13 = l1Var.a()) == null || (!a13.isEmpty() && a13.contains(language)))) {
                                Set e13 = l1Var.e();
                                if (e13 != null) {
                                    if (f75774g == null) {
                                        synchronized (t2.class) {
                                            HashSet hashSet = new HashSet();
                                            f75774g = hashSet;
                                            hashSet.add("Structure");
                                            f75774g.add("BasicStructure");
                                            f75774g.add("ConditionalProcessing");
                                            f75774g.add("Image");
                                            f75774g.add("Style");
                                            f75774g.add("ViewportAttribute");
                                            f75774g.add("Shape");
                                            f75774g.add("BasicText");
                                            f75774g.add("PaintAttribute");
                                            f75774g.add("BasicPaintAttribute");
                                            f75774g.add("OpacityAttribute");
                                            f75774g.add("BasicGraphicsAttribute");
                                            f75774g.add("Marker");
                                            f75774g.add("Gradient");
                                            f75774g.add("Pattern");
                                            f75774g.add("Clip");
                                            f75774g.add("BasicClip");
                                            f75774g.add("Mask");
                                            f75774g.add("View");
                                        }
                                    }
                                    if (!e13.isEmpty() && f75774g.containsAll(e13)) {
                                    }
                                }
                                Set l13 = l1Var.l();
                                if (l13 == null) {
                                    Set m13 = l1Var.m();
                                    if (m13 == null) {
                                        H(r1Var2);
                                        break;
                                    }
                                    m13.isEmpty();
                                } else {
                                    l13.isEmpty();
                                }
                            }
                        }
                    }
                    if (F3) {
                        E(w1Var.f75725h);
                    }
                    S(w1Var);
                }
            } else if (r1Var instanceof j0) {
                j0 j0Var = (j0) r1Var;
                U(this.f75777c, j0Var);
                if (k()) {
                    Matrix matrix3 = j0Var.f75640n;
                    if (matrix3 != null) {
                        this.f75775a.concat(matrix3);
                    }
                    f(j0Var, j0Var.f75725h);
                    boolean F4 = F();
                    I(j0Var, true);
                    if (F4) {
                        E(j0Var.f75725h);
                    }
                    S(j0Var);
                }
            } else {
                if (r1Var instanceof l0) {
                    l0 l0Var = (l0) r1Var;
                    m0 m0Var8 = l0Var.f75682r;
                    if (m0Var8 != null && !m0Var8.j() && (m0Var = l0Var.f75683s) != null && !m0Var.j() && (str = l0Var.f75679o) != null) {
                        v vVar2 = l0Var.f75773n;
                        if (vVar2 == null) {
                            vVar2 = v.f75798d;
                        }
                        if (str.startsWith("data:") && str.length() >= 14 && (indexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(indexOf - 7, indexOf))) {
                            try {
                                byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                            } catch (Exception e14) {
                                Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e14);
                            }
                        }
                        if (bitmap != null) {
                            z zVar4 = new z(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                            U(this.f75777c, l0Var);
                            if (k() && W()) {
                                Matrix matrix4 = l0Var.f75684t;
                                Canvas canvas2 = this.f75775a;
                                if (matrix4 != null) {
                                    canvas2.concat(matrix4);
                                }
                                m0 m0Var9 = l0Var.f75680p;
                                float g15 = m0Var9 != null ? m0Var9.g(this) : 0.0f;
                                m0 m0Var10 = l0Var.f75681q;
                                float h10 = m0Var10 != null ? m0Var10.h(this) : 0.0f;
                                float g16 = l0Var.f75682r.g(this);
                                float g17 = l0Var.f75683s.g(this);
                                r2 r2Var2 = this.f75777c;
                                r2Var2.f75764f = new z(g15, h10, g16, g17);
                                if (!r2Var2.f75759a.f75663v.booleanValue()) {
                                    z zVar5 = this.f75777c.f75764f;
                                    N(zVar5.f75823a, zVar5.f75824b, zVar5.f75825c, zVar5.f75826d);
                                }
                                l0Var.f75725h = this.f75777c.f75764f;
                                S(l0Var);
                                f(l0Var, l0Var.f75725h);
                                boolean F5 = F();
                                V();
                                canvas2.save();
                                canvas2.concat(e(this.f75777c.f75764f, zVar4, vVar2));
                                canvas2.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(this.f75777c.f75759a.M != e1.optimizeSpeed ? 2 : 0));
                                canvas2.restore();
                                if (F5) {
                                    E(l0Var.f75725h);
                                }
                            }
                        }
                    }
                } else if (r1Var instanceof s0) {
                    s0 s0Var = (s0) r1Var;
                    if (s0Var.f75770o != null) {
                        U(this.f75777c, s0Var);
                        if (k() && W()) {
                            r2 r2Var3 = this.f75777c;
                            if (r2Var3.f75761c || r2Var3.f75760b) {
                                Matrix matrix5 = s0Var.f75638n;
                                if (matrix5 != null) {
                                    this.f75775a.concat(matrix5);
                                }
                                Path path = (Path) new n2(this, s0Var.f75770o).f75714c;
                                if (s0Var.f75725h == null) {
                                    s0Var.f75725h = c(path);
                                }
                                S(s0Var);
                                g(s0Var);
                                f(s0Var, s0Var.f75725h);
                                boolean F6 = F();
                                r2 r2Var4 = this.f75777c;
                                if (r2Var4.f75760b) {
                                    a1 a1Var = r2Var4.f75759a.f75644c;
                                    path.setFillType((a1Var == null || a1Var != a1.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    l(s0Var, path);
                                }
                                if (this.f75777c.f75761c) {
                                    m(path);
                                }
                                L(s0Var);
                                if (F6) {
                                    E(s0Var.f75725h);
                                }
                            }
                        }
                    }
                } else if (r1Var instanceof x0) {
                    x0 x0Var = (x0) r1Var;
                    m0 m0Var11 = x0Var.f75814q;
                    if (m0Var11 != null && x0Var.f75815r != null && !m0Var11.j() && !x0Var.f75815r.j()) {
                        U(this.f75777c, x0Var);
                        if (k() && W()) {
                            Matrix matrix6 = x0Var.f75638n;
                            if (matrix6 != null) {
                                this.f75775a.concat(matrix6);
                            }
                            Path B = B(x0Var);
                            S(x0Var);
                            g(x0Var);
                            f(x0Var, x0Var.f75725h);
                            boolean F7 = F();
                            if (this.f75777c.f75760b) {
                                l(x0Var, B);
                            }
                            if (this.f75777c.f75761c) {
                                m(B);
                            }
                            if (F7) {
                                E(x0Var.f75725h);
                            }
                        }
                    }
                } else if (r1Var instanceof a0) {
                    a0 a0Var = (a0) r1Var;
                    m0 m0Var12 = a0Var.f75556q;
                    if (m0Var12 != null && !m0Var12.j()) {
                        U(this.f75777c, a0Var);
                        if (k() && W()) {
                            Matrix matrix7 = a0Var.f75638n;
                            if (matrix7 != null) {
                                this.f75775a.concat(matrix7);
                            }
                            Path y13 = y(a0Var);
                            S(a0Var);
                            g(a0Var);
                            f(a0Var, a0Var.f75725h);
                            boolean F8 = F();
                            if (this.f75777c.f75760b) {
                                l(a0Var, y13);
                            }
                            if (this.f75777c.f75761c) {
                                m(y13);
                            }
                            if (F8) {
                                E(a0Var.f75725h);
                            }
                        }
                    }
                } else if (r1Var instanceof f0) {
                    f0 f0Var = (f0) r1Var;
                    m0 m0Var13 = f0Var.f75597q;
                    if (m0Var13 != null && f0Var.f75598r != null && !m0Var13.j() && !f0Var.f75598r.j()) {
                        U(this.f75777c, f0Var);
                        if (k() && W()) {
                            Matrix matrix8 = f0Var.f75638n;
                            if (matrix8 != null) {
                                this.f75775a.concat(matrix8);
                            }
                            Path z13 = z(f0Var);
                            S(f0Var);
                            g(f0Var);
                            f(f0Var, f0Var.f75725h);
                            boolean F9 = F();
                            if (this.f75777c.f75760b) {
                                l(f0Var, z13);
                            }
                            if (this.f75777c.f75761c) {
                                m(z13);
                            }
                            if (F9) {
                                E(f0Var.f75725h);
                            }
                        }
                    }
                } else if (r1Var instanceof n0) {
                    n0 n0Var = (n0) r1Var;
                    U(this.f75777c, n0Var);
                    if (k() && W() && this.f75777c.f75761c) {
                        Matrix matrix9 = n0Var.f75638n;
                        if (matrix9 != null) {
                            this.f75775a.concat(matrix9);
                        }
                        m0 m0Var14 = n0Var.f75708o;
                        float g18 = m0Var14 == null ? 0.0f : m0Var14.g(this);
                        m0 m0Var15 = n0Var.f75709p;
                        float h13 = m0Var15 == null ? 0.0f : m0Var15.h(this);
                        m0 m0Var16 = n0Var.f75710q;
                        float g19 = m0Var16 == null ? 0.0f : m0Var16.g(this);
                        m0 m0Var17 = n0Var.f75711r;
                        r3 = m0Var17 != null ? m0Var17.h(this) : 0.0f;
                        if (n0Var.f75725h == null) {
                            n0Var.f75725h = new z(Math.min(g18, g19), Math.min(h13, r3), Math.abs(g19 - g18), Math.abs(r3 - h13));
                        }
                        Path path2 = new Path();
                        path2.moveTo(g18, h13);
                        path2.lineTo(g19, r3);
                        S(n0Var);
                        g(n0Var);
                        f(n0Var, n0Var.f75725h);
                        boolean F10 = F();
                        m(path2);
                        L(n0Var);
                        if (F10) {
                            E(n0Var.f75725h);
                        }
                    }
                } else if (r1Var instanceof w0) {
                    w0 w0Var = (w0) r1Var;
                    U(this.f75777c, w0Var);
                    if (k() && W()) {
                        r2 r2Var5 = this.f75777c;
                        if (r2Var5.f75761c || r2Var5.f75760b) {
                            Matrix matrix10 = w0Var.f75638n;
                            if (matrix10 != null) {
                                this.f75775a.concat(matrix10);
                            }
                            if (w0Var.f75801o.length >= 2) {
                                Path A = A(w0Var);
                                S(w0Var);
                                g(w0Var);
                                f(w0Var, w0Var.f75725h);
                                boolean F11 = F();
                                if (this.f75777c.f75760b) {
                                    l(w0Var, A);
                                }
                                if (this.f75777c.f75761c) {
                                    m(A);
                                }
                                L(w0Var);
                                if (F11) {
                                    E(w0Var.f75725h);
                                }
                            }
                        }
                    }
                } else if (r1Var instanceof v0) {
                    v0 v0Var = (v0) r1Var;
                    U(this.f75777c, v0Var);
                    if (k() && W()) {
                        r2 r2Var6 = this.f75777c;
                        if (r2Var6.f75761c || r2Var6.f75760b) {
                            Matrix matrix11 = v0Var.f75638n;
                            if (matrix11 != null) {
                                this.f75775a.concat(matrix11);
                            }
                            if (v0Var.f75801o.length >= 2) {
                                Path A2 = A(v0Var);
                                S(v0Var);
                                a1 a1Var2 = this.f75777c.f75759a.f75644c;
                                A2.setFillType((a1Var2 == null || a1Var2 != a1.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                g(v0Var);
                                f(v0Var, v0Var.f75725h);
                                boolean F12 = F();
                                if (this.f75777c.f75760b) {
                                    l(v0Var, A2);
                                }
                                if (this.f75777c.f75761c) {
                                    m(A2);
                                }
                                L(v0Var);
                                if (F12) {
                                    E(v0Var.f75725h);
                                }
                            }
                        }
                    }
                } else if (r1Var instanceof a2) {
                    a2 a2Var = (a2) r1Var;
                    U(this.f75777c, a2Var);
                    if (k()) {
                        Matrix matrix12 = a2Var.f75557r;
                        if (matrix12 != null) {
                            this.f75775a.concat(matrix12);
                        }
                        ArrayList arrayList = a2Var.f75590n;
                        float g23 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((m0) a2Var.f75590n.get(0)).g(this);
                        ArrayList arrayList2 = a2Var.f75591o;
                        float h14 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((m0) a2Var.f75591o.get(0)).h(this);
                        ArrayList arrayList3 = a2Var.f75592p;
                        float g24 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((m0) a2Var.f75592p.get(0)).g(this);
                        ArrayList arrayList4 = a2Var.f75593q;
                        if (arrayList4 != null && arrayList4.size() != 0) {
                            r3 = ((m0) a2Var.f75593q.get(0)).h(this);
                        }
                        f1 v13 = v();
                        if (v13 != f1.Start) {
                            float d2 = d(a2Var);
                            if (v13 == f1.Middle) {
                                d2 /= 2.0f;
                            }
                            g23 -= d2;
                        }
                        if (a2Var.f75725h == null) {
                            q2 q2Var = new q2(this, g23, h14);
                            n(a2Var, q2Var);
                            RectF rectF = (RectF) q2Var.f75754f;
                            a2Var.f75725h = new z(rectF.left, rectF.top, rectF.width(), ((RectF) q2Var.f75754f).height());
                        }
                        S(a2Var);
                        g(a2Var);
                        f(a2Var, a2Var.f75725h);
                        boolean F13 = F();
                        n(a2Var, new p2(this, g23 + g24, h14 + r3));
                        if (F13) {
                            E(a2Var.f75725h);
                        }
                    }
                }
            }
        }
        P();
    }

    public final void I(n1 n1Var, boolean z13) {
        if (z13) {
            this.f75779e.push(n1Var);
            this.f75780f.push(this.f75775a.getMatrix());
        }
        Iterator it = n1Var.getChildren().iterator();
        while (it.hasNext()) {
            H((r1) it.next());
        }
        if (z13) {
            this.f75779e.pop();
            this.f75780f.pop();
        }
    }

    public final void J(j2 j2Var, x xVar) {
        z zVar;
        v vVar;
        List list;
        List list2;
        this.f75776b = j2Var;
        k1 k1Var = j2Var.f75668a;
        if (k1Var == null) {
            Log.w("SVGAndroidRenderer", "Nothing to render. Document is empty.");
            return;
        }
        String str = xVar.f75810d;
        if (str != null) {
            p1 b13 = j2Var.b(str);
            if (b13 == null || !(b13 instanceof i2)) {
                Log.w("SVGAndroidRenderer", "View element with id \"" + str + "\" not found.");
                return;
            }
            i2 i2Var = (i2) b13;
            zVar = i2Var.f75802o;
            if (zVar == null) {
                Log.w("SVGAndroidRenderer", "View element with id \"" + str + "\" is missing a viewBox attribute.");
                return;
            }
            vVar = i2Var.f75773n;
        } else {
            z zVar2 = xVar.f75809c;
            if (zVar2 == null) {
                zVar2 = k1Var.f75802o;
            }
            zVar = zVar2;
            vVar = xVar.f75808b;
            if (vVar == null) {
                vVar = k1Var.f75773n;
            }
        }
        za.c cVar = xVar.f75807a;
        if (cVar != null && (list2 = cVar.f141454b) != null && list2.size() > 0) {
            j2Var.f75669b.c(xVar.f75807a);
        }
        this.f75777c = new r2();
        this.f75778d = new Stack();
        T(this.f75777c, j1.a());
        r2 r2Var = this.f75777c;
        r2Var.f75764f = null;
        r2Var.f75766h = false;
        this.f75778d.push(new r2(r2Var));
        this.f75780f = new Stack();
        this.f75779e = new Stack();
        Boolean bool = k1Var.f75735d;
        if (bool != null) {
            this.f75777c.f75766h = bool.booleanValue();
        }
        Q();
        z zVar3 = new z(xVar.f75811e);
        m0 m0Var = k1Var.f75673r;
        if (m0Var != null) {
            zVar3.f75825c = m0Var.c(this, zVar3.f75825c);
        }
        m0 m0Var2 = k1Var.f75674s;
        if (m0Var2 != null) {
            zVar3.f75826d = m0Var2.c(this, zVar3.f75826d);
        }
        G(k1Var, zVar3, zVar, vVar);
        P();
        za.c cVar2 = xVar.f75807a;
        if (cVar2 == null || (list = cVar2.f141454b) == null || list.size() <= 0) {
            return;
        }
        r rVar = r.RenderOptions;
        List list3 = j2Var.f75669b.f141454b;
        if (list3 == null) {
            return;
        }
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            if (((o) it.next()).f75718c == rVar) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f9, code lost:
    
        if (r8 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K(je.o0 r13, je.m2 r14) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: je.t2.K(je.o0, je.m2):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014d A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(je.i0 r19) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: je.t2.L(je.i0):void");
    }

    public final void M(p0 p0Var, z zVar) {
        float f13;
        float f14;
        Boolean bool = p0Var.f75730n;
        if (bool == null || !bool.booleanValue()) {
            m0 m0Var = p0Var.f75732p;
            float c13 = m0Var != null ? m0Var.c(this, 1.0f) : 1.2f;
            m0 m0Var2 = p0Var.f75733q;
            float c14 = m0Var2 != null ? m0Var2.c(this, 1.0f) : 1.2f;
            f13 = c13 * zVar.f75825c;
            f14 = c14 * zVar.f75826d;
        } else {
            m0 m0Var3 = p0Var.f75732p;
            f13 = m0Var3 != null ? m0Var3.g(this) : zVar.f75825c;
            m0 m0Var4 = p0Var.f75733q;
            f14 = m0Var4 != null ? m0Var4.h(this) : zVar.f75826d;
        }
        if (f13 == 0.0f || f14 == 0.0f) {
            return;
        }
        Q();
        r2 t13 = t(p0Var);
        this.f75777c = t13;
        t13.f75759a.f75654m = Float.valueOf(1.0f);
        boolean F = F();
        Canvas canvas = this.f75775a;
        canvas.save();
        Boolean bool2 = p0Var.f75731o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(zVar.f75823a, zVar.f75824b);
            canvas.scale(zVar.f75825c, zVar.f75826d);
        }
        I(p0Var, false);
        canvas.restore();
        if (F) {
            E(zVar);
        }
        P();
    }

    public final void N(float f13, float f14, float f15, float f16) {
        float f17 = f15 + f13;
        float f18 = f16 + f14;
        m.h hVar = this.f75777c.f75759a.f75664w;
        if (hVar != null) {
            f13 += ((m0) hVar.f85200e).g(this);
            f14 += ((m0) this.f75777c.f75759a.f75664w.f85197b).h(this);
            f17 -= ((m0) this.f75777c.f75759a.f75664w.f85198c).g(this);
            f18 -= ((m0) this.f75777c.f75759a.f75664w.f85199d).h(this);
        }
        this.f75775a.clipRect(f13, f14, f17, f18);
    }

    public final void P() {
        this.f75775a.restore();
        this.f75777c = (r2) this.f75778d.pop();
    }

    public final void Q() {
        this.f75775a.save();
        this.f75778d.push(this.f75777c);
        this.f75777c = new r2(this.f75777c);
    }

    public final String R(String str, boolean z13, boolean z14) {
        if (this.f75777c.f75766h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z13) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z14) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    public final void S(o1 o1Var) {
        if (o1Var.f75758b == null || o1Var.f75725h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.f75780f.peek()).invert(matrix)) {
            z zVar = o1Var.f75725h;
            float f13 = zVar.f75823a;
            float f14 = zVar.f75824b;
            float a13 = zVar.a();
            z zVar2 = o1Var.f75725h;
            float f15 = zVar2.f75824b;
            float a14 = zVar2.a();
            float b13 = o1Var.f75725h.b();
            z zVar3 = o1Var.f75725h;
            float[] fArr = {f13, f14, a13, f15, a14, b13, zVar3.f75823a, zVar3.b()};
            matrix.preConcat(this.f75775a.getMatrix());
            matrix.mapPoints(fArr);
            float f16 = fArr[0];
            float f17 = fArr[1];
            RectF rectF = new RectF(f16, f17, f16, f17);
            for (int i13 = 2; i13 <= 6; i13 += 2) {
                float f18 = fArr[i13];
                if (f18 < rectF.left) {
                    rectF.left = f18;
                }
                if (f18 > rectF.right) {
                    rectF.right = f18;
                }
                float f19 = fArr[i13 + 1];
                if (f19 < rectF.top) {
                    rectF.top = f19;
                }
                if (f19 > rectF.bottom) {
                    rectF.bottom = f19;
                }
            }
            o1 o1Var2 = (o1) this.f75779e.peek();
            z zVar4 = o1Var2.f75725h;
            if (zVar4 == null) {
                float f23 = rectF.left;
                float f24 = rectF.top;
                o1Var2.f75725h = new z(f23, f24, rectF.right - f23, rectF.bottom - f24);
                return;
            }
            float f25 = rectF.left;
            float f26 = rectF.top;
            float f27 = rectF.right - f25;
            float f28 = rectF.bottom - f26;
            if (f25 < zVar4.f75823a) {
                zVar4.f75823a = f25;
            }
            if (f26 < zVar4.f75824b) {
                zVar4.f75824b = f26;
            }
            if (f25 + f27 > zVar4.a()) {
                zVar4.f75825c = (f25 + f27) - zVar4.f75823a;
            }
            if (f26 + f28 > zVar4.b()) {
                zVar4.f75826d = (f26 + f28) - zVar4.f75824b;
            }
        }
    }

    public final void T(r2 r2Var, j1 j1Var) {
        j1 j1Var2;
        if (x(j1Var, 4096L)) {
            r2Var.f75759a.f75655n = j1Var.f75655n;
        }
        if (x(j1Var, 2048L)) {
            r2Var.f75759a.f75654m = j1Var.f75654m;
        }
        boolean x13 = x(j1Var, 1L);
        c0 c0Var = c0.f75567c;
        if (x13) {
            r2Var.f75759a.f75643b = j1Var.f75643b;
            s1 s1Var = j1Var.f75643b;
            r2Var.f75760b = (s1Var == null || s1Var == c0Var) ? false : true;
        }
        if (x(j1Var, 4L)) {
            r2Var.f75759a.f75645d = j1Var.f75645d;
        }
        if (x(j1Var, 6149L)) {
            O(r2Var, true, r2Var.f75759a.f75643b);
        }
        if (x(j1Var, 2L)) {
            r2Var.f75759a.f75644c = j1Var.f75644c;
        }
        if (x(j1Var, 8L)) {
            r2Var.f75759a.f75646e = j1Var.f75646e;
            s1 s1Var2 = j1Var.f75646e;
            r2Var.f75761c = (s1Var2 == null || s1Var2 == c0Var) ? false : true;
        }
        if (x(j1Var, 16L)) {
            r2Var.f75759a.f75647f = j1Var.f75647f;
        }
        if (x(j1Var, 6168L)) {
            O(r2Var, false, r2Var.f75759a.f75646e);
        }
        if (x(j1Var, 34359738368L)) {
            r2Var.f75759a.L = j1Var.L;
        }
        if (x(j1Var, 32L)) {
            j1 j1Var3 = r2Var.f75759a;
            m0 m0Var = j1Var.f75648g;
            j1Var3.f75648g = m0Var;
            r2Var.f75763e.setStrokeWidth(m0Var.b(this));
        }
        if (x(j1Var, 64L)) {
            r2Var.f75759a.f75649h = j1Var.f75649h;
            int i13 = k2.f75676b[j1Var.f75649h.ordinal()];
            Paint paint = r2Var.f75763e;
            if (i13 == 1) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i13 == 2) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i13 == 3) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (x(j1Var, 128L)) {
            r2Var.f75759a.f75650i = j1Var.f75650i;
            int i14 = k2.f75677c[j1Var.f75650i.ordinal()];
            Paint paint2 = r2Var.f75763e;
            if (i14 == 1) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (i14 == 2) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (i14 == 3) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (x(j1Var, 256L)) {
            r2Var.f75759a.f75651j = j1Var.f75651j;
            r2Var.f75763e.setStrokeMiter(j1Var.f75651j.floatValue());
        }
        if (x(j1Var, 512L)) {
            r2Var.f75759a.f75652k = j1Var.f75652k;
        }
        if (x(j1Var, 1024L)) {
            r2Var.f75759a.f75653l = j1Var.f75653l;
        }
        Typeface typeface = null;
        if (x(j1Var, 1536L)) {
            m0[] m0VarArr = r2Var.f75759a.f75652k;
            Paint paint3 = r2Var.f75763e;
            if (m0VarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = m0VarArr.length;
                int i15 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i15];
                int i16 = 0;
                float f13 = 0.0f;
                while (true) {
                    j1Var2 = r2Var.f75759a;
                    if (i16 >= i15) {
                        break;
                    }
                    float b13 = j1Var2.f75652k[i16 % length].b(this);
                    fArr[i16] = b13;
                    f13 += b13;
                    i16++;
                }
                if (f13 == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float b14 = j1Var2.f75653l.b(this);
                    if (b14 < 0.0f) {
                        b14 = (b14 % f13) + f13;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, b14));
                }
            }
        }
        if (x(j1Var, 16384L)) {
            float textSize = this.f75777c.f75762d.getTextSize();
            r2Var.f75759a.f75657p = j1Var.f75657p;
            r2Var.f75762d.setTextSize(j1Var.f75657p.c(this, textSize));
            r2Var.f75763e.setTextSize(j1Var.f75657p.c(this, textSize));
        }
        if (x(j1Var, 8192L)) {
            r2Var.f75759a.f75656o = j1Var.f75656o;
        }
        if (x(j1Var, 32768L)) {
            if (j1Var.f75658q.intValue() == -1 && r2Var.f75759a.f75658q.intValue() > 100) {
                j1 j1Var4 = r2Var.f75759a;
                j1Var4.f75658q = Integer.valueOf(j1Var4.f75658q.intValue() - 100);
            } else if (j1Var.f75658q.intValue() != 1 || r2Var.f75759a.f75658q.intValue() >= 900) {
                r2Var.f75759a.f75658q = j1Var.f75658q;
            } else {
                j1 j1Var5 = r2Var.f75759a;
                j1Var5.f75658q = Integer.valueOf(j1Var5.f75658q.intValue() + 100);
            }
        }
        if (x(j1Var, 65536L)) {
            r2Var.f75759a.f75659r = j1Var.f75659r;
        }
        if (x(j1Var, 106496L)) {
            j1 j1Var6 = r2Var.f75759a;
            List list = j1Var6.f75656o;
            if (list != null && this.f75776b != null) {
                Iterator it = list.iterator();
                while (it.hasNext() && (typeface = h((String) it.next(), j1Var6.f75658q, j1Var6.f75659r)) == null) {
                }
            }
            if (typeface == null) {
                typeface = h("serif", j1Var6.f75658q, j1Var6.f75659r);
            }
            r2Var.f75762d.setTypeface(typeface);
            r2Var.f75763e.setTypeface(typeface);
        }
        if (x(j1Var, 131072L)) {
            r2Var.f75759a.f75660s = j1Var.f75660s;
            g1 g1Var = j1Var.f75660s;
            g1 g1Var2 = g1.LineThrough;
            boolean z13 = g1Var == g1Var2;
            Paint paint4 = r2Var.f75762d;
            paint4.setStrikeThruText(z13);
            g1 g1Var3 = j1Var.f75660s;
            g1 g1Var4 = g1.Underline;
            paint4.setUnderlineText(g1Var3 == g1Var4);
            boolean z14 = j1Var.f75660s == g1Var2;
            Paint paint5 = r2Var.f75763e;
            paint5.setStrikeThruText(z14);
            paint5.setUnderlineText(j1Var.f75660s == g1Var4);
        }
        if (x(j1Var, 68719476736L)) {
            r2Var.f75759a.f75661t = j1Var.f75661t;
        }
        if (x(j1Var, 262144L)) {
            r2Var.f75759a.f75662u = j1Var.f75662u;
        }
        if (x(j1Var, 524288L)) {
            r2Var.f75759a.f75663v = j1Var.f75663v;
        }
        if (x(j1Var, 2097152L)) {
            r2Var.f75759a.f75665x = j1Var.f75665x;
        }
        if (x(j1Var, 4194304L)) {
            r2Var.f75759a.f75666y = j1Var.f75666y;
        }
        if (x(j1Var, 8388608L)) {
            r2Var.f75759a.f75667z = j1Var.f75667z;
        }
        if (x(j1Var, 16777216L)) {
            r2Var.f75759a.A = j1Var.A;
        }
        if (x(j1Var, 33554432L)) {
            r2Var.f75759a.B = j1Var.B;
        }
        if (x(j1Var, 1048576L)) {
            r2Var.f75759a.f75664w = j1Var.f75664w;
        }
        if (x(j1Var, 268435456L)) {
            r2Var.f75759a.E = j1Var.E;
        }
        if (x(j1Var, 536870912L)) {
            r2Var.f75759a.F = j1Var.F;
        }
        if (x(j1Var, 1073741824L)) {
            r2Var.f75759a.G = j1Var.G;
        }
        if (x(j1Var, 67108864L)) {
            r2Var.f75759a.C = j1Var.C;
        }
        if (x(j1Var, 134217728L)) {
            r2Var.f75759a.D = j1Var.D;
        }
        if (x(j1Var, 8589934592L)) {
            r2Var.f75759a.f75641J = j1Var.f75641J;
        }
        if (x(j1Var, 17179869184L)) {
            r2Var.f75759a.K = j1Var.K;
        }
        if (x(j1Var, 137438953472L)) {
            r2Var.f75759a.M = j1Var.M;
        }
    }

    public final void U(r2 r2Var, p1 p1Var) {
        boolean z13 = p1Var.f75758b == null;
        j1 j1Var = r2Var.f75759a;
        Boolean bool = Boolean.TRUE;
        j1Var.A = bool;
        if (!z13) {
            bool = Boolean.FALSE;
        }
        j1Var.f75663v = bool;
        j1Var.f75664w = null;
        j1Var.E = null;
        j1Var.f75654m = Float.valueOf(1.0f);
        j1Var.C = c0.f75566b;
        j1Var.D = Float.valueOf(1.0f);
        j1Var.G = null;
        j1Var.H = null;
        j1Var.I = Float.valueOf(1.0f);
        j1Var.f75641J = null;
        j1Var.K = Float.valueOf(1.0f);
        j1Var.L = i1.None;
        j1 j1Var2 = p1Var.f75736e;
        if (j1Var2 != null) {
            T(r2Var, j1Var2);
        }
        List list = this.f75776b.f75669b.f141454b;
        if (!(list == null || list.isEmpty())) {
            for (o oVar : this.f75776b.f75669b.f141454b) {
                if (v.z1.t(null, oVar.f75716a, p1Var)) {
                    T(r2Var, oVar.f75717b);
                }
            }
        }
        j1 j1Var3 = p1Var.f75737f;
        if (j1Var3 != null) {
            T(r2Var, j1Var3);
        }
    }

    public final void V() {
        int i13;
        j1 j1Var = this.f75777c.f75759a;
        s1 s1Var = j1Var.f75641J;
        if (s1Var instanceof c0) {
            i13 = ((c0) s1Var).f75568a;
        } else if (!(s1Var instanceof d0)) {
            return;
        } else {
            i13 = j1Var.f75655n.f75568a;
        }
        Float f13 = j1Var.K;
        if (f13 != null) {
            i13 = i(i13, f13.floatValue());
        }
        this.f75775a.drawColor(i13);
    }

    public final boolean W() {
        Boolean bool = this.f75777c.f75759a.B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Path b(o1 o1Var, z zVar) {
        Path D;
        p1 g13 = o1Var.f75757a.g(this.f75777c.f75759a.E);
        if (g13 == null) {
            o("ClipPath reference '%s' not found", this.f75777c.f75759a.E);
            return null;
        }
        b0 b0Var = (b0) g13;
        this.f75778d.push(this.f75777c);
        this.f75777c = t(b0Var);
        Boolean bool = b0Var.f75561o;
        boolean z13 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z13) {
            matrix.preTranslate(zVar.f75823a, zVar.f75824b);
            matrix.preScale(zVar.f75825c, zVar.f75826d);
        }
        Matrix matrix2 = b0Var.f75640n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (r1 r1Var : b0Var.f75696i) {
            if ((r1Var instanceof o1) && (D = D((o1) r1Var, true)) != null) {
                path.op(D, Path.Op.UNION);
            }
        }
        if (this.f75777c.f75759a.E != null) {
            if (b0Var.f75725h == null) {
                b0Var.f75725h = c(path);
            }
            Path b13 = b(b0Var, b0Var.f75725h);
            if (b13 != null) {
                path.op(b13, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f75777c = (r2) this.f75778d.pop();
        return path;
    }

    public final float d(c2 c2Var) {
        s2 s2Var = new s2(this);
        n(c2Var, s2Var);
        return s2Var.f75771b;
    }

    public final void f(o1 o1Var, z zVar) {
        Path b13;
        if (this.f75777c.f75759a.E == null || (b13 = b(o1Var, zVar)) == null) {
            return;
        }
        this.f75775a.clipPath(b13);
    }

    public final void g(o1 o1Var) {
        s1 s1Var = this.f75777c.f75759a.f75643b;
        if (s1Var instanceof r0) {
            j(true, o1Var.f75725h, (r0) s1Var);
        }
        s1 s1Var2 = this.f75777c.f75759a.f75646e;
        if (s1Var2 instanceof r0) {
            j(false, o1Var.f75725h, (r0) s1Var2);
        }
    }

    public final void j(boolean z13, z zVar, r0 r0Var) {
        float f13;
        float c13;
        float f14;
        float c14;
        float f15;
        float c15;
        float f16;
        p1 g13 = this.f75776b.g(r0Var.f75755a);
        if (g13 == null) {
            Object[] objArr = new Object[2];
            objArr[0] = z13 ? "Fill" : "Stroke";
            objArr[1] = r0Var.f75755a;
            o("%s reference '%s' not found", objArr);
            s1 s1Var = r0Var.f75756b;
            if (s1Var != null) {
                O(this.f75777c, z13, s1Var);
                return;
            } else if (z13) {
                this.f75777c.f75760b = false;
                return;
            } else {
                this.f75777c.f75761c = false;
                return;
            }
        }
        boolean z14 = g13 instanceof q1;
        c0 c0Var = c0.f75566b;
        if (z14) {
            q1 q1Var = (q1) g13;
            String str = q1Var.f75614l;
            if (str != null) {
                q(q1Var, str);
            }
            Boolean bool = q1Var.f75611i;
            boolean z15 = bool != null && bool.booleanValue();
            r2 r2Var = this.f75777c;
            Paint paint = z13 ? r2Var.f75762d : r2Var.f75763e;
            if (z15) {
                r2 r2Var2 = this.f75777c;
                z zVar2 = r2Var2.f75765g;
                if (zVar2 == null) {
                    zVar2 = r2Var2.f75764f;
                }
                m0 m0Var = q1Var.f75746m;
                float g14 = m0Var != null ? m0Var.g(this) : 0.0f;
                m0 m0Var2 = q1Var.f75747n;
                c14 = m0Var2 != null ? m0Var2.h(this) : 0.0f;
                m0 m0Var3 = q1Var.f75748o;
                float g15 = m0Var3 != null ? m0Var3.g(this) : zVar2.f75825c;
                m0 m0Var4 = q1Var.f75749p;
                f16 = g15;
                f15 = g14;
                c15 = m0Var4 != null ? m0Var4.h(this) : 0.0f;
            } else {
                m0 m0Var5 = q1Var.f75746m;
                float c16 = m0Var5 != null ? m0Var5.c(this, 1.0f) : 0.0f;
                m0 m0Var6 = q1Var.f75747n;
                c14 = m0Var6 != null ? m0Var6.c(this, 1.0f) : 0.0f;
                m0 m0Var7 = q1Var.f75748o;
                float c17 = m0Var7 != null ? m0Var7.c(this, 1.0f) : 1.0f;
                m0 m0Var8 = q1Var.f75749p;
                f15 = c16;
                c15 = m0Var8 != null ? m0Var8.c(this, 1.0f) : 0.0f;
                f16 = c17;
            }
            float f17 = c14;
            Q();
            this.f75777c = t(q1Var);
            Matrix matrix = new Matrix();
            if (!z15) {
                matrix.preTranslate(zVar.f75823a, zVar.f75824b);
                matrix.preScale(zVar.f75825c, zVar.f75826d);
            }
            Matrix matrix2 = q1Var.f75612j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = q1Var.f75610h.size();
            if (size == 0) {
                P();
                if (z13) {
                    this.f75777c.f75760b = false;
                    return;
                } else {
                    this.f75777c.f75761c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = q1Var.f75610h.iterator();
            int i13 = 0;
            float f18 = -1.0f;
            while (it.hasNext()) {
                z0 z0Var = (z0) ((r1) it.next());
                Float f19 = z0Var.f75827h;
                float floatValue = f19 != null ? f19.floatValue() : 0.0f;
                if (i13 == 0 || floatValue >= f18) {
                    fArr[i13] = floatValue;
                    f18 = floatValue;
                } else {
                    fArr[i13] = f18;
                }
                Q();
                U(this.f75777c, z0Var);
                j1 j1Var = this.f75777c.f75759a;
                c0 c0Var2 = (c0) j1Var.C;
                if (c0Var2 == null) {
                    c0Var2 = c0Var;
                }
                iArr[i13] = i(c0Var2.f75568a, j1Var.D.floatValue());
                i13++;
                P();
            }
            if ((f15 == f16 && f17 == c15) || size == 1) {
                P();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            h0 h0Var = q1Var.f75613k;
            if (h0Var != null) {
                if (h0Var == h0.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (h0Var == h0.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            P();
            LinearGradient linearGradient = new LinearGradient(f15, f17, f16, c15, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int floatValue2 = (int) (this.f75777c.f75759a.f75645d.floatValue() * 256.0f);
            paint.setAlpha(floatValue2 < 0 ? 0 : floatValue2 > 255 ? 255 : floatValue2);
            return;
        }
        if (!(g13 instanceof u1)) {
            if (g13 instanceof y0) {
                y0 y0Var = (y0) g13;
                if (z13) {
                    if (x(y0Var.f75736e, 2147483648L)) {
                        r2 r2Var3 = this.f75777c;
                        j1 j1Var2 = r2Var3.f75759a;
                        s1 s1Var2 = y0Var.f75736e.H;
                        j1Var2.f75643b = s1Var2;
                        r2Var3.f75760b = s1Var2 != null;
                    }
                    if (x(y0Var.f75736e, 4294967296L)) {
                        this.f75777c.f75759a.f75645d = y0Var.f75736e.I;
                    }
                    if (x(y0Var.f75736e, 6442450944L)) {
                        r2 r2Var4 = this.f75777c;
                        O(r2Var4, z13, r2Var4.f75759a.f75643b);
                        return;
                    }
                    return;
                }
                if (x(y0Var.f75736e, 2147483648L)) {
                    r2 r2Var5 = this.f75777c;
                    j1 j1Var3 = r2Var5.f75759a;
                    s1 s1Var3 = y0Var.f75736e.H;
                    j1Var3.f75646e = s1Var3;
                    r2Var5.f75761c = s1Var3 != null;
                }
                if (x(y0Var.f75736e, 4294967296L)) {
                    this.f75777c.f75759a.f75647f = y0Var.f75736e.I;
                }
                if (x(y0Var.f75736e, 6442450944L)) {
                    r2 r2Var6 = this.f75777c;
                    O(r2Var6, z13, r2Var6.f75759a.f75646e);
                    return;
                }
                return;
            }
            return;
        }
        u1 u1Var = (u1) g13;
        String str2 = u1Var.f75614l;
        if (str2 != null) {
            q(u1Var, str2);
        }
        Boolean bool2 = u1Var.f75611i;
        boolean z16 = bool2 != null && bool2.booleanValue();
        r2 r2Var7 = this.f75777c;
        Paint paint2 = z13 ? r2Var7.f75762d : r2Var7.f75763e;
        if (z16) {
            m0 m0Var9 = new m0(50.0f, g2.percent);
            m0 m0Var10 = u1Var.f75789m;
            float g16 = m0Var10 != null ? m0Var10.g(this) : m0Var9.g(this);
            m0 m0Var11 = u1Var.f75790n;
            float h10 = m0Var11 != null ? m0Var11.h(this) : m0Var9.h(this);
            m0 m0Var12 = u1Var.f75791o;
            c13 = m0Var12 != null ? m0Var12.b(this) : m0Var9.b(this);
            f13 = g16;
            f14 = h10;
        } else {
            m0 m0Var13 = u1Var.f75789m;
            float c18 = m0Var13 != null ? m0Var13.c(this, 1.0f) : 0.5f;
            m0 m0Var14 = u1Var.f75790n;
            float c19 = m0Var14 != null ? m0Var14.c(this, 1.0f) : 0.5f;
            m0 m0Var15 = u1Var.f75791o;
            f13 = c18;
            c13 = m0Var15 != null ? m0Var15.c(this, 1.0f) : 0.5f;
            f14 = c19;
        }
        Q();
        this.f75777c = t(u1Var);
        Matrix matrix3 = new Matrix();
        if (!z16) {
            matrix3.preTranslate(zVar.f75823a, zVar.f75824b);
            matrix3.preScale(zVar.f75825c, zVar.f75826d);
        }
        Matrix matrix4 = u1Var.f75612j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = u1Var.f75610h.size();
        if (size2 == 0) {
            P();
            if (z13) {
                this.f75777c.f75760b = false;
                return;
            } else {
                this.f75777c.f75761c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = u1Var.f75610h.iterator();
        int i14 = 0;
        float f23 = -1.0f;
        while (it2.hasNext()) {
            z0 z0Var2 = (z0) ((r1) it2.next());
            Float f24 = z0Var2.f75827h;
            float floatValue3 = f24 != null ? f24.floatValue() : 0.0f;
            if (i14 == 0 || floatValue3 >= f23) {
                fArr2[i14] = floatValue3;
                f23 = floatValue3;
            } else {
                fArr2[i14] = f23;
            }
            Q();
            U(this.f75777c, z0Var2);
            j1 j1Var4 = this.f75777c.f75759a;
            c0 c0Var3 = (c0) j1Var4.C;
            if (c0Var3 == null) {
                c0Var3 = c0Var;
            }
            iArr2[i14] = i(c0Var3.f75568a, j1Var4.D.floatValue());
            i14++;
            P();
        }
        if (c13 == 0.0f || size2 == 1) {
            P();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        h0 h0Var2 = u1Var.f75613k;
        if (h0Var2 != null) {
            if (h0Var2 == h0.reflect) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (h0Var2 == h0.repeat) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        P();
        RadialGradient radialGradient = new RadialGradient(f13, f14, c13, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int floatValue4 = (int) (this.f75777c.f75759a.f75645d.floatValue() * 256.0f);
        if (floatValue4 < 0) {
            floatValue4 = 0;
        } else if (floatValue4 > 255) {
            floatValue4 = 255;
        }
        paint2.setAlpha(floatValue4);
    }

    public final boolean k() {
        Boolean bool = this.f75777c.f75759a.A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020a A[LOOP:3: B:71:0x0204->B:73:0x020a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(je.o1 r20, android.graphics.Path r21) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: je.t2.l(je.o1, android.graphics.Path):void");
    }

    public final void m(Path path) {
        r2 r2Var = this.f75777c;
        i1 i1Var = r2Var.f75759a.L;
        i1 i1Var2 = i1.NonScalingStroke;
        Canvas canvas = this.f75775a;
        if (i1Var != i1Var2) {
            canvas.drawPath(path, r2Var.f75763e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = this.f75777c.f75763e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, this.f75777c.f75763e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final void n(c2 c2Var, c0.s0 s0Var) {
        float f13;
        float f14;
        float f15;
        f1 v13;
        if (k()) {
            Iterator it = c2Var.f75696i.iterator();
            boolean z13 = true;
            while (it.hasNext()) {
                r1 r1Var = (r1) it.next();
                if (r1Var instanceof f2) {
                    s0Var.k(R(((f2) r1Var).f75599c, z13, !it.hasNext()));
                } else if (s0Var.d((c2) r1Var)) {
                    if (r1Var instanceof d2) {
                        Q();
                        d2 d2Var = (d2) r1Var;
                        U(this.f75777c, d2Var);
                        if (k() && W()) {
                            p1 g13 = d2Var.f75757a.g(d2Var.f75585n);
                            if (g13 == null) {
                                o("TextPath reference '%s' not found", d2Var.f75585n);
                            } else {
                                s0 s0Var2 = (s0) g13;
                                Path path = (Path) new n2(this, s0Var2.f75770o).f75714c;
                                Matrix matrix = s0Var2.f75638n;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                m0 m0Var = d2Var.f75586o;
                                r5 = m0Var != null ? m0Var.c(this, pathMeasure.getLength()) : 0.0f;
                                f1 v14 = v();
                                if (v14 != f1.Start) {
                                    float d2 = d(d2Var);
                                    if (v14 == f1.Middle) {
                                        d2 /= 2.0f;
                                    }
                                    r5 -= d2;
                                }
                                g(d2Var.f75587p);
                                boolean F = F();
                                n(d2Var, new o2(r5, path, this));
                                if (F) {
                                    E(d2Var.f75725h);
                                }
                            }
                        }
                        P();
                    } else if (r1Var instanceof z1) {
                        Q();
                        z1 z1Var = (z1) r1Var;
                        U(this.f75777c, z1Var);
                        if (k()) {
                            ArrayList arrayList = z1Var.f75590n;
                            boolean z14 = arrayList != null && arrayList.size() > 0;
                            boolean z15 = s0Var instanceof p2;
                            if (z15) {
                                float g14 = !z14 ? ((p2) s0Var).f75739b : ((m0) z1Var.f75590n.get(0)).g(this);
                                ArrayList arrayList2 = z1Var.f75591o;
                                f14 = (arrayList2 == null || arrayList2.size() == 0) ? ((p2) s0Var).f75740c : ((m0) z1Var.f75591o.get(0)).h(this);
                                ArrayList arrayList3 = z1Var.f75592p;
                                f15 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((m0) z1Var.f75592p.get(0)).g(this);
                                ArrayList arrayList4 = z1Var.f75593q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    r5 = ((m0) z1Var.f75593q.get(0)).h(this);
                                }
                                float f16 = g14;
                                f13 = r5;
                                r5 = f16;
                            } else {
                                f13 = 0.0f;
                                f14 = 0.0f;
                                f15 = 0.0f;
                            }
                            if (z14 && (v13 = v()) != f1.Start) {
                                float d13 = d(z1Var);
                                if (v13 == f1.Middle) {
                                    d13 /= 2.0f;
                                }
                                r5 -= d13;
                            }
                            g(z1Var.f75828r);
                            if (z15) {
                                p2 p2Var = (p2) s0Var;
                                p2Var.f75739b = r5 + f15;
                                p2Var.f75740c = f14 + f13;
                            }
                            boolean F2 = F();
                            n(z1Var, s0Var);
                            if (F2) {
                                E(z1Var.f75725h);
                            }
                        }
                        P();
                    } else if (r1Var instanceof y1) {
                        Q();
                        y1 y1Var = (y1) r1Var;
                        U(this.f75777c, y1Var);
                        if (k()) {
                            g(y1Var.f75821o);
                            p1 g15 = r1Var.f75757a.g(y1Var.f75820n);
                            if (g15 == null || !(g15 instanceof c2)) {
                                o("Tref reference '%s' not found", y1Var.f75820n);
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                p((c2) g15, sb3);
                                if (sb3.length() > 0) {
                                    s0Var.k(sb3.toString());
                                }
                            }
                        }
                        P();
                    }
                }
                z13 = false;
            }
        }
    }

    public final void p(c2 c2Var, StringBuilder sb3) {
        Iterator it = c2Var.f75696i.iterator();
        boolean z13 = true;
        while (it.hasNext()) {
            r1 r1Var = (r1) it.next();
            if (r1Var instanceof c2) {
                p((c2) r1Var, sb3);
            } else if (r1Var instanceof f2) {
                sb3.append(R(((f2) r1Var).f75599c, z13, !it.hasNext()));
            }
            z13 = false;
        }
    }

    public final r2 t(r1 r1Var) {
        r2 r2Var = new r2();
        T(r2Var, j1.a());
        u(r1Var, r2Var);
        return r2Var;
    }

    public final void u(r1 r1Var, r2 r2Var) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (r1Var instanceof p1) {
                arrayList.add(0, (p1) r1Var);
            }
            Object obj = r1Var.f75758b;
            if (obj == null) {
                break;
            } else {
                r1Var = (r1) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            U(r2Var, (p1) it.next());
        }
        r2 r2Var2 = this.f75777c;
        r2Var.f75765g = r2Var2.f75765g;
        r2Var.f75764f = r2Var2.f75764f;
    }

    public final f1 v() {
        f1 f1Var;
        j1 j1Var = this.f75777c.f75759a;
        if (j1Var.f75661t == h1.LTR || (f1Var = j1Var.f75662u) == f1.Middle) {
            return j1Var.f75662u;
        }
        f1 f1Var2 = f1.Start;
        return f1Var == f1Var2 ? f1.End : f1Var2;
    }

    public final Path.FillType w() {
        a1 a1Var = this.f75777c.f75759a.F;
        return (a1Var == null || a1Var != a1.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final Path y(a0 a0Var) {
        m0 m0Var = a0Var.f75554o;
        float g13 = m0Var != null ? m0Var.g(this) : 0.0f;
        m0 m0Var2 = a0Var.f75555p;
        float h10 = m0Var2 != null ? m0Var2.h(this) : 0.0f;
        float b13 = a0Var.f75556q.b(this);
        float f13 = g13 - b13;
        float f14 = h10 - b13;
        float f15 = g13 + b13;
        float f16 = h10 + b13;
        if (a0Var.f75725h == null) {
            float f17 = 2.0f * b13;
            a0Var.f75725h = new z(f13, f14, f17, f17);
        }
        float f18 = 0.5522848f * b13;
        Path path = new Path();
        path.moveTo(g13, f14);
        float f19 = g13 + f18;
        float f23 = h10 - f18;
        path.cubicTo(f19, f14, f15, f23, f15, h10);
        float f24 = h10 + f18;
        path.cubicTo(f15, f24, f19, f16, g13, f16);
        float f25 = g13 - f18;
        path.cubicTo(f25, f16, f13, f24, f13, h10);
        path.cubicTo(f13, f23, f25, f14, g13, f14);
        path.close();
        return path;
    }

    public final Path z(f0 f0Var) {
        m0 m0Var = f0Var.f75595o;
        float g13 = m0Var != null ? m0Var.g(this) : 0.0f;
        m0 m0Var2 = f0Var.f75596p;
        float h10 = m0Var2 != null ? m0Var2.h(this) : 0.0f;
        float g14 = f0Var.f75597q.g(this);
        float h13 = f0Var.f75598r.h(this);
        float f13 = g13 - g14;
        float f14 = h10 - h13;
        float f15 = g13 + g14;
        float f16 = h10 + h13;
        if (f0Var.f75725h == null) {
            f0Var.f75725h = new z(f13, f14, g14 * 2.0f, 2.0f * h13);
        }
        float f17 = g14 * 0.5522848f;
        float f18 = 0.5522848f * h13;
        Path path = new Path();
        path.moveTo(g13, f14);
        float f19 = g13 + f17;
        float f23 = h10 - f18;
        path.cubicTo(f19, f14, f15, f23, f15, h10);
        float f24 = f18 + h10;
        path.cubicTo(f15, f24, f19, f16, g13, f16);
        float f25 = g13 - f17;
        path.cubicTo(f25, f16, f13, f24, f13, h10);
        path.cubicTo(f13, f23, f25, f14, g13, f14);
        path.close();
        return path;
    }
}
