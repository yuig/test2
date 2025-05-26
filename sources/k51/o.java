package k51;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final n f78328a;

    /* renamed from: b, reason: collision with root package name */
    public final b22.l f78329b;

    /* renamed from: c, reason: collision with root package name */
    public final bm1.n f78330c;

    public /* synthetic */ o(n nVar, b22.l lVar, int i13) {
        this((i13 & 1) != 0 ? n.SEARCH_BAR : nVar, (i13 & 2) != 0 ? b22.l.COMPACT : lVar, bm1.n.UNSELECTED);
    }

    public static o e(o oVar, b22.l selectedPinsViewType, bm1.n selectedState, int i13) {
        n appearance = oVar.f78328a;
        if ((i13 & 2) != 0) {
            selectedPinsViewType = oVar.f78329b;
        }
        if ((i13 & 4) != 0) {
            selectedState = oVar.f78330c;
        }
        oVar.getClass();
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        Intrinsics.checkNotNullParameter(selectedPinsViewType, "selectedPinsViewType");
        Intrinsics.checkNotNullParameter(selectedState, "selectedState");
        return new o(appearance, selectedPinsViewType, selectedState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f78328a == oVar.f78328a && this.f78329b == oVar.f78329b && this.f78330c == oVar.f78330c;
    }

    public final int hashCode() {
        return this.f78330c.hashCode() + ((this.f78329b.hashCode() + (this.f78328a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ViewOptionsDisplayState(appearance=" + this.f78328a + ", selectedPinsViewType=" + this.f78329b + ", selectedState=" + this.f78330c + ")";
    }

    public o(n appearance, b22.l selectedPinsViewType, bm1.n selectedState) {
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        Intrinsics.checkNotNullParameter(selectedPinsViewType, "selectedPinsViewType");
        Intrinsics.checkNotNullParameter(selectedState, "selectedState");
        this.f78328a = appearance;
        this.f78329b = selectedPinsViewType;
        this.f78330c = selectedState;
    }
}
