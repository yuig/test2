package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mg implements kg, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f132828d;

    /* renamed from: e, reason: collision with root package name */
    public final lg f132829e;

    public mg(String __typename, lg error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f132828d = __typename;
        this.f132829e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f132829e;
    }

    @Override // z40.b
    public final String b() {
        return this.f132828d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg)) {
            return false;
        }
        mg mgVar = (mg) obj;
        return Intrinsics.d(this.f132828d, mgVar.f132828d) && Intrinsics.d(this.f132829e, mgVar.f132829e);
    }

    public final int hashCode() {
        return this.f132829e.hashCode() + (this.f132828d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorData(__typename=" + this.f132828d + ", error=" + this.f132829e + ")";
    }
}
