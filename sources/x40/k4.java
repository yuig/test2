package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132660a;

    public k4(String str) {
        this.f132660a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k4) && Intrinsics.d(this.f132660a, ((k4) obj).f132660a);
    }

    public final int hashCode() {
        String str = this.f132660a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Product(itemId="), this.f132660a, ")");
    }
}
