package p02;

import kotlin.jvm.internal.Intrinsics;
import o82.h0;

/* loaded from: classes4.dex */
public final class q implements t {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f98448a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98449b;

    public q(h0 nestedEffect, String str) {
        Intrinsics.checkNotNullParameter(nestedEffect, "nestedEffect");
        this.f98448a = nestedEffect;
        this.f98449b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.d(this.f98448a, qVar.f98448a) && Intrinsics.d(this.f98449b, qVar.f98449b);
    }

    public final int hashCode() {
        int hashCode = this.f98448a.hashCode() * 31;
        String str = this.f98449b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ListSideEffectRequest(nestedEffect=" + this.f98448a + ", userId=" + this.f98449b + ")";
    }
}
