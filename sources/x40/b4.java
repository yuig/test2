package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f132004a;

    public b4(String str) {
        this.f132004a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4) && Intrinsics.d(this.f132004a, ((b4) obj).f132004a);
    }

    public final int hashCode() {
        String str = this.f132004a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Image(url="), this.f132004a, ")");
    }
}
