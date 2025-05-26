package uu;

import kotlin.jvm.internal.Intrinsics;
import pu.w;

/* loaded from: classes3.dex */
public final class j implements l82.h {

    /* renamed from: a, reason: collision with root package name */
    public final w f123125a;

    public j(w coreEffect) {
        Intrinsics.checkNotNullParameter(coreEffect, "coreEffect");
        this.f123125a = coreEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f123125a, ((j) obj).f123125a);
    }

    public final int hashCode() {
        return this.f123125a.hashCode();
    }

    public final String toString() {
        return "WrappedCoreEffectRequest(coreEffect=" + this.f123125a + ")";
    }
}
