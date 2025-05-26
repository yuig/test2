package com.pinterest.feature.settings.notifications;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements o {

    /* renamed from: a, reason: collision with root package name */
    public final o82.g0 f48243a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f48244b;

    public /* synthetic */ n(o82.g0 g0Var) {
        this(g0Var, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f48243a, nVar.f48243a) && Intrinsics.d(this.f48244b, nVar.f48244b);
    }

    public final int hashCode() {
        int hashCode = this.f48243a.hashCode() * 31;
        Map map = this.f48244b;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "WrappedMultiSectionEvent(wrapped=" + this.f48243a + ", args=" + this.f48244b + ")";
    }

    public n(o82.g0 wrapped, Map map) {
        Intrinsics.checkNotNullParameter(wrapped, "wrapped");
        this.f48243a = wrapped;
        this.f48244b = map;
    }
}
