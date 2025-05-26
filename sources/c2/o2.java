package c2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o2 {

    /* renamed from: a, reason: collision with root package name */
    public final kl2.l f25039a;

    public o2(q2.h hVar) {
        this.f25039a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        o2Var.getClass();
        return Intrinsics.d(null, null) && Intrinsics.d(this.f25039a, o2Var.f25039a);
    }

    public final int hashCode() {
        return this.f25039a.hashCode();
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=null, transition=" + this.f25039a + ')';
    }
}
