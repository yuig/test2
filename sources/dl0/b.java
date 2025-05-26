package dl0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.o;

/* loaded from: classes5.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final List f55189a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55190b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f55191c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f55192d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f55193e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f55194f;

    /* renamed from: g, reason: collision with root package name */
    public final vn1.b f55195g;

    public b(ArrayList imageUrls) {
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        this.f55189a = imageUrls;
        this.f55190b = 3;
        this.f55191c = true;
        this.f55192d = null;
        this.f55193e = null;
        this.f55194f = null;
        this.f55195g = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f55189a, bVar.f55189a) && this.f55190b == bVar.f55190b && this.f55191c == bVar.f55191c && Intrinsics.d(this.f55192d, bVar.f55192d) && Intrinsics.d(this.f55193e, bVar.f55193e) && Intrinsics.d(this.f55194f, bVar.f55194f) && this.f55195g == bVar.f55195g;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f55191c, ep.b.b(this.f55190b, this.f55189a.hashCode() * 31, 31), 31);
        Integer num = this.f55192d;
        int hashCode = (e13 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f55193e;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f55194f;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        vn1.b bVar = this.f55195g;
        return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "BoardIdeasPreviewDetailedDisplayState(imageUrls=" + this.f55189a + ", maxImagesToRenderNum=" + this.f55190b + ", isSeeMoreButtonVisible=" + this.f55191c + ", containerMarginBottomOverride=" + this.f55192d + ", titleMarginBottomOverride=" + this.f55193e + ", titleMarginStartOverride=" + this.f55194f + ", titleAlignmentOverride=" + this.f55195g + ")";
    }
}
