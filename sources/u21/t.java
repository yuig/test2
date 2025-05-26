package u21;

import h32.i0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements w {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f120122a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f120123b;

    public t(i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f120122a = context;
        this.f120123b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f120122a, tVar.f120122a) && Intrinsics.d(this.f120123b, tVar.f120123b);
    }

    @Override // u21.w
    public final HashMap getAuxData() {
        return this.f120123b;
    }

    @Override // u21.w
    public final i0 getContext() {
        return this.f120122a;
    }

    public final int hashCode() {
        return this.f120123b.hashCode() + (this.f120122a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogSavePin(context=");
        sb3.append(this.f120122a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f120123b, ")");
    }
}
