package u52;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f120728a;

    public q0(kotlin.collections.q0 unsupportedIds) {
        Intrinsics.checkNotNullParameter(unsupportedIds, "unsupportedIds");
        this.f120728a = unsupportedIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q0) {
            return Intrinsics.d(this.f120728a, ((q0) obj).f120728a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(1) + (this.f120728a.hashCode() * 31);
    }

    public final String toString() {
        return a.c.j(new StringBuilder("LoadTemplates(unsupportedIds="), this.f120728a, ", supportedVersion=1)");
    }
}
