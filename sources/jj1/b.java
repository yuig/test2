package jj1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final List f76310a;

    public b(ArrayList creatorStats) {
        Intrinsics.checkNotNullParameter(creatorStats, "creatorStats");
        this.f76310a = creatorStats;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f76310a, ((b) obj).f76310a);
    }

    public final int hashCode() {
        return this.f76310a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("CreatorStatsDisplayState(creatorStats="), this.f76310a, ")");
    }
}
