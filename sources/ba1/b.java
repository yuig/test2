package ba1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final a f22347a;

    public b(a item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f22347a = item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f22347a, ((b) obj).f22347a);
    }

    public final int hashCode() {
        return this.f22347a.hashCode();
    }

    public final String toString() {
        return "ClaimedAccount(item=" + this.f22347a + ")";
    }
}
