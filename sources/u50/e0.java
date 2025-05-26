package u50;

import android.content.Context;
import android.text.style.StrikethroughSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 extends d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f120555a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f120556b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final int f120557c = 17;

    @Override // u50.a0
    public final Object a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new StrikethroughSpan();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f120555a == e0Var.f120555a && this.f120556b == e0Var.f120556b && this.f120557c == e0Var.f120557c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120557c) + ep.b.b(this.f120556b, Integer.hashCode(this.f120555a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StrikethroughSpanPrimitive(startIndex=");
        sb3.append(this.f120555a);
        sb3.append(", endIndex=");
        sb3.append(this.f120556b);
        sb3.append(", flags=");
        return a.a.n(sb3, this.f120557c, ")");
    }
}
