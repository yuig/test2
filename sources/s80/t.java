package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements x {

    /* renamed from: a, reason: collision with root package name */
    public final l62.a f111797a;

    public t(l62.a composerModel) {
        Intrinsics.checkNotNullParameter(composerModel, "composerModel");
        this.f111797a = composerModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Intrinsics.d(this.f111797a, ((t) obj).f111797a);
    }

    public final int hashCode() {
        return this.f111797a.hashCode();
    }

    public final String toString() {
        return "ModelUpdated(composerModel=" + this.f111797a + ")";
    }
}
