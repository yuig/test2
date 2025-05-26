package y01;

import com.pinterest.api.model.PinFeed;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final PinFeed f136503a;

    public y(PinFeed sourceFeed) {
        Intrinsics.checkNotNullParameter(sourceFeed, "sourceFeed");
        this.f136503a = sourceFeed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.f136503a, ((y) obj).f136503a);
    }

    public final int hashCode() {
        return this.f136503a.hashCode();
    }

    public final String toString() {
        return "OnPinFeedLoadedToAppend(sourceFeed=" + this.f136503a + ")";
    }
}
