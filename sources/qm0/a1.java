package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final pm0.p f104238a;

    public a1(pm0.d0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f104238a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a1) && Intrinsics.d(this.f104238a, ((a1) obj).f104238a);
    }

    public final int hashCode() {
        return this.f104238a.hashCode();
    }

    public final String toString() {
        return "BoardLoadingRequest(request=" + this.f104238a + ")";
    }
}
