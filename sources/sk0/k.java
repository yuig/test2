package sk0;

import h32.i0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f113068a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f113069b;

    public k(i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f113068a = context;
        this.f113069b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f113068a, kVar.f113068a) && Intrinsics.d(this.f113069b, kVar.f113069b);
    }

    public final int hashCode() {
        return this.f113069b.hashCode() + (this.f113068a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogToolTapped(context=");
        sb3.append(this.f113068a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f113069b, ")");
    }
}
