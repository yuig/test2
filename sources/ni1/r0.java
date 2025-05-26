package ni1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f90786a;

    public r0(List pieces) {
        Intrinsics.checkNotNullParameter(pieces, "pieces");
        this.f90786a = pieces;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && Intrinsics.d(this.f90786a, ((r0) obj).f90786a);
    }

    public final int hashCode() {
        return this.f90786a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Hide(pieces="), this.f90786a, ")");
    }
}
