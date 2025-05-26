package g22;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f63401a;

    public a(String uniqueId) {
        Intrinsics.checkNotNullParameter(uniqueId, "uniqueId");
        this.f63401a = uniqueId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f63401a, ((a) obj).f63401a);
    }

    public final int hashCode() {
        return this.f63401a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("StoryFeedRequestArgs(uniqueId="), this.f63401a, ")");
    }
}
