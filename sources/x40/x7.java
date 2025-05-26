package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133676a;

    public x7(String str) {
        this.f133676a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x7) && Intrinsics.d(this.f133676a, ((x7) obj).f133676a);
    }

    public final int hashCode() {
        String str = this.f133676a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Product(itemId="), this.f133676a, ")");
    }
}
