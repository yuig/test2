package wd;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class c implements pd.g0, pd.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f129158a;

    /* renamed from: b, reason: collision with root package name */
    public final qd.d f129159b;

    public c(Bitmap bitmap, qd.d dVar) {
        d7.b.p(bitmap, "Bitmap must not be null");
        this.f129158a = bitmap;
        d7.b.p(dVar, "BitmapPool must not be null");
        this.f129159b = dVar;
    }

    public static c e(Bitmap bitmap, qd.d dVar) {
        if (bitmap == null) {
            return null;
        }
        return new c(bitmap, dVar);
    }

    @Override // pd.g0
    public final int a() {
        return he.n.c(this.f129158a);
    }

    @Override // pd.c0
    public final void b() {
        this.f129158a.prepareToDraw();
    }

    @Override // pd.g0
    public final void c() {
        this.f129159b.b(this.f129158a);
    }

    @Override // pd.g0
    public final Class d() {
        return Bitmap.class;
    }

    @Override // pd.g0
    public final Object get() {
        return this.f129158a;
    }
}
