package u80;

import kotlin.jvm.internal.Intrinsics;
import ra0.t0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f120913a;

    /* renamed from: b, reason: collision with root package name */
    public final d f120914b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f120915c;

    public b(a overlapPercentages, d transformations, t0 overlapDirection) {
        Intrinsics.checkNotNullParameter(overlapPercentages, "overlapPercentages");
        Intrinsics.checkNotNullParameter(transformations, "transformations");
        Intrinsics.checkNotNullParameter(overlapDirection, "overlapDirection");
        this.f120913a = overlapPercentages;
        this.f120914b = transformations;
        this.f120915c = overlapDirection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f120913a, bVar.f120913a) && Intrinsics.d(this.f120914b, bVar.f120914b) && this.f120915c == bVar.f120915c;
    }

    public final int hashCode() {
        return this.f120915c.hashCode() + ((this.f120914b.hashCode() + (this.f120913a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CardStackPlacement(overlapPercentages=" + this.f120913a + ", transformations=" + this.f120914b + ", overlapDirection=" + this.f120915c + ")";
    }

    public /* synthetic */ b(a aVar, d dVar) {
        this(aVar, dVar, t0.EndOnTop);
    }
}
