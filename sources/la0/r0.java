package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final ta0.x f82462a;

    public r0(ta0.w request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f82462a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0) && Intrinsics.d(this.f82462a, ((r0) obj).f82462a);
    }

    public final int hashCode() {
        return this.f82462a.hashCode();
    }

    public final String toString() {
        return "WrappedImageDownloadRequest(request=" + this.f82462a + ")";
    }
}
