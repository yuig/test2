package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class AppCompatBackgroundHelper {

    /* renamed from: a, reason: collision with root package name */
    public final View f16280a;

    /* renamed from: d, reason: collision with root package name */
    public z2 f16283d;

    /* renamed from: e, reason: collision with root package name */
    public z2 f16284e;

    /* renamed from: f, reason: collision with root package name */
    public z2 f16285f;

    /* renamed from: c, reason: collision with root package name */
    public int f16282c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final y f16281b = y.a();

    public AppCompatBackgroundHelper(View view) {
        this.f16280a = view;
    }

    public final boolean a(Drawable drawable) {
        if (this.f16285f == null) {
            this.f16285f = new z2();
        }
        z2 z2Var = this.f16285f;
        z2Var.a();
        WeakHashMap weakHashMap = q5.v0.f102521a;
        View view = this.f16280a;
        ColorStateList c13 = q5.m0.c(view);
        if (c13 != null) {
            z2Var.f16749b = true;
            z2Var.f16750c = c13;
        }
        PorterDuff.Mode d2 = q5.m0.d(view);
        if (d2 != null) {
            z2Var.f16748a = true;
            z2Var.f16751d = d2;
        }
        if (!z2Var.f16749b && !z2Var.f16748a) {
            return false;
        }
        y.e(drawable, z2Var, view.getDrawableState());
        return true;
    }

    public final void b() {
        View view = this.f16280a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f16283d == null || !a(background)) {
                z2 z2Var = this.f16284e;
                if (z2Var != null) {
                    y.e(background, z2Var, view.getDrawableState());
                    return;
                }
                z2 z2Var2 = this.f16283d;
                if (z2Var2 != null) {
                    y.e(background, z2Var2, view.getDrawableState());
                }
            }
        }
    }

    public final ColorStateList c() {
        z2 z2Var = this.f16284e;
        if (z2Var != null) {
            return (ColorStateList) z2Var.f16750c;
        }
        return null;
    }

    public final PorterDuff.Mode d() {
        z2 z2Var = this.f16284e;
        if (z2Var != null) {
            return (PorterDuff.Mode) z2Var.f16751d;
        }
        return null;
    }

    public final void e(AttributeSet attributeSet, int i13) {
        ColorStateList i14;
        View view = this.f16280a;
        x92.b N = x92.b.N(view.getContext(), attributeSet, i.j.ViewBackgroundHelper, i13, 0);
        View view2 = this.f16280a;
        q5.v0.n(view2, view2.getContext(), i.j.ViewBackgroundHelper, attributeSet, (TypedArray) N.f134366c, i13, 0);
        try {
            if (N.G(i.j.ViewBackgroundHelper_android_background)) {
                this.f16282c = N.C(i.j.ViewBackgroundHelper_android_background, -1);
                y yVar = this.f16281b;
                Context context = view.getContext();
                int i15 = this.f16282c;
                synchronized (yVar) {
                    i14 = yVar.f16736a.i(context, i15);
                }
                if (i14 != null) {
                    h(i14);
                }
            }
            if (N.G(i.j.ViewBackgroundHelper_backgroundTint)) {
                q5.v0.q(view, N.u(i.j.ViewBackgroundHelper_backgroundTint));
            }
            if (N.G(i.j.ViewBackgroundHelper_backgroundTintMode)) {
                q5.v0.r(view, c1.d(N.B(i.j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
            N.O();
        } catch (Throwable th3) {
            N.O();
            throw th3;
        }
    }

    public final void f() {
        this.f16282c = -1;
        h(null);
        b();
    }

    public final void g(int i13) {
        ColorStateList colorStateList;
        this.f16282c = i13;
        y yVar = this.f16281b;
        if (yVar != null) {
            Context context = this.f16280a.getContext();
            synchronized (yVar) {
                colorStateList = yVar.f16736a.i(context, i13);
            }
        } else {
            colorStateList = null;
        }
        h(colorStateList);
        b();
    }

    public final void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f16283d == null) {
                this.f16283d = new z2();
            }
            z2 z2Var = this.f16283d;
            z2Var.f16750c = colorStateList;
            z2Var.f16749b = true;
        } else {
            this.f16283d = null;
        }
        b();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f16284e == null) {
            this.f16284e = new z2();
        }
        z2 z2Var = this.f16284e;
        z2Var.f16750c = colorStateList;
        z2Var.f16749b = true;
        b();
    }

    public final void j(PorterDuff.Mode mode) {
        if (this.f16284e == null) {
            this.f16284e = new z2();
        }
        z2 z2Var = this.f16284e;
        z2Var.f16751d = mode;
        z2Var.f16748a = true;
        b();
    }
}
