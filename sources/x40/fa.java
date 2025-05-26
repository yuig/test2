package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fa {

    /* renamed from: a, reason: collision with root package name */
    public final String f132407a;

    public fa(String str) {
        this.f132407a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa) && Intrinsics.d(this.f132407a, ((fa) obj).f132407a);
    }

    public final int hashCode() {
        String str = this.f132407a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Product(itemId="), this.f132407a, ")");
    }
}
