package en1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends t {

    /* renamed from: d, reason: collision with root package name */
    public final u50.i f59694d;

    public r() {
        super(bm1.y.ic_straight_gestalt, l0.ic_straight_gestalt_selected_classic, null);
        this.f59694d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f59694d, ((r) obj).f59694d);
    }

    public final int hashCode() {
        u50.i iVar = this.f59694d;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public final String toString() {
        return "Straight(classicBackgroundColor=" + this.f59694d + ")";
    }
}
