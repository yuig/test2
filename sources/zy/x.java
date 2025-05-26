package zy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x implements y {

    /* renamed from: a, reason: collision with root package name */
    public final n f143120a;

    public x(n impressionParams) {
        Intrinsics.checkNotNullParameter(impressionParams, "impressionParams");
        this.f143120a = impressionParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f143120a, ((x) obj).f143120a);
    }

    public final int hashCode() {
        return this.f143120a.hashCode();
    }

    public final String toString() {
        return "ReportStoryImpressions(impressionParams=" + this.f143120a + ")";
    }
}
