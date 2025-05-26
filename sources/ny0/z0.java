package ny0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f92658a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92659b;

    /* renamed from: c, reason: collision with root package name */
    public final int f92660c;

    public z0(String useCaseId, int i13, int i14) {
        Intrinsics.checkNotNullParameter(useCaseId, "useCaseId");
        this.f92658a = useCaseId;
        this.f92659b = i13;
        this.f92660c = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return Intrinsics.d(this.f92658a, z0Var.f92658a) && this.f92659b == z0Var.f92659b && this.f92660c == z0Var.f92660c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f92660c) + ep.b.b(this.f92659b, this.f92658a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinFeedRequestArgs(useCaseId=");
        sb3.append(this.f92658a);
        sb3.append(", firstPinIndex=");
        sb3.append(this.f92659b);
        sb3.append(", lastPinIndex=");
        return a.a.n(sb3, this.f92660c, ")");
    }
}
