package oq;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final mf1.a f97033a;

    /* renamed from: b, reason: collision with root package name */
    public final tf1.d f97034b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f97035c;

    /* renamed from: d, reason: collision with root package name */
    public final d f97036d;

    public g(tf1.d dVar, Integer num, int i13) {
        dVar = (i13 & 2) != 0 ? null : dVar;
        this.f97033a = null;
        this.f97034b = dVar;
        this.f97035c = num;
        this.f97036d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f97033a == gVar.f97033a && Intrinsics.d(this.f97034b, gVar.f97034b) && Intrinsics.d(this.f97035c, gVar.f97035c) && Intrinsics.d(this.f97036d, gVar.f97036d);
    }

    public final int hashCode() {
        mf1.a aVar = this.f97033a;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        tf1.d dVar = this.f97034b;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Integer num = this.f97035c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        d dVar2 = this.f97036d;
        return hashCode3 + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    public final String toString() {
        return "IdeaPinInPinCloseupOverrides(customIdeaPinHostView=" + this.f97033a + ", customStoryPinViewModel=" + this.f97034b + ", customCornerRadiusResId=" + this.f97035c + ", customIdeaPinDimensions=" + this.f97036d + ")";
    }
}
