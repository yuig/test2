package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132694a;

    public l2(String str) {
        this.f132694a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2) && Intrinsics.d(this.f132694a, ((l2) obj).f132694a);
    }

    public final int hashCode() {
        String str = this.f132694a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Product(itemId="), this.f132694a, ")");
    }
}
