package ca1;

import kotlin.jvm.internal.Intrinsics;
import zy.k0;

/* loaded from: classes5.dex */
public final class s implements t {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f27225a;

    public s(k0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f27225a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f27225a, ((s) obj).f27225a);
    }

    public final int hashCode() {
        return this.f27225a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("PinalyticsSideEffectRequest(effect="), this.f27225a, ")");
    }
}
