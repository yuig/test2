package u41;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f120474a;

    public a(List pills) {
        Intrinsics.checkNotNullParameter(pills, "pills");
        this.f120474a = pills;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f120474a, ((a) obj).f120474a);
    }

    public final int hashCode() {
        return this.f120474a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("PillBarDisplayState(pills="), this.f120474a, ")");
    }
}
