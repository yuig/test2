package tq0;

import h32.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final u f118995a;

    /* renamed from: b, reason: collision with root package name */
    public final String f118996b;

    public d(u impression, String str) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        this.f118995a = impression;
        this.f118996b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f118995a, dVar.f118995a) && Intrinsics.d(this.f118996b, dVar.f118996b);
    }

    public final int hashCode() {
        int hashCode = this.f118995a.hashCode() * 31;
        String str = this.f118996b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BoardMoreIdeasFeedUpsellImpressionWrapper(impression=" + this.f118995a + ", storyId=" + this.f118996b + ")";
    }
}
