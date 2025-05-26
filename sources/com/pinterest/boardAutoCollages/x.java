package com.pinterest.boardAutoCollages;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy.k0 f44601a;

    public x(zy.f0 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f44601a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Intrinsics.d(this.f44601a, ((x) obj).f44601a);
    }

    public final int hashCode() {
        return this.f44601a.hashCode();
    }

    public final String toString() {
        return jq.b.l(new StringBuilder("LoggingSideEffectRequest(request="), this.f44601a, ")");
    }
}
