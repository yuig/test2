package gk1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    public final List f65230a;

    public h(List pieces) {
        Intrinsics.checkNotNullParameter(pieces, "pieces");
        this.f65230a = pieces;
    }

    public final List a() {
        return this.f65230a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f65230a, ((h) obj).f65230a);
    }

    public final int hashCode() {
        return this.f65230a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("MultiplePieces(pieces="), this.f65230a, ")");
    }
}
