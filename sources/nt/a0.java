package nt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f91978a;

    public a0(String str) {
        this.f91978a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f91978a, ((a0) obj).f91978a);
    }

    public final int hashCode() {
        String str = this.f91978a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DisclosureClick(url="), this.f91978a, ")");
    }
}
