package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 implements s0, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f21740d;

    /* renamed from: e, reason: collision with root package name */
    public final p0 f21741e;

    public q0(String __typename, p0 error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f21740d = __typename;
        this.f21741e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f21741e;
    }

    @Override // z40.b
    public final String b() {
        return this.f21740d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return Intrinsics.d(this.f21740d, q0Var.f21740d) && Intrinsics.d(this.f21741e, q0Var.f21741e);
    }

    public final int hashCode() {
        return this.f21741e.hashCode() + (this.f21740d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3UpdateObjectSubscriptionsForNotificationsGraphqlMutation(__typename=" + this.f21740d + ", error=" + this.f21741e + ")";
    }
}
