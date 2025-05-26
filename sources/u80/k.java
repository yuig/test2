package u80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final float f120958a;

    /* renamed from: b, reason: collision with root package name */
    public final float f120959b;

    /* renamed from: c, reason: collision with root package name */
    public final i f120960c;

    public k(float f13, float f14, i previewStyle) {
        Intrinsics.checkNotNullParameter(previewStyle, "previewStyle");
        this.f120958a = f13;
        this.f120959b = f14;
        this.f120960c = previewStyle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return n4.e.a(this.f120958a, kVar.f120958a) && Float.compare(this.f120959b, kVar.f120959b) == 0 && Intrinsics.d(this.f120960c, kVar.f120960c);
    }

    public final int hashCode() {
        return this.f120960c.hashCode() + a.a.a(this.f120959b, Float.hashCode(this.f120958a) * 31, 31);
    }

    public final String toString() {
        return "CarouselCardStyle(width=" + n4.e.b(this.f120958a) + ", aspectRatio=" + this.f120959b + ", previewStyle=" + this.f120960c + ")";
    }
}
