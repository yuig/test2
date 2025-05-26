package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 implements pc.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final x0 f131894a;

    public a1(x0 x0Var) {
        this.f131894a = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && Intrinsics.d(this.f131894a, ((a1) obj).f131894a);
    }

    public final int hashCode() {
        x0 x0Var = this.f131894a;
        if (x0Var == null) {
            return 0;
        }
        return x0Var.hashCode();
    }

    public final String toString() {
        return "Data(v3BatchDeclineContactRequestsMutation=" + this.f131894a + ")";
    }
}
