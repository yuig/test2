package a7;

import android.view.Surface;

/* loaded from: classes3.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final Surface f1240a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1241b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1242c;

    public x0(Surface surface, int i13, int i14) {
        this.f1240a = surface;
        this.f1241b = i13;
        this.f1242c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f1241b == x0Var.f1241b && this.f1242c == x0Var.f1242c && this.f1240a.equals(x0Var.f1240a);
    }

    public final int hashCode() {
        return ((((this.f1240a.hashCode() * 31) + this.f1241b) * 31) + this.f1242c) * 961;
    }
}
