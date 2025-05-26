package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132520a;

    public i4(String str) {
        this.f132520a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i4) && Intrinsics.d(this.f132520a, ((i4) obj).f132520a);
    }

    public final int hashCode() {
        String str = this.f132520a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Product(itemId="), this.f132520a, ")");
    }
}
