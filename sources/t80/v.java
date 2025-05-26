package t80;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements z {

    /* renamed from: a, reason: collision with root package name */
    public final c f116743a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f116744b;

    public v(c card, i0 context) {
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f116743a = card;
        this.f116744b = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f116743a == vVar.f116743a && Intrinsics.d(this.f116744b, vVar.f116744b);
    }

    public final int hashCode() {
        return this.f116744b.hashCode() + (this.f116743a.hashCode() * 31);
    }

    public final String toString() {
        return "LogCardTap(card=" + this.f116743a + ", context=" + this.f116744b + ")";
    }
}
