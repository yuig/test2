package zy;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final List f143077a;

    public h(ArrayList impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        this.f143077a = impressions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f143077a, ((h) obj).f143077a);
    }

    public final int hashCode() {
        return this.f143077a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("StartImpressions(impressions="), this.f143077a, ")");
    }
}
