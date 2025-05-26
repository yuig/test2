package v30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements d, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f123920d;

    /* renamed from: e, reason: collision with root package name */
    public final a f123921e;

    public b(String __typename, a error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f123920d = __typename;
        this.f123921e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f123921e;
    }

    @Override // z40.b
    public final String b() {
        return this.f123920d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f123920d, bVar.f123920d) && Intrinsics.d(this.f123921e, bVar.f123921e);
    }

    public final int hashCode() {
        return this.f123921e.hashCode() + (this.f123920d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3FollowUserMethodMutation(__typename=" + this.f123920d + ", error=" + this.f123921e + ")";
    }
}
