package tx0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final w12.a f119671a;

    public r(w12.a newsType) {
        Intrinsics.checkNotNullParameter(newsType, "newsType");
        this.f119671a = newsType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f119671a == ((r) obj).f119671a;
    }

    public final int hashCode() {
        return this.f119671a.hashCode();
    }

    public final String toString() {
        return "NewsHubFeedArgs(newsType=" + this.f119671a + ")";
    }
}
