package m90;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f86640a;

    public c0(List pinIds) {
        Intrinsics.checkNotNullParameter(pinIds, "pinIds");
        this.f86640a = pinIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.f86640a, ((c0) obj).f86640a);
    }

    public final int hashCode() {
        return this.f86640a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Root(pinIds="), this.f86640a, ")");
    }
}
