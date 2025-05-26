package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 extends t0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f91377b;

    /* renamed from: c, reason: collision with root package name */
    public final rn1.i f91378c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(int i13, rn1.i wrappedEvent) {
        super(i13, 1);
        Intrinsics.checkNotNullParameter(wrappedEvent, "wrappedEvent");
        this.f91377b = i13;
        this.f91378c = wrappedEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f91377b == a1Var.f91377b && Intrinsics.d(this.f91378c, a1Var.f91378c);
    }

    public final int hashCode() {
        return this.f91378c.hashCode() + (Integer.hashCode(this.f91377b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f91377b;
    }

    public final String toString() {
        return "TitleEvent(id=" + this.f91377b + ", wrappedEvent=" + this.f91378c + ")";
    }
}
