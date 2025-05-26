package j1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o2 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f74186a;

    /* renamed from: b, reason: collision with root package name */
    public final int f74187b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f74188c;

    public o2(int i13, c0 c0Var, int i14) {
        this(i13, 0, (i14 & 4) != 0 ? g0.f74070a : c0Var);
    }

    @Override // j1.n
    public final r2 a(p2 p2Var) {
        return new d3(this.f74186a, this.f74187b, this.f74188c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj;
        return o2Var.f74186a == this.f74186a && o2Var.f74187b == this.f74187b && Intrinsics.d(o2Var.f74188c, this.f74188c);
    }

    public final int hashCode() {
        return ((this.f74188c.hashCode() + (this.f74186a * 31)) * 31) + this.f74187b;
    }

    @Override // j1.b0, j1.n
    public final u2 a(p2 p2Var) {
        return new d3(this.f74186a, this.f74187b, this.f74188c);
    }

    public o2(int i13, int i14, c0 c0Var) {
        this.f74186a = i13;
        this.f74187b = i14;
        this.f74188c = c0Var;
    }
}
