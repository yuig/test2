package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 implements m0, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f21716d;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f21717e;

    public i0(String __typename, h0 error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f21716d = __typename;
        this.f21717e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f21717e;
    }

    @Override // z40.b
    public final String b() {
        return this.f21716d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.d(this.f21716d, i0Var.f21716d) && Intrinsics.d(this.f21717e, i0Var.f21717e);
    }

    public final int hashCode() {
        return this.f21717e.hashCode() + (this.f21716d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3HideNewsHubPinMutation(__typename=" + this.f21716d + ", error=" + this.f21717e + ")";
    }
}
