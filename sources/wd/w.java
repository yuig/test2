package wd;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes3.dex */
public final class w implements pd.g0, pd.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f129213a;

    /* renamed from: b, reason: collision with root package name */
    public final pd.g0 f129214b;

    public w(Resources resources, pd.g0 g0Var) {
        d7.b.p(resources, "Argument must not be null");
        this.f129213a = resources;
        d7.b.p(g0Var, "Argument must not be null");
        this.f129214b = g0Var;
    }

    public static w e(Resources resources, pd.g0 g0Var) {
        if (g0Var == null) {
            return null;
        }
        return new w(resources, g0Var);
    }

    @Override // pd.g0
    public final int a() {
        return this.f129214b.a();
    }

    @Override // pd.c0
    public final void b() {
        pd.g0 g0Var = this.f129214b;
        if (g0Var instanceof pd.c0) {
            ((pd.c0) g0Var).b();
        }
    }

    @Override // pd.g0
    public final void c() {
        this.f129214b.c();
    }

    @Override // pd.g0
    public final Class d() {
        return BitmapDrawable.class;
    }

    @Override // pd.g0
    public final Object get() {
        return new BitmapDrawable(this.f129213a, (Bitmap) this.f129214b.get());
    }
}
