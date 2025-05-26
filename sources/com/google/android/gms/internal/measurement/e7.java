package com.google.android.gms.internal.measurement;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;

/* loaded from: classes3.dex */
public final class e7 implements n7 {

    /* renamed from: a, reason: collision with root package name */
    public final a7 f31371a;

    /* renamed from: b, reason: collision with root package name */
    public final t7 f31372b;

    /* renamed from: c, reason: collision with root package name */
    public final t5 f31373c;

    public e7(t7 t7Var, t5 t5Var, a7 a7Var) {
        this.f31372b = t7Var;
        t5Var.getClass();
        this.f31373c = t5Var;
        this.f31371a = a7Var;
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final void a(Object obj, Object obj2) {
        o7.h(this.f31372b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final boolean b(Object obj, Object obj2) {
        t7 t7Var = this.f31372b;
        t7Var.getClass();
        q7 q7Var = ((a6) obj).zzb;
        t7Var.getClass();
        return q7Var.equals(((a6) obj2).zzb);
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final boolean c(Object obj) {
        this.f31373c.getClass();
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final void d(Object obj) {
        this.f31372b.getClass();
        t7.c(obj);
        this.f31373c.getClass();
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final void e(Object obj, byte[] bArr, int i13, int i14, l7.v vVar) {
        a6 a6Var = (a6) obj;
        if (a6Var.zzb == q7.f31604f) {
            a6Var.zzb = q7.f();
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final void f(Object obj, bb.p pVar) {
        this.f31373c.getClass();
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final int zza(Object obj) {
        this.f31372b.getClass();
        q7 q7Var = ((a6) obj).zzb;
        int i13 = q7Var.f31608d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < q7Var.f31605a; i15++) {
            int i16 = q7Var.f31606b[i15] >>> 3;
            i14 += q5.q(3, (o5) q7Var.f31607c[i15]) + q5.H(2, i16) + (q5.G(8) << 1);
        }
        q7Var.f31608d = i14;
        return i14;
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final int zzb(Object obj) {
        this.f31372b.getClass();
        return ((a6) obj).zzb.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final a6 zza() {
        a7 a7Var = this.f31371a;
        if (a7Var instanceof a6) {
            return (a6) ((a6) a7Var).g(4);
        }
        return ((z5) ((a6) a7Var).g(5)).c();
    }
}
