package r72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f106431a;

    /* renamed from: b, reason: collision with root package name */
    public final String f106432b;

    public a(j1 rBounds, String base64Mask) {
        Intrinsics.checkNotNullParameter(rBounds, "rBounds");
        Intrinsics.checkNotNullParameter(base64Mask, "base64Mask");
        this.f106431a = rBounds;
        this.f106432b = base64Mask;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f106431a, aVar.f106431a) && Intrinsics.d(this.f106432b, aVar.f106432b);
    }

    public final int hashCode() {
        return this.f106432b.hashCode() + (this.f106431a.hashCode() * 31);
    }

    public final String toString() {
        return "BitmapMask(relativeBounds=" + this.f106431a + ", base64Mask='" + kh2.r.l1(this.f106432b) + "')";
    }
}
