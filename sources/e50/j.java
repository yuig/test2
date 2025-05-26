package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements l, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f57368d;

    /* renamed from: e, reason: collision with root package name */
    public final i f57369e;

    public j(String __typename, i error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f57368d = __typename;
        this.f57369e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f57369e;
    }

    @Override // z40.b
    public final String b() {
        return this.f57368d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f57368d, jVar.f57368d) && Intrinsics.d(this.f57369e, jVar.f57369e);
    }

    public final int hashCode() {
        return this.f57369e.hashCode() + (this.f57368d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3SearchUsersWithStoriesQuery(__typename=" + this.f57368d + ", error=" + this.f57369e + ")";
    }
}
