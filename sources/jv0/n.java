package jv0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends l3.c {

    /* renamed from: a, reason: collision with root package name */
    public final List f77644a;

    public n(List productTags) {
        Intrinsics.checkNotNullParameter(productTags, "productTags");
        this.f77644a = productTags;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f77644a, ((n) obj).f77644a);
    }

    public final int hashCode() {
        return this.f77644a.hashCode();
    }

    public final String toString() {
        return a.c.j(new StringBuilder("ItemsReady(productTags="), this.f77644a, ")");
    }
}
