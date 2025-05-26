package bb2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f22593a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22594b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22595c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22596d;

    /* renamed from: e, reason: collision with root package name */
    public final float f22597e;

    /* renamed from: f, reason: collision with root package name */
    public final float f22598f;

    /* renamed from: g, reason: collision with root package name */
    public final float f22599g;

    /* renamed from: h, reason: collision with root package name */
    public final float f22600h;

    /* renamed from: i, reason: collision with root package name */
    public final a f22601i;

    public c(int i13, int i14, int i15, int i16, float f13, float f14, float f15) {
        a scaleDirection = a.SCALE_TO_MAX_WIDTH;
        Intrinsics.checkNotNullParameter(scaleDirection, "scaleDirection");
        this.f22593a = i13;
        this.f22594b = i14;
        this.f22595c = i15;
        this.f22596d = i16;
        this.f22597e = f13;
        this.f22598f = f14;
        this.f22599g = 0.3f;
        this.f22600h = f15;
        this.f22601i = scaleDirection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f22593a == cVar.f22593a && this.f22594b == cVar.f22594b && this.f22595c == cVar.f22595c && this.f22596d == cVar.f22596d && Float.compare(this.f22597e, cVar.f22597e) == 0 && Float.compare(this.f22598f, cVar.f22598f) == 0 && Float.compare(this.f22599g, cVar.f22599g) == 0 && Float.compare(this.f22600h, cVar.f22600h) == 0 && this.f22601i == cVar.f22601i;
    }

    public final int hashCode() {
        return this.f22601i.hashCode() + a.a.a(this.f22600h, a.a.a(this.f22599g, a.a.a(this.f22598f, a.a.a(this.f22597e, ep.b.b(this.f22596d, ep.b.b(this.f22595c, ep.b.b(this.f22594b, Integer.hashCode(this.f22593a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "ConstrainedImageProcessingParams(imageWidth=" + this.f22593a + ", imageHeight=" + this.f22594b + ", deviceWindowWidth=" + this.f22595c + ", deviceWindowHeight=" + this.f22596d + ", minScreenWidthConstraint=" + this.f22597e + ", maxScreenWidthConstraint=" + this.f22598f + ", minScreenHeightConstraint=" + this.f22599g + ", maxScreenHeightConstraint=" + this.f22600h + ", scaleDirection=" + this.f22601i + ")";
    }
}
