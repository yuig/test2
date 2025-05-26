package gu1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final hu1.k f66149a;

    public l(hu1.k wrapped) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f66149a = wrapped;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f66149a, ((l) obj).f66149a);
    }

    public final int hashCode() {
        return this.f66149a.hashCode();
    }

    public final String toString() {
        return "WrappedNavUserModelLoaderEffectRequest(wrapped=" + this.f66149a + ")";
    }
}
