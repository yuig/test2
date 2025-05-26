package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133149a;

    public r3(String str) {
        this.f133149a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3) && Intrinsics.d(this.f133149a, ((r3) obj).f133149a);
    }

    public final int hashCode() {
        String str = this.f133149a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Product(itemId="), this.f133149a, ")");
    }
}
