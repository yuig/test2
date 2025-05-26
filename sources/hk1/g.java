package hk1;

import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f69351a;

    public g(List pieceDisplayStates) {
        Intrinsics.checkNotNullParameter(pieceDisplayStates, "pieceDisplayStates");
        this.f69351a = pieceDisplayStates;
    }

    public static g e(List pieceDisplayStates) {
        Intrinsics.checkNotNullParameter(pieceDisplayStates, "pieceDisplayStates");
        return new g(pieceDisplayStates);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f69351a, ((g) obj).f69351a);
    }

    public final int hashCode() {
        return this.f69351a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("TrailingAccessoryZoneDisplayState(pieceDisplayStates="), this.f69351a, ")");
    }

    public g() {
        this(q0.f80391a);
    }
}
