package m62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final h f86018a;

    public j0(h model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f86018a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && Intrinsics.d(this.f86018a, ((j0) obj).f86018a);
    }

    public final int hashCode() {
        return this.f86018a.hashCode();
    }

    public final String toString() {
        return "EffectCategoryClicked(model=" + this.f86018a + ")";
    }
}
