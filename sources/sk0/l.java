package sk0;

import h32.i0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f113070a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f113071b;

    public l(i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f113070a = context;
        this.f113071b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f113070a, lVar.f113070a) && Intrinsics.d(this.f113071b, lVar.f113071b);
    }

    public final int hashCode() {
        return this.f113071b.hashCode() + (this.f113070a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogToolViewed(context=");
        sb3.append(this.f113070a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f113071b, ")");
    }
}
