package androidx.recyclerview.widget;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class f1 extends b2 {

    /* renamed from: d, reason: collision with root package name */
    public final f f19403d;

    public f1(y90.e1 e1Var) {
        e1 e1Var2 = new e1(this);
        f fVar = new f(new androidx.appcompat.widget.q(this, 0), new c(e1Var).a());
        this.f19403d = fVar;
        fVar.f19373d.add(e1Var2);
    }

    public final Object C(int i13) {
        return this.f19403d.f19375f.get(i13);
    }

    public final void D(List list) {
        this.f19403d.b(list, null);
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f19403d.f19375f.size();
    }
}
