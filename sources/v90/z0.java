package v90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final r72.i1 f124972a;

    public z0(r72.i1 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f124972a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0) && Intrinsics.d(this.f124972a, ((z0) obj).f124972a);
    }

    public final int hashCode() {
        return this.f124972a.hashCode();
    }

    public final String toString() {
        return "UpdateSelectMask(model=" + this.f124972a + ")";
    }
}
