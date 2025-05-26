package ek1;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Pair f59373a;

    /* renamed from: b, reason: collision with root package name */
    public final long f59374b;

    public t(Pair gestureXY, long j13) {
        Intrinsics.checkNotNullParameter(gestureXY, "gestureXY");
        this.f59373a = gestureXY;
        this.f59374b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f59373a, tVar.f59373a) && this.f59374b == tVar.f59374b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f59374b) + (this.f59373a.hashCode() * 31);
    }

    public final Pair j() {
        return this.f59373a;
    }

    public final long k() {
        return this.f59374b;
    }

    public final String toString() {
        return "CoreCellOnSingleTapUp(gestureXY=" + this.f59373a + ", timestamp=" + this.f59374b + ")";
    }
}
