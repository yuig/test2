package r02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v implements w {

    /* renamed from: a, reason: collision with root package name */
    public final String f105823a;

    public v(String str) {
        this.f105823a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f105823a, ((v) obj).f105823a);
    }

    public final int hashCode() {
        String str = this.f105823a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RVCRefresh(userId="), this.f105823a, ")");
    }
}
