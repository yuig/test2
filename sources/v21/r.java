package v21;

import h32.i0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements v {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f123896a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f123897b;

    public r(i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f123896a = context;
        this.f123897b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f123896a, rVar.f123896a) && Intrinsics.d(this.f123897b, rVar.f123897b);
    }

    @Override // v21.v
    public final HashMap getAuxData() {
        return this.f123897b;
    }

    @Override // v21.v
    public final i0 getContext() {
        return this.f123896a;
    }

    public final int hashCode() {
        return this.f123897b.hashCode() + (this.f123896a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogExit(context=");
        sb3.append(this.f123896a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f123897b, ")");
    }
}
