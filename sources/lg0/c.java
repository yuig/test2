package lg0;

import java.util.List;
import kg.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends o {

    /* renamed from: b, reason: collision with root package name */
    public final List f83207b;

    public c(List clusters) {
        Intrinsics.checkNotNullParameter(clusters, "clusters");
        this.f83207b = clusters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f83207b, ((c) obj).f83207b);
    }

    public final int hashCode() {
        return this.f83207b.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("Recommendation(clusters="), this.f83207b, ")");
    }
}
