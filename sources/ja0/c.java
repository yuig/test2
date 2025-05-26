package ja0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final za0.d f75293a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f75294b;

    public c() {
        za0.d feedType = za0.d.Popular;
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        this.f75293a = feedType;
        this.f75294b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f75293a == cVar.f75293a && this.f75294b == cVar.f75294b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75294b) + (this.f75293a.hashCode() * 31);
    }

    public final String toString() {
        return "RemixBrowseRequestArgs(feedType=" + this.f75293a + ", filterStories=" + this.f75294b + ")";
    }
}
