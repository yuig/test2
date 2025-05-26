package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
public abstract class c0 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f33595a;

    /* renamed from: b, reason: collision with root package name */
    public f0 f33596b;

    public c0(f0 f0Var) {
        this.f33595a = f0Var;
        if (f0Var.q()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f33596b = f0Var.t();
    }

    public final f0 a() {
        f0 buildPartial = buildPartial();
        buildPartial.getClass();
        if (f0.p(buildPartial, true)) {
            return buildPartial;
        }
        throw new UninitializedMessageException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final f0 buildPartial() {
        if (!this.f33596b.q()) {
            return this.f33596b;
        }
        f0 f0Var = this.f33596b;
        f0Var.getClass();
        m1.a().c(f0Var).b(f0Var);
        f0Var.r();
        return this.f33596b;
    }

    public final c0 c() {
        c0 c13 = this.f33595a.c();
        c13.f33596b = buildPartial();
        return c13;
    }

    public final void g() {
        if (this.f33596b.q()) {
            return;
        }
        f0 t13 = this.f33595a.t();
        m1.f33656c.c(t13).a(t13, this.f33596b);
        this.f33596b = t13;
    }

    public final void h(f0 f0Var) {
        if (this.f33595a.equals(f0Var)) {
            return;
        }
        g();
        f0 f0Var2 = this.f33596b;
        m1.f33656c.c(f0Var2).a(f0Var2, f0Var);
    }
}
