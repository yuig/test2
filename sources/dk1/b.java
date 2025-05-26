package dk1;

import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import u50.o;

/* loaded from: classes2.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final List f55161a;

    public b(List pieceDisplayStates) {
        Intrinsics.checkNotNullParameter(pieceDisplayStates, "pieceDisplayStates");
        this.f55161a = pieceDisplayStates;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f55161a, ((b) obj).f55161a);
    }

    public final int hashCode() {
        return this.f55161a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("HeaderZoneDisplayState(pieceDisplayStates="), this.f55161a, ")");
    }

    public b() {
        this(q0.f80391a);
    }
}
