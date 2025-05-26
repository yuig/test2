package dn2;

import kotlin.jvm.internal.Intrinsics;
import pn2.b0;

/* loaded from: classes4.dex */
public final class q extends s {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f55635a;

    public q(b0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f55635a = type;
    }

    public final b0 a() {
        return this.f55635a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f55635a, ((q) obj).f55635a);
    }

    public final int hashCode() {
        return this.f55635a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.f55635a + ')';
    }
}
