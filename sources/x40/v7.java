package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f133541a;

    public v7(String str) {
        this.f133541a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7) && Intrinsics.d(this.f133541a, ((v7) obj).f133541a);
    }

    public final int hashCode() {
        String str = this.f133541a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Product(itemId="), this.f133541a, ")");
    }
}
