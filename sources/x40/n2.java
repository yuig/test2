package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132869a;

    public n2(String str) {
        this.f132869a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2) && Intrinsics.d(this.f132869a, ((n2) obj).f132869a);
    }

    public final int hashCode() {
        String str = this.f132869a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Product(itemId="), this.f132869a, ")");
    }
}
