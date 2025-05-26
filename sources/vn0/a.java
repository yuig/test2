package vn0;

import kotlin.jvm.internal.Intrinsics;
import u50.o;

/* loaded from: classes5.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final sk0.d f126252a;

    /* renamed from: b, reason: collision with root package name */
    public final tk0.e f126253b;

    public a(sk0.d floatingToolbarDisplayState, tk0.e organizeFloatingToolbarDisplayState) {
        Intrinsics.checkNotNullParameter(floatingToolbarDisplayState, "floatingToolbarDisplayState");
        Intrinsics.checkNotNullParameter(organizeFloatingToolbarDisplayState, "organizeFloatingToolbarDisplayState");
        this.f126252a = floatingToolbarDisplayState;
        this.f126253b = organizeFloatingToolbarDisplayState;
    }

    public static a e(a aVar, sk0.d floatingToolbarDisplayState, tk0.e organizeFloatingToolbarDisplayState, int i13) {
        if ((i13 & 1) != 0) {
            floatingToolbarDisplayState = aVar.f126252a;
        }
        if ((i13 & 2) != 0) {
            organizeFloatingToolbarDisplayState = aVar.f126253b;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(floatingToolbarDisplayState, "floatingToolbarDisplayState");
        Intrinsics.checkNotNullParameter(organizeFloatingToolbarDisplayState, "organizeFloatingToolbarDisplayState");
        return new a(floatingToolbarDisplayState, organizeFloatingToolbarDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f126252a, aVar.f126252a) && Intrinsics.d(this.f126253b, aVar.f126253b);
    }

    public final int hashCode() {
        return this.f126253b.hashCode() + (this.f126252a.hashCode() * 31);
    }

    public final String toString() {
        return "BoardSectionDisplayState(floatingToolbarDisplayState=" + this.f126252a + ", organizeFloatingToolbarDisplayState=" + this.f126253b + ")";
    }
}
