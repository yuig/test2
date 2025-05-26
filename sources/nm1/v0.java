package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v0 extends d1 {

    /* renamed from: b, reason: collision with root package name */
    public final int f91496b;

    /* renamed from: c, reason: collision with root package name */
    public final cn1.v f91497c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(int i13, cn1.v wrappedEvent) {
        super(i13);
        Intrinsics.checkNotNullParameter(wrappedEvent, "wrappedEvent");
        this.f91496b = i13;
        this.f91497c = wrappedEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f91496b == v0Var.f91496b && Intrinsics.d(this.f91497c, v0Var.f91497c);
    }

    public final int hashCode() {
        return this.f91497c.hashCode() + (Integer.hashCode(this.f91496b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f91496b;
    }

    public final String toString() {
        return "SearchFieldEvent(id=" + this.f91496b + ", wrappedEvent=" + this.f91497c + ")";
    }
}
