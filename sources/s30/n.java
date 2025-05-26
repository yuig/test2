package s30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n implements r {

    /* renamed from: d, reason: collision with root package name */
    public final String f111045d;

    /* renamed from: e, reason: collision with root package name */
    public final m f111046e;

    public n(String __typename, m mVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f111045d = __typename;
        this.f111046e = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f111045d, nVar.f111045d) && Intrinsics.d(this.f111046e, nVar.f111046e);
    }

    public final int hashCode() {
        int hashCode = this.f111045d.hashCode() * 31;
        m mVar = this.f111046e;
        return hashCode + (mVar == null ? 0 : mVar.hashCode());
    }

    public final String toString() {
        return "AndroidCubesClustersResponseV3AndroidCubesClustersQuery(__typename=" + this.f111045d + ", data=" + this.f111046e + ")";
    }
}
