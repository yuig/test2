package yi1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f139081a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.n f139082b;

    /* renamed from: c, reason: collision with root package name */
    public final u50.n f139083c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f139084d;

    /* renamed from: e, reason: collision with root package name */
    public final g0 f139085e;

    public e(l0 validatedUrl, u50.n targetWidth, u50.n targetHeight, boolean z13, g0 transform) {
        Intrinsics.checkNotNullParameter(validatedUrl, "validatedUrl");
        Intrinsics.checkNotNullParameter(targetWidth, "targetWidth");
        Intrinsics.checkNotNullParameter(targetHeight, "targetHeight");
        Intrinsics.checkNotNullParameter(transform, "transform");
        this.f139081a = validatedUrl;
        this.f139082b = targetWidth;
        this.f139083c = targetHeight;
        this.f139084d = z13;
        this.f139085e = transform;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f139081a, eVar.f139081a) && Intrinsics.d(this.f139082b, eVar.f139082b) && Intrinsics.d(this.f139083c, eVar.f139083c) && this.f139084d == eVar.f139084d && this.f139085e == eVar.f139085e;
    }

    public final int hashCode() {
        return this.f139085e.hashCode() + ep.b.e(this.f139084d, d7.g.e(this.f139083c, d7.g.e(this.f139082b, this.f139081a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "ImageLoadingParams(validatedUrl=" + this.f139081a + ", targetWidth=" + this.f139082b + ", targetHeight=" + this.f139083c + ", centerInside=" + this.f139084d + ", transform=" + this.f139085e + ")";
    }
}
