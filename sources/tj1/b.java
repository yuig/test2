package tj1;

import jj1.d;
import kotlin.jvm.internal.Intrinsics;
import oi1.c;
import oi1.m;
import pj1.f;
import pj1.l;

/* loaded from: classes2.dex */
public final class b implements d, l {

    /* renamed from: a, reason: collision with root package name */
    public final f f117922a;

    public b(f indicatorDisplayState) {
        Intrinsics.checkNotNullParameter(indicatorDisplayState, "indicatorDisplayState");
        this.f117922a = indicatorDisplayState;
    }

    @Override // pj1.l
    public final c e() {
        return m.f95313a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f117922a, ((b) obj).f117922a);
    }

    public final int hashCode() {
        return this.f117922a.hashCode();
    }

    public final String toString() {
        return "DynamicBadgeIndicatorDisplayState(indicatorDisplayState=" + this.f117922a + ")";
    }
}
