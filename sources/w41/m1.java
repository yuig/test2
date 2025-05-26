package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final k51.m f128043a;

    public m1(k51.m effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f128043a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1) && Intrinsics.d(this.f128043a, ((m1) obj).f128043a);
    }

    public final int hashCode() {
        return this.f128043a.hashCode();
    }

    public final String toString() {
        return "ViewOptionsEffectRequest(effect=" + this.f128043a + ")";
    }
}
