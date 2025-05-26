package zx;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f142967a;

    /* renamed from: b, reason: collision with root package name */
    public final int f142968b;

    public b(String name, int i13) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f142967a = name;
        this.f142968b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f142967a, bVar.f142967a) && this.f142968b == bVar.f142968b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f142968b) + (this.f142967a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ClaimedAccountFilter(name=");
        sb3.append(this.f142967a);
        sb3.append(", position=");
        return a.a.n(sb3, this.f142968b, ")");
    }
}
