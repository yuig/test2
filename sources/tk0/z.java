package tk0;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f118009a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f118010b;

    public z(h32.i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f118009a = context;
        this.f118010b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f118009a, zVar.f118009a) && Intrinsics.d(this.f118010b, zVar.f118010b);
    }

    @Override // tk0.d0
    public final HashMap getAuxData() {
        return this.f118010b;
    }

    @Override // tk0.d0
    public final h32.i0 getContext() {
        return this.f118009a;
    }

    public final int hashCode() {
        return this.f118010b.hashCode() + (this.f118009a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogCancelTapped(context=");
        sb3.append(this.f118009a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f118010b, ")");
    }
}
