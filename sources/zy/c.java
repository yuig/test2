package zy;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements l {

    /* renamed from: a, reason: collision with root package name */
    public final List f143060a;

    public c(ArrayList impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        this.f143060a = impressions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f143060a, ((c) obj).f143060a);
    }

    public final int hashCode() {
        return this.f143060a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("ReportImpressions(impressions="), this.f143060a, ")");
    }
}
