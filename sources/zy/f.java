package zy;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final List f143072a;

    public f(ArrayList impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        this.f143072a = impressions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f143072a, ((f) obj).f143072a);
    }

    public final int hashCode() {
        return this.f143072a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("ReportImpressions(impressions="), this.f143072a, ")");
    }
}
