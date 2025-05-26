package en1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends t {

    /* renamed from: d, reason: collision with root package name */
    public final u50.i f59690d;

    public n() {
        super(bm1.y.ic_bald_shaved_gestalt, l0.ic_bald_shaved_gestalt_selected_classic, null);
        this.f59690d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f59690d, ((n) obj).f59690d);
    }

    public final int hashCode() {
        u50.i iVar = this.f59690d;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public final String toString() {
        return "BaldShaved(classicBackgroundColor=" + this.f59690d + ")";
    }
}
