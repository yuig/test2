package fk1;

import kotlin.jvm.internal.Intrinsics;
import so.rd;

/* loaded from: classes2.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final rd f62355a;

    public k(rd effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f62355a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && Intrinsics.d(this.f62355a, ((k) obj).f62355a);
    }

    public final int hashCode() {
        return this.f62355a.hashCode();
    }

    public final String toString() {
        return "ExperimentSideEffect(effect=" + this.f62355a + ")";
    }
}
