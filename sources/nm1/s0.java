package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 extends t0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f91487b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f91488c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f91489d;

    /* renamed from: e, reason: collision with root package name */
    public final om1.p f91490e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(int i13, u0 containerPosition, u0 u0Var, om1.p wrappedEvent) {
        super(i13);
        Intrinsics.checkNotNullParameter(containerPosition, "containerPosition");
        Intrinsics.checkNotNullParameter(wrappedEvent, "wrappedEvent");
        this.f91487b = i13;
        this.f91488c = containerPosition;
        this.f91489d = u0Var;
        this.f91490e = wrappedEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f91487b == s0Var.f91487b && this.f91488c == s0Var.f91488c && this.f91489d == s0Var.f91489d && Intrinsics.d(this.f91490e, s0Var.f91490e);
    }

    public final int hashCode() {
        int hashCode = (this.f91488c.hashCode() + (Integer.hashCode(this.f91487b) * 31)) * 31;
        u0 u0Var = this.f91489d;
        return this.f91490e.hashCode() + ((hashCode + (u0Var == null ? 0 : u0Var.hashCode())) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f91487b;
    }

    public final String toString() {
        return "IconButtonEvent(id=" + this.f91487b + ", containerPosition=" + this.f91488c + ", positionInContainer=" + this.f91489d + ", wrappedEvent=" + this.f91490e + ")";
    }
}
