package r52;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final o82.a0 f106283a;

    /* renamed from: b, reason: collision with root package name */
    public final f f106284b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f106285c;

    public g(o82.a0 listDisplayState, f selectionDisplayState, boolean z13) {
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(selectionDisplayState, "selectionDisplayState");
        this.f106283a = listDisplayState;
        this.f106284b = selectionDisplayState;
        this.f106285c = z13;
    }

    public static g e(g gVar, o82.a0 listDisplayState, f selectionDisplayState, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            listDisplayState = gVar.f106283a;
        }
        if ((i13 & 2) != 0) {
            selectionDisplayState = gVar.f106284b;
        }
        if ((i13 & 4) != 0) {
            z13 = gVar.f106285c;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(selectionDisplayState, "selectionDisplayState");
        return new g(listDisplayState, selectionDisplayState, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f106283a, gVar.f106283a) && Intrinsics.d(this.f106284b, gVar.f106284b) && this.f106285c == gVar.f106285c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106285c) + ((this.f106284b.hashCode() + (this.f106283a.f93524a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShareBoardPinSelectionSheetDisplayState(listDisplayState=");
        sb3.append(this.f106283a);
        sb3.append(", selectionDisplayState=");
        sb3.append(this.f106284b);
        sb3.append(", showDiscardDialog=");
        return a.a.r(sb3, this.f106285c, ")");
    }
}
