package v21;

import h32.i0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements v {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f123900a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f123901b;

    public t(i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f123900a = context;
        this.f123901b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f123900a, tVar.f123900a) && Intrinsics.d(this.f123901b, tVar.f123901b);
    }

    @Override // v21.v
    public final HashMap getAuxData() {
        return this.f123901b;
    }

    @Override // v21.v
    public final i0 getContext() {
        return this.f123900a;
    }

    public final int hashCode() {
        return this.f123901b.hashCode() + (this.f123900a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogRevealReward(context=");
        sb3.append(this.f123900a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f123901b, ")");
    }
}
