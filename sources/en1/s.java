package en1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s extends t {

    /* renamed from: d, reason: collision with root package name */
    public final u50.i f59695d;

    public s() {
        super(bm1.y.ic_wavy_gestalt, l0.ic_wavy_gestalt_selected_classic, null);
        this.f59695d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f59695d, ((s) obj).f59695d);
    }

    public final int hashCode() {
        u50.i iVar = this.f59695d;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public final String toString() {
        return "Wavy(classicBackgroundColor=" + this.f59695d + ")";
    }
}
