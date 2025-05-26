package zy;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final List f143070a;

    public e(ArrayList impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        this.f143070a = impressions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f143070a, ((e) obj).f143070a);
    }

    public final int hashCode() {
        return this.f143070a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("EndImpressions(impressions="), this.f143070a, ")");
    }
}
