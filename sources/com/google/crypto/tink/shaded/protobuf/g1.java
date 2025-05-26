package com.google.crypto.tink.shaded.protobuf;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import oi.u6;

/* loaded from: classes3.dex */
public final class g1 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final b f33627a;

    /* renamed from: b, reason: collision with root package name */
    public final v1 f33628b;

    /* renamed from: c, reason: collision with root package name */
    public final v f33629c;

    public g1(v1 v1Var, v vVar, b bVar) {
        this.f33628b = v1Var;
        vVar.getClass();
        this.f33629c = vVar;
        this.f33627a = bVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final void a(Object obj, Object obj2) {
        r1.A(this.f33628b, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final void b(Object obj) {
        this.f33628b.b(obj);
        this.f33629c.getClass();
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final boolean c(Object obj) {
        this.f33629c.getClass();
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final int d(Object obj) {
        ((x1) this.f33628b).getClass();
        w1 w1Var = ((f0) obj).unknownFields;
        int i13 = w1Var.f33708d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < w1Var.f33705a; i15++) {
            i14 += r.c0(u1.J(w1Var.f33706b[i15]), (k) w1Var.f33707c[i15]);
        }
        w1Var.f33708d = i14;
        return i14;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final Object e() {
        b bVar = this.f33627a;
        return bVar instanceof f0 ? ((f0) bVar).t() : bVar.c().buildPartial();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final int f(Object obj) {
        ((x1) this.f33628b).getClass();
        return ((f0) obj).unknownFields.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final boolean g(Object obj, Object obj2) {
        v1 v1Var = this.f33628b;
        ((x1) v1Var).getClass();
        w1 w1Var = ((f0) obj).unknownFields;
        ((x1) v1Var).getClass();
        return w1Var.equals(((f0) obj2).unknownFields);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final void h(Object obj, p1 p1Var, u uVar) {
        this.f33628b.a(obj);
        this.f33629c.getClass();
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final void i(Object obj, byte[] bArr, int i13, int i14, l7.v vVar) {
        f0 f0Var = (f0) obj;
        if (f0Var.unknownFields == w1.f33704f) {
            f0Var.unknownFields = w1.c();
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q1
    public final void j(Object obj, u6 u6Var) {
        this.f33629c.getClass();
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }
}
