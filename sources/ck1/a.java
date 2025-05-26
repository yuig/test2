package ck1;

import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import u50.o;

/* loaded from: classes2.dex */
public final class a implements o {

    /* renamed from: a, reason: collision with root package name */
    public final List f27906a;

    public a(List pieceDisplayStates) {
        Intrinsics.checkNotNullParameter(pieceDisplayStates, "pieceDisplayStates");
        this.f27906a = pieceDisplayStates;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f27906a, ((a) obj).f27906a);
    }

    public final int hashCode() {
        return this.f27906a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("FooterZoneDisplayState(pieceDisplayStates="), this.f27906a, ")");
    }

    public a() {
        this(q0.f80391a);
    }
}
