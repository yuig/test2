package zy;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s implements v {

    /* renamed from: a, reason: collision with root package name */
    public final List f143116a;

    public s(List impressions) {
        Intrinsics.checkNotNullParameter(impressions, "impressions");
        this.f143116a = impressions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f143116a, ((s) obj).f143116a);
    }

    public final int hashCode() {
        return this.f143116a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("RecordEndedImpressions(impressions="), this.f143116a, ")");
    }
}
