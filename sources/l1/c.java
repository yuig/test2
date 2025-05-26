package l1;

import b3.w;
import xk2.d0;
import xk2.e0;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f81314a;

    /* renamed from: b, reason: collision with root package name */
    public final long f81315b;

    /* renamed from: c, reason: collision with root package name */
    public final long f81316c;

    /* renamed from: d, reason: collision with root package name */
    public final long f81317d;

    /* renamed from: e, reason: collision with root package name */
    public final long f81318e;

    public c(long j13, long j14, long j15, long j16, long j17) {
        this.f81314a = j13;
        this.f81315b = j14;
        this.f81316c = j15;
        this.f81317d = j16;
        this.f81318e = j17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return w.c(this.f81314a, cVar.f81314a) && w.c(this.f81315b, cVar.f81315b) && w.c(this.f81316c, cVar.f81316c) && w.c(this.f81317d, cVar.f81317d) && w.c(this.f81318e, cVar.f81318e);
    }

    public final int hashCode() {
        int i13 = w.f21391o;
        d0 d0Var = e0.f135207b;
        return Long.hashCode(this.f81318e) + a.a.c(this.f81317d, a.a.c(this.f81316c, a.a.c(this.f81315b, Long.hashCode(this.f81314a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ContextMenuColors(backgroundColor=");
        jq.b.t(this.f81314a, sb3, ", textColor=");
        jq.b.t(this.f81315b, sb3, ", iconColor=");
        jq.b.t(this.f81316c, sb3, ", disabledTextColor=");
        jq.b.t(this.f81317d, sb3, ", disabledIconColor=");
        sb3.append((Object) w.i(this.f81318e));
        sb3.append(')');
        return sb3.toString();
    }
}
