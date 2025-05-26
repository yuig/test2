package bk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class q implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23282a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23283b;

    /* renamed from: c, reason: collision with root package name */
    public final g2 f23284c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23285d;

    public q(boolean z13, boolean z14, g2 source, boolean z15) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f23282a = z13;
        this.f23283b = z14;
        this.f23284c = source;
        this.f23285d = z15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f23282a == qVar.f23282a && this.f23283b == qVar.f23283b && this.f23284c == qVar.f23284c && this.f23285d == qVar.f23285d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23285d) + ((this.f23284c.hashCode() + ep.b.e(this.f23283b, Boolean.hashCode(this.f23282a) * 31, 31)) * 31);
    }

    public final boolean j() {
        return this.f23283b;
    }

    public final g2 k() {
        return this.f23284c;
    }

    public final boolean l() {
        return this.f23282a;
    }

    public final boolean m() {
        return this.f23285d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AcknowledgeClickThroughActionWithResult(willClickThrough=");
        sb3.append(this.f23282a);
        sb3.append(", shouldLog=");
        sb3.append(this.f23283b);
        sb3.append(", source=");
        sb3.append(this.f23284c);
        sb3.append(", isMDLSucceeded=");
        return a.a.r(sb3, this.f23285d, ")");
    }

    public /* synthetic */ q(boolean z13, boolean z14) {
        this(z13, z14, g2.Other, false);
    }
}
