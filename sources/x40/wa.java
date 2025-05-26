package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wa {

    /* renamed from: a, reason: collision with root package name */
    public final String f133619a;

    public wa(String str) {
        this.f133619a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wa) && Intrinsics.d(this.f133619a, ((wa) obj).f133619a);
    }

    public final int hashCode() {
        String str = this.f133619a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Product(itemId="), this.f133619a, ")");
    }
}
