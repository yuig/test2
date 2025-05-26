package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class eh {

    /* renamed from: a, reason: collision with root package name */
    public final String f132361a;

    public eh(String str) {
        this.f132361a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eh) && Intrinsics.d(this.f132361a, ((eh) obj).f132361a);
    }

    public final int hashCode() {
        String str = this.f132361a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Product(itemId="), this.f132361a, ")");
    }
}
