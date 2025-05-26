package m62;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0 extends b1 {

    /* renamed from: a, reason: collision with root package name */
    public final h1 f86035a;

    public n0(h1 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f86035a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.d(this.f86035a, ((n0) obj).f86035a);
    }

    public final int hashCode() {
        return this.f86035a.hashCode();
    }

    public final String toString() {
        return "FontClicked(model=" + this.f86035a + ")";
    }
}
