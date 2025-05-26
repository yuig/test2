package s30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p implements r, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f111049d;

    /* renamed from: e, reason: collision with root package name */
    public final o f111050e;

    public p(String __typename, o error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f111049d = __typename;
        this.f111050e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f111050e;
    }

    @Override // z40.b
    public final String b() {
        return this.f111049d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f111049d, pVar.f111049d) && Intrinsics.d(this.f111050e, pVar.f111050e);
    }

    public final int hashCode() {
        return this.f111050e.hashCode() + (this.f111049d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3AndroidCubesClustersQuery(__typename=" + this.f111049d + ", error=" + this.f111050e + ")";
    }
}
