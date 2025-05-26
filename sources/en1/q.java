package en1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends t {

    /* renamed from: d, reason: collision with root package name */
    public final u50.i f59693d;

    public q() {
        super(bm1.y.ic_protective_gestalt, l0.ic_protective_gestalt_selected_classic, null);
        this.f59693d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f59693d, ((q) obj).f59693d);
    }

    public final int hashCode() {
        u50.i iVar = this.f59693d;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public final String toString() {
        return "Protective(classicBackgroundColor=" + this.f59693d + ")";
    }
}
