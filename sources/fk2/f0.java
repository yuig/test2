package fk2;

import kb.q0;

/* loaded from: classes2.dex */
public final class f0 extends uj2.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62434a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f62435b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f62436c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f62437d;

    public f0(Object obj, Object obj2, Object obj3, int i13) {
        this.f62434a = i13;
        this.f62436c = obj;
        this.f62435b = obj3;
        this.f62437d = obj2;
    }

    @Override // uj2.b0
    public final void q(uj2.d0 d0Var) {
        int i13 = this.f62434a;
        Object obj = this.f62436c;
        switch (i13) {
            case 0:
                ((uj2.b) ((uj2.f) obj)).j(new a(this, d0Var));
                break;
            case 1:
                ((uj2.t) obj).d(new ek2.h(d0Var, (ak2.c) this.f62437d, this.f62435b, 1));
                break;
            default:
                ((uj2.b0) ((uj2.f0) obj)).p(new q0(5, this, d0Var));
                break;
        }
    }

    public f0(uj2.t tVar, Object obj, ak2.c cVar) {
        this.f62434a = 1;
        this.f62436c = tVar;
        this.f62435b = obj;
        this.f62437d = cVar;
    }
}
