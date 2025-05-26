package az;

import h32.z1;
import kotlin.jvm.internal.Intrinsics;
import u50.o;

/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final nx.c f20693a;

    /* renamed from: b, reason: collision with root package name */
    public final z1 f20694b;

    /* renamed from: c, reason: collision with root package name */
    public final a f20695c;

    public b(nx.c attributionData, z1 z1Var, a impressionState) {
        Intrinsics.checkNotNullParameter(attributionData, "attributionData");
        Intrinsics.checkNotNullParameter(impressionState, "impressionState");
        this.f20693a = attributionData;
        this.f20694b = z1Var;
        this.f20695c = impressionState;
    }

    public static b e(b bVar, nx.c attributionData, z1 z1Var, a impressionState, int i13) {
        if ((i13 & 1) != 0) {
            attributionData = bVar.f20693a;
        }
        if ((i13 & 2) != 0) {
            z1Var = bVar.f20694b;
        }
        if ((i13 & 4) != 0) {
            impressionState = bVar.f20695c;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(attributionData, "attributionData");
        Intrinsics.checkNotNullParameter(impressionState, "impressionState");
        return new b(attributionData, z1Var, impressionState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f20693a, bVar.f20693a) && Intrinsics.d(this.f20694b, bVar.f20694b) && this.f20695c == bVar.f20695c;
    }

    public final int hashCode() {
        int hashCode = this.f20693a.hashCode() * 31;
        z1 z1Var = this.f20694b;
        return this.f20695c.hashCode() + ((hashCode + (z1Var == null ? 0 : z1Var.hashCode())) * 31);
    }

    public final String toString() {
        return "PinImpressionDisplayState(attributionData=" + this.f20693a + ", impression=" + this.f20694b + ", impressionState=" + this.f20695c + ")";
    }

    public /* synthetic */ b() {
        this(new nx.c(null, null, null, null, 15), null, a.UNIMPRESSED);
    }
}
