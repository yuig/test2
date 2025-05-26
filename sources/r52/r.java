package r52;

import h32.i0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f106296a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f106297b;

    public r(i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f106296a = context;
        this.f106297b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f106296a, rVar.f106296a) && Intrinsics.d(this.f106297b, rVar.f106297b);
    }

    public final int hashCode() {
        return this.f106297b.hashCode() + (this.f106296a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogDoneClick(context=");
        sb3.append(this.f106296a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f106297b, ")");
    }
}
