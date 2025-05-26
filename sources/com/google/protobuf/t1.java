package com.google.protobuf;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;

/* loaded from: classes3.dex */
public final class t1 implements d2 {

    /* renamed from: a, reason: collision with root package name */
    public final o1 f33996a;

    /* renamed from: b, reason: collision with root package name */
    public final i2 f33997b;

    /* renamed from: c, reason: collision with root package name */
    public final z f33998c;

    public t1(i2 i2Var, z zVar, o1 o1Var) {
        this.f33997b = i2Var;
        zVar.getClass();
        this.f33998c = zVar;
        this.f33996a = o1Var;
    }

    @Override // com.google.protobuf.d2
    public final void a(Object obj, Object obj2) {
        e2.B(this.f33997b, obj, obj2);
    }

    @Override // com.google.protobuf.d2
    public final void b(Object obj) {
        this.f33997b.b(obj);
        this.f33998c.getClass();
        ep.b.A(obj);
        throw null;
    }

    @Override // com.google.protobuf.d2
    public final boolean c(Object obj) {
        this.f33998c.getClass();
        ep.b.A(obj);
        throw null;
    }

    @Override // com.google.protobuf.d2
    public final int d(Object obj) {
        ((k2) this.f33997b).getClass();
        j2 j2Var = ((n0) obj).unknownFields;
        int i13 = j2Var.f33915d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < j2Var.f33912a; i15++) {
            int i16 = j2Var.f33913b[i15] >>> 3;
            i14 += u.k(3, (l) j2Var.f33914c[i15]) + u.C(2, i16) + (u.B(1) * 2);
        }
        j2Var.f33915d = i14;
        return i14;
    }

    @Override // com.google.protobuf.d2
    public final Object e() {
        o1 o1Var = this.f33996a;
        return o1Var instanceof n0 ? ((n0) o1Var).newMutableInstance() : o1Var.newBuilderForType().buildPartial();
    }

    @Override // com.google.protobuf.d2
    public final int f(Object obj) {
        ((k2) this.f33997b).getClass();
        return ((n0) obj).unknownFields.hashCode();
    }

    @Override // com.google.protobuf.d2
    public final boolean g(Object obj, Object obj2) {
        i2 i2Var = this.f33997b;
        ((k2) i2Var).getClass();
        j2 j2Var = ((n0) obj).unknownFields;
        ((k2) i2Var).getClass();
        return j2Var.equals(((n0) obj2).unknownFields);
    }

    @Override // com.google.protobuf.d2
    public final void h(Object obj, rd.j jVar) {
        this.f33998c.getClass();
        ep.b.A(obj);
        throw null;
    }

    @Override // com.google.protobuf.d2
    public final void i(Object obj, c2 c2Var, y yVar) {
        this.f33997b.a(obj);
        this.f33998c.getClass();
        ep.b.A(obj);
        throw null;
    }

    @Override // com.google.protobuf.d2
    public final void j(Object obj, byte[] bArr, int i13, int i14, l7.v vVar) {
        n0 n0Var = (n0) obj;
        if (n0Var.unknownFields == j2.f33911f) {
            n0Var.unknownFields = new j2();
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        throw null;
    }
}
