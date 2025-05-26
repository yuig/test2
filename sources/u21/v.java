package u21;

import h32.i0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements w {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f120126a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f120127b;

    public v(i0 context, HashMap auxData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        this.f120126a = context;
        this.f120127b = auxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f120126a, vVar.f120126a) && Intrinsics.d(this.f120127b, vVar.f120127b);
    }

    @Override // u21.w
    public final HashMap getAuxData() {
        return this.f120127b;
    }

    @Override // u21.w
    public final i0 getContext() {
        return this.f120126a;
    }

    public final int hashCode() {
        return this.f120127b.hashCode() + (this.f120126a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LogView(context=");
        sb3.append(this.f120126a);
        sb3.append(", auxData=");
        return jq.b.f(sb3, this.f120127b, ")");
    }
}
