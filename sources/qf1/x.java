package qf1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final y f103775a;

    /* renamed from: b, reason: collision with root package name */
    public final y f103776b;

    public x(y primaryLog, y tooltipLog) {
        Intrinsics.checkNotNullParameter(primaryLog, "primaryLog");
        Intrinsics.checkNotNullParameter(tooltipLog, "tooltipLog");
        this.f103775a = primaryLog;
        this.f103776b = tooltipLog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.d(this.f103775a, xVar.f103775a) && Intrinsics.d(this.f103776b, xVar.f103776b);
    }

    public final int hashCode() {
        return this.f103776b.hashCode() + (this.f103775a.hashCode() * 31);
    }

    public final String toString() {
        return "Sticker(primaryLog=" + this.f103775a + ", tooltipLog=" + this.f103776b + ")";
    }
}
