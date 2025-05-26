package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gc implements ic, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f132448d;

    /* renamed from: e, reason: collision with root package name */
    public final fc f132449e;

    public gc(String __typename, fc error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f132448d = __typename;
        this.f132449e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f132449e;
    }

    @Override // z40.b
    public final String b() {
        return this.f132448d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc)) {
            return false;
        }
        gc gcVar = (gc) obj;
        return Intrinsics.d(this.f132448d, gcVar.f132448d) && Intrinsics.d(this.f132449e, gcVar.f132449e);
    }

    public final int hashCode() {
        return this.f132449e.hashCode() + (this.f132448d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3GetUserContactRequestsByUserQuery(__typename=" + this.f132448d + ", error=" + this.f132449e + ")";
    }
}
