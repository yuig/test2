package ma0;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f86765a;

    public a(i0 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f86765a = item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f86765a, ((a) obj).f86765a);
    }

    public final int hashCode() {
        return this.f86765a.hashCode();
    }

    public final String toString() {
        return "RetrievalFeedItemDeleted(item=" + this.f86765a + ")";
    }
}
