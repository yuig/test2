package g30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b implements e, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f63415d;

    /* renamed from: e, reason: collision with root package name */
    public final a f63416e;

    public b(String __typename, a error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f63415d = __typename;
        this.f63416e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f63416e;
    }

    @Override // z40.b
    public final String b() {
        return this.f63415d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f63415d, bVar.f63415d) && Intrinsics.d(this.f63416e, bVar.f63416e);
    }

    public final int hashCode() {
        return this.f63416e.hashCode() + (this.f63415d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3AddDeviceTokenMutation(__typename=" + this.f63415d + ", error=" + this.f63416e + ")";
    }
}
