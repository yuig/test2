package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class AppCompatTextHelper {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f16330a;

    /* renamed from: b, reason: collision with root package name */
    public z2 f16331b;

    /* renamed from: c, reason: collision with root package name */
    public z2 f16332c;

    /* renamed from: d, reason: collision with root package name */
    public z2 f16333d;

    /* renamed from: e, reason: collision with root package name */
    public z2 f16334e;

    /* renamed from: f, reason: collision with root package name */
    public z2 f16335f;

    /* renamed from: g, reason: collision with root package name */
    public z2 f16336g;

    /* renamed from: h, reason: collision with root package name */
    public z2 f16337h;

    /* renamed from: i, reason: collision with root package name */
    public final x0 f16338i;

    /* renamed from: j, reason: collision with root package name */
    public int f16339j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f16340k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f16341l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16342m;

    public AppCompatTextHelper(TextView textView) {
        this.f16330a = textView;
        this.f16338i = new x0(textView);
    }

    public static z2 d(Context context, y yVar, int i13) {
        ColorStateList i14;
        synchronized (yVar) {
            i14 = yVar.f16736a.i(context, i13);
        }
        if (i14 == null) {
            return null;
        }
        z2 z2Var = new z2();
        z2Var.f16749b = true;
        z2Var.f16750c = i14;
        return z2Var;
    }

    public final void a(Drawable drawable, z2 z2Var) {
        if (drawable == null || z2Var == null) {
            return;
        }
        y.e(drawable, z2Var, this.f16330a.getDrawableState());
    }

    public final void b() {
        z2 z2Var = this.f16331b;
        TextView textView = this.f16330a;
        if (z2Var != null || this.f16332c != null || this.f16333d != null || this.f16334e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f16331b);
            a(compoundDrawables[1], this.f16332c);
            a(compoundDrawables[2], this.f16333d);
            a(compoundDrawables[3], this.f16334e);
        }
        if (this.f16335f == null && this.f16336g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f16335f);
        a(compoundDrawablesRelative[2], this.f16336g);
    }

    public final void c() {
        this.f16338i.a();
    }

    public final boolean e() {
        x0 x0Var = this.f16338i;
        return x0Var.n() && x0Var.f16716a != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextHelper.f(android.util.AttributeSet, int):void");
    }

    public final void g() {
        b();
    }

    public final void h(Context context, int i13) {
        String D;
        x92.b bVar = new x92.b(1, context, context.obtainStyledAttributes(i13, i.j.TextAppearance));
        boolean G = bVar.G(i.j.TextAppearance_textAllCaps);
        TextView textView = this.f16330a;
        if (G) {
            textView.setAllCaps(bVar.t(i.j.TextAppearance_textAllCaps, false));
        }
        if (bVar.G(i.j.TextAppearance_android_textSize) && bVar.w(i.j.TextAppearance_android_textSize, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        o(context, bVar);
        if (bVar.G(i.j.TextAppearance_fontVariationSettings) && (D = bVar.D(i.j.TextAppearance_fontVariationSettings)) != null) {
            o0.d(textView, D);
        }
        bVar.O();
        Typeface typeface = this.f16341l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f16339j);
        }
    }

    public final void i(int i13, int i14, int i15, int i16) {
        x0 x0Var = this.f16338i;
        if (x0Var.n()) {
            DisplayMetrics displayMetrics = x0Var.f16725j.getResources().getDisplayMetrics();
            x0Var.o(TypedValue.applyDimension(i16, i13, displayMetrics), TypedValue.applyDimension(i16, i14, displayMetrics), TypedValue.applyDimension(i16, i15, displayMetrics));
            if (x0Var.k()) {
                x0Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i13) {
        x0 x0Var = this.f16338i;
        if (x0Var.n()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i13 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = x0Var.f16725j.getResources().getDisplayMetrics();
                    for (int i14 = 0; i14 < length; i14++) {
                        iArr2[i14] = Math.round(TypedValue.applyDimension(i13, iArr[i14], displayMetrics));
                    }
                }
                x0Var.f16721f = x0.b(iArr2);
                if (!x0Var.m()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                x0Var.f16722g = false;
            }
            if (x0Var.k()) {
                x0Var.a();
            }
        }
    }

    public final void k(int i13) {
        x0 x0Var = this.f16338i;
        if (x0Var.n()) {
            if (i13 == 0) {
                x0Var.f16716a = 0;
                x0Var.f16719d = -1.0f;
                x0Var.f16720e = -1.0f;
                x0Var.f16718c = -1.0f;
                x0Var.f16721f = new int[0];
                x0Var.f16717b = false;
                return;
            }
            if (i13 != 1) {
                throw new IllegalArgumentException(a.a.d("Unknown auto-size text type: ", i13));
            }
            DisplayMetrics displayMetrics = x0Var.f16725j.getResources().getDisplayMetrics();
            x0Var.o(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (x0Var.k()) {
                x0Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f16337h == null) {
            this.f16337h = new z2();
        }
        z2 z2Var = this.f16337h;
        z2Var.f16750c = colorStateList;
        z2Var.f16749b = colorStateList != null;
        this.f16331b = z2Var;
        this.f16332c = z2Var;
        this.f16333d = z2Var;
        this.f16334e = z2Var;
        this.f16335f = z2Var;
        this.f16336g = z2Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f16337h == null) {
            this.f16337h = new z2();
        }
        z2 z2Var = this.f16337h;
        z2Var.f16751d = mode;
        z2Var.f16748a = mode != null;
        this.f16331b = z2Var;
        this.f16332c = z2Var;
        this.f16333d = z2Var;
        this.f16334e = z2Var;
        this.f16335f = z2Var;
        this.f16336g = z2Var;
    }

    public final void n(int i13, float f13) {
        if (l3.f16641c) {
            return;
        }
        x0 x0Var = this.f16338i;
        if (!x0Var.n() || x0Var.f16716a == 0) {
            x0Var.j(i13, f13);
        }
    }

    public final void o(Context context, x92.b bVar) {
        String D;
        this.f16339j = bVar.B(i.j.TextAppearance_android_textStyle, this.f16339j);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 28) {
            int B = bVar.B(i.j.TextAppearance_android_textFontWeight, -1);
            this.f16340k = B;
            if (B != -1) {
                this.f16339j &= 2;
            }
        }
        if (!bVar.G(i.j.TextAppearance_android_fontFamily) && !bVar.G(i.j.TextAppearance_fontFamily)) {
            if (bVar.G(i.j.TextAppearance_android_typeface)) {
                this.f16342m = false;
                int B2 = bVar.B(i.j.TextAppearance_android_typeface, 1);
                if (B2 == 1) {
                    this.f16341l = Typeface.SANS_SERIF;
                    return;
                } else if (B2 == 2) {
                    this.f16341l = Typeface.SERIF;
                    return;
                } else {
                    if (B2 != 3) {
                        return;
                    }
                    this.f16341l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f16341l = null;
        int i14 = bVar.G(i.j.TextAppearance_fontFamily) ? i.j.TextAppearance_fontFamily : i.j.TextAppearance_android_fontFamily;
        int i15 = this.f16340k;
        int i16 = this.f16339j;
        if (!context.isRestricted()) {
            try {
                Typeface A = bVar.A(i14, this.f16339j, new l0(this, i15, i16, new WeakReference(this.f16330a)));
                if (A != null) {
                    if (i13 < 28 || this.f16340k == -1) {
                        this.f16341l = A;
                    } else {
                        this.f16341l = p0.a(Typeface.create(A, 0), this.f16340k, (this.f16339j & 2) != 0);
                    }
                }
                this.f16342m = this.f16341l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f16341l != null || (D = bVar.D(i14)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f16340k == -1) {
            this.f16341l = Typeface.create(D, this.f16339j);
        } else {
            this.f16341l = p0.a(Typeface.create(D, 0), this.f16340k, (this.f16339j & 2) != 0);
        }
    }
}
