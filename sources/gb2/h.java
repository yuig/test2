package gb2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends l {

    /* renamed from: a, reason: collision with root package name */
    public final String f64752a;

    public h(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.f64752a = uid;
    }

    @Override // gb2.l
    public final String a() {
        return this.f64752a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return Intrinsics.d(this.f64752a, ((h) obj).f64752a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f64752a.hashCode() * 31);
    }

    public final String toString() {
        return a.a.p(new StringBuilder("AutoMagicalBoardIsViewedStateUpdate(uid="), this.f64752a, ", isViewed=true)");
    }
}
