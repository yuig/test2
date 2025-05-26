package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final e0 f96495a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f96496b;

    public f0(e0 creation, d0 binding) {
        Intrinsics.checkNotNullParameter(creation, "creation");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f96495a = creation;
        this.f96496b = binding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.d(this.f96495a, f0Var.f96495a) && Intrinsics.d(this.f96496b, f0Var.f96496b);
    }

    public final int hashCode() {
        return this.f96496b.f96477a.hashCode() + (this.f96495a.hashCode() * 31);
    }

    public final String toString() {
        return "PinRepSetup(creation=" + this.f96495a + ", binding=" + this.f96496b + ")";
    }
}
