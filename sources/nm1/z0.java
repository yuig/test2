package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 extends t0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f91518b;

    /* renamed from: c, reason: collision with root package name */
    public final rn1.i f91519c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(int i13, rn1.i wrappedEvent) {
        super(i13, 1);
        Intrinsics.checkNotNullParameter(wrappedEvent, "wrappedEvent");
        this.f91518b = i13;
        this.f91519c = wrappedEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return this.f91518b == z0Var.f91518b && Intrinsics.d(this.f91519c, z0Var.f91519c);
    }

    public final int hashCode() {
        return this.f91519c.hashCode() + (Integer.hashCode(this.f91518b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f91518b;
    }

    public final String toString() {
        return "SubtitleEvent(id=" + this.f91518b + ", wrappedEvent=" + this.f91519c + ")";
    }
}
