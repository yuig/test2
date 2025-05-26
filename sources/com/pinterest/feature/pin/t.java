package com.pinterest.feature.pin;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f47319a;

    /* renamed from: b, reason: collision with root package name */
    public final RepinAnimationData f47320b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f47321c;

    public t(f30 pin, RepinAnimationData repinAnimationData, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f47319a = pin;
        this.f47320b = repinAnimationData;
        this.f47321c = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f47319a, tVar.f47319a) && Intrinsics.d(this.f47320b, tVar.f47320b) && this.f47321c == tVar.f47321c;
    }

    public final int hashCode() {
        int hashCode = this.f47319a.hashCode() * 31;
        RepinAnimationData repinAnimationData = this.f47320b;
        return Boolean.hashCode(this.f47321c) + ((hashCode + (repinAnimationData == null ? 0 : repinAnimationData.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShowRepinAnimationEvent(pin=");
        sb3.append(this.f47319a);
        sb3.append(", repinAnimationData=");
        sb3.append(this.f47320b);
        sb3.append(", isRepinToProfile=");
        return a.a.r(sb3, this.f47321c, ")");
    }
}
