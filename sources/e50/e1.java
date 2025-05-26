package e50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e1 implements l {

    /* renamed from: d, reason: collision with root package name */
    public final String f57319d;

    /* renamed from: e, reason: collision with root package name */
    public final m f57320e;

    public e1(String __typename, m mVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f57319d = __typename;
        this.f57320e = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Intrinsics.d(this.f57319d, e1Var.f57319d) && Intrinsics.d(this.f57320e, e1Var.f57320e);
    }

    public final int hashCode() {
        int hashCode = this.f57319d.hashCode() * 31;
        m mVar = this.f57320e;
        return hashCode + (mVar == null ? 0 : mVar.hashCode());
    }

    public final String toString() {
        return "V3SearchUsersWithStoriesV3SearchUsersWithStoriesQuery(__typename=" + this.f57319d + ", data=" + this.f57320e + ")";
    }
}
