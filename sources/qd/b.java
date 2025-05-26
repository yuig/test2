package qd;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final c f103534a;

    /* renamed from: b, reason: collision with root package name */
    public int f103535b;

    /* renamed from: c, reason: collision with root package name */
    public int f103536c;

    /* renamed from: d, reason: collision with root package name */
    public Bitmap.Config f103537d;

    public b(c cVar) {
        this.f103534a = cVar;
    }

    @Override // qd.l
    public final void a() {
        this.f103534a.g(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f103535b == bVar.f103535b && this.f103536c == bVar.f103536c && this.f103537d == bVar.f103537d;
    }

    public final int hashCode() {
        int i13 = ((this.f103535b * 31) + this.f103536c) * 31;
        Bitmap.Config config = this.f103537d;
        return i13 + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return sp2.i.P(this.f103535b, this.f103536c, this.f103537d);
    }
}
