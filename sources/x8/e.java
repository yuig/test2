package x8;

import q8.e0;
import q8.k0;
import q8.u;

/* loaded from: classes3.dex */
public final class e implements u {

    /* renamed from: a, reason: collision with root package name */
    public final long f134154a;

    /* renamed from: b, reason: collision with root package name */
    public final u f134155b;

    public e(long j13, u uVar) {
        this.f134154a = j13;
        this.f134155b = uVar;
    }

    @Override // q8.u
    public final void A() {
        this.f134155b.A();
    }

    @Override // q8.u
    public final k0 D(int i13, int i14) {
        return this.f134155b.D(i13, i14);
    }

    @Override // q8.u
    public final void j(e0 e0Var) {
        this.f134155b.j(new d(this, e0Var, e0Var));
    }
}
