package qp1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f104773a;

    public f(String str) {
        this.f104773a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f104773a, ((f) obj).f104773a);
    }

    public final int hashCode() {
        String str = this.f104773a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OpenNativeBrowser(url="), this.f104773a, ")");
    }
}
