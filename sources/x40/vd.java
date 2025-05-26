package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vd implements ud {

    /* renamed from: d, reason: collision with root package name */
    public final String f133554d;

    public vd(String __typename) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f133554d = __typename;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vd) && Intrinsics.d(this.f133554d, ((vd) obj).f133554d);
    }

    public final int hashCode() {
        return this.f133554d.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("V3HideConversationV3HideConversationMutation(__typename="), this.f133554d, ")");
    }
}
