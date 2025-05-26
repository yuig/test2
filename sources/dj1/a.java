package dj1;

import kotlin.jvm.internal.Intrinsics;
import vn1.c;

/* loaded from: classes2.dex */
public final class a implements aj1.a {

    /* renamed from: a, reason: collision with root package name */
    public final float f55148a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55149b;

    /* renamed from: c, reason: collision with root package name */
    public final c f55150c;

    public a(float f13, int i13, c ratingColor) {
        Intrinsics.checkNotNullParameter(ratingColor, "ratingColor");
        this.f55148a = f13;
        this.f55149b = i13;
        this.f55150c = ratingColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f55148a, aVar.f55148a) == 0 && this.f55149b == aVar.f55149b && this.f55150c == aVar.f55150c;
    }

    public final int hashCode() {
        return this.f55150c.hashCode() + ep.b.b(this.f55149b, Float.hashCode(this.f55148a) * 31, 31);
    }

    public final String toString() {
        return "PinRatingDisplayState(pinRichRatingValue=" + this.f55148a + ", pinRichReviewCount=" + this.f55149b + ", ratingColor=" + this.f55150c + ")";
    }
}
