package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133400a;

    public u1(String str) {
        this.f133400a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1) && Intrinsics.d(this.f133400a, ((u1) obj).f133400a);
    }

    public final int hashCode() {
        String str = this.f133400a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Product(itemId="), this.f133400a, ")");
    }
}
