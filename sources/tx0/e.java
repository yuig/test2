package tx0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    public final w12.a f119650a;

    public e(w12.a newsType) {
        Intrinsics.checkNotNullParameter(newsType, "newsType");
        this.f119650a = newsType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f119650a == ((e) obj).f119650a;
    }

    public final int hashCode() {
        return this.f119650a.hashCode();
    }

    public final String toString() {
        return "NewsTypeFilterChange(newsType=" + this.f119650a + ")";
    }
}
