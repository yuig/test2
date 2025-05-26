package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q0 extends t0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f91468b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f91469c;

    /* renamed from: d, reason: collision with root package name */
    public final rl1.a0 f91470d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(int i13, u0 containerPosition, rl1.a0 wrappedEvent) {
        super(i13);
        Intrinsics.checkNotNullParameter(containerPosition, "containerPosition");
        Intrinsics.checkNotNullParameter(wrappedEvent, "wrappedEvent");
        this.f91468b = i13;
        this.f91469c = containerPosition;
        this.f91470d = wrappedEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f91468b == q0Var.f91468b && this.f91469c == q0Var.f91469c && Intrinsics.d(this.f91470d, q0Var.f91470d);
    }

    public final int hashCode() {
        return this.f91470d.hashCode() + ((this.f91469c.hashCode() + (Integer.hashCode(this.f91468b) * 31)) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f91468b;
    }

    public final String toString() {
        return "AvatarEvent(id=" + this.f91468b + ", containerPosition=" + this.f91469c + ", wrappedEvent=" + this.f91470d + ")";
    }
}
