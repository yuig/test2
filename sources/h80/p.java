package h80;

import h32.i0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f68111a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f68112b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f68113c;

    /* renamed from: d, reason: collision with root package name */
    public final String f68114d;

    public p(i0 context, HashMap auxData, boolean z13, String id3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        Intrinsics.checkNotNullParameter(id3, "id");
        this.f68111a = context;
        this.f68112b = auxData;
        this.f68113c = z13;
        this.f68114d = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f68111a, pVar.f68111a) && Intrinsics.d(this.f68112b, pVar.f68112b) && this.f68113c == pVar.f68113c && Intrinsics.d(this.f68114d, pVar.f68114d);
    }

    public final int hashCode() {
        return this.f68114d.hashCode() + ep.b.e(this.f68113c, a.c.d(this.f68112b, this.f68111a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogGenerationResult(context=");
        sb3.append(this.f68111a);
        sb3.append(", auxData=");
        sb3.append(this.f68112b);
        sb3.append(", success=");
        sb3.append(this.f68113c);
        sb3.append(", id=");
        return a.a.p(sb3, this.f68114d, ")");
    }
}
