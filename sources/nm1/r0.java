package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 extends t0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f91478b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f91479c;

    /* renamed from: d, reason: collision with root package name */
    public final xl1.b f91480d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(int i13, u0 containerPosition, xl1.b wrappedEvent) {
        super(i13);
        Intrinsics.checkNotNullParameter(containerPosition, "containerPosition");
        Intrinsics.checkNotNullParameter(wrappedEvent, "wrappedEvent");
        this.f91478b = i13;
        this.f91479c = containerPosition;
        this.f91480d = wrappedEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f91478b == r0Var.f91478b && this.f91479c == r0Var.f91479c && Intrinsics.d(this.f91480d, r0Var.f91480d);
    }

    public final int hashCode() {
        return Integer.hashCode(((xl1.a) this.f91480d).f135260b) + ((this.f91479c.hashCode() + (Integer.hashCode(this.f91478b) * 31)) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f91478b;
    }

    public final String toString() {
        return "ButtonEvent(id=" + this.f91478b + ", containerPosition=" + this.f91479c + ", wrappedEvent=" + this.f91480d + ")";
    }
}
