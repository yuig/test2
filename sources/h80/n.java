package h80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements q {

    /* renamed from: a, reason: collision with root package name */
    public final String f68108a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68109b;

    public n(String imageSignature, String style) {
        Intrinsics.checkNotNullParameter(imageSignature, "imageSignature");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f68108a = imageSignature;
        this.f68109b = style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f68108a, nVar.f68108a) && Intrinsics.d(this.f68109b, nVar.f68109b);
    }

    public final int hashCode() {
        return this.f68109b.hashCode() + (this.f68108a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImageOutpaint(imageSignature=");
        sb3.append(this.f68108a);
        sb3.append(", style=");
        return a.a.p(sb3, this.f68109b, ")");
    }
}
