package j1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z0 extends y0 {

    /* renamed from: c, reason: collision with root package name */
    public final int f74339c;

    public z0(Object obj) {
        super(obj, g0.f74072c);
        this.f74339c = 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Intrinsics.d(z0Var.f74322a, this.f74322a) && Intrinsics.d(z0Var.f74323b, this.f74323b) && z0Var.f74339c == this.f74339c;
    }

    public final int hashCode() {
        Object obj = this.f74322a;
        return this.f74323b.hashCode() + ep.b.b(this.f74339c, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }
}
