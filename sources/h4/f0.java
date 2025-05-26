package h4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final b4.g f67559a;

    /* renamed from: b, reason: collision with root package name */
    public final long f67560b;

    /* renamed from: c, reason: collision with root package name */
    public final b4.p0 f67561c;

    static {
        r2.s sVar = r2.t.f106065a;
    }

    public f0(String str, long j13, int i13) {
        this(new b4.g((i13 & 1) != 0 ? "" : str, null, 6), (i13 & 2) != 0 ? b4.p0.f21639b : j13, (b4.p0) null);
    }

    public static f0 a(f0 f0Var, b4.g gVar, long j13, int i13) {
        if ((i13 & 1) != 0) {
            gVar = f0Var.f67559a;
        }
        if ((i13 & 2) != 0) {
            j13 = f0Var.f67560b;
        }
        b4.p0 p0Var = (i13 & 4) != 0 ? f0Var.f67561c : null;
        f0Var.getClass();
        return new f0(gVar, j13, p0Var);
    }

    public static f0 b(f0 f0Var, String str) {
        long j13 = f0Var.f67560b;
        b4.p0 p0Var = f0Var.f67561c;
        f0Var.getClass();
        return new f0(new b4.g(str, null, 6), j13, p0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return b4.p0.a(this.f67560b, f0Var.f67560b) && Intrinsics.d(this.f67561c, f0Var.f67561c) && Intrinsics.d(this.f67559a, f0Var.f67559a);
    }

    public final int hashCode() {
        int hashCode = this.f67559a.hashCode() * 31;
        int i13 = b4.p0.f21640c;
        int c13 = a.a.c(this.f67560b, hashCode, 31);
        b4.p0 p0Var = this.f67561c;
        return c13 + (p0Var != null ? Long.hashCode(p0Var.f21641a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f67559a) + "', selection=" + ((Object) b4.p0.g(this.f67560b)) + ", composition=" + this.f67561c + ')';
    }

    public f0(b4.g gVar, long j13, b4.p0 p0Var) {
        this.f67559a = gVar;
        this.f67560b = b7.c.l(gVar.f21571a.length(), j13);
        this.f67561c = p0Var != null ? new b4.p0(b7.c.l(gVar.f21571a.length(), p0Var.f21641a)) : null;
    }
}
