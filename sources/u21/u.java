package u21;

import h32.i0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f120124a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f120125b;

    public u(i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f120124a = context;
        this.f120125b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f120124a, uVar.f120124a) && Intrinsics.d(this.f120125b, uVar.f120125b);
    }

    @Override // u21.w
    public final HashMap getAuxData() {
        return this.f120125b;
    }

    @Override // u21.w
    public final i0 getContext() {
        return this.f120124a;
    }

    public final int hashCode() {
        return this.f120125b.hashCode() + (this.f120124a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogShare(context=");
        sb3.append(this.f120124a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f120125b, ")");
    }
}
