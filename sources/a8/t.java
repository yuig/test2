package a8;

import g8.a1;

/* loaded from: classes3.dex */
public final class t implements q8.u {

    /* renamed from: a, reason: collision with root package name */
    public final q8.k0 f1460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f1461b;

    public t(z zVar, a1 a1Var) {
        this.f1461b = zVar;
        this.f1460a = a1Var;
    }

    @Override // q8.u
    public final void A() {
        z zVar = this.f1461b;
        zVar.f1480b.post(new s(zVar, 0));
    }

    @Override // q8.u
    public final q8.k0 D(int i13, int i14) {
        return this.f1460a;
    }

    @Override // q8.u
    public final void j(q8.e0 e0Var) {
    }
}
