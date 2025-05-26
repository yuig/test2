package nc0;

import b3.w;
import xk2.d0;
import xk2.e0;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f90369a;

    /* renamed from: b, reason: collision with root package name */
    public final long f90370b;

    /* renamed from: c, reason: collision with root package name */
    public final int f90371c;

    /* renamed from: d, reason: collision with root package name */
    public final int f90372d;

    /* renamed from: e, reason: collision with root package name */
    public final int f90373e;

    public e(long j13, long j14, int i13, int i14, int i15) {
        this.f90369a = j13;
        this.f90370b = j14;
        this.f90371c = i13;
        this.f90372d = i14;
        this.f90373e = i15;
    }

    public static e a(e eVar, int i13) {
        return new e(eVar.f90369a, eVar.f90370b, eVar.f90371c, i13, eVar.f90373e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return w.c(this.f90369a, eVar.f90369a) && w.c(this.f90370b, eVar.f90370b) && this.f90371c == eVar.f90371c && this.f90372d == eVar.f90372d && this.f90373e == eVar.f90373e;
    }

    public final int hashCode() {
        int i13 = w.f21391o;
        d0 d0Var = e0.f135207b;
        return Integer.hashCode(this.f90373e) + ep.b.b(this.f90372d, ep.b.b(this.f90371c, a.a.c(this.f90370b, Long.hashCode(this.f90369a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder w13 = a.a.w("SimpleToolbarStyle(backgroundColor=", w.i(this.f90369a), ", titleTextColor=", w.i(this.f90370b), ", toolbarHeight=");
        w13.append(this.f90371c);
        w13.append(", horizontalPadding=");
        w13.append(this.f90372d);
        w13.append(", cornerRadius=");
        return a.a.n(w13, this.f90373e, ")");
    }
}
