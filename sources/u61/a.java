package u61;

import kotlin.jvm.internal.Intrinsics;
import tb.f;

/* loaded from: classes5.dex */
public final class a extends f {

    /* renamed from: h, reason: collision with root package name */
    public final v61.a f120819h;

    /* renamed from: i, reason: collision with root package name */
    public final int f120820i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f120821j;

    /* renamed from: k, reason: collision with root package name */
    public final int f120822k;

    public a(v61.a hairPatternFilter, int i13, boolean z13, int i14) {
        Intrinsics.checkNotNullParameter(hairPatternFilter, "hairPatternFilter");
        this.f120819h = hairPatternFilter;
        this.f120820i = i13;
        this.f120821j = z13;
        this.f120822k = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f120819h, aVar.f120819h) && this.f120820i == aVar.f120820i && this.f120821j == aVar.f120821j && this.f120822k == aVar.f120822k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120822k) + ep.b.e(this.f120821j, ep.b.b(this.f120820i, this.f120819h.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "HairPatternFilterViewModel(hairPatternFilter=" + this.f120819h + ", hairPatternIndex=" + this.f120820i + ", isPrevouslySelected=" + this.f120821j + ", numHairPatterns=" + this.f120822k + ")";
    }
}
