package v72;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ni1.u0;

/* loaded from: classes4.dex */
public final class i implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f124437a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f124438b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f124439c;

    public i(List items, boolean z13, u0 pinRepDisplayState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(pinRepDisplayState, "pinRepDisplayState");
        this.f124437a = items;
        this.f124438b = z13;
        this.f124439c = pinRepDisplayState;
    }

    public static i e(i iVar, List items, boolean z13, u0 pinRepDisplayState, int i13) {
        if ((i13 & 1) != 0) {
            items = iVar.f124437a;
        }
        if ((i13 & 2) != 0) {
            z13 = iVar.f124438b;
        }
        if ((i13 & 4) != 0) {
            pinRepDisplayState = iVar.f124439c;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(pinRepDisplayState, "pinRepDisplayState");
        return new i(items, z13, pinRepDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f124437a, iVar.f124437a) && this.f124438b == iVar.f124438b && Intrinsics.d(this.f124439c, iVar.f124439c);
    }

    public final int hashCode() {
        return this.f124439c.hashCode() + ep.b.e(this.f124438b, this.f124437a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "SbaPinCollageGridCellDisplayState(items=" + this.f124437a + ", canAnimate=" + this.f124438b + ", pinRepDisplayState=" + this.f124439c + ")";
    }
}
