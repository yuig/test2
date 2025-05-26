package fk1;

import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final List f62348a;

    public d(List pieceDisplayStates) {
        Intrinsics.checkNotNullParameter(pieceDisplayStates, "pieceDisplayStates");
        this.f62348a = pieceDisplayStates;
    }

    public static d e(List pieceDisplayStates) {
        Intrinsics.checkNotNullParameter(pieceDisplayStates, "pieceDisplayStates");
        return new d(pieceDisplayStates);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f62348a, ((d) obj).f62348a);
    }

    public final int hashCode() {
        return this.f62348a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("MetaDataZoneDisplayState(pieceDisplayStates="), this.f62348a, ")");
    }

    public d() {
        this(q0.f80391a);
    }
}
