package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gh {

    /* renamed from: a, reason: collision with root package name */
    public final String f132456a;

    public gh(String str) {
        this.f132456a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gh) && Intrinsics.d(this.f132456a, ((gh) obj).f132456a);
    }

    public final int hashCode() {
        String str = this.f132456a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Product(itemId="), this.f132456a, ")");
    }
}
