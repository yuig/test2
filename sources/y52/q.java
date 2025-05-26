package y52;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f137836a;

    public q(String videoUri) {
        Intrinsics.checkNotNullParameter(videoUri, "videoUri");
        Intrinsics.checkNotNullParameter("instagram_stories", "packageName");
        this.f137836a = videoUri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return Intrinsics.d(this.f137836a, ((q) obj).f137836a) && Intrinsics.d("instagram_stories", "instagram_stories");
        }
        return false;
    }

    public final int hashCode() {
        return (this.f137836a.hashCode() * 31) + 1268202694;
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ExportToStory(videoUri="), this.f137836a, ", packageName=instagram_stories)");
    }
}
