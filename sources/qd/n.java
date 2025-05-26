package qd;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class n implements l {

    /* renamed from: a, reason: collision with root package name */
    public final dc.a f103562a;

    /* renamed from: b, reason: collision with root package name */
    public int f103563b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap.Config f103564c;

    public n(dc.a aVar) {
        this.f103562a = aVar;
    }

    @Override // qd.l
    public final void a() {
        this.f103562a.g(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f103563b == nVar.f103563b && he.n.b(this.f103564c, nVar.f103564c);
    }

    public final int hashCode() {
        int i13 = this.f103563b * 31;
        Bitmap.Config config = this.f103564c;
        return i13 + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return o.c(this.f103563b, this.f103564c);
    }
}
