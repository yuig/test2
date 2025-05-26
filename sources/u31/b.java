package u31;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f120152a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f120153b;

    public b(boolean z13, e action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f120152a = z13;
        this.f120153b = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f120152a == bVar.f120152a && Intrinsics.d(this.f120153b, bVar.f120153b);
    }

    public final int hashCode() {
        return this.f120153b.hashCode() + (Boolean.hashCode(this.f120152a) * 31);
    }

    public final String toString() {
        return "EmptyState(isOwnProfile=" + this.f120152a + ", action=" + this.f120153b + ")";
    }
}
