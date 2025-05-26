package en1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends t {

    /* renamed from: d, reason: collision with root package name */
    public final u50.i f59692d;

    public p() {
        super(bm1.y.ic_curly_gestalt, l0.ic_curly_gestalt_selected_classic, null);
        this.f59692d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f59692d, ((p) obj).f59692d);
    }

    public final int hashCode() {
        u50.i iVar = this.f59692d;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public final String toString() {
        return "Curly(classicBackgroundColor=" + this.f59692d + ")";
    }
}
