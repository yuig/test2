package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132396a;

    public f8(String str) {
        this.f132396a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8) && Intrinsics.d(this.f132396a, ((f8) obj).f132396a);
    }

    public final int hashCode() {
        String str = this.f132396a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Image(url="), this.f132396a, ")");
    }
}
