package h3;

import b3.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: k */
    public static final e3.e f66650k = new e3.e();

    /* renamed from: l */
    public static int f66651l;

    /* renamed from: a */
    public final String f66652a;

    /* renamed from: b */
    public final float f66653b;

    /* renamed from: c */
    public final float f66654c;

    /* renamed from: d */
    public final float f66655d;

    /* renamed from: e */
    public final float f66656e;

    /* renamed from: f */
    public final g0 f66657f;

    /* renamed from: g */
    public final long f66658g;

    /* renamed from: h */
    public final int f66659h;

    /* renamed from: i */
    public final boolean f66660i;

    /* renamed from: j */
    public final int f66661j;

    public f(String str, float f13, float f14, float f15, float f16, g0 g0Var, long j13, int i13, boolean z13) {
        int i14;
        synchronized (f66650k) {
            i14 = f66651l;
            f66651l = i14 + 1;
        }
        this.f66652a = str;
        this.f66653b = f13;
        this.f66654c = f14;
        this.f66655d = f15;
        this.f66656e = f16;
        this.f66657f = g0Var;
        this.f66658g = j13;
        this.f66659h = i13;
        this.f66660i = z13;
        this.f66661j = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f66652a, fVar.f66652a) && n4.e.a(this.f66653b, fVar.f66653b) && n4.e.a(this.f66654c, fVar.f66654c) && this.f66655d == fVar.f66655d && this.f66656e == fVar.f66656e && Intrinsics.d(this.f66657f, fVar.f66657f) && b3.w.c(this.f66658g, fVar.f66658g) && s0.a(this.f66659h, fVar.f66659h) && this.f66660i == fVar.f66660i;
    }

    public final int hashCode() {
        int hashCode = (this.f66657f.hashCode() + a.a.a(this.f66656e, a.a.a(this.f66655d, a.a.a(this.f66654c, a.a.a(this.f66653b, this.f66652a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i13 = b3.w.f21391o;
        xk2.d0 d0Var = xk2.e0.f135207b;
        return Boolean.hashCode(this.f66660i) + ep.b.b(this.f66659h, a.a.c(this.f66658g, hashCode, 31), 31);
    }
}
