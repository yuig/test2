package bk1;

import kotlin.jvm.internal.Intrinsics;
import so.rd;

/* loaded from: classes2.dex */
public final class l1 implements o1 {

    /* renamed from: a, reason: collision with root package name */
    public final rd f23258a;

    public l1(rd effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f23258a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1) && Intrinsics.d(this.f23258a, ((l1) obj).f23258a);
    }

    public final int hashCode() {
        return this.f23258a.hashCode();
    }

    public final rd j() {
        return this.f23258a;
    }

    public final String toString() {
        return "WrappedExperimentSideEffectRequest(effect=" + this.f23258a + ")";
    }
}
