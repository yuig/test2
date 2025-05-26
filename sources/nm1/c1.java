package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 extends t0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f91392b;

    /* renamed from: c, reason: collision with root package name */
    public final rn1.i f91393c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(int i13, rn1.i wrappedEvent) {
        super(i13, 1);
        Intrinsics.checkNotNullParameter(wrappedEvent, "wrappedEvent");
        this.f91392b = i13;
        this.f91393c = wrappedEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f91392b == c1Var.f91392b && Intrinsics.d(this.f91393c, c1Var.f91393c);
    }

    public final int hashCode() {
        return this.f91393c.hashCode() + (Integer.hashCode(this.f91392b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f91392b;
    }

    public final String toString() {
        return "UserNameEvent(id=" + this.f91392b + ", wrappedEvent=" + this.f91393c + ")";
    }
}
