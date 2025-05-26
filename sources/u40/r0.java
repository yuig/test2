package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 implements t0, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f120421d;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f120422e;

    public r0(String __typename, q0 error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f120421d = __typename;
        this.f120422e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f120422e;
    }

    @Override // z40.b
    public final String b() {
        return this.f120421d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.d(this.f120421d, r0Var.f120421d) && Intrinsics.d(this.f120422e, r0Var.f120422e);
    }

    public final int hashCode() {
        return this.f120422e.hashCode() + (this.f120421d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3GetUserHandlerQuery(__typename=" + this.f120421d + ", error=" + this.f120422e + ")";
    }
}
