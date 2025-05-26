package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.q f91449a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f91450b;

    public n(u50.i0 i0Var, rm1.q icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f91449a = icon;
        this.f91450b = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f91449a == nVar.f91449a && Intrinsics.d(this.f91450b, nVar.f91450b);
    }

    public final int hashCode() {
        int hashCode = this.f91449a.hashCode() * 31;
        u50.i0 i0Var = this.f91450b;
        return hashCode + (i0Var == null ? 0 : i0Var.hashCode());
    }

    public final String toString() {
        return "HeaderBarIcon(icon=" + this.f91449a + ", contentDescription=" + this.f91450b + ")";
    }
}
