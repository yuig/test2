package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b1 extends t0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f91386b;

    /* renamed from: c, reason: collision with root package name */
    public final rl1.a0 f91387c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(int i13, rl1.a0 wrappedEvent) {
        super(i13, 1);
        Intrinsics.checkNotNullParameter(wrappedEvent, "wrappedEvent");
        this.f91386b = i13;
        this.f91387c = wrappedEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f91386b == b1Var.f91386b && Intrinsics.d(this.f91387c, b1Var.f91387c);
    }

    public final int hashCode() {
        return this.f91387c.hashCode() + (Integer.hashCode(this.f91386b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f91386b;
    }

    public final String toString() {
        return "AvatarEvent(id=" + this.f91386b + ", wrappedEvent=" + this.f91387c + ")";
    }
}
