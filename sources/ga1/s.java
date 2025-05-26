package ga1;

import kotlin.jvm.internal.Intrinsics;
import zy.k0;

/* loaded from: classes5.dex */
public final class s implements v {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f64652a;

    public s(k0 effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f64652a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f64652a, ((s) obj).f64652a);
    }

    public final int hashCode() {
        return this.f64652a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("PinalyticsEffectRequest(effect="), this.f64652a, ")");
    }
}
