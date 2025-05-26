package v30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j implements l, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f123935d;

    /* renamed from: e, reason: collision with root package name */
    public final i f123936e;

    public j(String __typename, i error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f123935d = __typename;
        this.f123936e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f123936e;
    }

    @Override // z40.b
    public final String b() {
        return this.f123935d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f123935d, jVar.f123935d) && Intrinsics.d(this.f123936e, jVar.f123936e);
    }

    public final int hashCode() {
        return this.f123936e.hashCode() + (this.f123935d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3UnfollowUserMethodMutation(__typename=" + this.f123935d + ", error=" + this.f123936e + ")";
    }
}
