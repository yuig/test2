package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vf {

    /* renamed from: a, reason: collision with root package name */
    public final String f133556a;

    public vf(String str) {
        this.f133556a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vf) && Intrinsics.d(this.f133556a, ((vf) obj).f133556a);
    }

    public final int hashCode() {
        String str = this.f133556a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Product(itemId="), this.f133556a, ")");
    }
}
