package nt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final String f92085a;

    public l(String str) {
        this.f92085a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.d(this.f92085a, ((l) obj).f92085a);
    }

    public final int hashCode() {
        String str = this.f92085a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DataForDoB(month="), this.f92085a, ")");
    }
}
