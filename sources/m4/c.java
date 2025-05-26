package m4;

import b3.s;
import b3.w;
import xk2.d0;
import xk2.e0;

/* loaded from: classes3.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final long f85786a;

    public c(long j13) {
        this.f85786a = j13;
        if (j13 == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
        }
    }

    @Override // m4.o
    public final float a() {
        return w.d(this.f85786a);
    }

    @Override // m4.o
    public final long b() {
        return this.f85786a;
    }

    @Override // m4.o
    public final s c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && w.c(this.f85786a, ((c) obj).f85786a);
    }

    public final int hashCode() {
        int i13 = w.f21391o;
        d0 d0Var = e0.f135207b;
        return Long.hashCode(this.f85786a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) w.i(this.f85786a)) + ')';
    }
}
