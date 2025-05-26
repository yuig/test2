package v30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements d {

    /* renamed from: d, reason: collision with root package name */
    public final String f123928d;

    /* renamed from: e, reason: collision with root package name */
    public final e f123929e;

    public f(String __typename, e eVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f123928d = __typename;
        this.f123929e = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f123928d, fVar.f123928d) && Intrinsics.d(this.f123929e, fVar.f123929e);
    }

    public final int hashCode() {
        int hashCode = this.f123928d.hashCode() * 31;
        e eVar = this.f123929e;
        return hashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "V3FollowUserMethodV3FollowUserMethodMutation(__typename=" + this.f123928d + ", data=" + this.f123929e + ")";
    }
}
