package r40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements d, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f106131d;

    /* renamed from: e, reason: collision with root package name */
    public final a f106132e;

    public b(String __typename, a error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f106131d = __typename;
        this.f106132e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f106132e;
    }

    @Override // z40.b
    public final String b() {
        return this.f106131d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f106131d, bVar.f106131d) && Intrinsics.d(this.f106132e, bVar.f106132e);
    }

    public final int hashCode() {
        return this.f106132e.hashCode() + (this.f106131d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3DeleteAddressBookMutation(__typename=" + this.f106131d + ", error=" + this.f106132e + ")";
    }
}
