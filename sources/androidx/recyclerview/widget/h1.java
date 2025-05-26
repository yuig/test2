package androidx.recyclerview.widget;

/* loaded from: classes3.dex */
public final class h1 extends d2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f19440a;

    public h1(i1 i1Var) {
        this.f19440a = i1Var;
    }

    @Override // androidx.recyclerview.widget.d2
    public final void a() {
        i1 i1Var = this.f19440a;
        i1Var.f19451e = i1Var.f19449c.e();
        android.support.v4.media.a aVar = i1Var.f19450d;
        ((l) aVar.f15837a).h();
        aVar.c();
    }

    @Override // androidx.recyclerview.widget.d2
    public final void b(int i13, int i14) {
        i1 i1Var = this.f19440a;
        android.support.v4.media.a aVar = i1Var.f19450d;
        ((l) aVar.f15837a).m(i13 + aVar.d(i1Var), null, i14);
    }

    @Override // androidx.recyclerview.widget.d2
    public final void c(int i13, Object obj, int i14) {
        i1 i1Var = this.f19440a;
        android.support.v4.media.a aVar = i1Var.f19450d;
        ((l) aVar.f15837a).m(i13 + aVar.d(i1Var), obj, i14);
    }

    @Override // androidx.recyclerview.widget.d2
    public final void d(int i13, int i14) {
        i1 i1Var = this.f19440a;
        i1Var.f19451e += i14;
        android.support.v4.media.a aVar = i1Var.f19450d;
        ((l) aVar.f15837a).n(i13 + aVar.d(i1Var), i14);
        if (i1Var.f19451e <= 0 || i1Var.f19449c.f19333c != a2.PREVENT_WHEN_EMPTY) {
            return;
        }
        aVar.c();
    }

    @Override // androidx.recyclerview.widget.d2
    public final void e(int i13, int i14) {
        i1 i1Var = this.f19440a;
        android.support.v4.media.a aVar = i1Var.f19450d;
        int d2 = aVar.d(i1Var);
        ((l) aVar.f15837a).k(i13 + d2, i14 + d2);
    }

    @Override // androidx.recyclerview.widget.d2
    public final void f(int i13, int i14) {
        i1 i1Var = this.f19440a;
        i1Var.f19451e -= i14;
        android.support.v4.media.a aVar = i1Var.f19450d;
        ((l) aVar.f15837a).o(i13 + aVar.d(i1Var), i14);
        if (i1Var.f19451e >= 1 || i1Var.f19449c.f19333c != a2.PREVENT_WHEN_EMPTY) {
            return;
        }
        aVar.c();
    }

    @Override // androidx.recyclerview.widget.d2
    public final void g() {
        this.f19440a.f19450d.c();
    }
}
