package v21;

import h32.i0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements v {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f123902a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f123903b;

    public u(i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f123902a = context;
        this.f123903b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f123902a, uVar.f123902a) && Intrinsics.d(this.f123903b, uVar.f123903b);
    }

    @Override // v21.v
    public final HashMap getAuxData() {
        return this.f123903b;
    }

    @Override // v21.v
    public final i0 getContext() {
        return this.f123902a;
    }

    public final int hashCode() {
        return this.f123903b.hashCode() + (this.f123902a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogView(context=");
        sb3.append(this.f123902a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f123903b, ")");
    }
}
