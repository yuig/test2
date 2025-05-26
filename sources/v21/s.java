package v21;

import h32.i0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements v {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f123898a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f123899b;

    public s(i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f123898a = context;
        this.f123899b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f123898a, sVar.f123898a) && Intrinsics.d(this.f123899b, sVar.f123899b);
    }

    @Override // v21.v
    public final HashMap getAuxData() {
        return this.f123899b;
    }

    @Override // v21.v
    public final i0 getContext() {
        return this.f123898a;
    }

    public final int hashCode() {
        return this.f123899b.hashCode() + (this.f123898a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogRestart(context=");
        sb3.append(this.f123898a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f123899b, ")");
    }
}
