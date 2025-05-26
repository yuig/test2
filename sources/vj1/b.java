package vj1;

import jj1.d;
import kotlin.jvm.internal.Intrinsics;
import oi1.c;
import oi1.p;
import pj1.f;
import pj1.l;

/* loaded from: classes2.dex */
public final class b implements d, l {

    /* renamed from: a, reason: collision with root package name */
    public final f f125925a;

    public b(f indicatorDisplayState) {
        Intrinsics.checkNotNullParameter(indicatorDisplayState, "indicatorDisplayState");
        this.f125925a = indicatorDisplayState;
    }

    @Override // pj1.l
    public final /* bridge */ /* synthetic */ c e() {
        return p.f95316a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f125925a, ((b) obj).f125925a);
    }

    public final int hashCode() {
        return this.f125925a.hashCode();
    }

    public final String toString() {
        return "InlineSaveIndicatorDisplayState(indicatorDisplayState=" + this.f125925a + ")";
    }
}
