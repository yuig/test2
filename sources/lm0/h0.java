package lm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final um0.h0 f83869a;

    public h0(um0.h0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f83869a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && Intrinsics.d(this.f83869a, ((h0) obj).f83869a);
    }

    public final int hashCode() {
        return this.f83869a.hashCode();
    }

    public final String toString() {
        return "BoardOrganizeRequest(request=" + this.f83869a + ")";
    }
}
