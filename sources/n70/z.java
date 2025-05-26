package n70;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f89702a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f89703b;

    public z(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f89702a = context;
        this.f89703b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f89702a, zVar.f89702a) && Intrinsics.d(this.f89703b, zVar.f89703b);
    }

    @Override // n70.c0
    public final HashMap getAuxData() {
        return this.f89703b;
    }

    @Override // n70.c0
    public final h32.i0 getContext() {
        return this.f89702a;
    }

    public final int hashCode() {
        return this.f89703b.hashCode() + (this.f89702a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogBackButtonClicked(context=");
        sb3.append(this.f89702a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f89703b, ")");
    }
}
