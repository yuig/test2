package bk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k1 implements o1 {

    /* renamed from: a, reason: collision with root package name */
    public final ni1.h f23249a;

    public k1(ni1.h effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        this.f23249a = effect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1) && Intrinsics.d(this.f23249a, ((k1) obj).f23249a);
    }

    public final int hashCode() {
        return this.f23249a.hashCode();
    }

    public final ni1.h j() {
        return this.f23249a;
    }

    public final String toString() {
        return "WrappedDevUtilsSER(effect=" + this.f23249a + ")";
    }
}
