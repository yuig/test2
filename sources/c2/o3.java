package c2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f25040a = b3.w.f21390n;

    /* renamed from: b, reason: collision with root package name */
    public final e2.i f25041b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return b3.w.c(this.f25040a, o3Var.f25040a) && Intrinsics.d(this.f25041b, o3Var.f25041b);
    }

    public final int hashCode() {
        int i13 = b3.w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        int hashCode = Long.hashCode(this.f25040a) * 31;
        e2.i iVar = this.f25041b;
        return hashCode + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RippleConfiguration(color=");
        jq.b.t(this.f25040a, sb3, ", rippleAlpha=");
        sb3.append(this.f25041b);
        sb3.append(')');
        return sb3.toString();
    }
}
