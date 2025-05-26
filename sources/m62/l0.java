package m62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final i f86030a;

    public l0(i model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f86030a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.d(this.f86030a, ((l0) obj).f86030a);
    }

    public final int hashCode() {
        return this.f86030a.hashCode();
    }

    public final String toString() {
        return "EffectClicked(model=" + this.f86030a + ")";
    }
}
