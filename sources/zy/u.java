package zy;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u implements v {

    /* renamed from: a, reason: collision with root package name */
    public final List f143118a;

    public u(List impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        this.f143118a = impressions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f143118a, ((u) obj).f143118a);
    }

    public final int hashCode() {
        return this.f143118a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("RecordStartedImpressions(impressions="), this.f143118a, ")");
    }
}
