package ay1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h implements q {

    /* renamed from: a, reason: collision with root package name */
    public final String f20672a;

    public h(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f20672a = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f20672a, ((h) obj).f20672a);
    }

    public final int hashCode() {
        return this.f20672a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("FetchPinStats(id="), this.f20672a, ")");
    }
}
