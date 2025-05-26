package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132953a;

    public o8(String str) {
        this.f132953a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8) && Intrinsics.d(this.f132953a, ((o8) obj).f132953a);
    }

    public final int hashCode() {
        String str = this.f132953a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Product(itemId="), this.f132953a, ")");
    }
}
