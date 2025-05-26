package nt;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final f f91985a;

    /* renamed from: b, reason: collision with root package name */
    public final List f91986b;

    /* renamed from: c, reason: collision with root package name */
    public final long f91987c;

    public b0(f cacheData, List cacheLoggingEvents, long j13) {
        Intrinsics.checkNotNullParameter(cacheData, "cacheData");
        Intrinsics.checkNotNullParameter(cacheLoggingEvents, "cacheLoggingEvents");
        this.f91985a = cacheData;
        this.f91986b = cacheLoggingEvents;
        this.f91987c = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f91985a, b0Var.f91985a) && Intrinsics.d(this.f91986b, b0Var.f91986b) && this.f91987c == b0Var.f91987c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f91987c) + ep.b.c(this.f91986b, this.f91985a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LeadGenBottomSheetCacheLoaded(cacheData=");
        sb3.append(this.f91985a);
        sb3.append(", cacheLoggingEvents=");
        sb3.append(this.f91986b);
        sb3.append(", delayedAnimationStartTime=");
        return a.a.o(sb3, this.f91987c, ")");
    }
}
