package b40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i implements k, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f21714d;

    /* renamed from: e, reason: collision with root package name */
    public final h f21715e;

    public i(String __typename, h error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f21714d = __typename;
        this.f21715e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f21715e;
    }

    @Override // z40.b
    public final String b() {
        return this.f21714d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f21714d, iVar.f21714d) && Intrinsics.d(this.f21715e, iVar.f21715e);
    }

    public final int hashCode() {
        return this.f21715e.hashCode() + (this.f21714d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3GetCurrentUserHandlerQuery(__typename=" + this.f21714d + ", error=" + this.f21715e + ")";
    }
}
