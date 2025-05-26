package u40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements t, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f120419d;

    /* renamed from: e, reason: collision with root package name */
    public final q f120420e;

    public r(String __typename, q error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f120419d = __typename;
        this.f120420e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f120420e;
    }

    @Override // z40.b
    public final String b() {
        return this.f120419d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f120419d, rVar.f120419d) && Intrinsics.d(this.f120420e, rVar.f120420e);
    }

    public final int hashCode() {
        return this.f120420e.hashCode() + (this.f120419d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3GetCurrentUserHandlerQuery(__typename=" + this.f120419d + ", error=" + this.f120420e + ")";
    }
}
