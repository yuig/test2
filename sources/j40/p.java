package j40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements p40.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f74615a;

    public p(String str) {
        this.f74615a = str;
    }

    @Override // p40.a
    public final String a() {
        return this.f74615a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f74615a, ((p) obj).f74615a);
    }

    public final int hashCode() {
        String str = this.f74615a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Images(url="), this.f74615a, ")");
    }
}
