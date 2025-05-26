package b2;

import a.cb;

/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final w1.v0 f21118a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21119b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f21120c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21121d;

    public c0(w1.v0 v0Var, long j13, b0 b0Var, boolean z13) {
        this.f21118a = v0Var;
        this.f21119b = j13;
        this.f21120c = b0Var;
        this.f21121d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f21118a == c0Var.f21118a && a3.c.b(this.f21119b, c0Var.f21119b) && this.f21120c == c0Var.f21120c && this.f21121d == c0Var.f21121d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21121d) + ((this.f21120c.hashCode() + a.a.c(this.f21119b, this.f21118a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SelectionHandleInfo(handle=");
        sb3.append(this.f21118a);
        sb3.append(", position=");
        sb3.append((Object) a3.c.j(this.f21119b));
        sb3.append(", anchor=");
        sb3.append(this.f21120c);
        sb3.append(", visible=");
        return cb.m(sb3, this.f21121d, ')');
    }
}
