package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f130965a;

    public f(String str) {
        this.f130965a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f130965a, ((f) obj).f130965a);
    }

    public final int hashCode() {
        String str = this.f130965a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OtherError(message="), this.f130965a, ")");
    }
}
