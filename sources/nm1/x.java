package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements y {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.q f91505a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f91506b;

    public x(u50.i0 i0Var, rm1.q icon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f91505a = icon;
        this.f91506b = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f91505a == xVar.f91505a && Intrinsics.d(this.f91506b, xVar.f91506b);
    }

    public final int hashCode() {
        int hashCode = this.f91505a.hashCode() * 31;
        u50.i0 i0Var = this.f91506b;
        return hashCode + (i0Var == null ? 0 : i0Var.hashCode());
    }

    public final String toString() {
        return "SingleIconButton(icon=" + this.f91505a + ", contentDescription=" + this.f91506b + ")";
    }
}
