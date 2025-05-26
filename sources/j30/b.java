package j30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements d, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f74545d;

    /* renamed from: e, reason: collision with root package name */
    public final a f74546e;

    public b(String __typename, a error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f74545d = __typename;
        this.f74546e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f74546e;
    }

    @Override // z40.b
    public final String b() {
        return this.f74545d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f74545d, bVar.f74545d) && Intrinsics.d(this.f74546e, bVar.f74546e);
    }

    public final int hashCode() {
        return this.f74546e.hashCode() + (this.f74545d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3GetUserHandlerQuery(__typename=" + this.f74545d + ", error=" + this.f74546e + ")";
    }
}
