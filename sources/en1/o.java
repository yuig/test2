package en1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o extends t {

    /* renamed from: d, reason: collision with root package name */
    public final u50.i f59691d;

    public o() {
        super(bm1.y.ic_coily_gestalt, l0.ic_coily_gestalt_selected_classic, null);
        this.f59691d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f59691d, ((o) obj).f59691d);
    }

    public final int hashCode() {
        u50.i iVar = this.f59691d;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public final String toString() {
        return "Coily(classicBackgroundColor=" + this.f59691d + ")";
    }
}
