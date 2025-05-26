package il0;

import kotlin.jvm.internal.Intrinsics;
import tk0.f0;

/* loaded from: classes5.dex */
public final class h implements l {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f72531a;

    public h(f0 sideEffectRequest) {
        Intrinsics.checkNotNullParameter(sideEffectRequest, "sideEffectRequest");
        this.f72531a = sideEffectRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f72531a, ((h) obj).f72531a);
    }

    public final int hashCode() {
        return this.f72531a.hashCode();
    }

    public final String toString() {
        return "OrganizeFloatingToolbarRequest(sideEffectRequest=" + this.f72531a + ")";
    }
}
