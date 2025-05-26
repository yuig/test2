package al1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f15481a;

    /* renamed from: b, reason: collision with root package name */
    public final o f15482b;

    public e(String bundleId, o result) {
        Intrinsics.checkNotNullParameter(bundleId, "bundleId");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f15481a = bundleId;
        this.f15482b = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f15481a, eVar.f15481a) && Intrinsics.d(this.f15482b, eVar.f15482b);
    }

    public final int hashCode() {
        return this.f15482b.hashCode() + (this.f15481a.hashCode() * 31);
    }

    public final String toString() {
        return "PopBackStackWithResult(bundleId=" + this.f15481a + ", result=" + this.f15482b + ")";
    }
}
