package rj1;

import jj1.d;
import kotlin.jvm.internal.Intrinsics;
import oi1.c;
import oi1.j;
import pj1.f;
import pj1.l;

/* loaded from: classes2.dex */
public final class b implements d, l {

    /* renamed from: a, reason: collision with root package name */
    public final f f108424a;

    public b(f indicatorDisplayState) {
        Intrinsics.checkNotNullParameter(indicatorDisplayState, "indicatorDisplayState");
        this.f108424a = indicatorDisplayState;
    }

    @Override // pj1.l
    public final c e() {
        return j.f95310a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f108424a, ((b) obj).f108424a);
    }

    public final int hashCode() {
        return this.f108424a.hashCode();
    }

    public final String toString() {
        return "DealBadgeCornerIndicatorDisplayState(indicatorDisplayState=" + this.f108424a + ")";
    }
}
