package u80;

import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final b f120937a;

    /* renamed from: b, reason: collision with root package name */
    public final List f120938b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f120939c;

    /* renamed from: d, reason: collision with root package name */
    public final int f120940d;

    public g(b bVar, int i13, int i14) {
        this((i14 & 1) != 0 ? m.f120966a : bVar, q0.f80391a, (i14 & 4) != 0, (i14 & 8) != 0 ? eo1.c.rounding_200 : i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f120937a, gVar.f120937a) && Intrinsics.d(this.f120938b, gVar.f120938b) && this.f120939c == gVar.f120939c && this.f120940d == gVar.f120940d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120940d) + ep.b.e(this.f120939c, ep.b.c(this.f120938b, this.f120937a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "CarouselCardPreviewStackState(placement=" + this.f120937a + ", previews=" + this.f120938b + ", showBorder=" + this.f120939c + ", cornerRadiusRes=" + this.f120940d + ")";
    }

    public g(b placement, List previews, boolean z13, int i13) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(previews, "previews");
        this.f120937a = placement;
        this.f120938b = previews;
        this.f120939c = z13;
        this.f120940d = i13;
    }
}
