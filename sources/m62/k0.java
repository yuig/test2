package m62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final h f86025a;

    public k0(h model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f86025a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && Intrinsics.d(this.f86025a, ((k0) obj).f86025a);
    }

    public final int hashCode() {
        return this.f86025a.hashCode();
    }

    public final String toString() {
        return "EffectCategorySelected(model=" + this.f86025a + ")";
    }
}
