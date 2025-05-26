package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vg {

    /* renamed from: a, reason: collision with root package name */
    public final ug f133557a;

    public vg(ug ugVar) {
        this.f133557a = ugVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vg) && Intrinsics.d(this.f133557a, ((vg) obj).f133557a);
    }

    public final int hashCode() {
        ug ugVar = this.f133557a;
        if (ugVar == null) {
            return 0;
        }
        return ugVar.hashCode();
    }

    public final String toString() {
        return "LinkDomain(officialUser=" + this.f133557a + ")";
    }
}
