package os;

import androidx.recyclerview.widget.d2;

/* loaded from: classes.dex */
public final class o extends d2 {

    /* renamed from: a, reason: collision with root package name */
    public final p f97494a;

    public o(p pVar) {
        this.f97494a = pVar;
    }

    @Override // androidx.recyclerview.widget.d2
    public final void a() {
        this.f97494a.h();
    }

    @Override // androidx.recyclerview.widget.d2
    public final void b(int i13, int i14) {
        p pVar = this.f97494a;
        pVar.l(((f) pVar).K() + i13, i14);
    }

    @Override // androidx.recyclerview.widget.d2
    public final void c(int i13, Object obj, int i14) {
        p pVar = this.f97494a;
        pVar.m(((f) pVar).K() + i13, obj, i14);
    }

    @Override // androidx.recyclerview.widget.d2
    public final void d(int i13, int i14) {
        p pVar = this.f97494a;
        pVar.n(((f) pVar).K() + i13, i14);
    }

    @Override // androidx.recyclerview.widget.d2
    public final void e(int i13, int i14) {
        p pVar = this.f97494a;
        f fVar = (f) pVar;
        pVar.k(fVar.K() + i13, fVar.K() + i14);
    }

    @Override // androidx.recyclerview.widget.d2
    public final void f(int i13, int i14) {
        p pVar = this.f97494a;
        pVar.o(((f) pVar).K() + i13, i14);
    }
}
