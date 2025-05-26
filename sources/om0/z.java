package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements u50.o {

    /* renamed from: a */
    public final a f96620a;

    /* renamed from: b */
    public final t f96621b;

    public z(a startAction, t endActions) {
        Intrinsics.checkNotNullParameter(startAction, "startAction");
        Intrinsics.checkNotNullParameter(endActions, "endActions");
        this.f96620a = startAction;
        this.f96621b = endActions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f96620a, zVar.f96620a) && Intrinsics.d(this.f96621b, zVar.f96621b);
    }

    public final int hashCode() {
        return this.f96621b.hashCode() + (this.f96620a.hashCode() * 31);
    }

    public final String toString() {
        return "BoardTopBarState(startAction=" + this.f96620a + ", endActions=" + this.f96621b + ")";
    }
}
