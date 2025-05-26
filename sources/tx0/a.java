package tx0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final w12.a f119637a;

    public a(w12.a newsType) {
        Intrinsics.checkNotNullParameter(newsType, "newsType");
        this.f119637a = newsType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f119637a == ((a) obj).f119637a;
    }

    public final int hashCode() {
        return this.f119637a.hashCode();
    }

    public final String toString() {
        return "EmptyStateDisplayState(newsType=" + this.f119637a + ")";
    }
}
