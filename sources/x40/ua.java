package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ua {

    /* renamed from: a, reason: collision with root package name */
    public final String f133458a;

    public ua(String str) {
        this.f133458a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ua) && Intrinsics.d(this.f133458a, ((ua) obj).f133458a);
    }

    public final int hashCode() {
        String str = this.f133458a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Product(itemId="), this.f133458a, ")");
    }
}
