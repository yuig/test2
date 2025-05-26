package m62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final k1 f86063a;

    public x0(k1 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f86063a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && Intrinsics.d(this.f86063a, ((x0) obj).f86063a);
    }

    public final int hashCode() {
        return this.f86063a.hashCode();
    }

    public final String toString() {
        return "ToolClicked(model=" + this.f86063a + ")";
    }
}
