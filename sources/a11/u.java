package a11;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String f357a;

    /* renamed from: b, reason: collision with root package name */
    public final int f358b;

    /* renamed from: c, reason: collision with root package name */
    public final int f359c;

    public u(String direction, int i13, int i14) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f357a = direction;
        this.f358b = i13;
        this.f359c = i14;
    }

    public final int a() {
        return this.f358b;
    }

    public final int b() {
        return this.f359c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f357a, uVar.f357a) && this.f358b == uVar.f358b && this.f359c == uVar.f359c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f359c) + ep.b.b(this.f358b, this.f357a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SendSwipeEventData(direction=");
        sb3.append(this.f357a);
        sb3.append(", createdPosition=");
        sb3.append(this.f358b);
        sb3.append(", destroyPosition=");
        return a.a.n(sb3, this.f359c, ")");
    }
}
