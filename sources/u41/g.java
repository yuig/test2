package u41;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f120486a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f120487b;

    public /* synthetic */ g(int i13, int i14) {
        this((i14 & 1) != 0 ? 0 : i13, c.f120478k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f120486a == gVar.f120486a && Intrinsics.d(this.f120487b, gVar.f120487b);
    }

    public final int hashCode() {
        return this.f120487b.hashCode() + (Integer.hashCode(this.f120486a) * 31);
    }

    public final String toString() {
        return "PillTapState(id=" + this.f120486a + ", action=" + this.f120487b + ")";
    }

    public g(int i13, Function1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f120486a = i13;
        this.f120487b = action;
    }
}
