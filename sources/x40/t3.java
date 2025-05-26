package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133327a;

    public t3(String str) {
        this.f133327a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3) && Intrinsics.d(this.f133327a, ((t3) obj).f133327a);
    }

    public final int hashCode() {
        String str = this.f133327a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Product(itemId="), this.f133327a, ")");
    }
}
