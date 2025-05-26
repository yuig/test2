package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class da {

    /* renamed from: a, reason: collision with root package name */
    public final String f132236a;

    public da(String str) {
        this.f132236a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof da) && Intrinsics.d(this.f132236a, ((da) obj).f132236a);
    }

    public final int hashCode() {
        String str = this.f132236a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Product(itemId="), this.f132236a, ")");
    }
}
