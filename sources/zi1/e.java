package zi1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ni1.f0;
import u50.n;

/* loaded from: classes5.dex */
public final class e implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f142023a;

    /* renamed from: b, reason: collision with root package name */
    public final n f142024b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f142025c;

    /* renamed from: d, reason: collision with root package name */
    public final int f142026d;

    /* renamed from: e, reason: collision with root package name */
    public final n f142027e;

    /* renamed from: f, reason: collision with root package name */
    public final n f142028f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f142029g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f142030h;

    public e(List pinChipImageUrls, n cornerRadius, boolean z13, int i13, n placeHolderCorners, n imageRadius, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(pinChipImageUrls, "pinChipImageUrls");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(placeHolderCorners, "placeHolderCorners");
        Intrinsics.checkNotNullParameter(imageRadius, "imageRadius");
        this.f142023a = pinChipImageUrls;
        this.f142024b = cornerRadius;
        this.f142025c = z13;
        this.f142026d = i13;
        this.f142027e = placeHolderCorners;
        this.f142028f = imageRadius;
        this.f142029g = z14;
        this.f142030h = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f142023a, eVar.f142023a) && Intrinsics.d(this.f142024b, eVar.f142024b) && this.f142025c == eVar.f142025c && this.f142026d == eVar.f142026d && Intrinsics.d(this.f142027e, eVar.f142027e) && Intrinsics.d(this.f142028f, eVar.f142028f) && this.f142029g == eVar.f142029g && this.f142030h == eVar.f142030h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f142030h) + ep.b.e(this.f142029g, d7.g.e(this.f142028f, d7.g.e(this.f142027e, ep.b.b(this.f142026d, ep.b.e(this.f142025c, d7.g.e(this.f142024b, this.f142023a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinChipsDrawableDisplayState(pinChipImageUrls=");
        sb3.append(this.f142023a);
        sb3.append(", cornerRadius=");
        sb3.append(this.f142024b);
        sb3.append(", isDLCollectionEnabled=");
        sb3.append(this.f142025c);
        sb3.append(", backgroundPaintColor=");
        sb3.append(this.f142026d);
        sb3.append(", placeHolderCorners=");
        sb3.append(this.f142027e);
        sb3.append(", imageRadius=");
        sb3.append(this.f142028f);
        sb3.append(", shouldRoundBottomCorners=");
        sb3.append(this.f142029g);
        sb3.append(", isDLCollectionWithIconEnabled=");
        return a.a.r(sb3, this.f142030h, ")");
    }
}
