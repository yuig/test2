package gk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final k92.o f65244a;

    public m0(k92.n effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f65244a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && Intrinsics.d(this.f65244a, ((m0) obj).f65244a);
    }

    public final int hashCode() {
        return this.f65244a.hashCode();
    }

    public final k92.o j() {
        return this.f65244a;
    }

    public final String toString() {
        return jq.b.g(new StringBuilder("WrappedToastSideEffectRequest(effect="), this.f65244a, ")");
    }
}
