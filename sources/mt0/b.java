package mt0;

import a.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f88146a;

    public b(List productIds) {
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        this.f88146a = productIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f88146a, ((b) obj).f88146a);
    }

    public final int hashCode() {
        return this.f88146a.hashCode();
    }

    public final String toString() {
        return c.j(new StringBuilder("EditProductTagsEvent(productIds="), this.f88146a, ")");
    }
}
