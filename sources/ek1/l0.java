package ek1;

import kotlin.jvm.internal.Intrinsics;
import so.rd;

/* loaded from: classes2.dex */
public final class l0 implements e1 {

    /* renamed from: a, reason: collision with root package name */
    public final rd f59271a;

    public l0(rd effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f59271a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0) && Intrinsics.d(this.f59271a, ((l0) obj).f59271a);
    }

    public final int hashCode() {
        return this.f59271a.hashCode();
    }

    public final String toString() {
        return "ExperimentSideEffect(effect=" + this.f59271a + ")";
    }
}
