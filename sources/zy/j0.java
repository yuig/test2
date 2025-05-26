package zy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f143082a;

    /* renamed from: b, reason: collision with root package name */
    public final String f143083b;

    public j0(h32.i0 context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f143082a = context;
        this.f143083b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return Intrinsics.d(this.f143082a, j0Var.f143082a) && Intrinsics.d(this.f143083b, j0Var.f143083b);
    }

    public final int hashCode() {
        int hashCode = this.f143082a.hashCode() * 31;
        String str = this.f143083b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "UpdateContextSideEffectRequest(context=" + this.f143082a + ", uniqueScreenKey=" + this.f143083b + ")";
    }
}
