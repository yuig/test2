package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements u {

    /* renamed from: a, reason: collision with root package name */
    public final x62.p f124954a;

    public q(x62.p model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f124954a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f124954a, ((q) obj).f124954a);
    }

    public final int hashCode() {
        return this.f124954a.hashCode();
    }

    public final String toString() {
        return "RefineMaskModelUpdated(model=" + this.f124954a + ")";
    }
}
