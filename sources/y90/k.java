package y90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    public final m62.s f138197a;

    public k(m62.s model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f138197a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f138197a, ((k) obj).f138197a);
    }

    public final int hashCode() {
        return this.f138197a.hashCode();
    }

    public final String toString() {
        return "ModelUpdated(model=" + this.f138197a + ")";
    }
}
