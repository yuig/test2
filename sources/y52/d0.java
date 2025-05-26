package y52;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f137791a;

    public d0(String videoUri) {
        Intrinsics.checkNotNullParameter(videoUri, "videoUri");
        this.f137791a = videoUri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && Intrinsics.d(this.f137791a, ((d0) obj).f137791a);
    }

    public final int hashCode() {
        return this.f137791a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RemoveVideoFromGallery(videoUri="), this.f137791a, ")");
    }
}
