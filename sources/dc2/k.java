package dc2;

import ac2.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f54420a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f54421b;

    public k(s0 poolItem, boolean z13) {
        Intrinsics.checkNotNullParameter(poolItem, "poolItem");
        this.f54420a = poolItem;
        this.f54421b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f54420a, kVar.f54420a) && this.f54421b == kVar.f54421b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f54421b) + (this.f54420a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GetOrCreateResult(poolItem=");
        sb3.append(this.f54420a);
        sb3.append(", didCreate=");
        return a.a.r(sb3, this.f54421b, ")");
    }
}
