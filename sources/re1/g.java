package re1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final u50.n f107599a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.n f107600b;

    /* renamed from: c, reason: collision with root package name */
    public final u50.n f107601c;

    /* renamed from: d, reason: collision with root package name */
    public final u50.n f107602d;

    public g(u50.d start, u50.d end, int i13) {
        start = (i13 & 1) != 0 ? new u50.d(eo1.a.item_spacing_none) : start;
        int i14 = eo1.a.item_spacing_none;
        u50.d top = new u50.d(i14);
        end = (i13 & 4) != 0 ? new u50.d(i14) : end;
        u50.d bottom = new u50.d(i14);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(top, "top");
        Intrinsics.checkNotNullParameter(end, "end");
        Intrinsics.checkNotNullParameter(bottom, "bottom");
        this.f107599a = start;
        this.f107600b = top;
        this.f107601c = end;
        this.f107602d = bottom;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f107599a, gVar.f107599a) && Intrinsics.d(this.f107600b, gVar.f107600b) && Intrinsics.d(this.f107601c, gVar.f107601c) && Intrinsics.d(this.f107602d, gVar.f107602d);
    }

    public final int hashCode() {
        return this.f107602d.hashCode() + d7.g.e(this.f107601c, d7.g.e(this.f107600b, this.f107599a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "CarouselPaddingSpec(start=" + this.f107599a + ", top=" + this.f107600b + ", end=" + this.f107601c + ", bottom=" + this.f107602d + ")";
    }
}
