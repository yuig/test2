package kj1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements jj1.d {

    /* renamed from: a, reason: collision with root package name */
    public final oe.f f79847a;

    /* renamed from: b, reason: collision with root package name */
    public final e f79848b;

    public a(oe.f fVar, e alignment) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.f79847a = fVar;
        this.f79848b = alignment;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f79847a, aVar.f79847a) && this.f79848b == aVar.f79848b;
    }

    public final int hashCode() {
        oe.f fVar = this.f79847a;
        return this.f79848b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31);
    }

    public final String toString() {
        return "AttributionBadgeIndicatorDisplayState(bitmapResource=" + this.f79847a + ", alignment=" + this.f79848b + ")";
    }
}
